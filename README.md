

#### 什么是SpringBoot?(优点)

无须依赖外部Servlet容器，使编码变得简单，使配置变得简单，使部署变得简单，使监控变得简单

#### 创建方式：

1. 自动创建

   通过 STS 快速创建一个Spring Boot项目

1. 手动创建

   1. 创建Maven项目

      修改pom.xml文件，增加Spring Boot框架的依赖关系及对Web环境的支持

   ```Java
    <parent>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-starter-parent</artifactId>
           <version>1.5.8.RELEASE</version>
       </parent>
       ...
       <dependencies>
           <dependency>
               <groupId>org.springframework.boot</groupId>
               <artifactId>spring-boot-starter-web</artifactId>
           </dependency>
       </dependencies>
   
   ```

   - spring-boot-starter-parent：继承Spring Boot的相关参数
   - spring-boot-starter-xxx：代表一个Spring Boot模块
   - spring-boot-starter-web：代表Web模块，在这个模块中包含了许多依赖的JAR包

#### 增加程序代码

在src/main/java目录中增加类com.example.demo.DemoApplication，并增加相应代码

注意：文件必须以Application结尾

```Java
@SpringBootApplication//注解：确认SpringBoot的主入口类
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
```

#### 集成Tomcat

SpringBoot内置Tomcat服务

Spring Boot会自动读取src/main/resources/路径或类路径下/config路径中的application.properties文件或application.yml文件

读取顺序参考源码：

```Java
  <resource>
        <filtering>true</filtering>
        <directory>${basedir}/src/main/resources</directory>
        <includes>
          <include>**/application*.yml</include>
          <include>**/application*.yaml</include>
          <include>**/application*.properties</include>
        </includes>
      </resource>
```

可以看出，SpringBoot可以读取${basedir}/src/main/resources下面的任意以yml、yaml或者properties结尾的配置文件，依次覆盖，yml文件更加简便，避免了重复。

#### 集成Spring&SpringBoot

- @ComponentScan注解

  该注解需要注解再入口文件(以Application结尾的含有mainf()方法的文件)

```Java
@ComponentScan(basePackages = "com.example.demo.controller.BoysController")
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
```

默认扫描当前包和子包

- 增加控制器代码

  - @Controller注解
  - @RestController注解 （Controller+ResponseBody）

  ```
  @Controller
  public class BoysController {
      @RequestMapping("/index")
      @ResponseBody
      public Object index(){
          Map map = new HashMap();
          map.put("username", "张三");
          return map;
      }
  }
  ```

- 执行主入口文件：浏览器访问127.0.0.1：8080/index可以看到输出map集合

#### 增加服务层代码

与mvc完全一致

#### 集成Mybatis

- 增加依赖

  ```java
   <!--springboot集成mybatis-->
          <dependency>
              <groupId>org.mybatis.spring.boot</groupId>
              <artifactId>mybatis-spring-boot-starter</artifactId>
              <version>1.3.1</version>
          </dependency>
  
          <!--springboot集成mysql-->
          <dependency>
              <groupId>mysql</groupId>
              <artifactId>mysql-connector-java</artifactId>
              <version>8.0.11</version>
          </dependency>
  ```

- 配置数据源（yml文件）

  ```java
  #数据库配置
  spring:
    datasource:
      driver-class-name: com.mysql.cj.jdbc.Driver
      url: jdbc:mysql://localhost:3306/DBNamew?characterEncoding=utf8&serverTimezone=GMT%2B8
      username: root
      password: 123456
  ```

  这几种key分别在源码中可以找到

- 扫描Dao接口和开启声明式事务(注解和xml)

  - 注解

    - 需要在Application主入口文件中增加扫描注解@MapperScan("com.example.**.dao")及事务管理@EnableTransactionManagement
    - 增加Dao代码

    ```Java
    public interface indexDao {
    @Select("select * from t_member where id = #{id}")
    public Member queryById(Integer id);
    ```

    - 增加实体类
    - 增加事务注解（ServiceImpl）

  - xml

    ```Java
    <mapper namespace="com.example.demo.mapper.BoysMapper">
        <select id="queryBoysList" resultType="boys">
            select * from boys
        </select>
    </mapper>
    ```

    - yml配置

    ```Java
    mybatis:
      type-aliases-package: com.example.demo.bean
      mapper-locations:
        - classpath:mapper/*Mapper.xml
    ```

#### 集成Redis

- 增加依赖

  ```Java
  <!--springboot集成redis-->
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-data-redis</artifactId>
          </dependency>
  ```

- yml配置

  ```Java
    redis:
      host: 127.0.0.1
      port: 6379
  ```

- 开启Redis服务（windows模拟）

  window安装Redis,启动成功

  ![http://puyu3wzq5.bkt.clouddn.com/0.jpg]()

- 编写测试代码

  ```Java
  @RunWith(SpringRunner.class)
  @SpringBootTest(classes = DemoApplication.class)
  public class RedisTest {
      @Autowired
      private RedisTemplate<String,String> redisTemplate;
      @Autowired
      private BoysMapper boysMapper;
      @Test
      public void testRedis() throws JsonProcessingException {
          //1、从redis中获得数据数据的形式为json形式
          String boysListJson = redisTemplate.boundValueOps("boysListsRedis.findAll").get();
          //2、判断redis是否含有数据
          if (boysListJson == null) {
              //3、不存在数据，则从数据库中查找
              List<Boys> queryBoysList = boysMapper.queryBoysList();
              //3.1、将查询出的数据存放在Redis缓存中
              //将list集合转化成json格式 使用jackson进行转换
              ObjectMapper objectMapper = new ObjectMapper();
              String writeValueAsString = objectMapper.writeValueAsString(queryBoysList);
              redisTemplate.boundValueOps("boysListsRedis.findAll").set(boysListJson);
              System.out.println("=======从数据库查询的数据=======");
          }else {
              System.out.println("======从缓存中获得的数据======");
          }
          //4、将数据打印在控制台
          System.out.println(boysListJson);
      }
  }
  ```

  第一次打印显示从数据库读取，第二次打印显示从Redis缓存中读取

#### 分布式集成

- 热部署

  - 增加依赖

    ```Java
    <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional><!-- 这个需要为 true 热部署才有效-->
        </dependency>
    
    ```

  - IDEA需要打开自动部署，以及Ctrl+Shift+Alt+/快捷键打开when.app.running才可生效

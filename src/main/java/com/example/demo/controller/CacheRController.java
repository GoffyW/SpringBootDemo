package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author:Goffy
 */
@RestController
@RequestMapping("/cache")
public class CacheRController {


    public static void main(String[] args) {
        try{
            //此时在这里要么try显示抛出，要么main方法再次声明抛出
            throwChecked(-3);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        // 即可以显示抛出，也可无需理会
        throwRuntime(-3);
    }

    public static void throwChecked(int a) throws Exception {
        if(a>0){
            throw new Exception("a的值大于0，不符合要求");
        }
    }

    public static void throwRuntime(int a ){
        if(a>0){
            throw  new RuntimeException("a的值大于0，不符合要求");
        }
    }

  /*  @Autowired
    private JdbcUserService jdbcUserService;

    @GetMapping("/getAll")
    public List<UserEntity> getAll(){
        return jdbcUserService.getAll();
    }*/

}

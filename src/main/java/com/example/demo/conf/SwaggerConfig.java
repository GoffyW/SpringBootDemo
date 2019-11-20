package com.example.demo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * Swagger基本配置类
 * @Author:Goffy
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
    @Bean
    public ApiInfo apiInfo(){
        return new ApiInfo("SpringBoot项目集成Swagger2","练习demo","V1.0.0",
                "Terms of service",
                new Contact("名字想好没",
                        "https://itweknow.cn",
                        "gancy.programmer@gmail.com"),
                        "Apache",
                        "http://www.apache.org/",
                        Collections.emptyList()
        );
    }

}

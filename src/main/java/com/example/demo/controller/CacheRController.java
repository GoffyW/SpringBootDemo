package com.example.demo.controller;

import com.example.demo.bean.UserEntity;
import com.example.demo.service.JdbcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @Author:Goffy
 */
@RestController
@RequestMapping("/cache")
public class CacheRController {

    @Autowired
    private JdbcUserService jdbcUserService;

    @GetMapping("/getAll")
    public List<UserEntity> getAll(){
        return jdbcUserService.getAll();
    }

}

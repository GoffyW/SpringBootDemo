package com.example.demo.controller;

import com.example.demo.bean.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.Cacheable;

import java.util.List;

/**
 * @Author:Goffy
 */
@RestController
public class CacheRController {

    @Autowired
    private UserService userService;


}

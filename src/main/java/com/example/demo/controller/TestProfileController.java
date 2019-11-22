package com.example.demo.controller;

import com.example.demo.bean.SystemUserInfoEntity;
import com.example.demo.jpa.SystemUserInfoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * 测试profile环境控制器
 * @Author:Goffy
 */
@RestController
@RequestMapping("/profile")
public class TestProfileController {
    @Autowired
    private SystemUserInfoJPA systemUserInfoJPA;

    @RequestMapping("/{id}")
    public Optional<SystemUserInfoEntity> detail(@PathVariable("id") Integer id) throws Exception{
        return systemUserInfoJPA.findById(id);
    }

}

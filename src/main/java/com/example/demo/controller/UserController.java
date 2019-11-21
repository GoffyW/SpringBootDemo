package com.example.demo.controller;

import com.example.demo.bean.UserEntity;
import com.example.demo.jpa.UserJPA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:Goffy
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    private final static Logger logger  = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserJPA userJPA;

    /**
     * 查询用户列表方法
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserEntity> list(){
        logger.info("访问到了list请求");
        return userJPA.findAll();
    }

    /**
     * 添加更新用户
     * @param entity
     * @return
     */
    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public UserEntity save(UserEntity entity){
        return userJPA.save(entity);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public List<UserEntity> delete(Long id){
        userJPA.deleteById(id);
        return userJPA.findAll();
    }


}

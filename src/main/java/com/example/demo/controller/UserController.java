package com.example.demo.controller;

import com.example.demo.bean.UserEntity;
import com.example.demo.jpa.UserJPA;
import com.example.demo.pojo.User;
import com.example.demo.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/add")
    public String  add(){
        UserEntity userEntity = new UserEntity();
        userEntity.setName("oNeal");
        userEntity.setAge(50);
        userEntity.setAddress("los");
        userJPA.save(userEntity);
        return "用户信息添加成功";
    }

    @RequestMapping("/delete/{userId}")
    public String deleteE(@PathVariable("userId") Long userId){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userId);
        userJPA.delete(userEntity);
        return "删除用户成功";
    }

    @RequestMapping("age")
    public Result age(){
        List<UserEntity> userEntities = userJPA.nativeQuery(30);
        return new Result(1,"成功",userEntities);
    }

    /**
     *
     * @return
     */
    @RequestMapping("testParam")
    public User getParam(@RequestBody User user){
        return user;

    }

}

package com.example.demo;

import com.example.demo.bean.UserEntity;
import com.example.demo.jpa.UserRepository;
import com.example.demo.service.JdbcUserService;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author:Goffy
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class RedisCacheTest {
    @Autowired
    private JdbcUserService jdbcUserService;
    @Test
    public void findAll(){
        List<UserEntity> all = jdbcUserService.getAll();
        System.out.println(all.toString());
    }
}

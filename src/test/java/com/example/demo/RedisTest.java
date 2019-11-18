package com.example.demo;

import com.example.demo.bean.Boys;
import com.example.demo.mapper.BoysMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class RedisTest {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Autowired
    private BoysMapper boysMapper;
    @Test
    public void testRedis() throws JsonProcessingException {
   /*     //1、从redis中获得数据数据的形式为json形式
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
        System.out.println(boysListJson);*/
    }
}

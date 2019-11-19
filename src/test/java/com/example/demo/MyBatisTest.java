package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class MyBatisTest {
    @Autowired
    private BoysMapper boysMapper;
    @Test
    public void Test(){
        List<Boys> list = boysMapper.queryBoysList();
        System.out.println(list);
    }
    @Test
    public void TestLength(){
        Assert.assertEquals("检测长度是否匹配",7,boysMapper.queryBoysList().size());
    }
}

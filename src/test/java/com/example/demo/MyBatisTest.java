package com.example.demo;

import com.example.demo.bean.Boys;
import com.example.demo.mapper.BoysMapper;
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
}

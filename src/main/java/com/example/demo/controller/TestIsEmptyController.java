package com.example.demo.controller;

import com.example.demo.bean.Boys;
import com.example.demo.service.TestIsEmptyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @Author:Goffy
 */
@RestController
@RequestMapping("isEmpty")
public class TestIsEmptyController {

    @Autowired
    private TestIsEmptyService testIsEmptyService;

    @GetMapping("/listUser")
    public List<Boys> listUser(){
        List<Boys> list = testIsEmptyService.listUser();
        return list;
    }


    @GetMapping("/get/{id}")
    public Boys get(@PathVariable("id") Integer id){
        return testIsEmptyService.get(id);
    }

    @GetMapping("/get1/{id}")
    public Optional<Boys> get1(@PathVariable("id") Integer id){
        return testIsEmptyService.getOptional(id);
    }


}

package com.example.demo.controller;

import com.example.demo.bean.Boys;
import com.example.demo.mapper.BoysMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 男孩控制器类
 * @Author:Goffy
 */
@Controller
public class BoysController {
    @Autowired
    private BoysMapper boysMapper;

    /**
     * 查询所有的男孩
     * @return
     */
    @RequestMapping("/queryBoysList")
    @ResponseBody
    public List<Boys> queryBoysList(){
        List<Boys> lists = boysMapper.queryBoysList();
        return lists;
    }
}

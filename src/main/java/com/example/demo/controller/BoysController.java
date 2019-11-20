package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.Boys;
import com.example.demo.service.BoysService;
import com.example.demo.service.UserService;
import com.example.demo.utils.ResponseBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 男孩控制器类
 * @Author:Goffy
 */
@RestController
public class BoysController {
    @Autowired
    private BoysService boysService;

    @Autowired
    private
    UserService userService;

    /**
     * 查询所有的男孩
     * @return
     */
    @GetMapping("/queryBoysList")
    public List<Boys> queryBoysList(){
        List<Boys> lists = boysService.getAllBoys();
        return lists;
    }

    /**
     * 更新操作
     * @param users
     * @return
     */
    @PostMapping("/update")
    public ResponseBO updataBoys(@RequestBody JSONObject users){
        int i = userService.updateUser(users);
        if (i>0){
            return ResponseBO.Builder.init().setCompleteCode(1).setReasonMessage("修改成功").build();
        }
        return ResponseBO.responseFail("更新失败");
    }



}

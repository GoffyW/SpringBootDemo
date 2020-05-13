package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Goffy
 */
@Controller
public class IndexController {
    @GetMapping("index")
    public String index(Model model){
        /*List<User> list = new ArrayList<>();
        for (int i = 0; i<10;i++){
            User user = new User();
            user.setId((long)i);
            user.setName("jordan"+i);
            user.setAddress("Chicago"+i);
            list.add(user);
        }
        model.addAttribute("users",list);*/
        return "index";
    }
}

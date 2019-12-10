package com.example.demo.controller;

import com.example.demo.pojo.Team;
import com.example.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:Goffy
 */
@Controller
public class TestURL {

    /**
     * 直接以String接收前端传过来的Json数据
     * @param jsonString json格式的字符串
     * @return json格式的字符串
     */
    @RequestMapping("mytest0")
    @ResponseBody
    public String myTest0(@RequestBody String jsonString){
        System.out.println(jsonString);
        return jsonString;
    }

    /**
     * 以较简单的User对象接受前端传递过来的对象 这个时候如何属性与包装的实体不一致，则为null
     * @param user
     * @return
     */
    @RequestMapping("mytest1")
    @ResponseBody
    public String mytest1(@RequestBody User user){
        System.out.println(user);
        return user.toString();
    }

    /**
     * 复杂模型 例如列表如果为空 则必须添加[]
     * {
     * 	"honors":["速度最快"],
     * 	"teamName":"地表最强战队",
     * 	"id":"1",
     * 	"teamMembers":[]
     * }
     * @param team
     * @return
     */
    @RequestMapping("mytest2")
    @ResponseBody
    public String mytest2(@RequestBody Team team){
        System.out.println(team);
        return team.toString();
    }

    /**
     * 一个请求中可以用多个RequestParam，但是只能有一个RequestBody
     * RequestParam如果有这个注解则必须传递这个参数，否则报400.required=true指定必须传，否则报400 默认为false
     * @param user
     * @param token
     * @return
     */
    @RequestMapping("mytest3")
    @ResponseBody
    public String mytest3(@RequestBody User user ,@RequestParam(value = "token",required = false) String token){
        System.out.println(user);
        System.out.println(token);
        return token+">>>>>>"+user.toString();
    }

    /**
     *
     * @param user 用户实体
     * @param arrays 从key-values获取到的实体
     * @return
     */
    @RequestMapping("mytest5")
    @ResponseBody
    public String mytest5(@RequestBody User user , @RequestParam("arrays") List<String> arrays){
        System.out.println(user.toString());
        StringBuffer stringBuffer = new StringBuffer();
        for (String array:arrays){
            stringBuffer.append(array);
            stringBuffer.append(" ");
            System.out.println(array);
        }
        return stringBuffer.toString()+user.toString();
    }




}

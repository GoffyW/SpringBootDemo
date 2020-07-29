package com.example.demo;

import com.example.demo.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Optional;

@Slf4j

public class TestController {

    /**
     * orElse  如果不为空依旧会执行
     * orElseGet 不为空则不执行
     * orElseThrow 为空抛出异常
     * @throws Exception
     */

    @Test
    public void Test() throws Exception {
        User user = new User();
        user.setName("WU");
        User users  =null;
        User user1 = Optional.ofNullable(user).orElse(createnewUser());
        User user2 = Optional.ofNullable(user).orElseGet(this::createnewUser);
        Optional.ofNullable(users).orElseThrow(()->new Exception("用户不存在"));
        /*System.out.println(user1);
        System.out.println(user2);*/

    }

    private User createnewUser() {
        User user  =new User();
        user.setName("GUO");
        return user;
    }
}

package com.example.demo.test;

import com.example.demo.pojo.User;

import java.util.Optional;

/**
 * @author GoffyGUO
 */
public class TestController {
    public static void main(String[] args) {
        /*String userId = null;
        User user = new User();
        Optional<User> user1 = Optional.ofNullable(user);
        Optional<String> s = user1.map(User::getName);*/
        //String str = "hello world";
        String str = null;

        Optional<String> str1 = Optional.ofNullable(str);
        String hello_shanghai = str1.orElse("hello shanghai");
        System.out.println(hello_shanghai);

    }
}

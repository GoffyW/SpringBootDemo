package com.example.demo.service;

import com.example.demo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author:Goffy
 */
@Service
public class JdbcUserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int insert(User user){
        int update = jdbcTemplate.update("insert into user (name ,address) values (?,?)", user.getName(), user.getAddress());
        return update;
    }
}

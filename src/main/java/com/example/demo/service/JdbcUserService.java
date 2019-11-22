package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.bean.UserEntity;
import com.example.demo.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Goffy
 */
@Service
public class JdbcUserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserRepository userRepository;
    public int insert(User user){
        int update = jdbcTemplate.update("insert into user (name ,address) values (?,?)", user.getName(), user.getAddress());
        return update;
    }

    /**
     * 查询全部用户s
     * @return
     */
    //@Cacheable(cacheNames = "user.service.all")
    public List<UserEntity> getAll(){
        return userRepository.findAll();
    }
}

package com.example.demo.service;

import com.example.demo.bean.Boys;
import com.example.demo.bean.User;

import java.util.List;
import java.util.Optional;

/**
 * @Author:Goffy
 */
public interface TestIsEmptyService {
    /**
     * 查询用户列表
     * @return
     */
    List<Boys> listUser();

    /**
     * 查询单个用户
     * @param id
     * @return
     */
    Boys get(Integer id);

    /**
     * 查询单个用户
     * @param id
     * @return
     */
    Optional<Boys> getOptional(Integer id);

}

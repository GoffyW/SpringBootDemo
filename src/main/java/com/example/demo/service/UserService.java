package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author:Goffy
 */
public interface UserService {
    /**
     * 更新接口
     * @param users
     * @return
     */
    int updateUser(JSONObject users);
}

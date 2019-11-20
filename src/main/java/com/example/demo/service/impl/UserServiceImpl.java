package com.example.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.Member;
import com.example.demo.mapper.MemberMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author:Goffy
 */
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public int updateUser(JSONObject users) {
        Member member = users.toJavaObject(Member.class);
        return memberMapper.updateByPrimaryKeySelective(member);
    }
}

package com.example.demo.service.impl;

import com.example.demo.bean.Boys;
import com.example.demo.bean.User;
import com.example.demo.jpa.TestIsEmptyResJpa;
import com.example.demo.mapper.BoysMapper;
import com.example.demo.service.TestIsEmptyService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

/**
 * @Author:Goffy
 */
@Service
public class TestIsEmptyServiceImpl implements TestIsEmptyService {

    @Autowired
    BoysMapper boysMapper;
    @Override
    public List<Boys> listUser() {
        List<Boys> list = boysMapper.selectByExample(null);
        if (CollectionUtils.isEmpty(list)){
            return Lists.newArrayList();
        }
        return list;
    }

    @Override
    public Boys get(Integer id) {
        return boysMapper.selectByPrimaryKey(id);
    }

    @Override
    public Optional<Boys> getOptional(Integer id) {
        return Optional.ofNullable(boysMapper.selectByPrimaryKey(id));
    }
}

package com.example.demo.service.impl;

import com.example.demo.bean.Boys;
import com.example.demo.mapper.BoysMapper;
import com.example.demo.service.BoysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Goffy
 */
@Service
public class BoysServiceImpl implements BoysService {
    @Autowired
    private BoysMapper boysMapper;
    @Override
    public List<Boys> getAllBoys() {
        return boysMapper.selectByExample(null);
    }
}

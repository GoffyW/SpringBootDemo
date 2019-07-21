package com.example.demo.mapper;

import com.example.demo.bean.Boys;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BoysMapper {
    public List<Boys> queryBoysList();
}

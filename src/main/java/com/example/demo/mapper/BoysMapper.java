package com.example.demo.mapper;

import com.example.demo.bean.Boys;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Mapper
/**
 * @Author:Goffy
 */
public interface BoysMapper {
    /**
     * 查询所有的男孩列表
     * @return
     */
    List<Boys> queryBoysList();
}

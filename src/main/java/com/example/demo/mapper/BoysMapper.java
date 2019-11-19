package com.example.demo.mapper;

import com.example.demo.bean.Boys;
import com.example.demo.bean.BoysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoysMapper {
    long countByExample(BoysExample example);

    int deleteByExample(BoysExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(Boys record);

    int insertSelective(Boys record);

    List<Boys> selectByExample(BoysExample example);

    Boys selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") Boys record, @Param("example") BoysExample example);

    int updateByExample(@Param("record") Boys record, @Param("example") BoysExample example);

    int updateByPrimaryKeySelective(Boys record);

    int updateByPrimaryKey(Boys record);
}
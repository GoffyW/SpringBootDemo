package com.example.demo.mapper;

import com.example.demo.bean.TestTime;
import com.example.demo.bean.TestTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestTimeMapper {
    long countByExample(TestTimeExample example);

    int deleteByExample(TestTimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestTime record);

    int insertSelective(TestTime record);

    List<TestTime> selectByExample(TestTimeExample example);

    TestTime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestTime record, @Param("example") TestTimeExample example);

    int updateByExample(@Param("record") TestTime record, @Param("example") TestTimeExample example);

    int updateByPrimaryKeySelective(TestTime record);

    int updateByPrimaryKey(TestTime record);

    /**
     * 按照时间查询
     * @return
     */
    TestTime selectByBirthTime(@Param("time")String time);
}
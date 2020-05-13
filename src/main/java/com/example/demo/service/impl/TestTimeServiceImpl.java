package com.example.demo.service.impl;

import com.example.demo.bean.TestTime;
import com.example.demo.mapper.TestTimeMapper;
import com.example.demo.service.TestTimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author GoffyGUO
 */
@Component
@RequiredArgsConstructor
public class TestTimeServiceImpl implements TestTimeService {


    private final TestTimeMapper testTimeMapper;

    @Override
    public TestTime getInfo(Integer id) {
        return testTimeMapper.selectByPrimaryKey(id);
    }

    @Override
    public TestTime getInoByTime(String time) {
        return testTimeMapper.selectByBirthTime(time);
    }
}

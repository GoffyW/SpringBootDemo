package com.example.demo.service;

import com.example.demo.bean.TestTime;

/**
 * @author GoffyGUO
 */
public interface TestTimeService {
    /**
     * 根据ID查询
     * @param id
     * @return
     */
    TestTime getInfo(Integer id);

    /**
     * 按照时间查询
     * @param time
     * @return
     */
    TestTime getInoByTime(String time);
}

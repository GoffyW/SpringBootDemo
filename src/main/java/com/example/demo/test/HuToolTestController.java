package com.example.demo.test;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @author GoffyGUO
 */
public class HuToolTestController {
    public static void main(String[] args) {
        DateUtil.yesterday();
        DateUtil.tomorrow();
        DateUtil.lastWeek();
        DateUtil.nextWeek();
        DateUtil.lastMonth();
        DateUtil.nextMonth();
    }
}

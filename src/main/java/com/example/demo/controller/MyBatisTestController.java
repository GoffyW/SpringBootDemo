package com.example.demo.controller;

import com.example.demo.bean.TestTime;
import com.example.demo.service.TestTimeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GoffyGUO
 */
@RestController
@RequiredArgsConstructor
@Slf4j
public class MyBatisTestController {

    private final TestTimeService testTimeService;

    @GetMapping("getInfo/{id}")
    public TestTime getInfo(@PathVariable("id") Integer id){
        TestTime info = testTimeService.getInfo(id);
        log.info(info+"");
        return info;
    }

    @GetMapping("get")
    public TestTime getInfoByTime(){
        String time = "2020-05-11";
        TestTime testTime = testTimeService.getInoByTime(time);
        return testTime;
    }

}

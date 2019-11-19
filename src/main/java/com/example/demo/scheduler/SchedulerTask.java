package com.example.demo.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @Author:Goffy
 */
@Component
public class SchedulerTask {
    private  final Logger logger = LoggerFactory.getLogger(this.getClass());
    private List<Integer> index = Arrays.asList(8*1000,3*1000,6*1000,2*1000,2*1000);
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    //@Scheduled(fixedDelay = 3 * 1000)
    //@Scheduled(cron = "0/5 * * * * ?")
    @Scheduled(fixedRate = 5 * 1000)
    private void fixedDelay()throws  Exception{
        int i = atomicInteger.get();
        if (i<5){
            Integer sleepTime = index.get(i);
            logger.info("第{}个任务开始执行，执行时间为{}ms",i,sleepTime);
            Thread.sleep(sleepTime);
            int andIncrement = atomicInteger.getAndIncrement();
            logger.info("andIncrement的值为{}",andIncrement);
        }
    }

}

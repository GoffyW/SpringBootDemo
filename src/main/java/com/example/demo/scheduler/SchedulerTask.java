package com.example.demo.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author:Goffy
 */
@Component
public class SchedulerTask {
    private int count = 0;
    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("this is schedule task running"+(count++));
    }

}

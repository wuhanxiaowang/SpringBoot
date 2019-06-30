package com.example.demo.job;

import org.springframework.scheduling.annotation.Scheduled;

//@Component
//@EnableScheduling // 单线程,多个任务不建议用,一旦阻塞,后面任务都无法执行,解决办法配置多线程
//@Async("asyncServiceExecutor")
public class Scheduledjob {


    @Scheduled(cron = "0/2 * * * * ?")
    public void scheduled1() {
        try{
            System.out.println("线程"+Thread.currentThread().getName()+"执行定时器1");
            Thread.sleep(100000);
        }catch (Exception e){

        }

    }
    @Scheduled(cron = "0/2 * * * * ?")
    public void scheduled2() {
        System.out.println("线程"+Thread.currentThread().getName()+"执行定时器2");
    }
    @Scheduled(cron = "0/2 * * * * ?")
    public void scheduled3() {
        System.out.println("线程"+Thread.currentThread().getName()+"执行定时器3");
    }


}

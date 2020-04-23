package com.online.gongyu;

import org.junit.jupiter.api.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author shkstart
 * @create 2020-04-20 22:11
 */
public class QuartzDeom {

    private HelloJOb helloJOb=new HelloJOb();

    @Test
    public void deom() throws SchedulerException, InterruptedException {


        //1.调度器
        Scheduler defaultScheduler = StdSchedulerFactory.getDefaultScheduler();
//        defaultScheduler.start();
        //2.任务实例
       JobDetail jobDetail =JobBuilder.newJob(HelloJOb.class)
                .withIdentity("job1","group1")
                .usingJobData("message","打印日志")
                .build();
        //3.触发器
      Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1","group1")
              .startNow()
                .withSchedule(SimpleScheduleBuilder.repeatSecondlyForTotalCount(5,3)
                )
                .build();
        defaultScheduler.scheduleJob(jobDetail,trigger);
        defaultScheduler.start();
        TimeUnit.SECONDS.sleep(10);
//
      defaultScheduler.shutdown();

    }
}

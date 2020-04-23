package com.online.gongyu;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import lombok.Data;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.quartz.*;

import javax.naming.Context;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shkstart
 * @create 2020-04-20 22:11
 */
@Data
@PersistJobDataAfterExecution
public class HelloJOb implements Job {

    private Integer count;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //输出当前时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);

            //  获取jobdetail的值
        JobKey jobKey = jobExecutionContext.getJobDetail().getKey();
        System.out.println("工作任务名称"+jobKey.getName()+"    ;工作任务组:" +jobKey.getGroup());

        System.out.println("任务类的名称(带路径):"+jobExecutionContext.getJobDetail().getJobClass().getName());

        System.out.println("任务类的名称："+jobExecutionContext.getJobDetail().getJobClass().getSimpleName());
        //从jobDetail对象中湖区jobDetaMap的值
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        String message = jobDataMap.getString("message");
        System.out.println("任务数据参数值"+message);
        //获取Trigger对象中获取jobDataMap的数据
        JobDataMap jobDataMap1 = jobExecutionContext.getTrigger().getJobDataMap();

        TriggerKey key = jobExecutionContext.getTrigger().getKey();
        String message1 = jobDataMap1.getString("message");
        System.out.println("触发器参数的值："+message1);

        System.out.println("触发器参数的值："+key.getName()+"   :"+key.getGroup());


        System.out.println("当前任务执行时间："+jobExecutionContext.getFireTime());
        System.out.println("正在进行数据库的备份，备份数据库时间是:"+format);


        ++count;
        jobExecutionContext.getJobDetail().getJobDataMap().put("count",count);
        System.out.println("111111111111: "+count);

    }
}

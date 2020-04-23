package com.online.gongyu;

import lombok.Data;
import org.quartz.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shkstart
 * @create 2020-04-20 22:11
 */
@Data
@PersistJobDataAfterExecution
public class HelloJobTrigger implements Job {


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //输出当前时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);





        System.out.println("正在进行数据库的备份，备份数据库时间是:"+format);

    }
}

package com.online.gongyu.area;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shkstart
 * @create 2020-04-20 14:42
 */
@MapperScan("com.online.gongyu.area.mapper")
@SpringBootApplication
public class GongyuApplication {

    public static void main(String[] args) {
        SpringApplication.run(GongyuApplication.class,args);
    }

}

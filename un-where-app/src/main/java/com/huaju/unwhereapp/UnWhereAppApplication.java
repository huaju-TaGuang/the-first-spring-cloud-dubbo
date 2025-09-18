package com.huaju.unwhereapp;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.huaju.unwhereapp.mapper")
@EnableDubbo
@EnableCaching
public class UnWhereAppApplication {

    public static void main(String[] args) {
        System.out.println("========== APP SERVICE RUNING ==========");
        SpringApplication.run(UnWhereAppApplication.class, args);
    }

}

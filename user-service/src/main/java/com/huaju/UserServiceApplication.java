package com.huaju;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.huaju.mapper")
@ComponentScan("com.huaju")
public class UserServiceApplication {
    
    public static void main(String[] args) {
        System.out.println("========== USER SERVICE RUNING... ==========");
        SpringApplication.run(UserServiceApplication.class, args);
    }

}

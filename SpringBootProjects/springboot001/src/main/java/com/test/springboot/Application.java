package com.test.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication注解是 Spring Boot项目的核心注解，主要作用是开启
//Spring自动配置 ，如果在 Application类上去掉该注解，那么不会启动 SpringBoot程序
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

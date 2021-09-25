package com.test.springboot016;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Spring Boot 项目配置字符编码.
 * 第一种方式：使用传统的 Spring提供的字符编码过滤器
 */
@SpringBootApplication
@ServletComponentScan(basePackages = "com.test.springboot016.servlet")
public class Springboot016CharacterEncoding01Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot016CharacterEncoding01Application.class, args);
    }

}

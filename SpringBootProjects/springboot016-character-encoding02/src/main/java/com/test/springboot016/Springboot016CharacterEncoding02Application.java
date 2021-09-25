package com.test.springboot016;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Spring Boot 项目配置字符编码.
 * 第二种方式：在 application.properties中配置字符编码（推荐）
 */
@SpringBootApplication
@ServletComponentScan(basePackages = "com.test.springboot016.servlet")
public class Springboot016CharacterEncoding02Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot016CharacterEncoding02Application.class, args);
    }

}

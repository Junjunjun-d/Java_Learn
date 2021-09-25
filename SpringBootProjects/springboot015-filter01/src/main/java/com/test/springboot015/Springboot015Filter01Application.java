package com.test.springboot015;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Spring Boot中使用Filter
 * 第一种方式：通过注解方式实现
 *
 * 第二步：在主应用程序 Application类上添加
 * @ServletComponentScan("basePackages = "com.test.springboot015.filter")
 */
@SpringBootApplication
@ServletComponentScan(basePackages = "com.test.springboot015.filter")
public class Springboot015Filter01Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot015Filter01Application.class, args);
    }

}

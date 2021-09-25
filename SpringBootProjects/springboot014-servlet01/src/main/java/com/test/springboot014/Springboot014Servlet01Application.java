package com.test.springboot014;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 通过注解扫描方式实现 springboot使用servlet
 * 第二步：在主应用程序 Application类上添加
 * @ServletComponentScan("com.test.springboot014.servlet")
 */
@SpringBootApplication
@ServletComponentScan(basePackages = "com.test.springboot014.servlet")
public class Springboot014Servlet01Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot014Servlet01Application.class, args);
    }

}

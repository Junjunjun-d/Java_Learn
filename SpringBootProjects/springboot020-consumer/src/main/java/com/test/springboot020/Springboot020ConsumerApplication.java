package com.test.springboot020;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Springboot020ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot020ConsumerApplication.class, args);
    }

}

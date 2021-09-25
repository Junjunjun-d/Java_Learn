package com.test.springboot009;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Springboot009DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot009DubboConsumerApplication.class, args);
    }

}

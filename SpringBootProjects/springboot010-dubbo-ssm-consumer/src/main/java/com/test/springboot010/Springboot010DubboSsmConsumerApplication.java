package com.test.springboot010;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDubboConfiguration
public class Springboot010DubboSsmConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot010DubboSsmConsumerApplication.class, args);
    }

}

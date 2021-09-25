package com.test.springboot020;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.test.springboot020.mapper")
@EnableDubboConfiguration
public class Springboot020ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot020ProviderApplication.class, args);
    }

}

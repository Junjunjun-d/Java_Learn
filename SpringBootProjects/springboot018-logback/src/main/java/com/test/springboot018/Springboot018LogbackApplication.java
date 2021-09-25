package com.test.springboot018;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages =  "com.test.springboot018.mapper")
public class Springboot018LogbackApplication {
    public static void main(String[] args) {
        SpringApplication.run(Springboot018LogbackApplication.class, args);
    }

}

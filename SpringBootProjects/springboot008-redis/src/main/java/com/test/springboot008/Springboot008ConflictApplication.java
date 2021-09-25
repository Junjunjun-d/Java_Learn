package com.test.springboot008;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.test.springboot008.mapper")//扫描数据持久层
public class Springboot008ConflictApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot008ConflictApplication.class, args);
    }

}

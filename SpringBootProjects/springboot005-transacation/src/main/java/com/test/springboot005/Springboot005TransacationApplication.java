package com.test.springboot005;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.test.springboot005.mapper")
@EnableTransactionManagement  //开启事务支持(可选项，但@Transactional必须添加)
public class Springboot005TransacationApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot005TransacationApplication.class, args);
    }

}

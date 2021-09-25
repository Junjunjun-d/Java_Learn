package com.test.springboot004;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//Mybatis 提供的注解: 扫描数据持久层的mapper映射配置文件，DAO接口上就不用加@Mapper
//basePackages通常指定到数据持久层包即可
//@MapperScan("com.test.springboot004.mapper")
@MapperScan(basePackages = "com.test.springboot004.mapper")
public class Springboot004MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot004MybatisApplication.class, args);
    }

}

package com.test.springboot017;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
/**
 * 如果需使用外部tomcat部署，就需要继承SpringBootServletInitializer,重写configure方法
 */
public class Springboot017WarApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(Springboot017WarApplication.class, args);

    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        //参数为当前springboot启动类
        //构造新资源
        return builder.sources(Springboot017WarApplication.class);
    }
}

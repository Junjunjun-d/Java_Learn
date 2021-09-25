package com.test.springboot011;

import com.test.springboot011.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //开启spring配置
public class Springboot011Java02Application implements CommandLineRunner {

    //第二步：通过容器获取bean，并注入给userService
    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {

        //第一步：SpringBoot 的启动程序，会初始化spring 容器
        SpringApplication.run(Springboot011Java02Application.class, args);


    }

    //重写CommandLineRunner类中的run方法
    @Override
    public void run(String... args) throws Exception {

        //第三步：容器启动后调用run方法，在该方法中调用业务方法
        String sayHello = studentService.sayHello();

        System.out.println(sayHello);

    }
}

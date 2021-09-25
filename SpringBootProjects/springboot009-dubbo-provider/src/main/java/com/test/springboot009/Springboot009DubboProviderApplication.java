package com.test.springboot009;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration   //开启dubbo配置
public class Springboot009DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot009DubboProviderApplication.class, args);
    }

}

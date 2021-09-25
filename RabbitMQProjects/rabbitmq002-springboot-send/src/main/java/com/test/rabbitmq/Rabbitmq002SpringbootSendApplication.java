package com.test.rabbitmq;

import com.test.rabbitmq.service.SendService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Rabbitmq002SpringbootSendApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Rabbitmq002SpringbootSendApplication.class, args);
        SendService service = (SendService) applicationContext.getBean("sendService");

        //service.sendDirectMessage("Boot的Direct测试数据");

        //service.sendFanoutMessage("Boot的Fanout测试数据");
        service.sendTopicMessage("Boot的Topic测数据数据key 为 aa.bb.cc");


    }

}

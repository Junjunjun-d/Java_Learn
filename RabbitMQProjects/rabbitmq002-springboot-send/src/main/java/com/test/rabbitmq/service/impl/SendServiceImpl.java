package com.test.rabbitmq.service.impl;

import com.test.rabbitmq.service.SendService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("sendService")
public class SendServiceImpl implements SendService {

    //注入Amqp的模板类，利用这个对象来发送和接收消息
    @Resource
    private AmqpTemplate amqpTemplate;

    /**
     * 发送消息
     * 参数 1 为交换机名
     * 参数 2 为RoutingKey
     * 参数 3 为我们的具体发送的消息数据
     */
    @Override
    public void sendDirectMessage(String message) {
        amqpTemplate.convertAndSend("bootDirectExchange","bootDirectRoutingKey",message);
    }

    @Override
    public void sendFanoutMessage(String message) {
        amqpTemplate.convertAndSend("bootFanoutExchange","",message);
    }

    @Override
    public void sendTopicMessage(String message) {
        amqpTemplate.convertAndSend("bootTopicExchange","aa.bb.cc",message);
    }
}

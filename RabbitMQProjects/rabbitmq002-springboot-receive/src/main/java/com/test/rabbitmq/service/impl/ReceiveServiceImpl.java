package com.test.rabbitmq.service.impl;

import com.test.rabbitmq.service.ReceiveService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("receiveService")
public class ReceiveServiceImpl implements ReceiveService {

    //注入Amqp的模板类，利用这个对象来发送和接收消息
    @Resource
    private AmqpTemplate amqpTemplate;

    /**
     * 这里个接收不是不间断接收消息，每执行一次这个方法只能接收一次消息，如果有新消息进入则不会自动接收消息
     * 不建议使用
     */
    @Override
    public void receive() {
        //String message= (String) amqpTemplate.receiveAndConvert("bootDirectQueue");
        //System.out.println(message);
    }

    /**
     * @RabbitListener 注解用于标记当前方法是一个RabbitMQ的消息监听方法，作用是持续性的自动接收消息
     * 这个方法不需要手动调用Spring会自动运行这个监听
     * 属性
     *   queues 用于指定一个已经存在的队列名，用于进行队列的监听
     * @param message  接收到的具体的消息数据
     *
     * 注意：如果当前监听方法正常结束Spring就会自动确认消息，如果出现异常则不会确认消息
     *      因此在消息处理时我们需要做好消息的防止重复处理工作
     */
    @Override
    @RabbitListener(queues = {"bootDirectQueue"})
    public void directReceive(String message){
       System.out.println("监听器接收的消息----"+message);
    }


    @RabbitListener(bindings={
                            @QueueBinding(//@QueueBinding注解要完成队列和交换机的
                                          value = @Queue(),//@Queue创建一个队列（没有指定参数则表示创建一个随机队列）
                                          exchange=@Exchange(name="bootFanoutExchange",type="fanout")//创建一个交换机
                                          )
                            }
                   )
    public void fanoutReceive01(String message){
        System.out.println("fanoutReceive01监听器接收的消息----"+message);
    }

    @RabbitListener(bindings={
            @QueueBinding(//@QueueBinding注解要完成队列和交换机的
                    value = @Queue(),//@Queue创建一个队列（没有指定参数则表示创建一个随机队列）
                    exchange=@Exchange(name="bootFanoutExchange",type="fanout")//创建一个交换机
            )
    }
    )
    public void fanoutReceive02(String message){
        System.out.println("fanoutReceive02监听器接收的消息----"+message);
    }



    @RabbitListener(bindings = {@QueueBinding(value=@Queue("topic01"),key = {"aa"},exchange =@Exchange(name = "bootTopicExchange",type = "topic"))})
    public void  topicReceive01(String message){
        System.out.println("topic01消费者 ---aa---"+message );
    }
    @RabbitListener(bindings = {@QueueBinding(value=@Queue("topic02"),key = {"aa.*"},exchange =@Exchange(name = "bootTopicExchange",type = "topic"))})
    public void  topicReceive02(String message){
        System.out.println("topic02消费者 ---aa.*---"+message );
    }
    @RabbitListener(bindings = {@QueueBinding(value=@Queue("topic03"),key = {"aa.#"},exchange =@Exchange(name = "bootTopicExchange",type = "topic"))})
    public void  topicReceive03(String message){
        System.out.println("topic03消费者 ---aa。#---"+message );
    }
}

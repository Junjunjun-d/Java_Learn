package com.test.rabitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Send {
    public static void main(String[] args) throws IOException, TimeoutException {
        //创建连接工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();
        /**
         * 配置rabbitmq的连接信息
         */
        connectionFactory.setHost("192.168.92.129");//设置RabbitMQ的主机IP
        connectionFactory.setPort(5672);//设置RabbitMQ的端口号
        connectionFactory.setUsername("root");//设置访问用户名
        connectionFactory.setPassword("root");//定义链接对象

        Connection connection = null;//定义链接对象
        Channel channel = null;//定义通道对象

        connection = connectionFactory.newConnection();//实例化链接对象
        channel = connection.createChannel();//实例化通道对象

        String message ="Hello World!0023";
        /**
         * @创建队列 ，名字为myQueue
         * @String 队列名，可取任意值
         * @boolean 是否为持久化的队列
         * @boolean 是否排外，如果排外则此队列只允许有一个消费者监听
         * @boolean 是否自动删除队列，为true表示 当队列中没有消息切没有消费者链接时会自动删除此队列
         * @map  队列的属性设置，通常为null
         * 注意：
         *    1、声明队列时，这个队列名称如果已经存在则放弃声明，如果队列不存在则会声明一个新的队列
         *    2、队列名可以取值任意，但是要与消息接收时完全一致
         *    3、这行代码是可有可无的但是一定要在发送消息前确认队列名已经存在在RabbitMQ中，否则就会出现问题
         */
        channel.queueDeclare("myQueue", true, false, false, null);

        /**
         * @发送消息到MQ
         *  @String 为交换机名称 这里为空字符串表示不使用交换机
         *  @String 为队列名或RoutingKey，当指定了交换机名称以后这个这个值就是RoutingKey
         * 参数 3 为消息属性信息 通常空即可
         * 参数 4 为具体的消息数据的字节数组
         * 注意：队列名必须要与接收时完全一致
         */
        channel.basicPublish("","myQueue",null,message.getBytes("UTF-8"));
        System.out.println("消息发送成功: "+message);
        channel.close();
        connection.close();


    }
}

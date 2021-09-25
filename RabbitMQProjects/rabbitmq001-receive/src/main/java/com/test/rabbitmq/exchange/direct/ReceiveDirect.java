package com.test.rabbitmq.exchange.direct;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ReceiveDirect {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("192.168.92.129");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("root");
        connectionFactory.setPassword("root");

        Connection connection = null;
        Channel channel = null;

        try {
            connection = connectionFactory.newConnection();
            channel = connection.createChannel();

            channel.queueDeclare("myDirectQueue",true,false,false,null);
            channel.exchangeDeclare("directExchange","direct",true);
            channel.queueBind("myDirectQueue","directExchange","directRoutingKey");

            /**
             * 监听某个队列并获取队列中的数据
             * 注意：
             *   当前被讲定的队列必须已经存在并正确的绑定到了某个交换机中
             */
            channel.basicConsume("myDirectQueue",true,"",new DefaultConsumer(channel){

                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String message=new String(body);
                    System.out.println("消费者 ---"+message);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}

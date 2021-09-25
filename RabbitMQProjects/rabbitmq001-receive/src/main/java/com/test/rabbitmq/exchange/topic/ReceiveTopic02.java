package com.test.rabbitmq.exchange.topic;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ReceiveTopic02 {
    public static void main(String[] args) {
        ConnectionFactory factory=new ConnectionFactory();
        factory.setHost("192.168.92.129");
        factory.setPort(5672);
        factory.setUsername("root");
        factory.setPassword("root");
        Connection connection=null;
        Channel channel=null;
        try {
            connection=factory.newConnection();
            channel=connection.createChannel();

            channel.queueDeclare("topicQueue02",true,false,false,null);
            channel.exchangeDeclare("topicExchange","topic",true);
            channel.queueBind("topicQueue02","topicExchange","aa.*");
            channel.basicConsume("topicQueue02",true,"",new DefaultConsumer(channel){
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String message=new String(body);
                    System.out.println("Receive02消费者aa.* ---"+message);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}

package com.test.rabbitmq.service;

public interface ReceiveService {

    void receive();

    void directReceive(String message);

}

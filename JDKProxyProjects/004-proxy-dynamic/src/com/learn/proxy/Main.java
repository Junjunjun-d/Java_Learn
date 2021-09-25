package com.learn.proxy;

import com.learn.proxy.handler.MyHandler;
import com.learn.proxy.service.Sell;
import com.learn.proxy.service.impl.SellImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        //1、创建目标对象
        Sell sell = new SellImpl();

        //2、创建InvocationHandler对象
        InvocationHandler handler = new MyHandler(sell);

        //3、创建代理对象
        Sell proxy = (Sell) Proxy.newProxyInstance(sell.getClass().getClassLoader(), sell.getClass().getInterfaces(), handler);

        //4、使用代理执行方法
        float f = proxy.sell(10);

        System.out.println("执行结果：" + f);

    }
}

package com.learn.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {

    //设置动态目标，根据传进来的目标进行增强
    private Object traget = null;

    //构造方法，用来传目标
    public MyHandler(Object traget) {
        this.traget = traget;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res = null;
        //执行目标方法
       res = method.invoke(traget, args);

       //增强
        if(res != null){

            float price = (float) res;
            price += 30;
            res = price;

        }
        return res;
    }
}

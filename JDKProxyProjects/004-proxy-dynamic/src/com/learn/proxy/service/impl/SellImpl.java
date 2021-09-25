package com.learn.proxy.service.impl;

import com.learn.proxy.service.Sell;

/**
 * 接口Sell的实现类  SellImpl
 */
public class SellImpl implements Sell {
    @Override
    public float sell(int amount) {

        System.out.println("接口实现类");
        return 90.0f;
    }
}

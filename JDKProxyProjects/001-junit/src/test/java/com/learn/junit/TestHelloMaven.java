package com.learn.junit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHelloMaven {

    @Test
    public void testAdd(){

        HelloMaven hm=new HelloMaven();

        assertEquals(30,hm.add(10,20));

        System.out.println("junit单元测试");
    }
}

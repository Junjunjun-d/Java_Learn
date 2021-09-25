package com.learn.junit;

public class HelloMaven {
    public static void main(String[] args) {

        HelloMaven hm=new HelloMaven();

       System.out.println( hm.add(10,20));

    }

    public int add(int t1,int t2){

        return t1+t2;

    }
}

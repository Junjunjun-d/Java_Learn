package com.java.learn.sub.thread.extend;

public class ThreadMethods {
	public static void test1() {
		// 线程 Thread: 继承Thread 使用的时候启动
		Thread1 t1 = new Thread1("正序循环00000011");
		Thread2 t2 = new Thread2("反序循环00000022");
		t1.start();
		t2.start();

	}

	public static void test2() {
		// 线程 Thread: 继承Thread 在构造方法中启动，调用时只需要创建对象即可
		Thread1 t3 = new Thread1("正序循环00000033");
		Thread2 t4 = new Thread2("反序循环00000044");
	}
}

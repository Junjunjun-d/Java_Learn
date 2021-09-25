package com.java.learn.sub.thread.runable;

public class RunnableMethods {
	public static void test() {
		// 线程 Thread: 实现接口Runnable
		Target1 tg1 = new Target1();
		Target2 tg2 = new Target2();
		Thread t3 = new Thread(tg1);
		Thread t4 = new Thread(tg2);
		t3.start();
		t4.start();
	}

}

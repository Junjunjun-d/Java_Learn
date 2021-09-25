package com.java.learn.sub.thread.extend;

public class Thread1 extends Thread {
	public Thread1(String name) {
		super(name);
		this.start();
	}

	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println(this.getName() + "Ïß³Ì111111111" + i);
		}
	}

}

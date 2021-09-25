package com.java.learn.sub.thread.runable;

public class Target2 implements Runnable {

	@Override
	public void run() {
		for (int i = 100000; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

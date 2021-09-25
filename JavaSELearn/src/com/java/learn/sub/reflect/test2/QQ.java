package com.java.learn.sub.reflect.test2;

public class QQ implements ICar {

	@Override
	public void run() {
		System.out.println("QQ的方法run()被调用");

	}

	@Override
	public void stop() {
		System.out.println("QQ的方法stop()被调用");
	}

}

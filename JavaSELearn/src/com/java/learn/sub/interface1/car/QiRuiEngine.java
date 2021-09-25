package com.java.learn.sub.interface1.car;

public class QiRuiEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("奇瑞启动，速度40km/h");

	}

	@Override
	public void stop() {
		System.out.println("奇瑞停止，速度0km/h");

	}

	@Override
	public void sqeedUp() {
		System.out.println("奇瑞加速，速度120km/h");

	}

}

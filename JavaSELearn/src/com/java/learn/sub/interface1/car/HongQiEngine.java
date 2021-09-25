package com.java.learn.sub.interface1.car;

public class HongQiEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("红旗启动，速度60km/h");

	}

	@Override
	public void stop() {
		System.out.println("红旗停止，速度0km/h");

	}

	@Override
	public void sqeedUp() {
		System.out.println("红旗加速，速度80km/h");

	}

}

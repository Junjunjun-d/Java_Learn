package com.java.learn.sub.interface1.car;

public class HongQiEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("�����������ٶ�60km/h");

	}

	@Override
	public void stop() {
		System.out.println("����ֹͣ���ٶ�0km/h");

	}

	@Override
	public void sqeedUp() {
		System.out.println("������٣��ٶ�80km/h");

	}

}

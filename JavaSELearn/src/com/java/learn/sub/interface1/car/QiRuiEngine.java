package com.java.learn.sub.interface1.car;

public class QiRuiEngine implements IEngine {

	@Override
	public void start() {
		System.out.println("�����������ٶ�40km/h");

	}

	@Override
	public void stop() {
		System.out.println("����ֹͣ���ٶ�0km/h");

	}

	@Override
	public void sqeedUp() {
		System.out.println("������٣��ٶ�120km/h");

	}

}

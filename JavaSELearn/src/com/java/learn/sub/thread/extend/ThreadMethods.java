package com.java.learn.sub.thread.extend;

public class ThreadMethods {
	public static void test1() {
		// �߳� Thread: �̳�Thread ʹ�õ�ʱ������
		Thread1 t1 = new Thread1("����ѭ��00000011");
		Thread2 t2 = new Thread2("����ѭ��00000022");
		t1.start();
		t2.start();

	}

	public static void test2() {
		// �߳� Thread: �̳�Thread �ڹ��췽��������������ʱֻ��Ҫ�������󼴿�
		Thread1 t3 = new Thread1("����ѭ��00000033");
		Thread2 t4 = new Thread2("����ѭ��00000044");
	}
}

package com.java.learn.sub.exercise;

public class RuntimeTestMethods {

	public static void runtimeTest() {
		Runtime rt = Runtime.getRuntime();
		long totalM = rt.freeMemory();
		System.out.println("ʣ���ڴ�Ϊ��" + totalM / 1024 / 1024 + "M");
		long maxM = rt.maxMemory();
		System.out.println("����ڴ�Ϊ��" + maxM / 1024 / 1024 + "M");
	}
}

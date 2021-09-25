package com.java.learn.sub.exercise;

public class RuntimeTestMethods {

	public static void runtimeTest() {
		Runtime rt = Runtime.getRuntime();
		long totalM = rt.freeMemory();
		System.out.println("剩余内存为：" + totalM / 1024 / 1024 + "M");
		long maxM = rt.maxMemory();
		System.out.println("最大内存为：" + maxM / 1024 / 1024 + "M");
	}
}

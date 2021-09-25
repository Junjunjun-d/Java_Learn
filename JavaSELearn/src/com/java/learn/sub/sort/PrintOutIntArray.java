package com.java.learn.sub.sort;

public class PrintOutIntArray {
	// 打印输出随机数组
	public static void printArray(int[] intArray) {
		String arrayString = "[";
		for (int i = 0; i < intArray.length; i++) {
			arrayString = arrayString + intArray[i] + ",";
			System.out.println("第" + (i + 1) + "个元素的值是:" + intArray[i]);
		}
		arrayString = arrayString.substring(0, arrayString.length() - 1) + "]";
		System.out.println("intArray[]数组的元素的值是:" + arrayString);
	}
}

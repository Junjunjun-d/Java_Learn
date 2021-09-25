package com.java.learn.sub.sort;

import java.util.Random;

public class GetRandomArray {
	// 获取0-1000的20个随机数并返回一个数字数组
	public static int[] getArrays() {
		int[] num = new int[20];
		for (int i = 0; i < 20; i++) {
			Random rm = new Random();
			int temp = rm.nextInt(1000);// 100表示获取的最大值，即0-100的随机数
			num[i] = temp;
		}
		num = BubblingSortArray.sortArray(num);
		return num;
	}
}

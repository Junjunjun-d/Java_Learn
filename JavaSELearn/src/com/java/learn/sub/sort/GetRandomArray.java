package com.java.learn.sub.sort;

import java.util.Random;

public class GetRandomArray {
	// ��ȡ0-1000��20�������������һ����������
	public static int[] getArrays() {
		int[] num = new int[20];
		for (int i = 0; i < 20; i++) {
			Random rm = new Random();
			int temp = rm.nextInt(1000);// 100��ʾ��ȡ�����ֵ����0-100�������
			num[i] = temp;
		}
		num = BubblingSortArray.sortArray(num);
		return num;
	}
}

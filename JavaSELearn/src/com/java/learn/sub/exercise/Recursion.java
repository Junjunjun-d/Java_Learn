package com.java.learn.sub.exercise;

public class Recursion {
	/**
	 * �ݹ���˻�
	 */
	public static int diGui02(int i) {
		int sum = 0;
		if (i == 1) {
			return 1;
		} else {
			sum = i * diGui02(i - 1);
			return sum;
		}
	}

	/**
	 * �ݹ����
	 */
	public static int diGui(int i) {
		int sum = 0;
		if (i == 1) {
			return 1;
		} else {
			sum = i + diGui(i - 1);
			return sum;
		}
	}

}

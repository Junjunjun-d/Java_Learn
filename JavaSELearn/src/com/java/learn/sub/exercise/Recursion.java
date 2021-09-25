package com.java.learn.sub.exercise;

public class Recursion {
	/**
	 * 递归求乘积
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
	 * 递归求和
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

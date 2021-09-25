package com.java.learn.sub.exercise;

public class NarcissusNumber {
	/**
	 * 打印出所有的水仙花数:一个三位数,其各位数字立方和等于其本身. eg: 153
	 */
	public static void printNarcissusNumber() {
		int gw = 0, sw = 0, bw = 0, sum = 0;

		for (int i = 100; i < 1000; i++) {
			bw = i / 100;
			sw = (i - 100 * bw) / 10;// i/10%10
			gw = (i - 100 * bw) % 10;// i%100%10
			sum = bw * bw * bw + sw * sw * sw + gw * gw * gw;
			if (i == sum) {
				System.out.println(i);
			} else {
				continue;
			}
		}
	}
}

package com.java.learn.sub.exercise;

public class NarcissusNumber {
	/**
	 * ��ӡ�����е�ˮ�ɻ���:һ����λ��,���λ���������͵����䱾��. eg: 153
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

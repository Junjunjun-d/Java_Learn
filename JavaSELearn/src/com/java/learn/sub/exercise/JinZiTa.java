package com.java.learn.sub.exercise;

public class JinZiTa {
	/**
	 * ��ӡ������
	 */
	public static void printJinZiTa(int n) {
		for (int i = 0; i < n; i++) {// ��������

			for (int j = 0; j < n - i; j++) {// ���ƿո�: n-1�� û��ӡһ�� �ո���һ��
				System.out.print(" ");// Ҫ��print������println
			}

			for (int k = 0; k <= 2 * i; k++) {
				System.out.print("*");// Ҫ��print������println
			}
			System.out.println("");
		}
	}
}

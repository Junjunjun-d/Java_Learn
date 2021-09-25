package com.java.learn.sub.exercise;

public class JinZiTa {
	/**
	 * 打印金字塔
	 */
	public static void printJinZiTa(int n) {
		for (int i = 0; i < n; i++) {// 层数控制

			for (int j = 0; j < n - i; j++) {// 控制空格: n-1个 没打印一层 空格少一个
				System.out.print(" ");// 要用print而不是println
			}

			for (int k = 0; k <= 2 * i; k++) {
				System.out.print("*");// 要用print而不是println
			}
			System.out.println("");
		}
	}
}

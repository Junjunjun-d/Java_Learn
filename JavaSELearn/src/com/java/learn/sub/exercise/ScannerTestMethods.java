package com.java.learn.sub.exercise;

import java.util.Scanner;

public class ScannerTestMethods {
	public static void scannerTest() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			// String s1 = scanner.next();// 如果有空格的话会返回两行
			// System.out.println(s1);

			String s2 = scanner.nextLine();// 不考虑空格，只返回一行
			System.out.println(s2);
		}

	}
}

package com.java.learn.sub.exercise;

import java.util.Scanner;

public class ScannerTestMethods {
	public static void scannerTest() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			// String s1 = scanner.next();// ����пո�Ļ��᷵������
			// System.out.println(s1);

			String s2 = scanner.nextLine();// �����ǿո�ֻ����һ��
			System.out.println(s2);
		}

	}
}

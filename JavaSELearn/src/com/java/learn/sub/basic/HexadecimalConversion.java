package com.java.learn.sub.basic;

public class HexadecimalConversion {
	public static void test() {
		int num = 1234;

		System.out.println(Integer.toString(num, 2));// 十进制转二进制
		System.out.println(Integer.toString(num, 8));// 十进制转八进制
		System.out.println(Integer.toString(num, 16));// 十进制转十六进制

		System.out.print("1234转二进制：");
		System.out.print(Integer.toBinaryString(num));// 十进制转二进制

		System.out.println();

		System.out.print("1234转八进制：");
		System.out.print("0" + Integer.toOctalString(num));
		// System.out.printf("%#o", num);// 十进制转八进制

		System.out.println();

		System.out.print("1234转十六进制：");
		System.out.print("0x" + Integer.toHexString(num));
		// System.out.printf("%#x", num);// 十进制转十六进制

		System.out.println();

		System.out.println("ABCDEF转十进制 ：" + Integer.parseInt("ABCDEF", 16));

		System.out.print("ABCDEF转十进制，占位15 方法一：");
		System.out.printf("%15s", Integer.parseInt("ABCDEF", 16));

		System.out.println();

		System.out.print("ABCDEF转十进制，占位15 方法二：");
		String s = Integer.valueOf("ABCDEF", 16).toString();
		StringBuilder sb = new StringBuilder(15);
		for (int i = 0; i < 15 - s.length(); i++) {
			sb.append(" ");
		}
		sb.append(s);
		System.out.println(sb);

	}
}

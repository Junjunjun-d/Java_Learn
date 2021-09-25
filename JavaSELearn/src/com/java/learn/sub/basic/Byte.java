package com.java.learn.sub.basic;

public class Byte {
	public static void test() {
		String s1 = "2";
		System.out.println("单个数字的占用字节数" + s1.getBytes().length);
		String s2 = "a";
		System.out.println("单个英文做字母的占用字节数" + s2.getBytes().length);
		String s3 = "a1";
		System.out.println("数字+字母的占用字节数" + s3.getBytes().length);
		String s4 = "中";
		System.out.println("单个中文的占用字节数" + s4.getBytes().length);
		String s5 = "中1";
		System.out.println("中文+数字的占用字节数" + s5.getBytes().length);
		String s6 = "a这";
		System.out.println("中文+字母的占用字节数" + s6.getBytes().length);
		String s7 = "￥";
		System.out.println("中文特殊符号的占用字节数" + s6.getBytes().length);
		String s8 = "$";
		System.out.println("英文特殊符号的占用字节数" + s6.getBytes().length);
	}
}

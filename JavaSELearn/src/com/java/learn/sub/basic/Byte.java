package com.java.learn.sub.basic;

public class Byte {
	public static void test() {
		String s1 = "2";
		System.out.println("�������ֵ�ռ���ֽ���" + s1.getBytes().length);
		String s2 = "a";
		System.out.println("����Ӣ������ĸ��ռ���ֽ���" + s2.getBytes().length);
		String s3 = "a1";
		System.out.println("����+��ĸ��ռ���ֽ���" + s3.getBytes().length);
		String s4 = "��";
		System.out.println("�������ĵ�ռ���ֽ���" + s4.getBytes().length);
		String s5 = "��1";
		System.out.println("����+���ֵ�ռ���ֽ���" + s5.getBytes().length);
		String s6 = "a��";
		System.out.println("����+��ĸ��ռ���ֽ���" + s6.getBytes().length);
		String s7 = "��";
		System.out.println("����������ŵ�ռ���ֽ���" + s6.getBytes().length);
		String s8 = "$";
		System.out.println("Ӣ��������ŵ�ռ���ֽ���" + s6.getBytes().length);
	}
}

package com.huawei.test;

import java.io.IOException;
import java.util.Scanner;

public class HuaWeiComputerTestHarder {

	/**
	 * HuaWeiComputerTestHarderMedium
	 * @param ��Ϊ��������ϰ ����   
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// printEndLength();//10 �����ַ������һ�����ʵĳ���
		// printInt();//11 ��ӡ�ظ��ַ��ĸ���:�ַ�������=����,��Сд��ĸ,�ո�


	}

	
	/*
	 * ����ĳ����ĸ���ֵĴ�����д��һ������ ����һ������ĸ�����ֺͿո���ɵ��ַ�������һ����ĸ��Ȼ����������ַ����и���ĸ�ĳ��ִ����������ִ�Сд��
	 */
	public static void printInt() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNextLine()) {
			String str1 = sr.nextLine();
			String str2 = sr.nextLine();
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();

			int count = 0;
			for (int i = 0; i < str1.length(); i++) {
				String temp = str1.charAt(i) + "";
				if (str2.equals(temp)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

	/*
	 * �����ַ������һ�����ʵĳ���: �����ַ������һ�����ʵĳ��ȣ������Կո������
	 */
	public static void printEndLength() {
		System.out.println("�������ַ�����");// ����һ�л������ڴ�ռ��
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String string = scanner.nextLine();
			// string.indexOf(i)
			String[] str = string.split(" ");
			int length = str[str.length - 1].length();
			System.out.println(length);
		}
	}

}

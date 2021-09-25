package com.huawei.test;

import java.io.IOException;
import java.util.Scanner;

public class HuaWeiComputerTestPrimer {

	/**
	 *
	 * @param ��Ϊ��������ϰ ����
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) {
		// getApproximation();// 1 ȡ����ֵ
		// getOneNumber();//2 ��int�����������ڴ��д洢ʱ1�ĸ���
	}

	/*
	 * 2 ��int���������ڴ��д洢ʱ1�ĸ���������һ��int�͵����������������int���������ڴ��д洢ʱ1�ĸ�����
	 */
	public static void getOneNumber() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			int count = 0;
			String toBinary = Integer.toBinaryString(num);// �������intת���ɶ�����
			for (int i = 0; i < toBinary.length(); i++) {
				if (toBinary.charAt(i) == '1') {// ѭ���жϴ˶����ƴ���ʹ��count���м���
					count++;
				}
			}
			System.out.println(count);
		}
	}

	/*
	 * 1 ȡ����ֵ(approximation)��д��һ�����򣬽���һ����������ֵ���������ֵ�Ľ�������ֵ��
	 * ���С�������ֵ���ڵ���5,����ȡ����С��5��������ȡ��
	 */
	public static void getApproximation() {
		float fNumber = 0f;
		int iNumber = 0;
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextFloat()) {
			fNumber = scanner.nextFloat();
			iNumber = (int) fNumber;
			if ((fNumber - iNumber) >= 0.5) {
				iNumber += 1;
			}
			System.out.println(iNumber);
		}

	}


	/*
	 * 11 д��һ������ ����һ������ĸ�����ֺͿո���ɵ��ַ�������һ����ĸ��Ȼ����������ַ����и���ĸ�ĳ��ִ����������ִ�Сд��
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
	 * 10 �����ַ������һ�����ʵĳ��ȣ������Կո������
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

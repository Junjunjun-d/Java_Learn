package com.huawei.test;

import java.io.IOException;
import java.util.Scanner;

public class HuaWeiComputerTestPrimer {

	/**
	 *
	 * @param 华为机试题练习 初级
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) {
		// getApproximation();// 1 取近似值
		// getOneNumber();//2 求int型正整数在内存中存储时1的个数
	}

	/*
	 * 2 求int型数据在内存中存储时1的个数：输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
	 */
	public static void getOneNumber() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			int count = 0;
			String toBinary = Integer.toBinaryString(num);// 把输入的int转换成二进制
			for (int i = 0; i < toBinary.length(); i++) {
				if (toBinary.charAt(i) == '1') {// 循环判断此二进制串，使用count进行计数
					count++;
				}
			}
			System.out.println(count);
		}
	}

	/*
	 * 1 取近似值(approximation)：写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
	 * 如果小数点后数值大于等于5,向上取整；小于5，则向下取整
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
	 * 11 写出一个程序， 接受一个由字母、数字和空格组成的字符串，和一个字母，然后输出输入字符串中该字母的出现次数。不区分大小写。
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
	 * 10 计算字符串最后一个单词的长度，单词以空格隔开。
	 */
	public static void printEndLength() {
		System.out.println("请输入字符串：");// 加这一行会增大内存占用
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

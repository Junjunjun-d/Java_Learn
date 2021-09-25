package com.huawei.test;

import java.io.IOException;
import java.util.Scanner;

public class HuaWeiComputerTestHarder {

	/**
	 * HuaWeiComputerTestHarderMedium
	 * @param 华为机试题练习 较难   
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// printEndLength();//10 计算字符串最后一个单词的长度
		// printInt();//11 打印重复字符的个数:字符串构成=数字,大小写字母,空格


	}

	
	/*
	 * 计算某个字母出现的次数：写出一个程序， 接受一个由字母、数字和空格组成的字符串，和一个字母，然后输出输入字符串中该字母的出现次数。不区分大小写。
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
	 * 计算字符串最后一个单词的长度: 计算字符串最后一个单词的长度，单词以空格隔开。
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

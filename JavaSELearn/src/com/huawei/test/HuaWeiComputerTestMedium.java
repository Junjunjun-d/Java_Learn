package com.huawei.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HuaWeiComputerTestMedium {

	/**
	 * HuaWeiComputerTestHarderMedium
	 * @param 华为机试题练习 中等   
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		// hexadecimalConversion();//26 进制转换
		// getAndPrintPrimeFactor();// 27 质数因子

		// mergeTableRecord();//28 合并表记录
		// getNotRepeatInt();//29 提取不重复的整数
		// getCharCount();// 30 字符个数统计
		sortString();
	}

	/*
	 * 31 字符串排序：给定n个字符串，请对n个字符串按照字典序排列。
	 * 
	 * 输入 9 cap to cat card two too up boat
	 * 
	 * boot 输出 boat boot cap card cat to too two up
	 */
	public static void sortString() {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int size = scanner.nextInt();
			String[] strs = new String[size];
			for (int i = 0; i < size; i++){ 

				strs[i] = scanner.next();

			}
			Arrays.sort(strs);
			for (String string : strs) {
				System.out.println(string);
			}

		}
	}

	/*
	 * 30 字符个数统计：
	 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。
	 * 多个相同的字符只计算一次 例如，对于字符串abaca而言，有a、b、c三种不同的字符，因此输出3。
	 */
	public static void getCharCount() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			String[] strs = string.split("");// 把字符串转换成数组
			// 去重不排序
			Set<String> set = new LinkedHashSet<String>(Arrays.asList(strs));

			System.out.println(set.size());
		}
	}

	/*
	 * 29 提取不重复的整数：输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。 保证输入的整数最后一位不是0。
	 * 9876673
	 */
	public static void getNotRepeatInt() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {

			StringBuffer stringBuffer = new StringBuffer(scanner.nextLine());
			String string = stringBuffer.reverse().toString();// 输入字符串反转

			String[] strs = string.split("");// 把字符串转换成数组
			// 去重并按大小排序使用TreeSet
			// Set<String> set = new TreeSet(Arrays.asList(strs));
			// 去重不排序
			Set<String> set = new LinkedHashSet<String>(Arrays.asList(strs));

			String resString = "";
			// 遍历set，输出成字符串
			for (String string2 : set) {
				resString += string2;
			}
			System.out.println(resString);
		}
	}


	/*
	 * 28 合并表记录：数据表记录包含表索引和数值（int范围的正整数），请对表索引相同的记录进行合并，
	 * 即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
	 * 
	 * 输入描述: 先输入键值对的个数 然后输入成对的index和value值，以空格隔开
	 * 
	 * 输出描述: 输出合并后的键值对（多行）
	 */
	public static void mergeTableRecord() {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int size = scanner.nextInt();
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for (int i = 0; i < size; i++) {
				int key = scanner.nextInt();
				int value = scanner.nextInt();
				if (map.containsKey(key)) {
					map.put(key, map.get(key) + value);
				} else {
					map.put(key, value);
				}
			}
			for (Map.Entry<Integer, Integer> integerIntegerEntry : map
					.entrySet()) {
				System.out.println(integerIntegerEntry.getKey() + " "
						+ integerIntegerEntry.getValue());
			}
		}
	}
	

	/*
	 * 27 质数因子：功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
	 * 最后一个数后面也要有空格
	 */
	public static void getAndPrintPrimeFactor() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int inputInt = scanner.nextInt();
			String tempString = "";
			for (int i = 2; i <= inputInt; i++) {
				if (inputInt % i == 0) {
					tempString += i + " ";
					inputInt = inputInt / i;
					i = 1;

				}
			}

			System.out.println(tempString);
		}
	}

	/**
	 * 26  进制转换: 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示 .
	 * 输入
	 * 0xA
	 * 0xAA
	 * 输出
	 * 10
	 * 170
	 */
	public static void hexadecimalConversion() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			String str1 = sr.nextLine().substring(2);//0x5AA
			
			int count = 0;
			int tempint = 0;
			for (int i = 0; i < str1.length(); i++) {//5AA
				String temp = str1.charAt(i) + "";
				
				if (temp.matches("[0-9]")) {
					tempint = Integer.parseInt(temp);
				} else if (temp.equals("a") || temp.equals("A")) {
					tempint = 10;
				}if(temp.equals("b")||temp.equals("B")){
					tempint = 11;
				}if(temp.equals("c")||temp.equals("C")){
					tempint = 12;
				}if(temp.equals("d")||temp.equals("D")){
					tempint = 13;
				}if(temp.equals("e")||temp.equals("E")){
					tempint = 14;
				}if(temp.equals("f")||temp.equals("F")){
					tempint = 15;
				}
				for (int j = 1; j < str1.length() - i; j++) {// 5AA
					tempint *= 16;
				}
				
				count += tempint;
			}
			System.out.println(count);
		}
	}

}

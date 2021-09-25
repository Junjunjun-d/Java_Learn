package com.java.learn.sub.util;

import com.java.learn.sub.sort.BubblingSortArray;

public class Sort {
	// 冒泡法排序数组
	public static int[] sortIntArray(int[] intArray) {

		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = 0; j < intArray.length - 1 - i; j++) {
				int temp;
				if (intArray[j] > intArray[j + 1]) {
					temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
		return intArray;
	}

	// 冒泡法排序Char，忽略大小写
	public static char[] sortCharIgnoreCaseArray(char[] intArray) {

		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = 0; j < intArray.length - 1 - i; j++) {
				char temp;
				if (Character.toLowerCase(intArray[j]) > Character.toLowerCase(intArray[j + 1])) {
					temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
		return intArray;
	}

	// 冒泡法排序Char，忽略大小写
	public static char[] sortCharArray(char[] intArray) {

		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = 0; j < intArray.length - 1 - i; j++) {
				char temp;
				if (intArray[j] > intArray[j + 1]) {
					temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
		return intArray;
	}

	// 排序字符串：忽略大小写并且只考虑字母排序
	public static String sortStringIgnoreCase(String strs) {

		// 1、把纯字母取出来放到一个字符串中
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strs.length(); i++) {
			char c = strs.charAt(i);
			if (Character.isLetter(c)) {// 判断是否为字母
				sb.append(c);
			}
		}
		System.out.println(sb.toString());

		// 冒泡排序法排序字母
		char[] cs = sb.toString().toCharArray();
		BubblingSortArray.sortCharArray(cs);
		for (int i = 0; i < cs.length; i++) {
			for (int j = 0; j < cs.length - i - 1; j++) {
				// 忽略大小写比较大小
				if (Character.toLowerCase(cs[j]) - Character.toLowerCase(cs[j + 1]) > 0) {
					char temp = cs[j];
					cs[j] = cs[j + 1];
					cs[j + 1] = temp;
				}
			}
		}

		for (char c : cs) {
			System.out.print(c);
		}
		System.out.println("");

		StringBuilder result = new StringBuilder();
		int index = 0;
		for (int i = 0; i < strs.length(); i++) {
			char c = strs.charAt(i);
			if (Character.isLetter(c)) {// 如果是字母就用排好序的数组替换
				result.append(cs[index]);
				index++;
			} else {
				result.append(c);// 如果不是就直接插入
			}
		}
		return result.toString();
	}

}

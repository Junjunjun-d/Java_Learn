package com.java.learn.sub.util;

import com.java.learn.sub.sort.BubblingSortArray;

public class Sort {
	// ð�ݷ���������
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

	// ð�ݷ�����Char�����Դ�Сд
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

	// ð�ݷ�����Char�����Դ�Сд
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

	// �����ַ��������Դ�Сд����ֻ������ĸ����
	public static String sortStringIgnoreCase(String strs) {

		// 1���Ѵ���ĸȡ�����ŵ�һ���ַ�����
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strs.length(); i++) {
			char c = strs.charAt(i);
			if (Character.isLetter(c)) {// �ж��Ƿ�Ϊ��ĸ
				sb.append(c);
			}
		}
		System.out.println(sb.toString());

		// ð������������ĸ
		char[] cs = sb.toString().toCharArray();
		BubblingSortArray.sortCharArray(cs);
		for (int i = 0; i < cs.length; i++) {
			for (int j = 0; j < cs.length - i - 1; j++) {
				// ���Դ�Сд�Ƚϴ�С
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
			if (Character.isLetter(c)) {// �������ĸ�����ź���������滻
				result.append(cs[index]);
				index++;
			} else {
				result.append(c);// ������Ǿ�ֱ�Ӳ���
			}
		}
		return result.toString();
	}

}

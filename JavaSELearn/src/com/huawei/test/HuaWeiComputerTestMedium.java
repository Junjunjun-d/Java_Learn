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
	 * @param ��Ϊ��������ϰ �е�   
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		// hexadecimalConversion();//26 ����ת��
		// getAndPrintPrimeFactor();// 27 ��������

		// mergeTableRecord();//28 �ϲ����¼
		// getNotRepeatInt();//29 ��ȡ���ظ�������
		// getCharCount();// 30 �ַ�����ͳ��
		sortString();
	}

	/*
	 * 31 �ַ������򣺸���n���ַ��������n���ַ��������ֵ������С�
	 * 
	 * ���� 9 cap to cat card two too up boat
	 * 
	 * boot ��� boat boot cap card cat to too two up
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
	 * 30 �ַ�����ͳ�ƣ�
	 * ��дһ�������������ַ����к��еĲ�ͬ�ַ��ĸ������ַ���ACSII�뷶Χ��(0~127)�����б�ʾ���������������ַ�����ڷ�Χ�ڵĲ���ͳ�ơ�
	 * �����ͬ���ַ�ֻ����һ�� ���磬�����ַ���abaca���ԣ���a��b��c���ֲ�ͬ���ַ���������3��
	 */
	public static void getCharCount() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			String[] strs = string.split("");// ���ַ���ת��������
			// ȥ�ز�����
			Set<String> set = new LinkedHashSet<String>(Arrays.asList(strs));

			System.out.println(set.size());
		}
	}

	/*
	 * 29 ��ȡ���ظ�������������һ��int�����������մ���������Ķ�˳�򣬷���һ�������ظ����ֵ��µ������� ��֤������������һλ����0��
	 * 9876673
	 */
	public static void getNotRepeatInt() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {

			StringBuffer stringBuffer = new StringBuffer(scanner.nextLine());
			String string = stringBuffer.reverse().toString();// �����ַ�����ת

			String[] strs = string.split("");// ���ַ���ת��������
			// ȥ�ز�����С����ʹ��TreeSet
			// Set<String> set = new TreeSet(Arrays.asList(strs));
			// ȥ�ز�����
			Set<String> set = new LinkedHashSet<String>(Arrays.asList(strs));

			String resString = "";
			// ����set��������ַ���
			for (String string2 : set) {
				resString += string2;
			}
			System.out.println(resString);
		}
	}


	/*
	 * 28 �ϲ����¼�����ݱ��¼��������������ֵ��int��Χ��������������Ա�������ͬ�ļ�¼���кϲ���
	 * ������ͬ��������ֵ����������㣬�������keyֵ������������
	 * 
	 * ��������: �������ֵ�Եĸ��� Ȼ������ɶԵ�index��valueֵ���Կո����
	 * 
	 * �������: ����ϲ���ļ�ֵ�ԣ����У�
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
	 * 27 �������ӣ�����:����һ�������������մ�С�����˳������������������ӣ��ظ���ҲҪ�о٣�����180��������Ϊ2 2 3 3 5 ��
	 * ���һ��������ҲҪ�пո�
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
	 * 26  ����ת��: д��һ�����򣬽���һ��ʮ�����Ƶ������������ֵ��ʮ���Ʊ�ʾ .
	 * ����
	 * 0xA
	 * 0xAA
	 * ���
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

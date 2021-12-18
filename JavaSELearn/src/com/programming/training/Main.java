package com.programming.training;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * https://dict.youdao.com/search?q=%E7%AE%97%E6%95%B0&keyfrom=new-fanyi.smartResult
 * 
 * @author ��̳�ѧ������ѵ��
 *
 */
public class Main {

	public static void main(String[] args) {
		// section2Number();// 1 BC120 ������ �˷�������������ܳ�����λ �����ʱ̫��,java��ʱ��û�뵽���õ�
		// printBirthday();//2 BC14 ���������������
		// exchangeOfOutput();// 3 BC15 ���ո�ʽ���벢�������
		// printK();//4 BC64 K��ͼ��
		// charToASCII();//5 BC16 �ַ�תASCII��
		// division();//6 BC18 ����������
		// reverse();//7 BC19 �������һ����λ��
		// bc18();//8 BC20 kiki����
		// bc19();//9 BC21 �������ĸ�λ����
		// new Inner().show();// 10 �ڲ���
		// powersOf2(10);// 11 2�Ķ���ݼ��� ʹ������λ����
		// outputScore();//12 BC24 �ܳɼ���ƽ���ּ���
		// getAvgScore();// 13 BC33 ����ƽ���ɼ�
		// calTriangle();// 14 BC26 ���������ε��ܳ������
		//calSphereVolume(); // 15 BC27 ������������
		upperToLower(); // 16 BC28 ��Сдת��
	}

	/*
	 * 16 BC28 ������������
	 * 
	 */
	public static void upperToLower() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			String input = sr.nextLine();	
			System.out.println(input.toLowerCase());
		}
		
		sr.close();
	}
	
	/*
	 * 15 BC27 ������������
	 * 
    	V = 4/3*��r3������ �� = 3.1415926
	 */
	public static void calSphereVolume() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			float r = sr.nextFloat();
			double volume = (4*3.1415926*r*r*r)/3;
			
			DecimalFormat df = new DecimalFormat("#.000");
			System.out.println(df.format(volume));
		}
		
		sr.close();
	}
	 
	/*
	 * 14 BC26 ���������ε��ܳ������
	 * 
    	���׹�ʽ�������
    	p = (a + b + c)/2
    	s = sqrt(p*(p-a)*(p-b)*(p-c))
	 */
	public static void calTriangle() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			String in = sr.nextLine();
			String[] arrs = in.split(" ");
			double[] dou = new double[3];

			double circumference = 0.0;
			for (int i = 0; i < arrs.length; i++) {
				circumference += Double.parseDouble(arrs[i]);;
				dou[i] = Double.parseDouble(arrs[i]);
			}
			double p = circumference / 2;
			double area = Math.sqrt(p*(p-dou[0])*(p-dou[1])*(p-dou[2]));

			DecimalFormat df = new DecimalFormat("###.00");
			System.out.println("circumference= "+df.format(circumference)+" area= "+df.format(area));
		}
		
		sr.close();
	}
	
	/*
	 * 13 BC33 ����ƽ���ɼ� ����һλС�� 75 80 43 67 96 72.2
	 */
	public static void getAvgScore() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			String in = sr.nextLine();
			String[] arrs = in.split(" ");

			float total = 0.0f;
			for (int i = 0; i < arrs.length; i++) {
				total += Float.parseFloat(arrs[i]);
			}
			float avg = total / 5;

			DecimalFormat df = new DecimalFormat("###.0");
			System.out.println(df.format(avg));
		}
		
		sr.close();
	}

	/*
	 * 12 BC24 �ܳɼ���ƽ���ּ��� ���� 79.5 80.0 98.0 �����257.50 85.83
	 */
	public static void outputScore() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			String string = sr.nextLine();
			int index1 = string.indexOf(" ");
			int index2 = string.lastIndexOf(" ");

			float t1 = Float.parseFloat(string.substring(0, index1));
			float t2 = Float.parseFloat(string.substring(index1, index2));
			float t3 = Float.parseFloat(string.substring(index2, string.length()));

			// # ���˲��Ჹ0
			// 0 ����ֱ�Ӳ�0 ǿ�ƶ����ʽ
			DecimalFormat df = new DecimalFormat("###.00");
			String avg = df.format((t1 + t2 + t3) / 3);
			String total = df.format(t1 + t2 + t3);

			System.out.println(total + " " + avg);

		}
		sr.close();
	}

	/*
	 * 11 2�Ķ���ݼ��� ʹ������λ����
	 */
	public static void powersOf2(int i) {
		int res = 1 << i;// 2��16����
		System.out.println(res);
	}

	/*
	 * 10 �ڲ������
	 */
	static class InnerClassDemo6 {
		static class Inner {
			void show() {
				System.out.println("dd");
			}
		}
	}

	/*
	 * 9 BC21 �������ĸ�λ����
	 */
	public static void bc19() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			String s = sr.nextLine();
			int index = s.indexOf(".");
			String a = s.substring(index - 1, index);
			System.out.println(a);

		}
		sr.close();
	}

	/*
	 * 8 BC20 kiki����
	 */
	public static void bc18() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			String s = sr.nextLine();
			int index = s.indexOf(" ");
			String s1 = s.substring(0, index);
			String s2 = s.substring(index + 1);

			if (s1.length() > 2) {

				if (s1.charAt(s1.length() - 2) == '0') {
					s1 = s1.substring(s1.length() - 1);
				} else {
					s1 = s1.substring(s1.length() - 2);
				}

			}
			if (s2.length() > 2) {

				if (s2.charAt(s2.length() - 2) == '0') {
					s2 = s2.substring(s2.length() - 1);
				} else {
					s2 = s2.substring(s2.length() - 2);
				}

			}
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			String sum = a + b + "";
			if (sum.length() > 2) {

				if (sum.charAt(sum.length() - 2) == '0') {
					sum = sum.substring(sum.length() - 1);
				} else {
					sum = sum.substring(sum.length() - 2);
				}

			}

			System.out.print(sum);
		}
		sr.close();
	}

	/*
	 * 7 BC19 �������һ����λ��
	 */
	public static void reverse() {
		Scanner sr = new Scanner(System.in);

		while (sr.hasNext()) {
			String s = sr.nextLine();
			StringBuilder sb = new StringBuilder(s);
			System.out.println(sb.reverse());
		}
		sr.close();
	}

	/*
	 * 6 BC18 ����������
	 * 
	 * ʾ��1 ���룺 15 2 ����� 7 1
	 * 
	 */
	public static void division() {
		Scanner sr = new Scanner(System.in);

		while (sr.hasNext()) {
			String s = sr.nextLine();

			int index = s.indexOf(" ");
			int a = Integer.parseInt(s.substring(0, index));
			int b = Integer.parseInt(s.substring(index + 1));
			System.out.print(a / b + " " + a % b);

		}
		sr.close();

	}

	/*
	 * 5 BC16 �ַ�תASCII��
	 */
	public static void charToASCII() {
		Scanner sr = new Scanner(System.in);

		while (sr.hasNext()) {

			String s = sr.nextLine();
			byte[] bytestr = s.getBytes();
			String temp = "";
			for (int i = 0; i < bytestr.length; i++) {
				temp += bytestr[i] + " ";
			}
			System.out.println(temp);

		}
		sr.close();
	}

	/*
	 * 4 BC64 K��ͼ���� KiKiѧϰ��ѭ����BoBo��ʦ��������һϵ�д�ӡͼ������ϰ���������Ǵ�ӡ�á�*����ɵ�K��ͼ����
	 */
	public static void printK() {
		Scanner sr = new Scanner(System.in);

		while (sr.hasNext()) {
			int size = sr.nextInt();
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size - i + 1; j++) {
					System.out.print("* ");
				}
				for (int k = 0; k < i; k++) {
					System.out.print("  ");
				}
				System.out.println();
			}
			System.out.println("* ");
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < 2 + i; j++) {
					System.out.print("* ");
				}
				for (int k = 0; k < size; k++) {
					System.out.print("  ");
				}
				System.out.println();
			}
			System.out.println();
		}
		sr.close();

	}

	/*
	 * 3 BC15 ���ո�ʽ���벢������� ����������������Χ-2^31~2^31-1�������������������
	 * 
	 * ���������� ����ֻ��һ�У����ո�ʽ����������������Χ���м��á�,���ָ���
	 * 
	 * ��������� ��������������ʽ������м��á�,���ָ���
	 */
	public static void exchangeOfOutput() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			String input = sr.nextLine();
			String t1 = input.substring(0, input.indexOf(","));
			String t2 = input.substring(input.indexOf(",") + 1);
			String s1 = t1.substring(0, 2);
			String s2 = t2.substring(0, 2);
			String n1 = t1.substring(2);
			String n2 = t2.substring(2);
			System.out.println(s1 + n2 + "," + s2 + n1);

		}
		sr.close();
	}

	/*
	 * 2 BC14 ���������������:����һ���˵ĳ������ڣ����������գ������������е��ꡢ�¡��շֱ������
	 * 
	 * ���������� ����ֻ��һ�У��������ڣ����������գ�������֮�������û�зָ�����
	 * 
	 * ��������� ���У���һ��Ϊ������ݣ��ڶ���Ϊ�����·ݣ�������Ϊ�������ڡ����ʱ����·ݻ�����Ϊ1λ������Ҫ��1λ��ǰ�油0��
	 * 
	 */

	public static void printBirthday() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			String strs = sr.nextLine();
			String year = strs.substring(0, 4);
			String month = strs.substring(4, 6);
			String day = strs.substring(6, 8);
			System.out.println("year = " + year);
			System.out.println("month = " + month);
			System.out.println("day = " + day);

		}
		sr.close();
	}

	/*
	 * 1 BC120 С���ִ���ʦ���������˶�����������ʣ����������˽��������
	 * 
	 * ����������������������ǡ�ð������ֲ�ͬ��ʮ��������s��t��s����0������s�����г��־����������е�t��ǰ�档
	 * ���磬44444411�Ƕ�������s��4��t��1����41��10000000��5555556Ҳ�ǡ���4444114��44444�����Ƕ�������
	 * ��ʱ��ʦ��С���֣�����һ�������������n�����������n������n�ı�������С���������������С���ֽ��������⡣
	 * 
	 * ���������� �������룬ÿ���������һ��������n (1 �� n �� 99999)
	 * 
	 * ��Ŀ��֤������������������500�飬������n=0ʱ��������� ��������� ����ÿ��������������������n�����������:
	 * ��������𰸲����У�����n������n�ı�������С��������
	 * 
	 * ʾ��1
	 * 
	 * ���룺 1
	 * 
	 * 2019
	 * 
	 * 0
	 * 
	 * ����� 1: 10
	 * 
	 * 2019: 9999999993
	 * 
	 */
	public static void section2Number() {
		Scanner sr = new Scanner(System.in);
		while (sr.hasNext()) {
			int input = sr.nextInt();
			if (input == 0) {
				sr.close();
			}
			boolean flag = false;
			int t = 2;
			String s = "";
			while (!flag) { 
				s = (long) input * t + "";
				char first = s.charAt(0);
				int count = 0;
				for (int i = 1; i < s.length(); i++) {
					if (s.charAt(i) != first) {
						first = s.charAt(i);
						count++;
					}
					if (count == 2) {
						break;
					}
				}
				if (count == 1) {
					flag = true;
				} else {
					t++;
				}

			}
			System.out.println(input + " : " + (long) input * t);
		}
		sr.close();
	}

}

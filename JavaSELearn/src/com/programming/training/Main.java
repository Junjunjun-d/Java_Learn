package com.programming.training;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * https://dict.youdao.com/search?q=%E7%AE%97%E6%95%B0&keyfrom=new-fanyi.smartResult
 * 
 * @author 编程初学者入门训练
 *
 */
public class Main {

	public static void main(String[] args) {
		// section2Number();// 1 BC120 二段数 此方法输入的数不能超过四位 否则耗时太久,java暂时还没想到更好的
		// printBirthday();//2 BC14 出生日期输入输出
		// exchangeOfOutput();// 3 BC15 按照格式输入并交换输出
		// printK();//4 BC64 K形图案
		// charToASCII();//5 BC16 字符转ASCII码
		// division();//6 BC18 计算带余除法
		// reverse();//7 BC19 反向输出一个四位数
		// bc18();//8 BC20 kiki算数
		// bc19();//9 BC21 浮点数的个位数字
		// new Inner().show();// 10 内部类
		// powersOf2(10);// 11 2的多次幂计算 使用左移位运算
		// outputScore();//12 BC24 总成绩和平均分计算
		// getAvgScore();// 13 BC33 计算平均成绩
		// calTriangle();// 14 BC26 计算三角形的周长和面积
		//calSphereVolume(); // 15 BC27 计算球体的体积
		upperToLower(); // 16 BC28 大小写转换
	}

	/*
	 * 16 BC28 计算球体的体积
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
	 * 15 BC27 计算球体的体积
	 * 
    	V = 4/3*πr3，其中 π = 3.1415926
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
	 * 14 BC26 计算三角形的周长和面积
	 * 
    	海伦公式求面积：
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
	 * 13 BC33 计算平均成绩 保留一位小数 75 80 43 67 96 72.2
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
	 * 12 BC24 总成绩和平均分计算 输入 79.5 80.0 98.0 输出：257.50 85.83
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

			// # 少了不会补0
			// 0 少了直接补0 强制对齐格式
			DecimalFormat df = new DecimalFormat("###.00");
			String avg = df.format((t1 + t2 + t3) / 3);
			String total = df.format(t1 + t2 + t3);

			System.out.println(total + " " + avg);

		}
		sr.close();
	}

	/*
	 * 11 2的多次幂计算 使用左移位运算
	 */
	public static void powersOf2(int i) {
		int res = 1 << i;// 2的16次幂
		System.out.println(res);
	}

	/*
	 * 10 内部类相关
	 */
	static class InnerClassDemo6 {
		static class Inner {
			void show() {
				System.out.println("dd");
			}
		}
	}

	/*
	 * 9 BC21 浮点数的个位数字
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
	 * 8 BC20 kiki算数
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
	 * 7 BC19 反向输出一个四位数
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
	 * 6 BC18 计算带余除法
	 * 
	 * 示例1 输入： 15 2 输出： 7 1
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
	 * 5 BC16 字符转ASCII码
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
	 * 4 BC64 K形图案： KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的K形图案。
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
	 * 3 BC15 按照格式输入并交换输出 输入两个整数，范围-2^31~2^31-1，交换两个数并输出。
	 * 
	 * 输入描述： 输入只有一行，按照格式输入两个整数，范围，中间用“,”分隔。
	 * 
	 * 输出描述： 把两个整数按格式输出，中间用“,”分隔。
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
	 * 2 BC14 出生日期输入输出:输入一个人的出生日期（包括年月日），将该生日中的年、月、日分别输出。
	 * 
	 * 输入描述： 输入只有一行，出生日期，包括年月日，年月日之间的数字没有分隔符。
	 * 
	 * 输出描述： 三行，第一行为出生年份，第二行为出生月份，第三行为出生日期。输出时如果月份或天数为1位数，需要在1位数前面补0。
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
	 * 1 BC120 小乐乐从老师口中听到了二段数这个名词，想更深入的了解二段数。
	 * 
	 * 二段数是这样的正整数：恰好包含两种不同的十进制数字s和t，s不是0，并且s的所有出现均排列在所有的t的前面。
	 * 例如，44444411是二段数（s是4，t是1），41、10000000和5555556也是。但4444114和44444都不是二段数。
	 * 这时老师问小乐乐：给你一个任意的正整数n，你能求出比n大并且是n的倍数的最小二段数吗？请你帮助小乐乐解答这个问题。
	 * 
	 * 输入描述： 多组输入，每组输入包含一个正整数n (1 ≤ n ≤ 99999)
	 * 
	 * 题目保证测试数据总数不超过500组，当输入n=0时程序结束。 输出描述： 对于每组测试用例，输出正整数n，后面紧跟“:
	 * ”，输出答案并换行，即比n大且是n的倍数的最小二段数。
	 * 
	 * 示例1
	 * 
	 * 输入： 1
	 * 
	 * 2019
	 * 
	 * 0
	 * 
	 * 输出： 1: 10
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

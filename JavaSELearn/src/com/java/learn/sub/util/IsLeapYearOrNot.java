package com.java.learn.sub.util;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsLeapYearOrNot {
	/**
	 * 判断是否湿润年:能被4或100整除，不能被400整除	 
	 */
	// 获取控制台输入的字符
	public static void isLeapYear() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份:");
		while (scanner.hasNext()) {// 可以直接使用hasNextInt()直接输入int类型的值，可以省略判断正确年份

			String year = scanner.next();
			;

			// 正则表达式判断是否是正确的年份
			String reg = "^[1-9][0-9]*$";
			Pattern pattern = Pattern.compile(reg);

			Matcher matcher = pattern.matcher(year);
			boolean bn = matcher.matches();
			// 如果正确则执行判断，否则给出提示
			if (bn) {
				System.out.print("year = " + year);
				long y = Integer.parseInt(year);
				if ((y % 4 == 0 || y % 100 == 0) && (y % 400 != 0)) {
					System.out.println(" 是闰年");
				} else {
					System.out.println(" 不是闰年");
				}
			} else {
				System.out.println("请输入正确的年份！");
			}
		}
	}

}

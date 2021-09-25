package com.java.learn.sub.util;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsLeapYearOrNot {
	/**
	 * �ж��Ƿ�ʪ����:�ܱ�4��100���������ܱ�400����	 
	 */
	// ��ȡ����̨������ַ�
	public static void isLeapYear() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������:");
		while (scanner.hasNext()) {// ����ֱ��ʹ��hasNextInt()ֱ������int���͵�ֵ������ʡ���ж���ȷ���

			String year = scanner.next();
			;

			// ������ʽ�ж��Ƿ�����ȷ�����
			String reg = "^[1-9][0-9]*$";
			Pattern pattern = Pattern.compile(reg);

			Matcher matcher = pattern.matcher(year);
			boolean bn = matcher.matches();
			// �����ȷ��ִ���жϣ����������ʾ
			if (bn) {
				System.out.print("year = " + year);
				long y = Integer.parseInt(year);
				if ((y % 4 == 0 || y % 100 == 0) && (y % 400 != 0)) {
					System.out.println(" ������");
				} else {
					System.out.println(" ��������");
				}
			} else {
				System.out.println("��������ȷ����ݣ�");
			}
		}
	}

}

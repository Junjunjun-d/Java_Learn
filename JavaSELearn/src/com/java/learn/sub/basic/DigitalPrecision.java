package com.java.learn.sub.basic;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DigitalPrecision {
	public static void test() {

		// ����һ����������
		double d1 = 36.965845;
		BigDecimal b = new BigDecimal(d1);
		d1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(d1);

		// ��������DecimalFormat
		// 1����DecimalFormat ���ص���String��ʽ�ġ������ʮ���ƽ���ȫ��ķ�װ����%�š�ǧ��λ��С�����ȡ���ѧ�����
		double d2 = 100.9;
		// ���췽�����ַ���ʽ�������С������2λ,����0����
		DecimalFormat decimalFormat = new DecimalFormat("##.00");
		// format ���ص����ַ���
		String p = decimalFormat.format(d2);
		System.out.println(p);

		// �������� String.format %.��ʾС����ǰ����λ����2��ʾ��λС������ʽ��Ľ��Ϊf����ʾ������
		double d3 = 3.1415926;
		String result = String.format("%.2f", d3);
		System.out.println(result);

		// �����ġ�NumberFormat
		double d4 = 23.545525;
		NumberFormat ddf1 = NumberFormat.getNumberInstance();
		ddf1.setMaximumFractionDigits(2);// ����С������λ��
		String s = ddf1.format(d4);
		System.out.println(s);

		// �����塢MATH.ROUND ��Math.round����,���ﷵ�ص����ָ�ʽ�� ����е��� ������ʹ��
		double d5 = 89.89526;
		// ���Ҫ��ȷ4λ��*10000Ȼ��/10000
		float num = (float) (Math.round(d5 * 1000)) / 1000;
		System.out.println(num);
	}
}

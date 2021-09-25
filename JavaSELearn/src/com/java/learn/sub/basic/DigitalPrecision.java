package com.java.learn.sub.basic;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DigitalPrecision {
	public static void test() {

		// 方案一、四舍五入
		double d1 = 36.965845;
		BigDecimal b = new BigDecimal(d1);
		d1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(d1);

		// 方案二、DecimalFormat
		// 1、用DecimalFormat 返回的是String格式的、该类对十进制进行全面的封装、像%号、千分位、小数精度、科学计算等
		double d2 = 100.9;
		// 构造方法的字符格式这里如果小数不足2位,会以0补足
		DecimalFormat decimalFormat = new DecimalFormat("##.00");
		// format 返回的是字符串
		String p = decimalFormat.format(d2);
		System.out.println(p);

		// 方案三、 String.format %.表示小数点前任意位数、2表示两位小数、格式后的结果为f、表示浮点型
		double d3 = 3.1415926;
		String result = String.format("%.2f", d3);
		System.out.println(result);

		// 方案四、NumberFormat
		double d4 = 23.545525;
		NumberFormat ddf1 = NumberFormat.getNumberInstance();
		ddf1.setMaximumFractionDigits(2);// 控制小数点后的位数
		String s = ddf1.format(d4);
		System.out.println(s);

		// 方案五、MATH.ROUND 用Math.round计算,这里返回的数字格式的 这个有点绕 不建议使用
		double d5 = 89.89526;
		// 如果要求精确4位就*10000然后/10000
		float num = (float) (Math.round(d5 * 1000)) / 1000;
		System.out.println(num);
	}
}

package com.java.learn.sub.exercise;

public class Operators {

	public static void test() {
		System.out.println("12/0.0=" + (12 / 0.0));// 12/0.0=Infinity
		System.out.println("value = " + (2.0 - 1.1));// value =
														// 0.8999999999999999

		/*
		 * 计算优先级
		 */
		int x = 1;
		int y = 1;
		int z = 1;
		boolean f = (x + y) + (2 * z) - (2 / 2) > (3 - 1);
		System.out.println(f);
		/*
		 * //在计算时，如果不存在long，那么表达式的返回值都是int，如果存在long，则返回值为long
		 */
		byte a = 1;
		byte b = 2;
		int c = (a + b);
		byte e = (byte) (a + b);// 强制转换
		System.out.println(c);

		/*
		 * //++,--在前面时就现在执行加减在赋值，在后面时先赋值在加减
		 */
		int i = 10, m = 10, j, n;
		j = ++i;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		n = m++;
		System.out.println("m = " + m);
		System.out.println("n = " + n);

		/*
		 * 二进制中中最高位1表示负数，0表示整数 9的二进制:00000000 00000000 00000000 00001001
		 * 将操作数对32取模 1%32 = 1 即向右位移一位变成 4:00000000 00000000 00000000 00000100
		 * 向右位移3步变成1:00000000 00000000 00000000 00000001 int和低于int的对32,long对64
		 */
		byte b1 = 8;
		// int b2 = b1 >> 1;//1%32 = 1
		int b2 = b1 >> 35;// 35%32 =3
		System.out.println("b2 = " + b2);

		/*
		 * 三元操作做符：布尔表达式?表达式1:表达式2 布尔表达式结果为true,返回1,结果为false,返回2
		 */
		int a3 = 10, b3 = 20;
		int c3 = a3 > b3 ? a3++ : b3++;
		System.out.println("a3 = " + a3);
		System.out.println("b3= " + b3);
		System.out.println("c3 = " + c3);

	}

}

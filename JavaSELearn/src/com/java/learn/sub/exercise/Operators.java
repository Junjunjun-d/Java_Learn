package com.java.learn.sub.exercise;

public class Operators {

	public static void test() {
		System.out.println("12/0.0=" + (12 / 0.0));// 12/0.0=Infinity
		System.out.println("value = " + (2.0 - 1.1));// value =
														// 0.8999999999999999

		/*
		 * �������ȼ�
		 */
		int x = 1;
		int y = 1;
		int z = 1;
		boolean f = (x + y) + (2 * z) - (2 / 2) > (3 - 1);
		System.out.println(f);
		/*
		 * //�ڼ���ʱ�����������long����ô���ʽ�ķ���ֵ����int���������long���򷵻�ֵΪlong
		 */
		byte a = 1;
		byte b = 2;
		int c = (a + b);
		byte e = (byte) (a + b);// ǿ��ת��
		System.out.println(c);

		/*
		 * //++,--��ǰ��ʱ������ִ�мӼ��ڸ�ֵ���ں���ʱ�ȸ�ֵ�ڼӼ�
		 */
		int i = 10, m = 10, j, n;
		j = ++i;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		n = m++;
		System.out.println("m = " + m);
		System.out.println("n = " + n);

		/*
		 * �������������λ1��ʾ������0��ʾ���� 9�Ķ�����:00000000 00000000 00000000 00001001
		 * ����������32ȡģ 1%32 = 1 ������λ��һλ��� 4:00000000 00000000 00000000 00000100
		 * ����λ��3�����1:00000000 00000000 00000000 00000001 int�͵���int�Ķ�32,long��64
		 */
		byte b1 = 8;
		// int b2 = b1 >> 1;//1%32 = 1
		int b2 = b1 >> 35;// 35%32 =3
		System.out.println("b2 = " + b2);

		/*
		 * ��Ԫ�����������������ʽ?���ʽ1:���ʽ2 �������ʽ���Ϊtrue,����1,���Ϊfalse,����2
		 */
		int a3 = 10, b3 = 20;
		int c3 = a3 > b3 ? a3++ : b3++;
		System.out.println("a3 = " + a3);
		System.out.println("b3= " + b3);
		System.out.println("c3 = " + c3);

	}

}

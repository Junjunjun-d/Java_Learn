package com.java.learn.sub.basic;

public class HexadecimalConversion {
	public static void test() {
		int num = 1234;

		System.out.println(Integer.toString(num, 2));// ʮ����ת������
		System.out.println(Integer.toString(num, 8));// ʮ����ת�˽���
		System.out.println(Integer.toString(num, 16));// ʮ����תʮ������

		System.out.print("1234ת�����ƣ�");
		System.out.print(Integer.toBinaryString(num));// ʮ����ת������

		System.out.println();

		System.out.print("1234ת�˽��ƣ�");
		System.out.print("0" + Integer.toOctalString(num));
		// System.out.printf("%#o", num);// ʮ����ת�˽���

		System.out.println();

		System.out.print("1234תʮ�����ƣ�");
		System.out.print("0x" + Integer.toHexString(num));
		// System.out.printf("%#x", num);// ʮ����תʮ������

		System.out.println();

		System.out.println("ABCDEFתʮ���� ��" + Integer.parseInt("ABCDEF", 16));

		System.out.print("ABCDEFתʮ���ƣ�ռλ15 ����һ��");
		System.out.printf("%15s", Integer.parseInt("ABCDEF", 16));

		System.out.println();

		System.out.print("ABCDEFתʮ���ƣ�ռλ15 ��������");
		String s = Integer.valueOf("ABCDEF", 16).toString();
		StringBuilder sb = new StringBuilder(15);
		for (int i = 0; i < 15 - s.length(); i++) {
			sb.append(" ");
		}
		sb.append(s);
		System.out.println(sb);

	}
}

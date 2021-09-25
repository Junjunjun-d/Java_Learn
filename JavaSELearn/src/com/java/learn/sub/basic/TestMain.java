package com.java.learn.sub.basic;

/**
 * @Author: DZF
 * @Date: 2021-08-08 20:35
 * @Description: com.learn.proxy.test
 * @Version: 1.0
 */
public class TestMain {

	public static void test() {
		// �����������ʹ�����ջ���ôreturn���ݵľ������ݡ�
		// ��finally�ı����ջ������ݣ����ǲ���ı䱸�����ݣ����Է���ֵ���䡣
		System.out.println(test1());
		System.out.println();

		// �������������ͣ����ݴ����ڶ��п��ٵĿռ����ջ�д洢���Ƕѵ�����Ӧ�Ŀռ��ַ��
		// ���return���ݵ���ջ�еĿռ��ַ������finally�ı���Ƕ��е����ݣ�
		// ���Ե�return���ص�ַʱ�����ҵ����е����ݾ��Ǳ��ı���
		System.out.println(test2());
		System.out.println();

		// ���ﷵ�ص���string���ǻ�������
		System.out.println(test3());
	}

	public static int test1() {

		int num = 10;
		try {
			return num;
		} finally {
			num++;
			System.out.println("finally��ִ��");
			System.out.println("���ڵ�numֵ�ǣ�" + num);
			// return num;
		}
	}

	public static StringBuilder test2() {

		StringBuilder sb = new StringBuilder("Hello");

		try {

			sb.append(" World");

			return sb;

		} catch (Exception e) {
			return sb;
		} finally {
			sb.append(" Finally");
			System.out.println("���ڵ�sbֵ�ǣ�" + sb);
			// return sb.toString();
		}
	}

	public static String test3() {

		StringBuilder sb = new StringBuilder("Hello");

		try {

			sb.append(" World");

			return sb.toString();

		} catch (Exception e) {
			return sb.toString();
		} finally {
			sb.append(" Finally");
			System.out.println("���ڵ�sbֵ�ǣ�" + sb);
			// return sb.toString();
		}
	}
}

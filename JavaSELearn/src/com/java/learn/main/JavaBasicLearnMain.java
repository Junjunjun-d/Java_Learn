package com.java.learn.main;

import java.io.File;

import com.java.learn.sub.exercise.Thread.FileCopyer;

/**
 * һ��Դ�ļ��п����ж���ࣨclass������ֻ����һ�������ࣨpubic calss�� ���ҹ���������������Դ�ļ�����һ��
 * �����������淶��ÿ�����ʵ���ָ��ĸ�����д
 * */
public class JavaBasicLearnMain {
	/**
	 * main������Ϊ�������ڣ�jvm����ȥ����main������
	 * 
	 * һ������ķ��������ó�staticʱ main���� ��Ҫnew���������ʹ�����еķ��� һ������ķ��� ���ó�staticʱ main����
	 * ֱ������.������ ���ɵ���
	 **/
	public static void main(String[] args) {

		// ���߳̿����ļ�
		FileCopyer.start(new File(
				"D:\\�������\\�������20150916\\oracle-xe-11.2.0-1.0.x86_64.rpm.zip"),
				"D:\\test", 10);

		// 30 �߳� Thread: ʵ�ֽӿ�Runnable
		// RunnableMethods.test();

		// 29 �߳� Thread: �̳�Thread
		// ThreadMethods.test1();
		// ThreadMethods.test2();

		// 28 ���� Reflect
		// ReflectTest.test();
		// ReflectTestMethods.test();

		// 27 ��������� �����־��¼
		// Logger.log("sadadasdas");
		//
		// try {
		// FileInputStream fis = new FileInputStream("saasfasf");
		// } catch (Exception e) {
		// e.printStackTrace();
		// Logger.log(e);
		// }

		// 26 CopyDirectory.copyFile(new File("D:\\copy.txt"), "D:\\copytest");
		// CopyDirectory
		// .copyDirectory(
		// new File(
		// "E:\\Work\\Working\\workspace_MyEclipse10\\JavaSELearn\\src\\com"),
		// "D:\\copytest");

		// 25 IO: copy ʹ��File + ·�� + �߼���(ʹ�ø���Ļ��� ���ٴ��̶�д���������Ч��)
		// File secFile2 = new File("D:\\Documents\\UPUP.rar");
		// Copy.test3(secFile2, "d:\\copytest");

		// 24 IO: copy ʹ��File + ·��
		// File secFile1 = new File("D:\\copy.txt");
		// Copy.test2(secFile1, "d:\\test");

		// 23 IO:copy FileInputStream + FileOutputStream
		// Copy.test1("D:\\a.txt", "d:\\copy.txt");

		// 22 IO:FileOutputStream
		// FileOutputStreamTest.test("D:\\FileOutputStreamTest.txt");

		// 21 IO:FileInputStream
		// FileInputStreamTest.test("D:\\a.txt");

		// 20 ������ϰ��
		// ArrayTestMethods.test();

		// 19 map��ϰ
		// HashMapTest.testHashMap();
		// TreeMapTest.testTreeMap();

		// 18 ʹ��LinKList()ʵ���Ƚ������ջ
		// StackTestMethods.test();

		// 17 set����
		// SetTestMethods.hashSetTest();
		// SetTestMethods.treeSetTest();

		// 16 Scanner����next()��nextLine()����
		// scannerTest();

		// 15 ��Ϊ��������ϰ1
		// mergeTableRecord();

		// 14 �ӿڲ���2 car
		// CarTestMethods.test1();

		// 13 �ӿڲ���1 myframe
		// FrameTestMethods.test1();

		// 12 Runtime��������
		// RuntimeTestMethods.runtimeTest();

		// 11 ���㳵��
		// double money = TaxiFare.taxiMoney(22.6f, 184);
		// System.out.println("Ӧ������: " + money + "Ԫ");

		// 10 �ݹ����
		// System.out.println(Recursion.diGui02(6));

		// 9 �ݹ����
		// System.out.println(Recursion.diGui(5000));

		// 8 ��ӡ������
		// JinZiTa.printJinZiTa(20);

		// 7 ��ӡ�����е�ˮ�ɻ���
		// NarcissusNumber.printNarcissusNumber();

		// 6 ����ֵ
		// StudentTestMethods.AssignmentObjects();

		// 5 ���ԣ��������͵Ĵ���
		// StudentTestMethods.test();

		// 4 �ж��Ƿ�ʪ����
		// IsLeapYearOrNot.isLeapYear();

		// 3 ��ӡ�Զ������飺ѡ������
		// SortArrayTestMethods.selectionSort();
		// SortArrayTestMethods.bubblingSort();

		// 2 ��ȡʱ��
		// GetTime gt = new GetTime();
		// gt.getTime();

		// 1 ������
		// Operators.test();
	}
}

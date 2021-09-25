package com.java.learn.main;

import java.io.File;

import com.java.learn.sub.exercise.Thread.FileCopyer;

/**
 * 一个源文件中可以有多个类（class）但是只能有一个公开类（pubic calss） 并且公开类的类名必须和源文件名称一致
 * 类名的命名规范：每个单词的手指字母必须大写
 * */
public class JavaBasicLearnMain {
	/**
	 * main方法作为程序的入口，jvm就是去调用main方法的
	 * 
	 * 一个类里的方法不设置成static时 main方法 需要new出对象才能使用其中的方法 一个类里的方法 设置成static时 main方法
	 * 直接类名.方法名 即可调用
	 **/
	public static void main(String[] args) {

		// 多线程拷贝文件
		FileCopyer.start(new File(
				"D:\\常用软件\\工作软件20150916\\oracle-xe-11.2.0-1.0.x86_64.rpm.zip"),
				"D:\\test", 10);

		// 30 线程 Thread: 实现接口Runnable
		// RunnableMethods.test();

		// 29 线程 Thread: 继承Thread
		// ThreadMethods.test1();
		// ThreadMethods.test2();

		// 28 反射 Reflect
		// ReflectTest.test();
		// ReflectTestMethods.test();

		// 27 输入输出流 完成日志记录
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

		// 25 IO: copy 使用File + 路径 + 高级流(使用更大的缓存 减少磁盘读写次数，提高效率)
		// File secFile2 = new File("D:\\Documents\\UPUP.rar");
		// Copy.test3(secFile2, "d:\\copytest");

		// 24 IO: copy 使用File + 路径
		// File secFile1 = new File("D:\\copy.txt");
		// Copy.test2(secFile1, "d:\\test");

		// 23 IO:copy FileInputStream + FileOutputStream
		// Copy.test1("D:\\a.txt", "d:\\copy.txt");

		// 22 IO:FileOutputStream
		// FileOutputStreamTest.test("D:\\FileOutputStreamTest.txt");

		// 21 IO:FileInputStream
		// FileInputStreamTest.test("D:\\a.txt");

		// 20 集合练习题
		// ArrayTestMethods.test();

		// 19 map练习
		// HashMapTest.testHashMap();
		// TreeMapTest.testTreeMap();

		// 18 使用LinKList()实现先进后出的栈
		// StackTestMethods.test();

		// 17 set测试
		// SetTestMethods.hashSetTest();
		// SetTestMethods.treeSetTest();

		// 16 Scanner器中next()和nextLine()区别
		// scannerTest();

		// 15 华为机试题练习1
		// mergeTableRecord();

		// 14 接口测试2 car
		// CarTestMethods.test1();

		// 13 接口测试1 myframe
		// FrameTestMethods.test1();

		// 12 Runtime方法测试
		// RuntimeTestMethods.runtimeTest();

		// 11 计算车费
		// double money = TaxiFare.taxiMoney(22.6f, 184);
		// System.out.println("应付车费: " + money + "元");

		// 10 递归求积
		// System.out.println(Recursion.diGui02(6));

		// 9 递归求和
		// System.out.println(Recursion.diGui(5000));

		// 8 打印金字塔
		// JinZiTa.printJinZiTa(20);

		// 7 打印出所有的水仙花数
		// NarcissusNumber.printNarcissusNumber();

		// 6 对象赋值
		// StudentTestMethods.AssignmentObjects();

		// 5 测试：引用类型的传递
		// StudentTestMethods.test();

		// 4 判断是否湿润年
		// IsLeapYearOrNot.isLeapYear();

		// 3 打印自定义数组：选择排序
		// SortArrayTestMethods.selectionSort();
		// SortArrayTestMethods.bubblingSort();

		// 2 获取时间
		// GetTime gt = new GetTime();
		// gt.getTime();

		// 1 操作符
		// Operators.test();
	}
}

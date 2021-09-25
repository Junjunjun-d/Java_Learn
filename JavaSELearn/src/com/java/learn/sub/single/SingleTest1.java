package com.java.learn.sub.single;
/**
 * 
 * @author Administrator
 * 饿汉式
 */
public class SingleTest1 {
	// 私有化构造方法
	private SingleTest1() {
	};

	// 私有并静态本类对象
	private static SingleTest1 singleTest = new SingleTest1();

	// 定义共有并静态的方法，返回该对象
	public static SingleTest1 getTest() {

		return singleTest;
	}
}

/**
 * 懒汉式
 */
class SingleTest2 {
	// 私有化构造方法
	private SingleTest2() {
	};

	// 私有并静态本类对象,但是并不创建对象
	private static SingleTest2 s = null;

	// 定义共有并静态的方法，返回该对象
	public static SingleTest2 getSingleTest2() {
		if(s == null){
			s = new SingleTest2();
		}
		return s;
	}
}
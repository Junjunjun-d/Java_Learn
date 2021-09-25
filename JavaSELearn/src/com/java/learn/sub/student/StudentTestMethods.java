package com.java.learn.sub.student;

public class StudentTestMethods {
	/** 对象赋值*/
	public static void AssignmentObjects() {
		// 创建一个对象之后可以用不同的方式对属性进行赋值

		// 1.调用无参数的构造方法之后使用setXXX()方法
		Student student = new Student();// 当创建了有参构造方法时,系统不再提供无参构造方法,所以只能在构造一个无参的构造方法
		student.setAge(200);// 调用方法
		student.setName("李一");

		// 调用属性:如果student类中的属性是private时,此种方式是不支持的,一般情况属性都会私有化.
		// student.name = "李一";
		student.study("Java");

		// 2.在student类中声明属性的时候直接赋缺省值
		Student student2 = new Student();
		student2.study("Python");

		// 3.调用有参数的构造方法给属性赋值
		Student student3 = new Student("李二", 36);
		student3.study("GIS");

	}

	/**测试：引用类型的传递*/
	public static void test() {
		// 调用无参的构造方法时，s1和s2都是初始值
		Student s1 = new Student();
		Student s2 = s1;
		System.out.println("s1 == " + s1.study("Java"));
		System.out.println("s2 == " + s2.study("Python"));

		// 调用有参的构造方法时，s3和s4的值都是传进去的新值
		Student s3 = new Student("小红", 12);
		Student s4 = s3;
		System.out.println("s3 == " + s3.study("Java"));
		System.out.println("s4 == " + s4.study("Python"));

		// 调用无参的构造方法时，s5和s6都是初始值并改变s5的值
		Student s5 = new Student();
		Student s6 = s5;

		// 改变s5的值
		s5.setAge(13);
		s5.setName("Jack");

		System.out.println("s5 == " + s5.study("Java"));
		System.out.println("s6 == " + s6.study("Python"));

		// 调用无参的构造方法时，s7和s8都是初始值并改变s8的值
		Student s7 = new Student();
		Student s8 = s7;

		// 改变s8的值
		s8.setAge(14);
		s8.setName("Tom");

		System.out.println("s7 == " + s7.study("Java"));
		System.out.println("s8 == " + s8.study("Python"));

		// 调用有参的构造方法时，s9和s10的值都是传进去的新值
		Student s9 = new Student("小红", 12);
		Student s10 = s9;

		// 改变s8的值
		s9.setAge(15);
		s9.setName("小张");

		System.out.println("s9 == " + s9.study("Java"));
		System.out.println("s10 == " + s10.study("Python"));

		// 调用有参的构造方法时，s9和s12的值都是传进去的新值
		Student s11 = new Student("小红", 12);
		Student s12 = s11;

		// 改变s8的值
		s12.setAge(16);
		s12.setName("小李");

		System.out.println("s11 == " + s11.study("Java"));
		System.out.println("s12 == " + s12.study("Python"));

		Student s13 = new Student("小红", 12);
		change1(s13);
		System.out.println("s13 == " + s13.study("Java"));

		/*
		 * Student s14 = new Student("小红", 12); s14 = null;
		 * System.out.println("s14 == " + s14.study("Python"));
		 */

		Student s15 = new Student("小红", 12);
		change2(s15);
		System.out.println("s15 == " + s15.study("Python"));
	}

	public static void change1(Student student) {
		student.setAge(20);
		student.setName("张三");
	}

	public static void change2(Student student) {
		student = null;
	}

}

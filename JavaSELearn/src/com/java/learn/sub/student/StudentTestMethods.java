package com.java.learn.sub.student;

public class StudentTestMethods {
	/** ����ֵ*/
	public static void AssignmentObjects() {
		// ����һ������֮������ò�ͬ�ķ�ʽ�����Խ��и�ֵ

		// 1.�����޲����Ĺ��췽��֮��ʹ��setXXX()����
		Student student = new Student();// ���������вι��췽��ʱ,ϵͳ�����ṩ�޲ι��췽��,����ֻ���ڹ���һ���޲εĹ��췽��
		student.setAge(200);// ���÷���
		student.setName("��һ");

		// ��������:���student���е�������privateʱ,���ַ�ʽ�ǲ�֧�ֵ�,һ��������Զ���˽�л�.
		// student.name = "��һ";
		student.study("Java");

		// 2.��student�����������Ե�ʱ��ֱ�Ӹ�ȱʡֵ
		Student student2 = new Student();
		student2.study("Python");

		// 3.�����в����Ĺ��췽�������Ը�ֵ
		Student student3 = new Student("���", 36);
		student3.study("GIS");

	}

	/**���ԣ��������͵Ĵ���*/
	public static void test() {
		// �����޲εĹ��췽��ʱ��s1��s2���ǳ�ʼֵ
		Student s1 = new Student();
		Student s2 = s1;
		System.out.println("s1 == " + s1.study("Java"));
		System.out.println("s2 == " + s2.study("Python"));

		// �����вεĹ��췽��ʱ��s3��s4��ֵ���Ǵ���ȥ����ֵ
		Student s3 = new Student("С��", 12);
		Student s4 = s3;
		System.out.println("s3 == " + s3.study("Java"));
		System.out.println("s4 == " + s4.study("Python"));

		// �����޲εĹ��췽��ʱ��s5��s6���ǳ�ʼֵ���ı�s5��ֵ
		Student s5 = new Student();
		Student s6 = s5;

		// �ı�s5��ֵ
		s5.setAge(13);
		s5.setName("Jack");

		System.out.println("s5 == " + s5.study("Java"));
		System.out.println("s6 == " + s6.study("Python"));

		// �����޲εĹ��췽��ʱ��s7��s8���ǳ�ʼֵ���ı�s8��ֵ
		Student s7 = new Student();
		Student s8 = s7;

		// �ı�s8��ֵ
		s8.setAge(14);
		s8.setName("Tom");

		System.out.println("s7 == " + s7.study("Java"));
		System.out.println("s8 == " + s8.study("Python"));

		// �����вεĹ��췽��ʱ��s9��s10��ֵ���Ǵ���ȥ����ֵ
		Student s9 = new Student("С��", 12);
		Student s10 = s9;

		// �ı�s8��ֵ
		s9.setAge(15);
		s9.setName("С��");

		System.out.println("s9 == " + s9.study("Java"));
		System.out.println("s10 == " + s10.study("Python"));

		// �����вεĹ��췽��ʱ��s9��s12��ֵ���Ǵ���ȥ����ֵ
		Student s11 = new Student("С��", 12);
		Student s12 = s11;

		// �ı�s8��ֵ
		s12.setAge(16);
		s12.setName("С��");

		System.out.println("s11 == " + s11.study("Java"));
		System.out.println("s12 == " + s12.study("Python"));

		Student s13 = new Student("С��", 12);
		change1(s13);
		System.out.println("s13 == " + s13.study("Java"));

		/*
		 * Student s14 = new Student("С��", 12); s14 = null;
		 * System.out.println("s14 == " + s14.study("Python"));
		 */

		Student s15 = new Student("С��", 12);
		change2(s15);
		System.out.println("s15 == " + s15.study("Python"));
	}

	public static void change1(Student student) {
		student.setAge(20);
		student.setName("����");
	}

	public static void change2(Student student) {
		student = null;
	}

}

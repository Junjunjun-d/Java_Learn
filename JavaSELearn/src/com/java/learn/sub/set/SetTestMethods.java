package com.java.learn.sub.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTestMethods {
	public static void hashSetTest() {
		// 新建对象
		Teacher t1 = new Teacher("张二", 25, 6000);
		Teacher t2 = new Teacher("丁一", 21, 5000);
		Teacher t3 = new Teacher("李三", 23, 3000);
		Teacher t4 = new Teacher("王五", 35, 8000);
		Teacher t5 = new Teacher("王五", 35, 9000);
		Teacher t6 = new Teacher("张二", 27, 7000);

		// 把对象添加的HashSet中
		Set<Teacher> s1 = new HashSet<Teacher>();
		s1.add(t1);
		s1.add(t2);
		s1.add(t3);
		s1.add(t4);
		s1.add(t5);
		s1.add(t6);

		// 遍历：foreach
		System.out.println("============hashSetTest=================");
		System.out.println("============遍历：foreach===================");
		for (Teacher teacher : s1) {
			System.out.println(teacher.toString());
		}
		System.out.println("============遍历：Iterator==================");
		// 遍历：Iterator
		Iterator<Teacher> it = s1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

	public static void treeSetTest() {
		// 新建对象
		Teacher t1 = new Teacher("张二", 25, 6000);
		Teacher t2 = new Teacher("丁一", 21, 5000);
		Teacher t3 = new Teacher("李三", 23, 3000);
		Teacher t4 = new Teacher("王五", 35, 8000);
		Teacher t5 = new Teacher("王五", 35, 9000);
		Teacher t6 = new Teacher("张二", 27, 7000);

		// 把对象添加的HashSet中
		Set<Teacher> s1 = new TreeSet<Teacher>();
		s1.add(t1);
		s1.add(t2);
		s1.add(t3);
		s1.add(t4);
		s1.add(t5);
		s1.add(t6);

		System.out.println("============treeSetTest=================");
		System.out.println("============遍历：foreach===================");
		// 遍历：foreach
		for (Teacher teacher : s1) {
			System.out.println(teacher.toString());
		}
		System.out.println("============遍历：Iterator==================");

		// 遍历： Iterator
		Iterator<Teacher> it = s1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}

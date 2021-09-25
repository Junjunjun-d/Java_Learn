package com.java.learn.sub.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTestMethods {
	public static void hashSetTest() {
		// �½�����
		Teacher t1 = new Teacher("�Ŷ�", 25, 6000);
		Teacher t2 = new Teacher("��һ", 21, 5000);
		Teacher t3 = new Teacher("����", 23, 3000);
		Teacher t4 = new Teacher("����", 35, 8000);
		Teacher t5 = new Teacher("����", 35, 9000);
		Teacher t6 = new Teacher("�Ŷ�", 27, 7000);

		// �Ѷ�����ӵ�HashSet��
		Set<Teacher> s1 = new HashSet<Teacher>();
		s1.add(t1);
		s1.add(t2);
		s1.add(t3);
		s1.add(t4);
		s1.add(t5);
		s1.add(t6);

		// ������foreach
		System.out.println("============hashSetTest=================");
		System.out.println("============������foreach===================");
		for (Teacher teacher : s1) {
			System.out.println(teacher.toString());
		}
		System.out.println("============������Iterator==================");
		// ������Iterator
		Iterator<Teacher> it = s1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

	public static void treeSetTest() {
		// �½�����
		Teacher t1 = new Teacher("�Ŷ�", 25, 6000);
		Teacher t2 = new Teacher("��һ", 21, 5000);
		Teacher t3 = new Teacher("����", 23, 3000);
		Teacher t4 = new Teacher("����", 35, 8000);
		Teacher t5 = new Teacher("����", 35, 9000);
		Teacher t6 = new Teacher("�Ŷ�", 27, 7000);

		// �Ѷ�����ӵ�HashSet��
		Set<Teacher> s1 = new TreeSet<Teacher>();
		s1.add(t1);
		s1.add(t2);
		s1.add(t3);
		s1.add(t4);
		s1.add(t5);
		s1.add(t6);

		System.out.println("============treeSetTest=================");
		System.out.println("============������foreach===================");
		// ������foreach
		for (Teacher teacher : s1) {
			System.out.println(teacher.toString());
		}
		System.out.println("============������Iterator==================");

		// ������ Iterator
		Iterator<Teacher> it = s1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}

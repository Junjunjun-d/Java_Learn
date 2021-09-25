package com.java.learn.sub.stack;

import java.util.Iterator;

public class StackTestMethods {

	public static void test() {
		Stack<String> s = new Stack<String>();
		s.push("String01");
		s.push("String02");
		s.push("String03");
		s.push("String04");
		s.push("String05");

		// ����ջ foreach
		System.out.println("=================foreach======================");
		for (String string : s) {
			System.out.println(string);
		}

		// ����ջ Iterator Stack�����ʵ��Iterable�ӿ�
		System.out.println("=================Iterator======================");
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// ��ջ
		System.out.println("=================��ջ======================");
		try {
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			// System.out.println(s.pop());
			// System.out.println(s.pop());
		} catch (StackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}

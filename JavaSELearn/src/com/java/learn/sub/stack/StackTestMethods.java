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

		// 遍历栈 foreach
		System.out.println("=================foreach======================");
		for (String string : s) {
			System.out.println(string);
		}

		// 遍历栈 Iterator Stack类必须实现Iterable接口
		System.out.println("=================Iterator======================");
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 出栈
		System.out.println("=================出栈======================");
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

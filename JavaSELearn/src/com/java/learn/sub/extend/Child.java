package com.java.learn.sub.extend;

public class Child extends Parent {
	public static void prit() {
		System.out.println("C");
	}

	public void B() {
		System.out.println("B");
	}

	public static void main(String[] args) {

		// �̳й�ϵ
		Parent parent = new Parent();
		Child child = new Child();
		parent.A();
		parent.prit();

	}
}

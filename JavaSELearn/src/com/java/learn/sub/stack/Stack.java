package com.java.learn.sub.stack;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack<E> implements Iterable<E> {
	private LinkedList<E> list = new LinkedList<E>();


	// ѹջ
	public void push(E e) {
		list.addLast(e);
	}

	// ��ջ
	public E pop() throws StackException {
		if (list.size() > 0) {
			return list.removeLast();
		} else {
			throw new StackException("ջ���Ѿ�û�������ˣ������ڳ�ջ�ˣ�");
		}

	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}

}

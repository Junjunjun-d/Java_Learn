package com.java.learn.sub.stack;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack<E> implements Iterable<E> {
	private LinkedList<E> list = new LinkedList<E>();


	// 压栈
	public void push(E e) {
		list.addLast(e);
	}

	// 出栈
	public E pop() throws StackException {
		if (list.size() > 0) {
			return list.removeLast();
		} else {
			throw new StackException("栈内已经没有数据了，不能在出栈了！");
		}

	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}

}

package com.spring.test5.autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class AutoWireTest extends TestCase {
	private BeanFactory bf;

	// 初始化方法
	@Override
	protected void setUp() throws Exception {
		// 只创建一次
		// 1、读一个文件
		bf = new ClassPathXmlApplicationContext("applicationContext-autowire.xml");

	}

	// 销毁方法
	@Override
	protected void tearDown() throws Exception {

	}

	public void testAutoWire() {
		Bean2 b2 = (Bean2) bf.getBean("bean2");
		System.out.println("b2.bean3.id = " + b2.getBean3().getId());
		System.out.println("b2.bean3.name = " + b2.getBean3().getName());
		System.out.println("b2.bean3.sex = " + b2.getBean3().getSex());
		System.out.println("b2.bean4.id = " + b2.getBean4().getId());
		System.out.println("b2.bean4.name = " + b2.getBean4().getName());
		System.out.println("b2.bean4.sex = " + b2.getBean4().getSex());
		System.out.println("b2.bean4.id = " + b2.getBean4().getAge());
		System.out.println("b2.bean5.password = " + b2.getBean5().getPassword());

	}
}

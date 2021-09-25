package com.spring.test4.scope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class ScopeTest extends TestCase {
	private BeanFactory bf;

	// 初始化方法
	@Override
	protected void setUp() throws Exception {
		// 只创建一次
		// 1、读一个文件
		bf = new ClassPathXmlApplicationContext("applicationContext-scope.xml");

	}

	public void testScope() {
		Bean1 bean11 = (Bean1) bf.getBean("bean1");
		Bean1 bean12 = (Bean1) bf.getBean("bean1");

		System.out.println(bean11 == bean12);
	}

	// 销毁方法
	@Override
	protected void tearDown() throws Exception {

	}
}

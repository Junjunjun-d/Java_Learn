package com.spring.test4.scope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class ScopeTest extends TestCase {
	private BeanFactory bf;

	// ��ʼ������
	@Override
	protected void setUp() throws Exception {
		// ֻ����һ��
		// 1����һ���ļ�
		bf = new ClassPathXmlApplicationContext("applicationContext-scope.xml");

	}

	public void testScope() {
		Bean1 bean11 = (Bean1) bf.getBean("bean1");
		Bean1 bean12 = (Bean1) bf.getBean("bean1");

		System.out.println(bean11 == bean12);
	}

	// ���ٷ���
	@Override
	protected void tearDown() throws Exception {

	}
}

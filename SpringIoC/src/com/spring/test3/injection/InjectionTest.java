package com.spring.test3.injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class InjectionTest extends TestCase {
	private BeanFactory bf;

	// ��ʼ������
	@Override
	protected void setUp() throws Exception {
		// ֻ����һ��
		// 1����һ���ļ�
		// bf = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2��������ļ� ʹ������
		// String[] conStrings = new String[] { "applicationContext.xml",
		// "applicationContext-editor.xml" };
		// bf = new ClassPathXmlApplicationContext(conStrings);

		// 3��ʹ�������ģ��ƥ�䣺���ַ�ʽ���������ļ�����������Լ������
		bf = new ClassPathXmlApplicationContext("applicationContext-*.xml");

	}

	// ���ٷ���
	@Override
	protected void tearDown() throws Exception {

	}

	public void testInjection1() {
		Bean1 b1 = (Bean1) bf.getBean("bean1");
		System.out.println("b1.strValue = " + b1.getStrValue());
		System.out.println("b1.intValue = " + b1.getIntValue());
		System.out.println("b1.listValue = " + b1.getListValue());
		System.out.println("b1.setValue = " + b1.getSetValue());
		System.out.println("b1.arrayValue = " + b1.getArrayValue());
		System.out.println("b1.mapValue = " + b1.getMapValue());
		System.out.println("b1.dateValue = " + b1.getDateValue());
	}

	public void testInjection2() {
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

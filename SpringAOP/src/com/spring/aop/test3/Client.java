package com.spring.aop.test3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ʹ�������ļ����AOP
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext-AOP3.xml");
		UserManager userManager = (UserManager) bf.getBean("userManagerImpl");
		userManager.addUser("dsd", "12345");
	}
}
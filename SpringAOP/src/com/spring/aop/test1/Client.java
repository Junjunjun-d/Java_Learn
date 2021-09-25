package com.spring.aop.test1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用annotation完成AOP
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext-AOP1.xml");
		UserManager userManager = (UserManager) bf.getBean("userManagerImpl");
		userManager.addUser("dsd", "12345");
	}
}

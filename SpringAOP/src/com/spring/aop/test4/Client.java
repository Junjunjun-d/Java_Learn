package com.spring.aop.test4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用配置文件完成AOP
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext-AOP4.xml");
		UserManagerImpl userManager = (UserManagerImpl) bf.getBean("userManagerImpl");
		userManager.addUser("dsd", "12345");
	}
}

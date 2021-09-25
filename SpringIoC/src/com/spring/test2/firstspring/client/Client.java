package com.spring.test2.firstspring.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test2.firstspring.manager.UserManager;

public class Client {

	public static void main(String[] args) {
		// ��IoC�����л�ȡuserManager
		BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserManager userManager = (UserManager) bf.getBean("userManager");
		userManager.addUser("test1", "test1");

	}

}

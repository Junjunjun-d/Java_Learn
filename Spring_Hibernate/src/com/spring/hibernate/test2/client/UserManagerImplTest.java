package com.spring.hibernate.test2.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.hibernate.test2.domain.User;
import com.spring.hibernate.test2.manager.UserManager;

import junit.framework.TestCase;

public class UserManagerImplTest extends TestCase {

	public void testAddUser() {

		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext-*.xml");
		UserManager userManager = (UserManager) factory.getBean("userManager");

		User u = new User();
		u.setName("Ding");
		try {
			userManager.addUser(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
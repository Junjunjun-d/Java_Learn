package com.spring.hibernate.test1.client;

import com.spring.hibernate.test1.domain.User;
import com.spring.hibernate.test1.manager.UserManager;
import com.spring.hibernate.test1.manager.UserManagerImpl;

import junit.framework.TestCase;

public class UserManagerImplTest extends TestCase {

	public void testAddUser() {
		UserManager userManager = new UserManagerImpl();
		User u = new User();
		u.setName("Wang");
		userManager.addUser(u);
	}
}
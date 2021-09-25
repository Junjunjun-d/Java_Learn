package com.spring.test1.whyspring.client;

import com.spring.test1.whyspring.manager.UserManager;
import com.spring.test1.whyspring.manager.UserManagerImpl;

public class Client {

	public static void main(String[] args) {
		// 由我们的应用程序负责（对象）定位
		UserManager userManager = new UserManagerImpl();
		userManager.addUser("test1", "test1");

	}

}

package com.spring.test1.whyspring.client;

import com.spring.test1.whyspring.manager.UserManager;
import com.spring.test1.whyspring.manager.UserManagerImpl;

public class Client {

	public static void main(String[] args) {
		// �����ǵ�Ӧ�ó����𣨶��󣩶�λ
		UserManager userManager = new UserManagerImpl();
		userManager.addUser("test1", "test1");

	}

}

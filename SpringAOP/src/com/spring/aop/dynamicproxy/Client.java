package com.spring.aop.dynamicproxy;

public class Client {

	public static void main(String[] args) {
		SecurityHandler sh = new SecurityHandler();
		UserManager userManager = (UserManager) sh.createProxyInstance(new UserManagerImpl());
		userManager.addUser("test", "123456");

		userManager.delUser(12);

		userManager.updateUser(12, "test", "123456");

		userManager.queryUser(12);

	}

}

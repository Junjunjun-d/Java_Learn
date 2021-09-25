package com.spring.struts.manager;

public class UserManagerImpl implements UserManager {

	public void login(String username, String password) {
		System.out.println(this.getClass() + ", username=" + username);
	}

}

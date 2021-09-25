package com.spring.test2.firstspring.manager;

import com.spring.test2.firstspring.dao.UserDao;

public class UserManagerImpl implements UserManager {
	private UserDao userDao;

	public UserManagerImpl() {
		super();
	}

	public UserManagerImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(String username, String password) {

		userDao.addUser(username, password);

	}

}

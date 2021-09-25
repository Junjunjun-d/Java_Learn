package com.spring.test1.whyspring.manager;

import com.spring.test1.whyspring.dao.UserDao;
import com.spring.test1.whyspring.dao.UserDao4MySqlImpl;

public class UserManagerImpl implements UserManager {

	@Override
	public void addUser(String username, String password) {
		// 由我们的应用程序负责（对象）定位
		UserDao userDao = new UserDao4MySqlImpl();
		userDao.addUser(username, password);

	}

}

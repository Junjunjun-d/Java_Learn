package com.spring.test1.whyspring.manager;

import com.spring.test1.whyspring.dao.UserDao;
import com.spring.test1.whyspring.dao.UserDao4MySqlImpl;

public class UserManagerImpl implements UserManager {

	@Override
	public void addUser(String username, String password) {
		// �����ǵ�Ӧ�ó����𣨶��󣩶�λ
		UserDao userDao = new UserDao4MySqlImpl();
		userDao.addUser(username, password);

	}

}

package com.spring.aop.test2;

public class UserManagerImpl implements UserManager {

	@Override
	public void addUser(String username, String password) {
		System.out.println("------UserManagerImpl.addUser()-------");
	}

	@Override
	public void delUser(int userId) {
		System.out.println("------UserManagerImpl.delUser()-------");
	}

	@Override
	public String queryUser(int userId) {
		System.out.println("------UserManagerImpl.queryUser()-------");
		return "kkj";
	}

	@Override
	public void updateUser(int userId, String username, String password) {
		System.out.println("------UserManagerImpl.updateUser()-------");
	}

}

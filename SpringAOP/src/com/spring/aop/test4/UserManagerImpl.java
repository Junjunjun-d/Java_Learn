package com.spring.aop.test4;

public class UserManagerImpl {
	// implements UserManager {

	public void addUser(String username, String password) {
		System.out.println("------UserManagerImpl.addUser()-------");
	}

	public void delUser(int userId) {
		System.out.println("------UserManagerImpl.delUser()-------");
	}

	public String queryUser(int userId) {
		System.out.println("------UserManagerImpl.queryUser()-------");
		return "kkj";
	}

	public void updateUser(int userId, String username, String password) {
		System.out.println("------UserManagerImpl.updateUser()-------");
	}

}

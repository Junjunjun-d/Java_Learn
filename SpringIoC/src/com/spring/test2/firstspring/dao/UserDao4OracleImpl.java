package com.spring.test2.firstspring.dao;

public class UserDao4OracleImpl implements UserDao {

	@Override
	public void addUser(String username, String password) {
		System.out.println("UserDao4OracleImpl.addUser()");
	}

}

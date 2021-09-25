package com.spring.aop.dynamicproxy;

public interface UserManager {

	public void addUser(String username, String password);

	public void delUser(int userId);

	public String queryUser(int userId);

	public void updateUser(int userId, String username, String password);

}

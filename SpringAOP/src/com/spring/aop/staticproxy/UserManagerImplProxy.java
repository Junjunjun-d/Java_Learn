package com.spring.aop.staticproxy;

/**
 *
 * @author Administrator
 *
 */
public class UserManagerImplProxy implements UserManager {

	private UserManager userManger;

	public UserManagerImplProxy(UserManager userManger) {
		this.userManger = userManger;
	}

	@Override
	public void addUser(String username, String password) {
		checkSecurity();
		userManger.addUser(username, password);
	}

	@Override
	public void delUser(int userId) {
		checkSecurity();
		userManger.delUser(userId);
	}

	@Override
	public String queryUser(int userId) {
		checkSecurity();
		return userManger.queryUser(userId);
	}

	@Override
	public void updateUser(int userId, String username, String password) {
		checkSecurity();
		userManger.updateUser(userId, username, password);
	}

	private void checkSecurity() {
		System.out.println("------checkSecurity()-------");
	}

}

package com.spring.aop.staticproxy;

public class UserManagerImpl implements UserManager {

	@Override
	public void addUser(String username, String password) {
		// checkSecurity();
		System.out.println("------UserManagerImpl.addUser()-------");
	}

	@Override
	public void delUser(int userId) {
		// checkSecurity();
		System.out.println("------UserManagerImpl.delUser()-------");
	}

	@Override
	public String queryUser(int userId) {
		// checkSecurity();
		System.out.println("------UserManagerImpl.queryUser()-------");
		return "kkj";
	}

	@Override
	public void updateUser(int userId, String username, String password) {
		// checkSecurity();
		System.out.println("------UserManagerImpl.updateUser()-------");
	}

	// private void checkSecurity() {
	// System.out.println("------checkSecurity()-------");
	// }

}

package com.spring.hibernate.test2.manager;

import java.util.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.spring.hibernate.test2.domain.Log;
import com.spring.hibernate.test2.domain.User;

public class UserManagerImpl extends HibernateDaoSupport implements UserManager {

	private LogManager logManager;

	public void setLogManager(LogManager logManager) {
		this.logManager = logManager;
	}

	// public void addUser(User user) {
	// this.getHibernateTemplate().save(user);
	//
	// Log log = new Log();
	// log.setType("������־");
	// log.setTime(new Date());
	// log.setDetail("XXX");
	// logManager.addLog(log);
	//
	// throw new RuntimeException();// ����ʱ�쳣��ع�
	//
	// }

	public void addUser(User user) throws Exception {
		this.getHibernateTemplate().save(user);

		Log log = new Log();
		log.setType("������־");
		log.setTime(new Date());
		log.setDetail("XXX");

		logManager.addLog(log);

		throw new Exception();// �����쳣����ع�
	}

}

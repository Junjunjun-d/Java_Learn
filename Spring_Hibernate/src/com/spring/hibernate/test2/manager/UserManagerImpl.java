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
	// log.setType("操作日志");
	// log.setTime(new Date());
	// log.setDetail("XXX");
	// logManager.addLog(log);
	//
	// throw new RuntimeException();// 运行时异常会回滚
	//
	// }

	public void addUser(User user) throws Exception {
		this.getHibernateTemplate().save(user);

		Log log = new Log();
		log.setType("操作日志");
		log.setTime(new Date());
		log.setDetail("XXX");

		logManager.addLog(log);

		throw new Exception();// 这种异常不会回滚
	}

}

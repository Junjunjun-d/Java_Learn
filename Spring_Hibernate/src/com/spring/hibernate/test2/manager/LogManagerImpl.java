package com.spring.hibernate.test2.manager;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.spring.hibernate.test2.domain.Log;

public class LogManagerImpl extends HibernateDaoSupport implements LogManager {

	public void addLog(Log log) {
		getHibernateTemplate().save(log);
	}

}

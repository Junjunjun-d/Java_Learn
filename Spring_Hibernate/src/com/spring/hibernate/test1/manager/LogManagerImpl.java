package com.spring.hibernate.test1.manager;

import com.spring.hibernate.test1.domain.Log;
import com.spring.hibernate.test1.util.HibernateUtils;

public class LogManagerImpl implements LogManager {

	public void addLog(Log log) {
		HibernateUtils.getSessionFactory().getCurrentSession().save(log);
	}

}

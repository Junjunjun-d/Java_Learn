package com.spring.hibernate.test1.manager;

import java.util.Date;

import org.hibernate.Session;

import com.spring.hibernate.test1.domain.Log;
import com.spring.hibernate.test1.domain.User;
import com.spring.hibernate.test1.util.HibernateUtils;

public class UserManagerImpl implements UserManager {

	public void addUser(User user) {
		Session session = null;
		try {
			// session = HibernateUtils.getSession();
			session = HibernateUtils.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			session.save(user);

			Log log = new Log();
			log.setType("²Ù×÷ÈÕÖ¾");
			log.setTime(new Date());
			log.setDetail("XXX");

			LogManager logManager = new LogManagerImpl();
			logManager.addLog(log);

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			// }finally {
			// HibernateUtils.closeSession(session);
		}
	}

}

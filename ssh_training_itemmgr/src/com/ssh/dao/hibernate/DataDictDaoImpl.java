package com.ssh.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ssh.dao.DataDictDao;
import com.ssh.domain.ItemCategory;
import com.ssh.domain.ItemUnit;

public class DataDictDaoImpl extends HibernateDaoSupport implements DataDictDao {

	public List<ItemCategory> getItemCategoryList() {
		return getHibernateTemplate().find("from ItemCategory");
	}

	public List<ItemUnit> getItemUnitList() {
		return getHibernateTemplate().find("from ItemUnit");
	}

}

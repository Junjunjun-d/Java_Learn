package com.ssh.dao;

import java.util.List;

import com.ssh.domain.ItemCategory;
import com.ssh.domain.ItemUnit;

public interface DataDictDao {

	/**
	 * ȡ�������������б�
	 * @return
	 */
	public List<ItemCategory> getItemCategoryList();
	
	/**
	 * ȡ���ﵥλ�б�
	 * @return
	 */
	public List<ItemUnit> getItemUnitList();
	
}

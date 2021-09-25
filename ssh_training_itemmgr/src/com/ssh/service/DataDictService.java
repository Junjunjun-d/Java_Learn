package com.ssh.service;

import java.util.List;

import com.ssh.domain.ItemCategory;
import com.ssh.domain.ItemUnit;

public interface DataDictService {
	/**
	 * 取得物料类别代码列表
	 * @return
	 */
	public List<ItemCategory> getItemCategoryList();

	/**
	 * 取得物单位列表
	 * @return
	 */
	public List<ItemUnit> getItemUnitList();
}

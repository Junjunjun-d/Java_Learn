package com.ssh.service.impl;

import java.util.List;

import com.ssh.AppException;
import com.ssh.dao.DataDictDao;
import com.ssh.domain.ItemCategory;
import com.ssh.domain.ItemUnit;
import com.ssh.service.DataDictService;


/**
 * 管理数据字典
 * @author Administrator
 *
 */
public class DataDictServiceImpl implements DataDictService{

	private DataDictDao dataDictDao; 
	
	/**
	 * 取得物料类别代码列表
	 * @return
	 */
	public List<ItemCategory> getItemCategoryList() {
		try {
			return (List)dataDictDao.getItemCategoryList();
		}catch(Exception e) {
			e.printStackTrace();
			throw new AppException("查询物料类别失败！");
		}
	}
	
	/**
	 * 取得物单位列表
	 * @return
	 */
	public List<ItemUnit> getItemUnitList() {
		try {
			return (List)dataDictDao.getItemUnitList();
		}catch(Exception e) {
			e.printStackTrace();
			throw new AppException("查询物料单位失败！");
		}
	}

	public void setDataDictDao(DataDictDao dataDictDao) {
		this.dataDictDao = dataDictDao;
	}
	
}

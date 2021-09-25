package com.ssh.service.impl;

import java.util.List;

import com.ssh.AppException;
import com.ssh.dao.DataDictDao;
import com.ssh.domain.ItemCategory;
import com.ssh.domain.ItemUnit;
import com.ssh.service.DataDictService;


/**
 * ���������ֵ�
 * @author Administrator
 *
 */
public class DataDictServiceImpl implements DataDictService{

	private DataDictDao dataDictDao; 
	
	/**
	 * ȡ�������������б�
	 * @return
	 */
	public List<ItemCategory> getItemCategoryList() {
		try {
			return (List)dataDictDao.getItemCategoryList();
		}catch(Exception e) {
			e.printStackTrace();
			throw new AppException("��ѯ�������ʧ�ܣ�");
		}
	}
	
	/**
	 * ȡ���ﵥλ�б�
	 * @return
	 */
	public List<ItemUnit> getItemUnitList() {
		try {
			return (List)dataDictDao.getItemUnitList();
		}catch(Exception e) {
			e.printStackTrace();
			throw new AppException("��ѯ���ϵ�λʧ�ܣ�");
		}
	}

	public void setDataDictDao(DataDictDao dataDictDao) {
		this.dataDictDao = dataDictDao;
	}
	
}

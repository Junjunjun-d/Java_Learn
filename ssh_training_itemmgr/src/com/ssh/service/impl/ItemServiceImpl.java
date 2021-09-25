package com.ssh.service.impl;

import com.ssh.AppException;
import com.ssh.PageModel;
import com.ssh.dao.ItemDao;
import com.ssh.domain.Item;
import com.ssh.service.ItemService;

/**
 * 采用单例模式实现
 * 
 * @author Administrator
 *
 */
public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;

	public void addItem(Item item) {
		try {
			itemDao.addItem(item);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AppException("添加物料失败!");
		}
	}

	/**
	 * 分页查询
	 * 
	 * @param queryString
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public PageModel findAllItem(String queryString, int pageNo, int pageSize) {
		try {
			return itemDao.findAllItem(queryString, pageNo, pageSize);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AppException("分页查询物料失败!");
		}
	}

	/**
	 * 修改物料
	 * 
	 * @param item
	 */
	public void modifyItem(Item item) {
		try {
			itemDao.modifyItem(item);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AppException("修改物料失败!");
		}
	}

	/**
	 * 删除物料
	 * 
	 * @param item
	 */
	public void deleteItem(String[] itemNos) {
		try {
			itemDao.deleteItem(itemNos);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AppException("删除物料失败!");
		}
	}

	/**
	 * 根据物料代码查询
	 * 
	 * @param itemNo
	 * @return
	 */
	public Item findItemById(String itemNo) {
		try {
			return itemDao.findItemById(itemNo);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AppException("根据物料代码查询失败，代码=【" + itemNo + "】!");
		}
	}

	/**
	 * 保存上传文件
	 * 
	 * @param itemNo
	 * @param uploadFileName
	 */
	public void modifyUploadFileNameField(String itemNo, String uploadFileName) {
		try {
			itemDao.modifyUploadFileNameField(itemNo, uploadFileName);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AppException("上传物料图片失败!");
		}
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
}

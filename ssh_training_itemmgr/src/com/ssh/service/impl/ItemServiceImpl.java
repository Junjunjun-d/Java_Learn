package com.ssh.service.impl;

import com.ssh.AppException;
import com.ssh.PageModel;
import com.ssh.dao.ItemDao;
import com.ssh.domain.Item;
import com.ssh.service.ItemService;

/**
 * ���õ���ģʽʵ��
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
			throw new AppException("�������ʧ��!");
		}
	}

	/**
	 * ��ҳ��ѯ
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
			throw new AppException("��ҳ��ѯ����ʧ��!");
		}
	}

	/**
	 * �޸�����
	 * 
	 * @param item
	 */
	public void modifyItem(Item item) {
		try {
			itemDao.modifyItem(item);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AppException("�޸�����ʧ��!");
		}
	}

	/**
	 * ɾ������
	 * 
	 * @param item
	 */
	public void deleteItem(String[] itemNos) {
		try {
			itemDao.deleteItem(itemNos);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AppException("ɾ������ʧ��!");
		}
	}

	/**
	 * �������ϴ����ѯ
	 * 
	 * @param itemNo
	 * @return
	 */
	public Item findItemById(String itemNo) {
		try {
			return itemDao.findItemById(itemNo);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AppException("�������ϴ����ѯʧ�ܣ�����=��" + itemNo + "��!");
		}
	}

	/**
	 * �����ϴ��ļ�
	 * 
	 * @param itemNo
	 * @param uploadFileName
	 */
	public void modifyUploadFileNameField(String itemNo, String uploadFileName) {
		try {
			itemDao.modifyUploadFileNameField(itemNo, uploadFileName);
		} catch (Exception e) {
			e.printStackTrace();
			throw new AppException("�ϴ�����ͼƬʧ��!");
		}
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
}

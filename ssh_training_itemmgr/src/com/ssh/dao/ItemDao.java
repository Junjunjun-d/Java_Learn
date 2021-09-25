package com.ssh.dao;

import com.ssh.PageModel;
import com.ssh.domain.Item;

/**
 * ItemDao�ӿ�
 * 
 * @author Administrator
 *
 */
public interface ItemDao {

	/**
	 * �������
	 * 
	 * @param item
	 */
	public void addItem(Item item);

	/**
	 * ����id��ѯ
	 * 
	 * @param itemNo
	 * @return ������ڷ���Item���󣬷��򷵻�null
	 */
	public Item findItemById(String itemNo);

	/**
	 * ��ҳ��ѯ
	 * 
	 * @param queryString
	 *            ��ѯ���������ϴ�������ƣ�
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public PageModel findAllItem(String queryString, int pageNo, int pageSize);

	/**
	 * �޸�����
	 * 
	 * @param item
	 */
	public void modifyItem(Item item);

	/**
	 * �޸�����
	 * 
	 * @param item
	 */
	public void deleteItem(String[] itemNos);

	/**
	 * �����ϴ����ļ�����
	 * 
	 * @param itemNo
	 * @param uploadFileName
	 */
	public void modifyUploadFileNameField(String itemNo, String uploadFileName);
}

package com.ssh.web.actions;

import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import com.ssh.PageModel;
import com.ssh.domain.Item;
import com.ssh.domain.ItemCategory;
import com.ssh.domain.ItemUnit;
import com.ssh.service.DataDictService;
import com.ssh.service.ItemService;
import com.ssh.web.forms.ItemActionForm;

public class ItemAction extends BaseAction {

	private ItemService itemService;

	private DataDictService dataDictService;

	@Override
	protected ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ItemActionForm iaf = (ItemActionForm) form;
		int pageNo = iaf.getPageNo();
		int pageSize = Integer.parseInt(request.getSession().getServletContext().getInitParameter("page-size"));
		String queryString = iaf.getClientIdOrName();
		PageModel pageModel = itemService.findAllItem(queryString, pageNo, pageSize);
		request.setAttribute("pageModel", pageModel);
		return mapping.findForward("list");
	}

	/**
	 * 显示添加页面
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward showAdd(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List itemCategoryList = dataDictService.getItemCategoryList();
		List itemUnitList = dataDictService.getItemUnitList();
		request.setAttribute("itemCategoryList", itemCategoryList);
		request.setAttribute("itemUnitList", itemUnitList);
		return mapping.findForward("show_add");
	}

	/**
	 * 添加
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward add(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ItemActionForm iaf = (ItemActionForm) form;
		Item item = new Item();
		BeanUtils.copyProperties(item, iaf);

		ItemCategory itemCategory = new ItemCategory();
		itemCategory.setId(iaf.getCategory());
		item.setItemCategory(itemCategory);

		ItemUnit itemUnit = new ItemUnit();
		itemUnit.setId(iaf.getUnit());
		item.setItemUnit(itemUnit);

		itemService.addItem(item);
		return mapping.findForward("item_index");
	}

	/**
	 * 删除
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward del(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ItemActionForm iaf = (ItemActionForm) form;
		itemService.deleteItem(iaf.getSelectFlag());
		return mapping.findForward("item_index");
	}

	/**
	 * 显示修改
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward showModify(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ItemActionForm iaf = (ItemActionForm) form;
		Item item = itemService.findItemById(iaf.getItemNo());
		request.setAttribute("item", item);

		List itemCategoryList = dataDictService.getItemCategoryList();
		List itemUnitList = dataDictService.getItemUnitList();
		request.setAttribute("itemCategoryList", itemCategoryList);
		request.setAttribute("itemUnitList", itemUnitList);
		return mapping.findForward("show_modify");
	}

	/**
	 * 修改
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward modify(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ItemActionForm iaf = (ItemActionForm) form;
		Item item = new Item();
		BeanUtils.copyProperties(item, iaf);

		ItemCategory itemCategory = new ItemCategory();
		itemCategory.setId(iaf.getCategory());
		item.setItemCategory(itemCategory);

		ItemUnit itemUnit = new ItemUnit();
		itemUnit.setId(iaf.getUnit());
		item.setItemUnit(itemUnit);
		itemService.modifyItem(item);
		return mapping.findForward("item_index");
	}

	/**
	 * 显示上传
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward showUpload(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ItemActionForm iaf = (ItemActionForm) form;
		Item item = itemService.findItemById(iaf.getItemNo());
		request.setAttribute("item", item);

		return mapping.findForward("show_upload");
	}

	/**
	 * 上传
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward upload(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ItemActionForm iaf = (ItemActionForm) form;
		String itemNo = iaf.getItemNo();
		FormFile myFile = iaf.getItemFile();
		String fileName = myFile.getFileName();
		itemService.modifyUploadFileNameField(itemNo, fileName);

		String realPath = request.getSession().getServletContext().getRealPath("/images");
		FileOutputStream fos = new FileOutputStream(realPath + "/" + fileName);
		fos.write(myFile.getFileData());
		fos.flush();
		fos.close();
		return mapping.findForward("item_index");
	}

	/**
	 * 显示详细信息
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward showDetail(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ItemActionForm iaf = (ItemActionForm) form;
		Item item = itemService.findItemById(iaf.getItemNo());
		request.setAttribute("item", item);

		return mapping.findForward("show_detail");
	}

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	public void setDataDictService(DataDictService dataDictService) {
		this.dataDictService = dataDictService;
	}

}

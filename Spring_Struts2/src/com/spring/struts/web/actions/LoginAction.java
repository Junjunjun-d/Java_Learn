package com.spring.struts.web.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.spring.struts.manager.UserManager;
import com.spring.struts.web.forms.LoginActionForm;

public class LoginAction extends Action {

	private UserManager userManager;

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LoginActionForm laf = (LoginActionForm) form;
		String username = laf.getUsername();
		String password = laf.getPassword();

		userManager.login(username, password);

		return mapping.findForward("success");
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
}

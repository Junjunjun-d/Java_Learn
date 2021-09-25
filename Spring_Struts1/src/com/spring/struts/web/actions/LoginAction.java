package com.spring.struts.web.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.spring.struts.manager.UserManager;
import com.spring.struts.web.forms.LoginActionForm;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LoginActionForm laf = (LoginActionForm) form;
		String username = laf.getUsername();
		String password = laf.getPassword();

		// UserManager userManager = new UserManagerImpl();
		// userManager.login(username, password);

		// BeanFactory factory = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// UserManager userManager =
		// (UserManager)factory.getBean("userManager");
		// userManager.login(username, password);

		BeanFactory factory = WebApplicationContextUtils
				.getRequiredWebApplicationContext(request.getSession().getServletContext());
		UserManager userManager = (UserManager) factory.getBean("userManager");
		userManager.login(username, password);

		return mapping.findForward("success");
	}
}

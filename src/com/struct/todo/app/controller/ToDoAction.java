package com.struct.todo.app.controller;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ToDoAction extends Action{

	public ActionForward getToDoList(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)
			        throws Exception {
		return mapping.findForward("success");
	}
}

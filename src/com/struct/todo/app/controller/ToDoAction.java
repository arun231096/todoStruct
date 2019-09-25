package com.struct.todo.app.controller;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.struct.todo.app.model.ToDoFrom;

public class ToDoAction extends Action{

	private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) {
    	List<ToDoFrom> formList = new LinkedList<ToDoFrom>();
    	formList.add(new ToDoFrom("1","AML","Technical Task","2",Date.valueOf("2019-09-25").toString(), Date.valueOf("2019-09-25").toString(), "completed"));
    	formList.add(new ToDoFrom("2","Base60AML","Technical Task","3",Date.valueOf("2019-09-25").toString(), Date.valueOf("2019-09-25").toString(), "not completed"));
    	request.setAttribute("formlist", formList);
    	if(formList.isEmpty()) {
    		return mapping.findForward(FAILURE);
    	}
    	return mapping.findForward(SUCCESS);
    }
}

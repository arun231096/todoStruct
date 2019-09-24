package com.struct.todo.app.controller;

import org.apache.struts.action.ActionForm;

public class ToDoForm extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4827231098795823950L;
	String message;

	public final String getMessage() {
		return message;
	}

	public final void setMessage(String message) {
		this.message = message;
	}
}

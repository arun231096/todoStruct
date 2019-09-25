package com.struct.todo.app.model;

import org.apache.struts.action.ActionForm;

/**
 * @author arunkumar.angappan
 *
 */
public class ToDoFrom extends ActionForm{

	private static final long serialVersionUID = -637363568861842138L;
	
	private String id;
	private String title;
	private String message;
	private String estimation;
	private String startDate;
	private String endDate;
	private String status;

	public ToDoFrom() {}
	public ToDoFrom(String id, String title, String message, String estimation, String startDate, String endDate,
			String status) {
		super();
		this.id = id;
		this.title = title;
		this.message = message;
		this.estimation = estimation;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getEstimation() {
		return estimation;
	}
	public void setEstimation(String estimation) {
		this.estimation = estimation;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
}

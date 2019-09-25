package com.struct.todo.app.model;

import java.util.Date;

import org.apache.struts.action.ActionForm;

/**
 * @author arunkumar.angappan
 *
 */
public class ToDoFrom extends ActionForm{

	private static final long serialVersionUID = -637363568861842138L;
	
	private long id;
	private String title;
	private String message;
	private long estimation;
	private Date startDate;
	private Date endDate;
	private boolean status;

	public ToDoFrom() {}
	public ToDoFrom(long id, String title, String message, long estimation, Date startDate, Date endDate,
			boolean status) {
		super();
		this.id = id;
		this.title = title;
		this.message = message;
		this.estimation = estimation;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}
	public final long getId() {
		return id;
	}
	public final void setId(long id) {
		this.id = id;
	}
	public final String getTitle() {
		return title;
	}
	public final void setTitle(String title) {
		this.title = title;
	}
	public final String getMessage() {
		return message;
	}
	public final void setMessage(String message) {
		this.message = message;
	}
	public final long getEstimation() {
		return estimation;
	}
	public final void setEstimation(long estimation) {
		this.estimation = estimation;
	}
	public final Date getStartDate() {
		return startDate;
	}
	public final void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public final Date getEndDate() {
		return endDate;
	}
	public final void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public final boolean isStatus() {
		return status;
	}
	public final void setStatus(boolean status) {
		this.status = status;
	}
	
	

}

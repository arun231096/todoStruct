package com.struct.todo.app.model;

/**
 * @author arunkumar.angappan
 *
 */
public class LoginForm extends org.apache.struts.action.ActionForm {
    
	private static final long serialVersionUID = 5550053846233969863L;

	private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

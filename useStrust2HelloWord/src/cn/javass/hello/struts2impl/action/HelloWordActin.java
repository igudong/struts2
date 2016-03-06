package cn.javass.hello.struts2impl.action;

import com.opensymphony.xwork2.Action;

public class HelloWordActin implements Action {

	private String account;
	private String password;
	private String submitFlag;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSubmitFlag() {
		return submitFlag;
	}

	public void setSubmitFlag(String submitFlag) {
		this.submitFlag = submitFlag;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "toWelcome";
	}

}

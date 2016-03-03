package cn.javass.hello.servletimpl.vo;

public class HelloWordModel {

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
	
	public void bussinessExecute(){
		System.out.println("业务正在进行中。。。。。");
	}
	
	public String toString(){
		
		
		return account+"--->"+password+"---->"+submitFlag;
	}

}

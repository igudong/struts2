package cn.javass.hello.struts2impl.action;


import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.Action;

@Namespace("/servletimpl")
public class HelloWordActin implements Action {
	/*
	 * 
	 * public class HelloWordActin extends ActionSupport {  用这个也可以
	 * 
	 * */
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

	
	@org.apache.struts2.convention.annotation.Action(value="welcome" ,results={
			@Result(name="toWelcome",location="/servletimpl/welcome.jsp"),
			@Result(name="hello",location="/servletimpl/hello.jsp")
			
	})
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("进入execute方法");
		if(account.equals("11")){
			return "toWelcome";
		}else{
			return "hello";
		}

		
	}

}

package cn.javass.hello.struts2impl.action;



import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;


@Namespace("/servletimpl")
@Result(name="success",location="/servletimpl/login.jsp")
public class LoginAction extends ActionSupport{


}

package cn.javass.hello.struts2impl.action;



import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;


@Namespace("/servletimpl")
@ResultPath("/test")
@Result(name="success",location="happy.jsp")
public class Login1Action extends ActionSupport{


}

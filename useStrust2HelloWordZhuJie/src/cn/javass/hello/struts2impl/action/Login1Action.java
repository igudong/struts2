package cn.javass.hello.struts2impl.action;



import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;


@Namespace("/servletimpl")
@ResultPath("/test")
@Result(name="success",location="happy.jsp")
/*
 * 
 * 当@Result注解中location的写的是绝对路径的时候，
 * @ResultPath的注解不起作用
 * 
 * 当@Result注解中location的写的是相对路径的时候，
 * @ResultPath的注解起作用，但是路径等于@ResultPath的路径
 * 加上@Namespace注解的路径，最后再加上@Result的location的路径
 * */
public class Login1Action extends ActionSupport{


}

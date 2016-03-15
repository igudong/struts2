package cn.javass.hello.struts2impl.action;



import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;


@Namespace("/servletimpl")
@Result(name="success",location="/servletimpl/login.jsp")
/*
 * @Result(name="success",location="servletimpl/login.jsp")
 * 找的是路径(/useStrust2HelloWord/WEB-INF/content/
 * servletimpl/servletimpl/login.jsp)是这个，是/WEB-INF/content/下的
 * 加上namespace和location
 * 
 * */

/*
 * @Result(name="success",location="/servletimpl/login.jsp")
 * 找的是路径(useStrust2HelloWordZhuJie/servletimpl/login.jsp)是这个，
 * 是根目录下的文件
 * 
 * */
public class LoginAction extends ActionSupport{


}

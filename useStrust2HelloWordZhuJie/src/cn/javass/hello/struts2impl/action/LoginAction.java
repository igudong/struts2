package cn.javass.hello.struts2impl.action;



import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;


@Namespace("/servletimpl")
@Result(name="success",location="/servletimpl/login.jsp")
/*
 * @Result(name="success",location="servletimpl/login.jsp")
 * �ҵ���·��(/useStrust2HelloWord/WEB-INF/content/
 * servletimpl/servletimpl/login.jsp)���������/WEB-INF/content/�µ�
 * ����namespace��location
 * 
 * */

/*
 * @Result(name="success",location="/servletimpl/login.jsp")
 * �ҵ���·��(useStrust2HelloWordZhuJie/servletimpl/login.jsp)�������
 * �Ǹ�Ŀ¼�µ��ļ�
 * 
 * */
public class LoginAction extends ActionSupport{


}

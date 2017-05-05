package com.liping.crm.web.intercepter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
/**
 * 登录拦截器
 * @author liping
 *
 */
public class LoginIntercepter extends MethodFilterInterceptor {

	@Override
	public String doIntercept(ActionInvocation arg0) throws Exception {

		Object obj=ActionContext.getContext().getSession().get("loginStaff");
		if(obj==null){
			//获得当前action
			Object object=arg0.getAction();
			//判断当前对象是否是ActionSupport
			if(object instanceof ActionSupport){
				ActionSupport actionSupport=(ActionSupport) object;
				actionSupport.addFieldError("", "请登录");
			}
			
			return "login";
		}
		
		return arg0.invoke();
	}

}

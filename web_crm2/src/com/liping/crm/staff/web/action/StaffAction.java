package com.liping.crm.staff.web.action;

import java.util.List;

import com.liping.crm.service.dao.StaffService;
import com.liping.crm.staff.domain.CrmStaff;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StaffAction extends ActionSupport implements ModelDriven<CrmStaff> {

	private CrmStaff staff=new CrmStaff();
	
	public CrmStaff getModel() {
		return staff;
	}
	
	
	private StaffService staffService;
	
	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
	
	//////////////////////////////////////////
	public String login(){
		//查询员工
		CrmStaff crmStaff=staffService.login(staff);
		//是否成功
		if(crmStaff!=null){
			//成功
			ActionContext.getContext().getSession().put("loginStaff", crmStaff);
			//重定向
			return "success";
		}
		this.addFieldError("","用户名与密码不匹配");
		//请求转发显示
		return "login";
		
	}
	
	//显示首页
	public String home(){
		
		return "home";
	}
	
	//查询所有员工
	
	public String findAll(){
		
		List<CrmStaff> list=staffService.findAllStaff();
		//存放数据
		ActionContext.getContext().put("allStaff", list);
		
		return "findAll";
	}
	
	
	

}

package com.liping.crm.staff.web.action;

import java.util.List;

import com.liping.crm.department.domain.CrmDepartment;
import com.liping.crm.service.dao.DepartmentService;
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
	private DepartmentService departmentService;
	
	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
	
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
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
	//通过id查找员工
	
	public String editUI(){
			CrmStaff findstaff=this.staffService.findById(staff);
			ActionContext.getContext().getValueStack().push(findstaff);
			
			List<CrmDepartment> allDepartment=departmentService.findall();
			ActionContext.getContext().getValueStack().set("allDepartment",allDepartment);
			
		return "findById";
	}
	
	//员工跟新
	
	public String edit(){
		
		this.staffService.updateStaff(staff);
		return "edit";
	}
	
	
	
	

}

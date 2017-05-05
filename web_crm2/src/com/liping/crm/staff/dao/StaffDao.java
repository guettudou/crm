package com.liping.crm.staff.dao;

import java.util.List;

import com.liping.crm.staff.domain.CrmStaff;

public interface StaffDao {
	
	/**
	 * 通过用户名和密码查找员工信息
	 * @param loginName
	 * @param loginPwd
	 * @return
	 */
	public CrmStaff find(String loginName,String loginPwd);
	/**
	 * 查询所有员工
	 * @return
	 */
	public List<CrmStaff> findAll();
	

}

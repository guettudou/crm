package com.liping.crm.service.dao;

import java.util.List;

import com.liping.crm.staff.dao.StaffDao;
import com.liping.crm.staff.domain.CrmStaff;

public interface StaffService {

	/**
	 * 用户登录
	 * @param staff
	 * @return
	 */
	public CrmStaff login(CrmStaff staff);

	/**
	 * 查询所有员工
	 * @return
	 */
	public List<CrmStaff> findAllStaff();
	
	/**
	 * 查找员工
	 * @param staff
	 * @return
	 */
	public CrmStaff findById(CrmStaff staff);

	
	/**
	 * 更新员工
	 * @param staff
	 */
	public void updateStaff(CrmStaff staff);
	
	
	
}

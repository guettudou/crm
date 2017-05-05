package com.liping.crm.service.dao.impl;

import java.util.List;

import com.liping.crm.service.dao.StaffService;
import com.liping.crm.staff.dao.StaffDao;
import com.liping.crm.staff.domain.CrmStaff;
import com.liping.crm.utils.MyStringUtils;

public class StaffServiceImpl implements StaffService {

	private StaffDao staffDao;
	public void setStaffDao(StaffDao staffDao) {
		this.staffDao = staffDao;
	}
	
	public CrmStaff login(CrmStaff staff) {
		String loginPwd=MyStringUtils.getMd5Value(staff.getLoginPwd());
		return staffDao.find(staff.getLoginName(),loginPwd);
		
	}

	public List<CrmStaff> findAllStaff() {
		
		return staffDao.findAll();
	}
	
	

}

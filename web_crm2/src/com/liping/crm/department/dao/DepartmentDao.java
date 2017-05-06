package com.liping.crm.department.dao;

import java.util.List;

import com.liping.crm.department.domain.CrmDepartment;

public interface DepartmentDao {
	
	public List<CrmDepartment> findAll();
	

}

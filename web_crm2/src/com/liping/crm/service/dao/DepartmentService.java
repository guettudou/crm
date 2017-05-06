package com.liping.crm.service.dao;

import java.util.List;

import com.liping.crm.department.domain.CrmDepartment;

public interface DepartmentService {
	/**
	 * 查询所有的部门
	 * @return
	 */
	public List<CrmDepartment> findall();
	

}

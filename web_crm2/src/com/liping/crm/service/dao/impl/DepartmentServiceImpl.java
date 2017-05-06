package com.liping.crm.service.dao.impl;

import java.util.List;

import com.liping.crm.department.dao.DepartmentDao;
import com.liping.crm.department.domain.CrmDepartment;
import com.liping.crm.service.dao.DepartmentService;
/**
 * 部门service层
 * @author liping
 *
 */
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentDao departmentDao;
	
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	
	public List<CrmDepartment> findall() {
		
		return departmentDao.findAll();
	}

}

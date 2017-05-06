package com.liping.crm.department.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.liping.crm.department.dao.DepartmentDao;
import com.liping.crm.department.domain.CrmDepartment;

public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {

	
	public List<CrmDepartment> findAll() {
		
		return this.getHibernateTemplate().find("from CrmDepartment");
	}

}

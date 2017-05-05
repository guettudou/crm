package com.liping.crm.staff.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.liping.crm.staff.dao.StaffDao;
import com.liping.crm.staff.domain.CrmStaff;

public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao{

	
	
	public CrmStaff find(String loginName, String loginPwd) {
		
		List<CrmStaff> list=this.getHibernateTemplate().find("from CrmStaff where loginName=? and loginPwd=?",loginName,loginPwd);
		if(list.size()==1){
			return list.get(0);
			
		}
		
		return null;
	}

	public List<CrmStaff> findAll() {
		return this.getHibernateTemplate().find("from CrmStaff");
	}
	
	
	
	

}

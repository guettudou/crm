package com.liping.crm.post.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.liping.crm.department.domain.CrmDepartment;
import com.liping.crm.post.dao.PostDao;
import com.liping.crm.post.domain.CrmPost;

public class PostDaoImpl extends HibernateDaoSupport implements PostDao {

	public List<CrmPost> findAll(CrmDepartment department) {
		
		return this.getHibernateTemplate().find("from CrmPost where department=?",department);
	}

}

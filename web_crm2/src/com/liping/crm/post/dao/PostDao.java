package com.liping.crm.post.dao;

import java.util.List;

import com.liping.crm.department.domain.CrmDepartment;
import com.liping.crm.post.domain.CrmPost;

public interface PostDao {
	
	public List<CrmPost> findAll(CrmDepartment department);
	

}

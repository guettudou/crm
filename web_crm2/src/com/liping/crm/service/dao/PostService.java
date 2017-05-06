package com.liping.crm.service.dao;

import java.util.List;

import com.liping.crm.department.domain.CrmDepartment;
import com.liping.crm.post.domain.CrmPost;

public interface PostService {
	
	/**
	 * 通过部门查询职务
	 * @param department
	 * @return
	 */
	public List<CrmPost>findAll(CrmDepartment department);
	

}

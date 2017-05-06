package com.liping.crm.service.dao.impl;

import java.util.List;

import com.liping.crm.department.domain.CrmDepartment;
import com.liping.crm.post.dao.PostDao;
import com.liping.crm.post.domain.CrmPost;
import com.liping.crm.service.dao.PostService;

public class PostServiceImpl implements PostService {

	private PostDao postDao;
	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}
	
	public List<CrmPost> findAll(CrmDepartment department) {
		return postDao.findAll(department);
	}

}

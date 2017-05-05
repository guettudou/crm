package com.liping.crm.department.domain;

import java.util.HashSet;
import java.util.Set;

import com.liping.crm.post.domain.CrmPost;

/**
 * 部门
 * @author liping
 *
 */
public class CrmDepartment {
	
	/*
	 * CREATE TABLE `crm_department` (
  	`depId` VARCHAR(255) NOT NULL PRIMARY KEY,
  	`depName` VARCHAR(50) DEFAULT NULL
	);
	 * 
	 * */
	private String depId;
	private String depName;
	//一个部门对应对个职务
	private Set<CrmPost> postSet =new HashSet<CrmPost>();
	public String getDepId() {
		return depId;
	}
	public void setDepId(String depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public Set<CrmPost> getPostSet() {
		return postSet;
	}
	public void setPostSet(Set<CrmPost> postSet) {
		this.postSet = postSet;
	}

}

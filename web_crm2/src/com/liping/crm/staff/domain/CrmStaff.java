package com.liping.crm.staff.domain;

import java.util.Date;

import com.liping.crm.post.domain.CrmPost;

/**
 * 员工
 * @author liping
 *
 */
public class CrmStaff {
	/*
	 * CREATE TABLE `crm_staff` (
  `staffId` VARCHAR(255) NOT NULL PRIMARY KEY,
  `loginName` VARCHAR(100) DEFAULT NULL,
  `loginPwd` VARCHAR(100) DEFAULT NULL,
  `staffName` VARCHAR(100) DEFAULT NULL,
  `gender` VARCHAR(20) DEFAULT NULL,
  `onDutyDate` DATETIME DEFAULT NULL,
  `postId` VARCHAR(255) DEFAULT NULL,
  CONSTRAINT FOREIGN KEY (`postId`) REFERENCES `crm_post` (`postId`)
);
*/
	
	private String staffId;
	private String loginName;
	private String loginPwd;
	private String staffName;
	private String gender;
	private Date onDutyDate;
	//一个员工对应一个部门
	private CrmPost post;
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getOnDutyDate() {
		return onDutyDate;
	}
	public void setOnDutyDate(Date onDutyDate) {
		this.onDutyDate = onDutyDate;
	}
	public CrmPost getPost() {
		return post;
	}
	public void setPost(CrmPost post) {
		this.post = post;
	}
	
}

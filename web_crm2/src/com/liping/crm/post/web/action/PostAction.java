package com.liping.crm.post.web.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import org.apache.struts2.ServletActionContext;

import com.liping.crm.post.domain.CrmPost;
import com.liping.crm.service.dao.PostService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PostAction extends ActionSupport implements ModelDriven<CrmPost> {

	CrmPost post=new CrmPost();
	PostService postService;
	public CrmPost getModel() {
		return post;
	}
	
	public void setPostService(PostService postService) {
		this.postService = postService;
	}
	
	////////////////////////////////////////////////
	
	public String findAllByDepartment() throws IOException{
		//获得数据
		List<CrmPost> allPost=postService.findAll(post.getDepartment());
		//排除不需要的数据
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.setExcludes(new String[]{"department","staffSet"});
		//生成json数据
		JSONArray jsonData=JSONArray.fromObject(allPost,jsonConfig);
		//设置编码
		ServletActionContext.getResponse().setContentType("text/html;charset=UTF-8");
		//ajax返回数据
		ServletActionContext.getResponse().getWriter().print(jsonData.toString());
		
	return "none";	
	}
	
	

}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags"  prefix="s"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath}/css/sys.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/Calendar.js"></script>
</head>

<body class="emp_body">
<table border="0" cellspacing="0" cellpadding="0" width="100%">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
  <tr>
    <td width="1%"><img src="${pageContext.request.contextPath}/images/tleft.gif"/></td>
    <td width="44%" align="left">[员工管理]</td>
   
    <td width="52%"align="right">
    	<!-- 提交表单 -->
       <a href="javascript:void(0)" onclick="document.forms[0].submit()">
       	<img src="${pageContext.request.contextPath}/images/button/save.gif" />
       </a>
       <!-- 执行js，进行返回 -->
       <a href="javascript:void(0)" onclick="window.history.go(-1)"><img src="${pageContext.request.contextPath}/images/button/tuihui.gif" /></a>
      
    </td>
    <td width="3%" align="right"><img src="${pageContext.request.contextPath}/images/tright.gif"/></td>
  </tr>
</table>

<s:form action="staffAction_edit" namespace="/">
	<table width="88%" border="0" class="emp_table" style="width:80%;">
	 <tr>
	    <td>登录名：</td>
	    <td><s:textfield name="loginName"></s:textfield></td>
	    <td>密码：</td>
	    <td><s:password name="loginPwd" showPassword="true"></s:password></td>
	  </tr>
	 <tr>
	    <td>姓名：</td>
	    <td><s:textfield name="staffName"></s:textfield></td>
	    <td>性别：</td>
	    <td>
	    	<s:radio list="{'男','女'}" name="gender"></s:radio>
	    </td>
	  </tr>
	 <tr>
	    <td width="10%">所属部门：</td>
	    <td width="20%">
	    	<s:select list="allDepartment" name="post.department.depId"
				    	listKey="depId" listValue="depName"
				    	headerKey=""  headerValue="----请--选--择----"
						onchange="showPost(this)"				    	
				    	>
	    	</s:select>
	    </td>
	    <td width="8%">职务：</td>
	    <td width="62%">
	    	<s:select list="post.department.postSet" name="post.postId"
	    		listKey="postId" listValue="postName"
	    		headerKey=""  headerValue="----请--选--择----"
	    		id="selectElement"
	    	>
	    	
	    	</s:select>
	    </td>
	  </tr>
	  <tr>
	    <td width="10%">入职时间：</td>
	    <td width="20%">
	    	<s:date name="onDutyDate" format="yyyy-MM-dd" var="myDate"/>
	    	<s:textfield name="onDutyDate" readonly="true" value="%{#myDate}" onfocus="c.showMoreDay=true; c.show(this);"></s:textfield>
	    </td>
	    <td width="8%"></td>
	    <td width="62%"></td>
	  </tr>
	</table>
</s:form>
	<script type="text/javascript">
		
		function showPost(obj){
		
			//获得选中部门
			var depId=obj.value;
			//获得引擎
			var xmlHttp;
 			//
			 try
			    { // Firefox, Opera 8.0+, Safari
			    xmlHttp=new XMLHttpRequest();
			    }catch (e) { // Internet Explorer
			   try
			      {
			      xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
			      } catch (e) {
	
	     	 try
	         {
	        	 xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
	         }
	    	  catch (e)
	         {
	         alert("您的浏览器不支持AJAX！");
	         return false;
	         }
	      }
	    }
		
		//设置回调函数
	    xmlHttp.onreadystatechange=function()
	      {
	      if(xmlHttp.readyState==4&&xmlHttp.status==200)
	        {
	         //获得数据并展示
	         var textData=xmlHttp.responseText;
	         //转换成json数据
	         var jsonData=eval("("+textData+")");
	         //获得select对象
	         var selectElement=document.getElementById("selectElement");
	         //初始化select
	         selectElement.innerHTML="<option value=''>----请--选--择----</option>";
	         for(var i=0;i<jsonData.length;i++){
	         	var postObj=jsonData[i];
	         	selectElement.innerHTML+="<option value='"+postObj.postId+"'>"+postObj.postName+"</option>";
	         
	         }
	         
	         
	        }
	      };
	      //创建连接
	    var url="{pageContext.request.contextPath}/postAction_findAllByDepartment?department.depId="+depId
	    xmlHttp.open("GET",url);
	    //发送请求
	    xmlHttp.send(null);
	    
		}
	</script>
</body>
</html>

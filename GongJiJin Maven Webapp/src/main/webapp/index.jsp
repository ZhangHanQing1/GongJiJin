<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台管理系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<%-- <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap-theme.min.css">
  	<script src="${pageContext.request.contextPath}/resources/bootstrap/jquery-1.11.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script> --%>
	<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">  
	<script src="resources/jquery-1.11.3.min.js"></script>
	 <script src="resources/bootstrap/js/bootstrap.min.js"></script> 
	<link rel="stylesheet" href="resources/layui/css/layui.css" media="all">
	<script src="resources/jquery.form.js"></script>
	<script src="resources/jqueryExt.js"></script>
	<script src="resources/layui/layui.all.js" charset="utf-8"></script>
	<link href="<c:url value="/resources/layui/css/layui.css" />" rel="stylesheet">
	<link href="<c:url value="/demo/common/bootstrap/css/bootstrap.min.css" />" media="all" rel="stylesheet">
	<script src="<c:url value="/resources/jquery-1.11.3.min.js" />" charset="utf-8"></script>
	<script type="text/javascript" src="<c:url value="/demo/common/bootstrap/js/bootstrap.min.js" />"></script>
	<style type="text/css">
a:link{text-decoration:none;   /* 指正常的未被访问过的链接*/
}a:visited{text-decoration:none; /*指已经访问过的链接*/
}a:hover{text-decoration:none;/*指鼠标在链接*/}a:active{text-decoration:none;/* 指正在点的链接*/ 
}
	</style>
  </head>
  
  <body style="background-image: url(Images/img.jpg)">
  
  <div class="container-fiuled" >
  	<div class="row-fluid" >
	<nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid layui-nav" style="">
    <div class="navbar-header" >
        <span class="navbar-brand" style="color: red">住房公积金系统</span>
        <button class="layui-btn layui-btn-normal" id="yinxian" style="height: 30px; margin-top: 10px;">隐藏显示</button>
    </div>
    <div >
       	<ul class="nav navbar-nav navbar-right"> 
            <li><a href="user/message.jsp"><span class="glyphicon glyphicon-user"></span> ${user_name}</a></li> 
            <li><a href="javascript:logout()" ><span class="glyphicon glyphicon-log-in"></span> 注销</a></li> 
        </ul>
   	 </div>
    </div>
	</nav>
</div>
  	
  	
  	<div class="row-fluid" style="margin-top: -20px;" id="yin">
		<ul class="layui-nav layui-nav-tree layui-inline col-md-2" lay-filter="demo" style="margin-right: 10px;">
		 <c:forEach items="${list}" var="li">
       		 <!-- 判断父节点是否为root -->
        	<c:if test="${li.parent_id=='0'}">
						<!--若为ROOT则表示给节点为父级节点，显示出来（因为ROOT是数据库建表时定义的数据。）  -->
						<li class="layui-nav-item layui-nav-itemed">
						 <a href="${li.url}" target="main">${li.menu_name}</a>
					    <c:forEach items="${list}" var="li2">
                         <!--判断子点是否和父级节点的模块ID相同，显示出来二级菜单  -->
                         <dl class="layui-nav-child">
                         <c:if test="${li2.parent_id==li.order_num}">
							<dd><a target="main" href="${li2.url}">${li2.menu_name}</a></dd> 	    
						 </c:if>
						 </dl>
    	                 </c:forEach> 
    	                 </li>
			 </c:if>
        </c:forEach>
        </ul>
  </div>		
  		
  		<div class="col-md-10" >
  				<iframe name="main" style="width:100%; height:100%; border:none;"></iframe>
  		</div>
  	</div>
  	<div class="row-fluid">
  		<div class="col-md-12 layui-nav">
  			<h6 class="text-center">底部版权</h6>
  		</div>
  	</div>
  </div>
  <script src="resources/layui/layui.js" charset="utf-8"></script>
  <script>
	 $("#yinxian").click(function(){
		if($("#yin").css("display")=="none"){
			$("#yin").show();
			}else{
			$("#yin").hide();
	}
	})
		/* $(".a11").click(function(){
		if($(".a22").css("display")=="none"){
			$(".a22").show();
			}else{
			$(".a22").hide();
	}
}) */
	layui.use('element', function(){
  	var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
  
  	//监听导航点击
  	element.on('nav(demo)', function(elem){
    //console.log(elem)
    layer.msg(elem.text());
  });
});
function logout(){
		if(confirm("确认要退出系统吗")){
		  	$.ajax({
		  		url:"asdf",
		  		success: function(data){
		  			location.href="deng.jsp";
		  		}
		  	})
		}
	}
</script>
  
  </body>

</html>


 
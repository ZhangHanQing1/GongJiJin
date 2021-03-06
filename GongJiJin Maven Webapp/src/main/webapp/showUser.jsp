<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showUser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css"> 
	<script src="resources/jquery-1.11.3.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  
  <body>
    	
    <table class="table table-bordered">
    <input type="text" id="mohu" style="margin-top: 10px;"/><span>可以根据用户名字进行模糊查询</span>
	<thead>
		<tr>
			<th>用户名字</th>
			<th>用户管理</th>
			<th>联系电话</th>
			<th>适用岗位</th>
			<th>部门名称</th>
			<th>用户状态</th>
			<th>
			<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" id="aaa">
			添加用户
			</button>
			</th>
		</tr>
	</thead>
	<tbody id="tbody">
    			
    </tbody>
</table>
	<ul class="pager" id="ul1" style="display: block;">
		<li><button type="button" class="btn btn-default" id="shouye">首页</button></li>
		<li><button type="button" class="btn btn-default" id="syy">上一页</button></li>
		<li><button type="button" class="btn btn-default" id="xyy">下一页</button></li>
		<li><button type="button" class="btn btn-default" id="weiye">尾页</button></li>
		<li style="font-weight: lighter;">当前第<input type="text" id="currPage" style="height:35px;width:50px;border-radius:10px;text-align: center;"/>页</li>
	</ul>
	 <ul class="pager" id="ul2" style="display: none;">
		<li><button type="button" class="btn btn-default" id="shouye1">首页</button></li>
		<li><button type="button" class="btn btn-default" id="syy1">上一页</button></li>
		<li><button type="button" class="btn btn-default" id="xyy1">下一页</button></li>
		<li><button type="button" class="btn btn-default" id="weiye1">尾页</button></li>
		<li style="font-weight: lighter;">当前第<input type="text" id="currPage1" style="height:35px;width:50px;border-radius:10px;text-align: center;"/>页</li>
	</ul> 
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" 
						aria-hidden="true">×
				</button>
				<h4 class="modal-title" id="myModalLabel">
					添加系统用户
				</h4>
			</div>
			<div class="modal-body">
				
				<form class="form-horizontal" role="form" id="addUser">
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">用户编号</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="user_id1" name="user_id" >
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">用户昵称</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="user_name1" name="user_name"
				   placeholder="请输入用户昵称">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">登陆账号</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="login_name1" name="login_name"
				   placeholder="请输入登陆账号">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">手机号码</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="phonenum1" name="phonenum"
				   placeholder="请输入手机号码">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">用户性别</label>
		<div class="col-sm-10">
			<input type="radio" checked="checked" id="sex1" name="sex">男
			<input type="radio" id="sex2" name="sex">女
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">用户密码</label>
		<div class="col-sm-10">
			<input type="password" class="form-control" id="passwords1" name="passwords"
				   placeholder="请输入密码">
		</div>
	</div>
	<input type="hidden" name="status" value="0">
	<input type="hidden" name="del_flag" value="0">
	<input type="hidden" name="user_type" value="00">
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">部门名称</label>
		<div class="col-sm-10">
			<select id="showDept" class="contractType form-control" name="dept_id">
  	
  			</select>
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">岗位名称</label>
		<div class="col-sm-10">
			<select id="showPost" class="contractType form-control" name="post_id">
  	
  			</select>
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">角色名称</label>
		<div class="col-sm-10">
			<select id="showRole" class="contractType form-control" name="role_id">
  	
  			</select>
		</div>
	</div>
	</form>	
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" 
						data-dismiss="modal">关闭
				</button>
				<button type="button" id="a1111" class="btn btn-default" onclick="addUser()">
					提交更改
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<input type="hidden" id="aa"/>
<input type="hidden" id="bb"/>
	
	
  </body>
</html>
<script type="text/javascript">
	$("#aaa").click(function(){
	$("#user_id1").val("");
	//设置时间  
　 	var myDate = new Date();
	//获取当前年
	var year=myDate.getFullYear();
	//获取当前月
	var month=myDate.getMonth()+1;
	//获取当前日
	var date=myDate.getDate(); 
	var h=myDate.getHours();       //获取当前小时数(0-23)
	var m=myDate.getMinutes();     //获取当前分钟数(0-59)
	var s=myDate.getSeconds();  
	
	var now=p(month)+""+p(date)+""+p(h)+''+p(m)+""+p(s);
 　	 	$("#user_id1").val(now);
	})
	
	
	function p(s) {
    return s < 10 ? '0' + s: s;
	}
	function selectshang(startPage){
		$("#ul1").css("display","block");
		$("#ul2").css("display","none");
		$("#tbody").html("")
		$.ajax({
        	url : "showUser",
        	type : "post",
        	data : {
				"startPage" : startPage
			},
       	 	dataType : "JSON",//返回的数据类型
        	success : function(data){
          		var ary=data.list;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		if(obj.del_flag=='0'){
		        		tr+="<td>"+obj.user_name+"</td>";
		        		tr+="if(obj.user_type.equals('00')){user_type.equals('系统用户')}"
		        		tr+="<td>系统用户</td>";
		        		tr+="<td>"+obj.phonenum+"</td>";
		        		tr+="<td>"+obj.post_name+"</td>";
		        		tr+="<td>"+obj.dept_name+"</td>";
		        		if(obj.status==0){
		        		tr+="<td>正常</td>";
		        		}
		        		if(obj.status==1){
		        		tr+="<td>停用</td>";
		        		}
		        		if(obj.role_id==1){
		        		tr+="<td>(管理员)</td>"; 
		        		} 
		        		 if(obj.role_id!=1 && obj.status==0){
		        		tr+="<td><button type='button' id='"+obj.user_id+"' name='"+obj.status+"' class='updateUser btn btn-danger'>停用</button><button type='button' id='"+obj.user_id+"' class='updateUserFlag btn btn-success'>删除</button></td>"; 
		        		}
		        		 if(obj.role_id!=1 && obj.status==1){
		        		tr+="<td><button type='button' id='"+obj.user_id+"' name='"+obj.status+"' class='updateUser btn btn-info'>启用</button><button type='button' id='"+obj.user_id+"' class='updateUserFlag btn btn-success'>删除</button></td>"; 
		        		}  
		        		}
		        		tr+="</tr>";
		        		$("#tbody").append(tr);
		       	}  
		       		$("#currPage").val(data.pageNum);
				$("#aa").val(data.total);
				$("#bb").val(data.pageSize);
				$("#currPage").blur(function() {
					var last = Math.ceil(data.total / data.pageSize);
					var curr = $("#currPage").val();
					if(last<curr){
					   $("#currPage").val(last);
					   selectshang(last);
					}
					if(curr<=0){
					  $("#currPage").val(1);
					   selectshang(1);
					}
					 selectshang(curr);
				});
				
				if (data.isFirstPage) {
					$("#syy").attr("disabled", "disabled");
					$("#shouye").attr("disabled", "disabled");
				} else {
					$("#syy").removeAttr("disabled", "disabled");
					$("#shouye").removeAttr("disabled", "disabled");
				}
				if (data.isLastPage) {
					$("#xyy").attr("disabled", "disabled");
					$("#weiye").attr("disabled", "disabled");
				} else {
					$("#xyy").removeAttr("disabled", "disabled");
					$("#weiye").removeAttr("disabled", "disabled");
				}
		       	 
        	}
 		})
	}
		$("#syy").click(function() {
		var currPage = parseInt($("#currPage").val());
		selectshang(currPage - 1);
	})
	$("#xyy").click(function() {
		var currPage = parseInt($("#currPage").val());
		selectshang(currPage + 1);
	})
	$("#shouye").click(function() {
		selectshang(1);
	})
	$("#weiye").click(function() {
		var tt=$("#aa").val();
		var tt1=$("#bb").val();
		var last = Math.ceil(tt/tt1);
		selectshang(last);
				})
	function muhu(startPage){
		$("#ul2").css("display","block");
		$("#ul1").css("display","none");
		var user_name=$("#mohu").val();
		$("#tbody").html("")
		$.ajax({
        	url : "showUser",
        	type : "post",
        	data : {
				"startPage" : startPage,
				"user_name" : user_name,
			},
       	 	dataType : "JSON",//返回的数据类型
        	success : function(data){
          		var ary=data.list;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		if(obj.del_flag=='0'){
		        		tr+="<td>"+obj.user_name+"</td>";
		        		tr+="if(obj.user_type.equals('00')){user_type.equals('系统用户')}"
		        		tr+="<td>系统用户</td>";
		        		tr+="<td>"+obj.phonenum+"</td>";
		        		tr+="<td>"+obj.post_name+"</td>";
		        		tr+="<td>"+obj.dept_name+"</td>";
		        		if(obj.status==0){
		        		tr+="<td>正常</td>";
		        		}
		        		if(obj.status==1){
		        		tr+="<td>停用</td>";
		        		}
		        		if(obj.role_id==1){
		        		tr+="<td>(管理员)</td>"; 
		        		} 
		        		 if(obj.role_id!=1 && obj.status==0){
		        		tr+="<td><button type='button' id='"+obj.user_id+"' name='"+obj.status+"' class='updateUser btn btn-danger'>停用</button><button type='button' id='"+obj.user_id+"' class='updateUserFlag btn btn-success'>删除</button></td>"; 
		        		}
		        		 if(obj.role_id!=1 && obj.status==1){
		        		tr+="<td><button type='button' id='"+obj.user_id+"' name='"+obj.status+"' class='updateUser btn btn-info'>启用</button><button type='button' id='"+obj.user_id+"' class='updateUserFlag btn btn-success'>删除</button></td>"; 
		        		}  
		        		}
		        		tr+="</tr>";
		        		$("#tbody").append(tr);
		       	}  
		       		
		       	$("#currPage1").val(data.pageNum);
				$("#aa").val(data.total);
				$("#bb").val(data.pageSize);
				$("#currPage1").blur(function() {
					var last = Math.ceil(data.total / data.pageSize);
					var curr = $("#currPage").val();
					if(last<curr){
					   $("#currPage1").val(last);
					   muhu(last);
					}
					if(curr<=0){
					  $("#currPage1").val(1);
					   muhu(1);
					}
					 muhu(curr);
				});
				
				if (data.isFirstPage) {
					$("#syy1").attr("disabled", "disabled");
					$("#shouye1").attr("disabled", "disabled");
				} else {
					$("#syy1").removeAttr("disabled", "disabled");
					$("#shouye1").removeAttr("disabled", "disabled");
				}
				if (data.isLastPage) {
					$("#xyy1").attr("disabled", "disabled");
					$("#weiye1").attr("disabled", "disabled");
				} else {
					$("#xyy1").removeAttr("disabled", "disabled");
					$("#weiye1").removeAttr("disabled", "disabled");
				}  
        	}
		})
	}
	$("#syy1").click(function() {
		var currPage = parseInt($("#currPage").val());
		muhu(currPage - 1);
	})
	$("#xyy1").click(function() {
		var currPage = parseInt($("#currPage").val());
		muhu(currPage + 1);
	})
	$("#shouye1").click(function() {
		muhu(1);
	})
	$("#weiye1").click(function() {
		var tt=$("#aa").val();
		var tt1=$("#bb").val();
		var last = Math.ceil(tt/tt1);
		muhu(last);
				})
	$("#mohu").keyup(function(){
		if($("#mohu").val()==''){
			$("#tbody").html("");
			selectshang(1);
		}else{
		muhu(1);
		}
		
	})
	//查询部门表
	function showDept(){
		$.ajax({
        	url : "showDept",
        	type : "post",
       	 	dataType : "JSON",//返回的数据类型
        	success : function(data) {
          		var ary=data;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<option value='"+obj.dept_id+"'>"+obj.dept_name+"</option>"
						$("#showDept").append(tr);
		       	}   
        	}
 		})
	}
	//查询岗位表
	function showPost(){
		$.ajax({
        	url : "showPost",
        	type : "post",
       	 	dataType : "JSON",//返回的数据类型
        	success : function(data) {
          		var ary=data;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<option value='"+obj.post_id+"'>"+obj.post_name+"</option>"
						$("#showPost").append(tr);
		       	}   
        	}
 		})
	}
	//查询角色表
	function showRole(){
		$.ajax({
        	url : "showRole",
        	type : "post",
       	 	dataType : "JSON",//返回的数据类型
        	success : function(data) {
          		var ary=data;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<option value='"+obj.role_id+"'>"+obj.role_name+"</option>"
						$("#showRole").append(tr);
		       	}   
        	}
 		})
	}
	function addUser(){
         uname=$("#user_name1").val();
	     logname=$("#login_name1").val();
	     pwd=$("#passwords1").val();
	     phone=$("#phonenum1").val();
         var CheckForm1=CheckForm(logname,uname,pwd)
	     if(CheckForm1!=false){
	     var phone1=validatemobile(phone)
	     }
	     if(CheckForm1!=false&&phone1!=false){
	      var obj=$("#addUser").serialize();
		$.ajax({
        	url : "addUser",
        	type : "post",
        	async : true,
        	//contentType: "application/json; charset=utf-8",//需要制定
        	data : obj,//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		if(data==1){
        			$("#login_name1").val("");
        			alert("登录名已有人用");
        		}
        		if(data==2){
        			$("#user_name1").val("");
	        		$("#login_name1").val("");
	        		$("#passwords1").val("");
	        		$("#phonenum1").val("");
	        		var bb=$("#mohu").val();
        			var aa=$("#currPage").val();
        			var cc=$("#currPage1").val();
        			location.reload();
        			if(bb==""){
        				selectshang(1);
        			}else{
        				muhu(1);
        			}
        		}
        	}
 		});
 		}
	}
	
	$("#tbody").on("click",".updateUser",function(){
		 var user_id=this.id;
		 var status=this.name;
		alert(user_id); 
		$.ajax({
			url:"updateUser",
			type : "post",
        	data:{
        		"user_id" : user_id,
        		"status" : status,
        	},
       	 	dataType : "text",//返回的数据类型
        	success : function(data) {
        	
        		var bb=$("#mohu").val();
        		var aa=$("#currPage").val();
        		var cc=$("#currPage1").val();
        		if(bb==""){
        			selectshang(aa);
        		}else{
        			muhu(cc);
        			}
        	}	
		})
	})
	$("#tbody").on("click",".updateUserFlag",function(){
		 var user_id=this.id;
		alert(user_id); 
		$.ajax({
			url:"Flag",
			type : "post",
        	data:{
        		"user_id" : user_id,
        	},
       	 	dataType : "text",//返回的数据类型
        	success : function(data) {
        		
        		var bb=$("#mohu").val();
        		var aa=$("#currPage").val();
        		var cc=$("#currPage1").val();
        		if(bb==""){
        			selectshang(aa);
        		}else{
        			muhu(cc);
        			}
        	}	
		})
	})
	
	$(function(){  
    	selectshang(1);
    	showDept();
    	showPost();
    	showRole();
	});
	//手机号
	function validatemobile(mobile) 
			{ 
			if(mobile.length==0) 
			{ 
			alert('手机号码不能为空！');
			return false; 
			} 
			if(mobile.length!=11) 
			{ 
			alert('请输入有效的手机号码，需是11位！');
			return false; 
			} 
			
			var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/; 
			if(!myreg.test(mobile)) 
			{ 
			alert('请输入有效的手机号码！'); 
			return false; 
			} 
			} 
	function CheckForm(logname,uname,pwd) {
			if (logname.length == 0) { 
			alert("登录名不能为空!"); 
			return false; 
			}
			if (uname.length == 0) { 
			alert("用户名不能为空!"); 
			return false; 
			}
			if (pwd.length == 0) { 
			alert("密码不能为空!"); 
			return false; 
			}
		} 		
</script>
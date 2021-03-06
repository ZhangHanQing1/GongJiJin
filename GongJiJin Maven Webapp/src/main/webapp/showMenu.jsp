<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showMenu.jsp' starting page</title>
    
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
    <table class="table table-bordered" style="margin-top: 20px;">
	<input type="text" id="mohu" style="margin-top: 10px;"/><span>可以根据权限昵称和url进行模糊查询</span>
	<thead>
		<tr>
			<th>权限编号</th>
			<th>权限昵称</th>
			<th>权限url</th>
			<th>权限节点</th>
			<th>
			<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" id="xinzeng1">
			新增子权限
			</button>
			<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModalmy" id="xinzeng2">
			新增父权限
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
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" 
						aria-hidden="true">×
				</button>
				<h4 class="modal-title" id="myModalLabel">
					新增权限（只能添加子集菜单）
				</h4>
			</div>
			<div class="modal-body">
				
		<form class="form-horizontal" role="form" id="addMenu">
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">权限昵称</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="lastname" name="menu_name">
			<input type="hidden" class="form-control" id="menu_id" name="menu_id">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">权限url</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="lastname" name="url">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">父级昵称</label>
		<div class="col-sm-10">
			<select id="aaaaaaa" class="contractType form-control" name="parent_id">
  	
  			</select>
		</div>
	</div>
	
	</form>	
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" 
						data-dismiss="modal">关闭
				</button>
				<button type="button" class="btn btn-primary" data-dismiss="modal" onclick="addMenu()">
					提交更改
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->


<div class="modal fade" id="myModalmy" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" 
						aria-hidden="true">×
				</button>
				<h4 class="modal-title" id="myModalLabel">
					新增权限（只能添加父集菜单）
				</h4>
			</div>
			<div class="modal-body">
				
		<form class="form-horizontal" role="form" id="addMenuFu">
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">权限昵称</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="lastname" name="menu_name">
			<input type="hidden" class="form-control" id="menuId" name="menu_id">
			<input type="hidden" id="parent_id111" value="0" name="parent_id"/>
			<input type="hidden" class="form-control" id="order_num11" name="order_num">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">权限url</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="lastname" name="url" value="javascript:;">
		</div>
	</div>
	
	</form>	
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" 
						data-dismiss="modal">关闭
				</button>
				<button type="button" class="btn btn-primary" data-dismiss="modal" onclick="addMenuFu()">
					提交更改
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" 
						aria-hidden="true">×
				</button>
				<h4 class="modal-title" id="myModalLabel">
					修改权限
				</h4>
			</div>
			<div class="modal-body">
				
		<form class="form-horizontal" role="form" id="updateMenu2">
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">权限昵称</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="menu_name" name="menu_name">
			<input type="hidden" class="form-control" id="menu_id1" name="menu_id">
			
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">权限url</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="url1" name="url">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">父级昵称</label>
		<div class="col-sm-10">
			<select id="bbbbbbbbb" class="contractType form-control" name="parent_id">
  	
  			</select>
		</div>
	</div>
	</form>	
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" 
						data-dismiss="modal">关闭
				</button>
				<button type="button" class="btn btn-primary" data-dismiss="modal" onclick="updateMenu()">
					提交更改
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div class="modal fade" id="myModal111" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" 
						aria-hidden="true">×
				</button>
				<h4 class="modal-title" id="myModalLabel">
					修改权限
				</h4>
			</div>
			<div class="modal-body">
				
		<form class="form-horizontal" role="form" id="updateMenu5">
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">权限昵称</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="menu_name11" name="menu_name">
			<input type="hidden" class="form-control" id="menu_id11" name="menu_id">
			
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">权限url</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="url11" name="url">
		</div>
	</div>
	</form>	
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" 
						data-dismiss="modal">关闭
				</button>
				<button type="button" class="btn btn-primary" data-dismiss="modal" onclick="updateMenu5()">
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
$("#xinzeng1").click(function(){
	$("#menu_id").val("");
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
 　	 	$("#menu_id").val(now);
	})
	$("#xinzeng2").click(function(){
		$("#order_num11").val("");
 		$("#menuId").val("");
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
 　	 	$("#order_num11").val(now);
 		$("#menuId").val(now);
	})
	/* $(function(){  
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
 　	 	$("#menu_id").val(now);
 		$("#order_num11").val(now);
 		$("#menuId").val(now);
	});  */
	
	
	function p(s) {
    return s < 10 ? '0' + s: s;
	}

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
	
	var now=year+'-'+p(month)+"-"+p(date)+" "+p(h)+':'+p(m)+":"+p(s);
	
	function selectshang(startPage){
		$("#ul1").css("display","block");
		$("#ul2").css("display","none");
		$("#tbody").html("")
		$.ajax({
        	url : "showMenu",
        	type : "post",
        	data : {
				"startPage" : startPage
			},
       	 	dataType : "JSON",//返回的数据类型
        	success : function(data) {
          		var ary=data.list;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		if(obj.parent_id!=0){
		        		var tr="<tr>";
		        		tr+="<td>"+obj.menu_id+"</td>";
		        		tr+="<td>"+obj.menu_name+"</td>";
		        		tr+="<td>"+obj.url+"</td>";
		        		tr+="<td>"+obj.parent_id+"</td>";
		        		tr+="<td><button type='button' id='"+obj.menu_id+"' class='showMenu1 btn btn-info' data-toggle='modal' data-target='#myModal1'>修改</button><button type='button' id='"+obj.menu_id+"' class='deleteMenu btn btn-danger'>删除</button></td>"; 
		        		tr+="</tr>";
		        		$("#tbody").append(tr);
		        		}
		        		if(obj.parent_id==0){
		        		var tr="<tr>";
		        		tr+="<td>"+obj.menu_id+"</td>";
		        		tr+="<td>"+obj.menu_name+"</td>";
		        		tr+="<td>"+obj.url+"</td>";
		        		tr+="<td>父级菜单</td>";
		        		tr+="<td><button type='button' id='"+obj.menu_id+"' class='showMenu5 btn btn-info' data-toggle='modal' data-target='#myModal111'>修改</button><button type='button' id='"+obj.menu_id+"' class='deleteMenu btn btn-danger'>删除</button></td>"; 
		        		tr+="</tr>";
		        		$("#tbody").append(tr);
		        		}
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
	//查询权限表
	function showMenu22(){
	$("#aaaaaaa").append("");
		$.ajax({
        	url : "showMenu222",
        	type : "post",
       	 	dataType : "JSON",//返回的数据类型
        	success : function(data) {
          		var ary=data;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		if(obj.parent_id=='0'){
		        		var tr="<option value='"+obj.order_num+"'>"+obj.menu_name+"</option>"
						$("#aaaaaaa").append(tr);
						}
		       	}   
        	}
 		})
	}
	function addMenu(){
          var obj=$("#addMenu").serialize();
          alert(obj);
		$.ajax({
        	url : "addMenu",
        	type : "post",
        	async : true,
        	//contentType: "application/json; charset=utf-8",//需要制定
        	data : obj,//将json对象转换成json格式的字符串
       	 	dataType : 'text',//返回的数据类型
        	success : function(data) {
        		alert("aa");
        		selectshang(1);
        	}
 		});
	}
	function addMenuFu(){
          var obj=$("#addMenuFu").serialize();
          alert(obj);
		$.ajax({
        	url : "addMenu",
        	type : "post",
        	async : true,
        	//contentType: "application/json; charset=utf-8",//需要制定
        	data : obj,//将json对象转换成json格式的字符串
       	 	dataType : 'text',//返回的数据类型
        	success : function(data) {
        		alert("aa");
        		selectshang(1);
        	}
 		});
	}
	
	$("#tbody").on("click",".showMenu1",function(){
		$("#bbbbbbbbb").html("");
		$("#menu_name").val("");
        $("#url1").val("");
        $("#parent_id").val("");
        $("#menu_id1").val("");
		 var menu_id=this.id;
		$.ajax({
			url:"showMenu1",
			type : "post",
        	data:{
        		"menu_id" : menu_id,
        	},
       	 	dataType : "json",//返回的数据类型
        	success : function(data) {
        		$("#menu_name").val(data.menu_name);
        		$("#url1").val(data.url);
        		$("#menu_id1").val(data.menu_id);
        		$.ajax({
		        	url : "showMenu222",
		        	type : "post",
		       	 	dataType : "JSON",//返回的数据类型
		        	success : function(data1) {
		          		var ary=data1;
				     	for(var i=0;i<ary.length;i++){
				        		var obj=ary[i];//获取当前对象
				        		if(obj.parent_id=='0'){
				        		if(data.parent_id==obj.order_num){
				        			var tr="<option value='"+obj.order_num+"' selected='selected'>"+obj.menu_name+"</option>"
									$("#bbbbbbbbb").append(tr);
								}else{
									var tr="<option value='"+obj.order_num+"'>"+obj.menu_name+"</option>"
									$("#bbbbbbbbb").append(tr);
								}
								}
				       	}   
		        	}
 		})
        	}	
		})
	})
	$("#tbody").on("click",".showMenu5",function(){
		$("#menu_name11").val("");
        $("#url1").val("");
        $("#menu_id1").val("");
		 var menu_id=this.id;
		$.ajax({
			url:"showMenu1",
			type : "post",
        	data:{
        		"menu_id" : menu_id,
        	},
       	 	dataType : "json",//返回的数据类型
        	success : function(data) {
        		$("#url11").val(data.url);
        		$("#menu_id11").val(data.menu_id);
        		$("#menu_name11").val(data.menu_name);
        	}	
		})
	})
	//修改权限表
	function updateMenu(){
          var obj=$("#updateMenu2").serialize();
		$.ajax({
        	url : "updateMenu",
        	type : "post",
        	async : true,
        	//contentType: "application/json; charset=utf-8",//需要制定
        	data : obj,//将json对象转换成json格式的字符串
       	 	dataType : 'text',//返回的数据类型
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
 		});
	}
	//修改权限表
	function updateMenu5(){
          var obj=$("#updateMenu5").serialize();
		$.ajax({
        	url : "updateMenu",
        	type : "post",
        	async : true,
        	//contentType: "application/json; charset=utf-8",//需要制定
        	data : obj,//将json对象转换成json格式的字符串
       	 	dataType : 'text',//返回的数据类型
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
 		});
	}
	//删除权限表
	$("#tbody").on("click",".deleteMenu",function(){
		 var menu_id=this.id;
		alert(menu_id); 
		$.ajax({
			url:"deleteMenu",
			type : "post",
        	data:{
        		"menu_id" : menu_id,
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
    	showMenu22();
    		});
	function muhu(startPage){
		$("#ul2").css("display","block");
		$("#ul1").css("display","none");
		$("#tbody").html("");
		var menu_name=$("#mohu").val();
	    var url=$("#mohu").val();
		$.ajax({
			url : "showMenu",
        	type : "post",
        	data: {
        		"startPage" : startPage,
        		"menu_name" : menu_name,
        		"url" : url, 
        	},
       	 	dataType : "JSON",//返回的数据类型
        	success : function(data) {
          		var ary=data.list;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		if(obj.parent_id!=0){
		        		var tr="<tr>";
		        		tr+="<td>"+obj.menu_id+"</td>";
		        		tr+="<td>"+obj.menu_name+"</td>";
		        		tr+="<td>"+obj.url+"</td>";
		        		tr+="<td>"+obj.parent_id+"</td>";
		        		tr+="<td><button type='button' id='"+obj.menu_id+"' class='showMenu1 btn btn-info' data-toggle='modal' data-target='#myModal1'>修改</button><button type='button' id='"+obj.menu_id+"' class='deleteMenu btn btn-danger'>删除</button></td>"; 
		        		tr+="</tr>";
		        		$("#tbody").append(tr);
		        		}
		        		if(obj.parent_id==0){
		        		var tr="<tr>";
		        		tr+="<td>"+obj.menu_id+"</td>";
		        		tr+="<td>"+obj.menu_name+"</td>";
		        		tr+="<td>"+obj.url+"</td>";
		        		tr+="<td>父级菜单</td>";
		        		tr+="<td><button type='button' id='"+obj.menu_id+"' class='showMenu5 btn btn-info' data-toggle='modal' data-target='#myModal111'>修改</button><button type='button' id='"+obj.menu_id+"' class='deleteMenu btn btn-danger'>删除</button></td>"; 
		        		tr+="</tr>";
		        		$("#tbody").append(tr);
		        		}
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
</script>

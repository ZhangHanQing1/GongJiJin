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
	<script type="text/javascript">
	layui.use('element', function(){
  	var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
  	//监听导航点击
  	element.on('nav(demo)', function(elem){
    //console.log(elem)
    layer.msg(elem.text());
  });
}); 
</script>
  </head>
  <body>
    <table class="table table-bordered">
			<thead>
				<tr>
					<th>角色编号</th>
					<th>角色昵称</th>
					<th>角色状态</th>
					<th>
					<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
					新增角色
					</button>
					</th>
				</tr>
			</thead>
		<tbody id="tbody">
	    			
	    </tbody>
	</table>
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" 
						aria-hidden="true">×
				</button>
				<h4 class="modal-title" id="myModalLabel">
					新增角色
				</h4>
			</div>
			<div class="modal-body">
				
		<form class="form-horizontal" role="form" id="addRole">
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">角色昵称</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="role_name" name="role_name">
			<input type="hidden" class="form-control" id="role_id" name="role_id">
			<input type="hidden" class="form-control" value="1" id="status" name="status">
		</div>
	</div>
	</form>	
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" 
						data-dismiss="modal">关闭
				</button>
				<button type="button" data-dismiss="modal" class="btn btn-primary" onclick="addRole()">
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
					分配角色
				</h4>
			</div>
			<div class="modal-body">
				
		<form class="form-horizontal" role="form" id="updeteRole22">
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">角色昵称</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="role_name2" name="role_name">
			<input type="hidden" class="form-control" id="role_id2" name="role_id">
		</div>
	</div>
	</form>	
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" 
						data-dismiss="modal">关闭
				</button>
				<button type="button" data-dismiss="modal" class="btn btn-primary" onclick="updeteRole2()">
					提交更改
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<div class="modal fade" id="perModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left: -200px;">
		<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" 
						aria-hidden="true">×
				</button>
				<h4 class="modal-title" id="myModalLabel">
					修改角色
				</h4>
			</div>
			<div class="modal-body" >
				<form action="" id="aaaa">
					<ul class="layui-nav layui-nav-tree layui-inline" lay-filter="demo" style="margin-right: 10px; display: block;" id="roleList">
					
					</ul>
					<input type="hidden" name="role_id" id="role_ids"/>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" 
						data-dismiss="modal">关闭
				</button>
				<button class="btn btn-primary btn-lg" data-dismiss="modal" id="aaaa1">
					新增角色
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
	</div> 
	
	<script src="resources/layui/layui.js" charset="utf-8"></script>
  <script>
	
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
  })
})
</script>
  </body>
</html>
<script type="text/javascript">
	$(function(){  
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
 　	 	$("#role_id").val(now);
	}); 
	
	
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
	function selectshang(){
		$("#tbody").html("")
		$.ajax({
        	url : "showRole",
        	type : "post",
       	 	dataType : "JSON",//返回的数据类型
        	success : function(data) {
          		var ary=data;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.role_id+"</td>";
		        		tr+="<td>"+obj.role_name+"</td>";
		        		if(obj.status==0){
		        		tr+="<td>正常</td>";
		        		}
		        		if(obj.status==1){
		        		tr+="<td>停用</td>";
		        		}
		        		if(obj.role_id==1){
		        			tr+="<td><button type='button' id='"+obj.role_id+"' class='shoeRoleId btn btn-success' data-toggle='modal' data-target='#myModal1'>修改</button><button type='button' id='"+obj.role_id+"' class='showRolefen btn btn-success' data-toggle='modal' data-target='#perModal'>查看权限</button></td>"; 
		        		}else{
			        		if(obj.status==0){
			        			tr+="<td><button type='button' id='"+obj.role_id+"' name='"+obj.status+"' class='updateRole btn btn-danger'>停用</button><button type='button' id='"+obj.role_id+"' class='shoeRoleId btn btn-success' data-toggle='modal' data-target='#myModal1'>修改</button><button type='button' id='"+obj.role_id+"' class='showRolefen btn btn-success' data-toggle='modal' data-target='#perModal'>查看权限</button></td>"; 
			        		}
			        		if(obj.status==1){
			        			tr+="<td><button type='button' id='"+obj.role_id+"' name='"+obj.status+"' class='updateRole btn btn-success'>启用</button><button type='button' id='"+obj.role_id+"' class='shoeRoleId btn btn-success' data-toggle='modal' data-target='#myModal1'>修改</button><button type='button' id='"+obj.role_id+"' class='showRolefen btn btn-success' data-toggle='modal' data-target='#perModal'>查看权限</button></td>"; 
			        		}
		        		}
		        		tr+="</tr>";
		        		$("#tbody").append(tr);
		       	}   
        	}
 		})
	}
	function addRole(){
          var obj=$("#addRole").serialize();
			$.ajax({
        	url : "addRole",
        	type : "post",
        	async : true,
        	//contentType: "application/json; charset=utf-8",//需要制定
        	data : obj,//将json对象转换成json格式的字符串
       	 	dataType : 'text',//返回的数据类型
        	success : function(data) {
        		selectshang();
        	}
 		})
	}
	//停用和启用角色
	$("#tbody").on("click",".updateRole",function(){
		var role_id=this.id;
		var status=this.name; 
		alert(role_id)
		$.ajax({
			url:"updateRole",
			type : "post",
        	data:{
        		"role_id" : role_id,
        		"status" : status,
        	},
       	 	dataType : "text",//返回的数据类型
        	success : function(data) {
        		selectshang();
        	}	
		})
	})
	//删除角色表
	$("#tbody").on("click",".deleteRole",function(){
		var role_id=this.id;
		alert(role_id)
		$.ajax({
			url:"deleteRole",
			type : "post",
        	data:{
        		"role_id" : role_id,
        	},
       	 	dataType : "text",//返回的数据类型
        	success : function(data) {
        		selectshang();
        	}	
		})
	})	
	//通过id查询角色表
	$("#tbody").on("click",".shoeRoleId",function(){
		$("#role_name2").val("");
		$("#role_id2").val("");
		 var role_id=this.id;
		 alert(role_id)
		 alert()
		$.ajax({
			url:"shoeRoleId",
			type : "post",
        	data:{
        		"role_id" : role_id,
        	},
       	 	dataType : "json",//返回的数据类型
        	success : function(data) {
        		$("#role_name2").val(data.role_name);
        		$("#role_id2").val(data.role_id);
        	}	
		})
	})
	function updeteRole2(){
          var obj=$("#updeteRole22").serialize();
          alert("aa")
			$.ajax({
        	url : "updeteRole2",
        	type : "post",
        	async : true,
        	//contentType: "application/json; charset=utf-8",//需要制定
        	data : obj,//将json对象转换成json格式的字符串
       	 	dataType : 'text',//返回的数据类型
        	success : function(data) {
        		selectshang();
        	}
 		})
	}
	$(function(){  
    	selectshang();
	});
	$("#tbody").on("click",".showRolefen",function(){
    var role_id=this.id;
    $("#role_ids").val(role_id);
    $("#roleList").html("");
		$.ajax({
        	url : "showMenuShu",
        	type : "post",
        	data:{
        		"role_id" : role_id,
        	},
       	 	dataType : "JSON",//返回的数据类型
        	success : function(data) {
          		var ary=data;
		     	for(var i=0;i<ary.length;i++){
		     	
		        		var obj=ary[i];//获取当前对象
		        		if(obj.checked==1){
		        		if(obj.parent_id=='0'){
		        		var li="<li class='layui-nav-item layui-nav-itemed' id='roleList1'>"
		        		li+="<a href='javascript:;'><input type='checkbox' value='"+obj.menu_id+"' name='list["+i+"].menu_id' checked='checked'>"+obj.menu_name+"</a>"
		        		    for(var j=0;j<ary.length;j++){
			        		var obj1=ary[j]; 
			        		li+="<dl class='layui-nav-child'>"
			        		if(obj1.parent_id==obj.order_num){
			        			if(obj1.checked==1){
			        			 li+="<dd><a style='margin-left: 20px;'><input type='checkbox' name='list["+j+"].menu_id' value='"+obj1.menu_id+"' checked='checked'>"+obj1.menu_name+"</a></dd>"	 
								}
								if(obj1.checked==0){
			        			 li+="<dd><a style='margin-left: 20px;'><input type='checkbox' value='"+obj1.menu_id+"' name='list["+j+"].menu_id'>"+obj1.menu_name+"</a></dd>"	 
								}
								}
			        		 li+="</dl>"
			        		 }        
		        		li+="</li>"
		        		 $("#roleList").append(li);	
		        		} 	
		        		}
		        		if(obj.checked==0){
		        		if(obj.parent_id=='0'){
		        		var li="<li class='layui-nav-item layui-nav-itemed' id='roleList1'>"
		        		li+="<a href='javascript:;'><input type='checkbox' name='list["+i+"].menu_id' value='"+obj.menu_id+"'>"+obj.menu_name+"</a>"
		        		    for(var j=0;j<ary.length;j++){
			        		var obj1=ary[j]; 
			        		li+="<dl class='layui-nav-child'>"
			        		if(obj1.parent_id==obj.order_num){
			        			if(obj1.checked==1){
			        			 li+="<dd><a style='margin-left: 20px;'><input type='checkbox' name='list["+j+"].menu_id' value='"+obj1.menu_id+"' checked='checked'>"+obj1.menu_name+"</a></dd>"	 
								}
								if(obj1.checked==0){
			        			 li+="<dd><a style='margin-left: 20px;'><input type='checkbox' name='list["+j+"].menu_id' value='"+obj1.menu_id+"'>"+obj1.menu_name+"</a></dd>"	 
								}
								}
			        		 li+="</dl>"
			        		 }        
		        		li+="</li>"
		        		 $("#roleList").append(li);	
		        		} 	
		        		}	
		       	}  
		       
        	}
 		})
})
	$("#aaaa1").click(function(){
			var obj=$("#aaaa").serialize();
			alert(obj)
			$.ajax({
	        	url : "SRMsss",
	        	type : "post",
	        	async : true,
	        	data : obj,//将json对象转换成json格式的字符串
	       	 	dataType : 'text',//返回的数据类型
        		success : function(data) {
        		
        		}
 		})
	})

/* $("#selectMeRo").click(function(){
    $("#roleList2").html("");
		$.ajax({
        	url : "selectMeRo",
        	type : "post",
       	 	dataType : "JSON",//返回的数据类型
        	success : function(data) {
          		var ary=data;	
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		if(obj.parent_id=='0'){
		        		var li="<li class='layui-nav-item layui-nav-itemed' id='roleList1'>"
		        		li+="<a href='javascript:;'><input type='checkbox' class='test' id='parent["+i+"]'>"+obj.menu_name+"</a>"
		        		    for(var j=0;j<ary.length;j++){
			        		var obj1=ary[j]; 
			        		li+="<dl class='layui-nav-child'>"
			        		if(obj1.parent_id==obj.order_num){
			        			 li+="<dd><a style='margin-left: 20px;'><input type='checkbox' name='"+obj1.menu_id+"' id='"+obj1.parent_id+"' class='addsussess1'>"+obj1.menu_name+"</a></dd>"	 
								}
			        		 li+="</dl>"
			        		 }        
		        		li+="</li>"
		        		 $("#roleList2").append(li);	
		        		} 	
		        		
		       	}  
		       
        	}
 		})
}) */ 
/* 	/*分配功能*/
/* $("#tbody").on("click",".showRolefen",function(){
    var role_id=this.id;
    $("#hidRoleId").val(role_id);
    createTree(role_id);
});
var zTree;
//创建树型结构
function createTree(role_id) {
 var setting = {
   check:{
     enable:true
   },
   view: {
     dblClickExpand: true,
     expandSpeed: ""
   },
   //异步加载
   async: {
     enable: true,//设置是否异步加载
     url:"showMenuShu", //设置异步获取节点的 URL 地址
     otherParam: [ "Sys_role.role_id",role_id]
   },
   data: {
     simpleData: {
       enable: true,
       pIdKey: "parent_id",
       idKey: "menu_id"
     },
     key: {
       checked: "checked",
       name:"menu_name"
     }
   },
   callback: {
     onAsyncSuccess: zTreeOnAsyncSuccess 
   } 
 };
 //初始化
  zTree = $.fn.zTree.init($("#tree"), setting);  
 zTree.expandAll(true);
}
/* 异步加载无法展开tree 默认展开一级菜单 */
 /* var firstAsyncSuccessFlag = 0;
function zTreeOnAsyncSuccess(event, treeId, msg) { 
if (firstAsyncSuccessFlag == 0) { 
    try { 
        //调用默认展开第一个结点 
        var selectedNode = zTree.getSelectedNodes(); 
        var nodes = zTree.getNodes(); 
        zTree.expandNode(nodes[0], true); 
        var childNodes = zTree.transformToArray(nodes[0]); 
        zTree.expandNode(childNodes[1], true); 
        zTree.selectNode(childNodes[1]); 
        var childNodes1 = zTree.transformToArray(childNodes[1]); 
        zTree.checkNode(childNodes1[1], true, true); 
        firstAsyncSuccessFlag = 1; 
     } catch (err) { 
    	 console.log(err.message);
     } 
  } 
}
//保存修改后的权限数据
$("#savePermission").click(function(){
	        var nodes = zTree.getCheckedNodes();//获取所有选中的节点集合
		    var ids = [];
		    for(var i=0,l=nodes.length;i<l;i++){
		      ids[ids.length] = nodes[i].menu_id;//存入菜单编号
		    }
		    var idstr=ids.join(",");//拼接成字符串
	        $.ajax({
		        url:"${pageContext.request.contextPath}/role_grantPermissionForRole.action",
		        data:{"sys_role.role_id":$("#hidRoleId").val(),"menuIds":idstr},
		        dataType:"json", 
		        type:"post",
		        success:function(data){
		            alert(data.message);
		        }
	         });
	     });  */
</script>


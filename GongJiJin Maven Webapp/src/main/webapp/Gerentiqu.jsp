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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	 <!-- <div class="layui-inline" style="margin-top: 22px;">
      <label class="layui-form-label">提取类型</label>
      <div class="layui-input-inline">
        	<select id="tqlx_id">
        		<option value="">全部</option>
        		<option value="部分提取">部分提取</option>
        		<option value="销户提取">销户提取</option>
        	</select>
      </div>
    </div> -->
    <div class="form-group">
		<input type="text" class="layui-input" placeholder="提取类型" style="width: 70px;background-color: #dddddd; display: block;margin-top: 40px;">
		<div class="col-sm-10" style="float: left;">
			<select id="tqlx_id" class="contractType form-control" style="width: 200px; margin-left: 60px;margin-top: -35px;">
  				<option value="">全部</option>
        		<option value="部分提取">部分提取</option>
        		<option value="销户提取">销户提取</option>
  			</select>
		</div>
	</div>
    <!-- <div class="layui-inline" style="margin-top: 22px; float: left;">
      <label class="layui-form-label">提取状态</label>
      <div class="layui-input-inline">
        	<select id="tqzt_id">
        		<option value="通过">通过</option>
        		<option value="不过">不过</option>
        		<option value="未申">未申</option>
        	</select>
      </div>
    </div> -->
    <div class="form-group" style="float: left; margin-top: -90px; margin-left: 400px;">
		<input type="text" class="layui-input" placeholder="提取类型" style="width: 70px;background-color: #dddddd; display: block;margin-top: 40px;">
		<div class="col-sm-10" style="float: left;">
			<select id="tqzt_id" class="contractType form-control" style="width: 200px;margin-left: 60px;margin-top: -35px;">
  				<option value="通过">通过</option>
        		<option value="不过">不过</option>
        		<option value="未申">未申</option>
  			</select>
		</div>
	</div>
	
	    <div class="layui-inline" style="margin-top: -45px;margin-left: 0px; float: left;">
		      <div class="layui-input-inline">
		        <input type="text" class="layui-input" placeholder="业务日期" style="width: 70px;background-color: #dddddd;">
		      </div>
		 </div>
		 <div style="margin-left: 70px;">
	    <div class="layui-inline" style="margin-top: -70px;margin-left: 70px;">
	      <div class="layui-input-inline">
	        <input type="text" class="layui-input" id="date1" placeholder="yyyy-MM-dd">
	      </div>
	    </div>
	    <div class="layui-inline" style="margin-top: -70px;">
	      <div class="layui-input-inline">
	        <input type="text" class="layui-input" id="date1" placeholder="至" style="width: 27px;">
	      </div>
	    </div>
	    <div class="layui-inline" style="margin-top: -70px;">
	      <div class="layui-input-inline">
	        <input type="text" class="layui-input" id="date2" placeholder="yyyy-MM-dd">
	      </div>
	    </div>
     	<button class="layui-btn layui-btn-normal" id="show" style="margin-top: -70px;">查询</button>
     </div>
     <table class="table table-bordered" style="margin-top: 20px;">
	<thead>
		<tr>
			<th>姓名</th>
			<th>单位名称</th>
			<th>提取类型</th>
			<th>提取金额</th>
			<th>提取日期</th>
			<th>提取状态</th>
		</tr>
	</thead>
	<tbody id="tbody">
    			
    </tbody>
</table>
<div style="border: 1px solid #dddddd; width: 100%; height: 40px; margin-top: -20px; line-height: 40px; text-align: center;" >
	总计：提取<span id="a1"></span>次，提取总额<span id="a2"></span>元
</div>
	<ul class="pager" id="ul1" style="display: block;">
		<li><button type="button" class="btn btn-default" id="shouye">首页</button></li>
		<li><button type="button" class="btn btn-default" id="syy">上一页</button></li>
		<li><button type="button" class="btn btn-default" id="xyy">下一页</button></li>
		<li><button type="button" class="btn btn-default" id="weiye">尾页</button></li>
		<li style="font-weight: lighter;">当前第<input type="text" id="currPage" style="height:35px;width:50px;border-radius:10px;text-align: center;"/>页</li>
	</ul>
	<input type="hidden" id="aa"/>
<input type="hidden" id="bb"/>
  </body>
</html>
<script>
layui.use('laydate', function(){
  var laydate = layui.laydate;
  
  //常规用法
  laydate.render({
    elem: '#date1'
  });
  laydate.render({
    elem: '#date2'
  });
  })
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
	
	var date1=p(year)+"-"+p(month)+"-"+"01";
	var date2=p(year)+"-"+p(month)+"-"+"31";
	$("#date1").val(date1);
	$("#date2").val(date2);
	showGeTq(1);
	geren();
	gerens();
  	})
  	function p(s) {
    return s < 10 ? '0' + s: s;
	}
	function showGeTq(startPage){
		$("#tbody").html("")
		var date1=$("#date1").val();
		var date2=$("#date2").val();
		var tqlx=$("#tqlx_id").val();
		var spzt2=$("#tqzt_id").val();
		
		$.ajax({
        	url : "showGeTq",
        	type : "post",
        	data:{
        		"date1" : date1,
        		"date2" : date2,
        		"tqlx" : tqlx,
        		"spzt2" : spzt2,
        		"startPage" : startPage,
        	},
       	 	dataType : "JSON",//返回的数据类型
        	success : function(data) {
          		var ary=data.list;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.zgxm+"</td>";
		        		tr+="<td>"+obj.dwmc2+"</td>";
		        		tr+="<td>"+obj.tqlx+"</td>";
		        		tr+="<td>"+obj.tqze+"</td>";
		        		tr+="<td>"+obj.spsj+"</td>";
		        		tr+="<td>"+obj.spzt2+"</td>";
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
					   showGeTq(last);
					}
					if(curr<=0){
					  $("#currPage").val(1);
					   showGeTq(1);
					}
					 showGeTq(curr);
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
		showGeTq(currPage - 1);
	})
	$("#xyy").click(function() {
		var currPage = parseInt($("#currPage").val());
		showGeTq(currPage + 1);
	})
	$("#shouye").click(function() {
		showGeTq(1);
	})
	$("#weiye").click(function() {
		var tt=$("#aa").val();
		var tt1=$("#bb").val();
		var last = Math.ceil(tt/tt1);
		showGeTq(last);
				})
	function geren(){
		var date1=$("#date1").val();
		var date2=$("#date2").val();
		var tqlx=$("#tqlx_id").val();
		var spzt2=$("#tqzt_id").val();
		$("#a2").html("");
		$.ajax({
        	url : "grtq111",
        	type : "post",
        	async : true,
        	data : {
        		"date1" : date1,
        		"date2" : date2,
        		"tqlx" : tqlx,
        		"spzt2" :spzt2,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a2").html(data);
        	}
 		});
	}
	function gerens(){
		var date1=$("#date1").val();
		var date2=$("#date2").val();
		var tqlx=$("#tqlx_id").val();
		var spzt2=$("#tqzt_id").val();
		$("#a1").html("");
		$.ajax({
        	url : "grtqs111",
        	type : "post",
        	async : true,
        	data : {
        		"date1" : date1,
        		"date2" : date2,
        		"tqlx" : tqlx,
        		"spzt2" :spzt2,
        		
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a1").html(data);
        	}
 		});
	}
	$("#show").click(function(){
		showGeTq(1);
		geren();
		gerens();
	})
</script>

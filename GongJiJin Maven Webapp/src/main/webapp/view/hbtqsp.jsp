<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>合并/提取审批</title>
	<meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap-theme.min.css">
	<script src="resources/jquery-1.11.3.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
    <h2 class="text-center" style="width: 60%;margin-left: 20%"><a href="javascript:void(0)" id="one">合并审批</a>/<a href="javascript:void(0)" id="two">提取审批</a></h2>
    <table class="table table-bordered table-hover text-center" style="width: 60%;margin-left: 20%" id="zhhbjlb">
      <thead>
        <tr>
          <td>记录编号</td>
          <td>保留个人账号</td>
          <td>销户个人账号</td>
          <td>销户个人账户余额</td>
          <td>申请时间</td>
          <td>审核状态</td>
        </tr>
      </thead>
      <tbody id="zhhbs">
      
      </tbody>
    </table>    
    <table class="table table-bordered table-hover text-center" style="width: 60%;margin-left: 20%;" id="gjjtq">
      <thead>
        <tr>
          <td>个人账户</td>
          <td>职工姓名</td>
          <td>证件号码</td>
          <td>单位账户</td>
          <td>单位名称</td>
          <td>账户余额</td>
          <td>提取类型</td>
          <td>提取金额</td>
          <td>申请时间</td>
          <td>提取原因</td>
        </tr>
      </thead>
      <tbody id="">
      
      </tbody>
    </table>
    <script type="text/javascript">
      $(function(){
		    $("#gjjtq").hide();
      })
    	 /* 简易选择卡切换 */
		$("#one,#two").click(function(){
		  if(this.id=="one"){
		    $("#zhhbjlb").show();
		    $("#gjjtq").hide();
		  }else if(this.id=="two"){
		    $("#zhhbjlb").hide();
		    $("#gjjtq").show();
		  }
		})
      $(function(){
          findByConditions();
      })
      /* 查询账户合并申请 */
      function findByConditions(){
	      $.ajax({
	        url:'zhhbjlb/findByConditions',
	        type:'post',
	        async:true,
			contentType : "application/x-www-form-urlencoded;charset=utf-8",
	        dataType:"json",
	        success:function(data){
	          $("#zhhbs").empty();
	          var caozuo="";
	          $.each(data, function(){
	            if(this.tzzd1=="未审批"){
	              caozuo="&nbsp;||&nbsp;<a onclick='confirmZhhbjlb("+this.jlbh+")' href='javascript:void(0)'>通过</a>&nbsp;||&nbsp;<a onclick='' href='javascript:void(0)'>不通过</a>";
	            }
	            var tr="<tr>";
	            tr+="<td>"+this.jlbh+"</td>";
	            tr+="<td>"+this.blgrzh+"</td>";
	            tr+="<td>"+this.xhgrzh+"</td>";
	            tr+="<td>"+this.xhgrzhye+"元</td>";
	            tr+="<td>"+this.cjsj+"</td>";
	            tr+="<td>"+this.tzzd1+caozuo+"</td>";
	            tr+="</tr>";
	            $("#zhhbs").append(tr);
	          })
	        }
	      })
      }
      function confirmZhhbjlb(jlbh){
	      $.ajax({
	        url:'zhhbjlb/confirmZhhbjlb',
	        type:'post',
	        async:true,
	        data:{"jlbh":jlbh},
			contentType : "application/x-www-form-urlencoded;charset=utf-8",
	        dataType:"text",
	        success:function(data){
	          if(data==1){
	            alert("账户合并成功!");
	            findByConditions();
	          }
	        }
	      })
      }
    </script>
  </body>
</html>

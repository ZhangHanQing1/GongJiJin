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
    <title>账户合并</title>
	<meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap-theme.min.css">
	<script src="resources/jquery-1.11.3.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
    <form>
      <table class="table table-bordered text-center" style="width:60%;margin-left:20%">
        <caption class="text-center h2" >账户合并</caption>
        <thead>
            <tr id="newZh">
              <td class="input-group" style="border-bottom-color: #fff;width: 400px;">
	              <span class="input-group-addon">
	                保留账户:
	              </span>
	              <input type="text" class="form-control"  placeholder="请输入" id="blgrzh"/>
	              <span class="input-group-btn">
	                <input type="button" class="btn btn-default"  id="selectById" value="确认"/>
	              </span>
	          </td>
            </tr>
	        <tr>
		        <td style="width: 400px">公积金账户</td>
		        <td>姓名</td>
		        <td>公司名称</td>
		        <td>余额</td>
		        <td>证件信息</td>
		        <td>操作</td>
	        </tr>
        </thead>
        <tbody id="zhxxs">

        </tbody>
      </table>
    </form>
    <script type="text/javascript">
        $("#selectById").click(function(){
              var grbh=$("#blgrzh").val();
		      $.ajax({
		        url:'grzhxx/findById',
		        type:'post',
		        async:true,
				contentType : "application/x-www-form-urlencoded;charset=utf-8",
                data:{"grbh":grbh},
		        dataType:"json",
		        success:function(data){
		           var tr="";
		           $.each(data, function(index,object){
		               if(grbh==object.grbh){
		                 caozuo="保留账户";
		               }else{
		                 caozuo="<input class='btn btn-default' onclick='insertZhhbjlb("+object.grbh+")' type='button' value='合并此账户'/>";
		               }
		               tr+="<tr><td>"+object.grbh+"</td><td>"+object.xingming+"</td><td>"
		               +object.dwmc2+"</td><td>"+object.grzhye+"元</td><td>"+object.sbzh
		               +"</td><td>"+caozuo+"</td></tr>";
		           })
		           $("#zhxxs").append(tr);
		        }
		      })
        })
        function insertZhhbjlb(xhgrzh){
          var blgrzh=parseInt($("#blgrzh").val());
	      $.ajax({
	        url:'zhhbjlb/insertZhhbjlb',
	        type:'post',
	        async:true,
			contentType : "application/x-www-form-urlencoded;charset=utf-8",
            data:{"blgrzh":blgrzh,"xhgrzh":xhgrzh},
	        dataType:"text",
	        success:function(data){
	            if(data==1){
	              alert("提交申请成功");
	              /* $("#grzhxx").reset(); */
	            }else{
	              alert("提交申请失败");
	            }
	        }
	      })
        }
    </script>
  </body>
</html>
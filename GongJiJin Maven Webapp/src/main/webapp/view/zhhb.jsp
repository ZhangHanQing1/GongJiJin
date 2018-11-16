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
    <form action="" class="">
      <table class="table table-bordered text-center">
        <caption class="text-center h2" >账户合并</caption>
        <thead>
	        <tr>
		        <td>公积金账户</td>
		        <td style="width:200px;">姓名</td>
		        <td style="width:200px;">公司名称</td>
		        <td style="width:200px;">余额</td>
		        <td style="width:200px;">证件信息</td>
	        </tr>
        </thead>
        <tbody id="zhxxs">
          <tr id="newZh">
            <td class="input-group" style="border-top-color: #fff">
	            <span class="input-group-addon">
	              保留账户:
	            </span>
	            <input type="text" class="form-control"  placeholder="请输入" id="blgrzh"/>
	            <span class="input-group-btn">
	              <input type="button" class="btn btn-default"  id="selectById" value="确认"/>
	            </span>
	        </td>
          </tr>
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
		           /* [{xingming=田统一, grbh=1, dwmc2=单位一号, grzhye=3200, sbzh=41272319981014xxxx}, 
		           {xingming=田统一, grbh=3, dwmc2=单位一号, sbzh=41272319981014xxxx}] */
		           $("#newZh").append("<td>"+data[0].xingming+"</td><td>"+data[0].dwmc2
		           +"</td><td>"+data[0].grzhye+"元</td><td>"+data[0].sbzh+"</td>");
		           var tr="";
		           $.each(data, function(index,object){
		             if(object.grbh==grbh){
		             }else{
		               tr+="<tr><td>"+object.grbh+"&nbsp;&nbsp;&nbsp;&nbsp;<input class='btn btn-default' onclick='insertZhhbjlb("+object.grbh+")' type='button' value='合并此账户'/></td><td>"+object.xingming+"</td><td>"
		               +object.dwmc2+"</td><td>"+object.grzhye+"元</td><td>"+object.sbzh+"</td></tr>";
		             }
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
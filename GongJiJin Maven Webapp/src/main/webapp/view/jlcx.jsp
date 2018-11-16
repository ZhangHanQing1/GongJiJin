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
    <title>记录查询</title>
	<meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap-theme.min.css">
	<script src="resources/jquery-1.11.3.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
    <table class="table table-bordered text-center table-hover" id="mxxxs" style="width:60%;margin-left:20%">
        <caption class='text-center h3'>缴费历史记录</caption>
		<thead>
		    <tr>
		      <td style="width:300px;">
	            <div class="input-group">
		            <span class="input-group-addon">
		                个人账户:
		            </span>
		            <input type="text" class="form-control"  placeholder="请输入" id="grbh"/>
		            <span class="input-group-btn">
		              <input type="button" class="btn btn-default"onclick="selectById(0,1)" value="确认"/>
		            </span>
	            </div>
		      </td>
		    </tr>
		    <tr>
		        <td>流水单号</td>
		        <td>缴费类型</td>
		        <td>缴费时间</td>
		        <td>个人缴额</td>
		        <td>单位缴额</td>
		    </tr>
		</thead>
		<tbody id="tabBody">
		
		</tbody>
		<tfoot id="tabFoot">
		
		</tfoot>
    </table>
    <script type="text/javascript">
        /* 分页查询个人缴费记录(pagehelper) */
        function selectById(grbh,startPage){
          grbh=$("#grbh").val();
          $.ajax({
		        url:'Gryw/selectById',
		        type:'post',
		        async:true,
		        /* contentType: "application/json;charset=utf-8", */
				contentType : "application/x-www-form-urlencoded;charset=utf-8",
                data:{"grbh":grbh,"startPage":startPage},
		        dataType:"json",
		        success:function(data){
		          if(!data.hasPreviousPage){
		              data.prePage=1;
		          }else if(!data.hasNextPage){
		              data.nextPage=data.pages;
		          }
		          $("#tabBody").empty();
		          $("#tabFoot").empty();
		          var tbody="";
		          $.each(data.list, function(){
		            var dwje;
		            if(this.dwje==null){
		              dwje=0;
		            }
		            tbody+="<tr><td>"+this.grywmxbh+"</td><td>"+this.gjywlx+"</td><td>"
		            +this.cjsj3+"</td><td>"+this.grje+"元</td><td>"+dwje+"元</td></tr>";
		          })
		          var options="<select onchange='selectById("+grbh+","+'this.value'+")'>";
		          for (var i=1;i<=data.pages;i++){
		            if(i==data.pageNum){
		              options+="<option selected='selected' value='"+i+"'>"+i+"</option>"
		            }else{
		              options+="<option value='"+i+"'>"+i+"</option>"
		            }
		          }
		          options+="</select>";
		          var tfoot="<tr><td colspan='5''><button onclick='selectById("+grbh+","+1+")'>首页"
		                        +"</button>&nbsp;<button onclick='selectById("+grbh+","+data.prePage+")'>上一页</button>"
		                        +"&nbsp;"+options+"/"+data.pages+"&nbsp;<button  onclick='selectById("+grbh+","+data.nextPage+")'>下一页</button>&nbsp;"
		                        +"<button  onclick='selectById("+grbh+","+data.pages+")'>尾页</button></td></tr>";
		          $("#tabBody").append(tbody);
		          $("#tabFoot").append(tfoot);
		        }
          })
        }
    </script>
  </body>
</html>

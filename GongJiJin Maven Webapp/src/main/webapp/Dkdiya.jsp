<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Dkshenqing.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap-theme.min.css">
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
    <script src="resources/jquery-1.11.3.min.js"></script>	
    <script src="resources/jquery.form.js"></script>
   
	<style>
	  .form-control{border-radius:18px;width:200px;height:30px;}
	   #dianji{margin-top:2%; }
	 
	</style>
  </head>
  
  <body>
    <center>
       <form class="form-horizontal" role="form" id="form1">
       <table class="table table-striped">
           <caption><h1>贷款抵押物信息</h1></caption>
  <tbody>
         
     <tr>
     <td>抵押姓名：</td>
     <td><input type="text" class="form-control" name="dyrxm"  placeholder="请输入"/></td>
     <td>抵押身份证号：</td>
     <td><input type="text" class="form-control" name="dyrsfzh"  placeholder="请输入"/></td>
     
     
     </tr> 
     <tr>
      <td>抵押类型：</td>
     <td><select name="dylx" class="form-control"><option>不动产抵押</option><option >动产抵押</option></select></td> 
     <td>抵押地址：</td>
     <td><input type="text" class="form-control" name="dywdz"   placeholder="请输入"/></td>     
     </tr> 
     <tr>
     <td>抵押所有权证号：</td>
     <td><input type="text" class="form-control" name="dywsyqzh"  placeholder="请输入"/></td>
     <td>抵押他项权证号：</td>
     <td><input type="text" class="form-control" name="dywtxqzh"  placeholder="请输入" /></td>    
     </tr>
     <tr> 
     <td>抵押物状态：</td>
     <td><select name="dbzt" class="form-control"><option>已抵押</option><option >未抵押</option></select></td>    
     <td>抵押物金额：</td>
     <td><input type="text" class="form-control" name="dyje" /></td>      
    </tr> 
 
    </tbody>
</table>
  </form>

      <button  class="btn btn-default" style="width:250px;font-size:20px;" id="dianji">提交申请</button>

 


  </body>
</html>
<script>
	$("#dianji").click(function tiaojian(){
			alert(JSON.stringify($("#form1").serializeObject()));
	     $.ajax({
	     url:"htxx/dyxxadd",
	       type:"post",
	       async : true,
        	contentType: "application/json; charset=utf-8",//需要制定
        	data : JSON.stringify($("#form1").serializeObject()),//将json对象转换成json格式的字符串
	       dataType:"json",
	      success:function(data){
					if(data=='1'){
						
						window.location.href="Dkshenqing.jsp";
					}else{
						
						alter(data);
					}
	          
	       }
	       
	       })
	       });
	
		$.fn.serializeObject = function() {
      var o = {};
      var a = this.serializeArray();
      $.each(a, function() {
          if (o[this.name] !== undefined) {
              if (!o[this.name].push) {
                  o[this.name] = [o[this.name]];
              }
              o[this.name].push(this.value || '');
          } else {
              o[this.name] = this.value || '';
          }
      });
      return o;
    };
    </script>

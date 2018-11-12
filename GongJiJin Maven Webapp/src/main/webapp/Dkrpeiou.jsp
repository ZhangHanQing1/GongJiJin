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
    <script type="text/javascript">
    	function checkaccount(){	
    	
    		$.ajax({
    			url:"zhxx/queryId",
    			type:"post",
    			data:{"dkrpo":$("#account").val()},
    			dataType:'json',
    			success:function(data){
    				$("#xingming").val(data.xingming);
    				$("#xingbie").val(data.xingbie);
    				$("#sjhm2").val(data.sjhm2);
    				$("#hyzk").val(data.hyzk);
    				$("#zhicheng").val(data.zhicheng);
    				$("#xueli").val(data.xueli);
    				$("#dzxx").val(data.dzxx);
    				$("#jtzz").val(data.jtzz);
    				$("#sbzh").val(data.sbzh);
    				$("#khrq").val(data.khrq);
    				
    			}
    		})
    	}
    </script>
	<style>
	  .form-control{border-radius:18px;width:200px;height:30px;}
	   #dianji{margin-top:2%; }
	 
	</style>
  </head>
  
  <body>
    <center>
       <form class="form-horizontal" role="form" id="form1">
       <table class="table table-striped">
           <caption><h1>贷款申请人配偶信息</h1></caption>
  <tbody>
    <tr> 
    <tr> 
      <td>配偶公积金账号：</td>
      <td><input type="text" class="form-control" name="pogjjzh" id="account"/></td>
      <td>配偶单位电话：</td>
      <td><input type="text" class="form-control" name="podwdh" /></td>      
     </tr>      
     <tr>
      <td>配偶姓名：</td>
      <td><input type="text" class="form-control" name="poxm" /></td>
      <td>配偶年龄：</td>
      <td><input type="text" class="form-control" name="ponl" /></td>  
      </tr> 
      <tr>   
      <td>证件类型：</td>
      <td><select name="pozjlx" class="form-control"><option>身份证</option><option>户口本</option></select></td>
      <td>证件号码：</td>
      <td><input type="text" class="form-control" name="pozjhm" /></td> 
      </tr> 
      <tr>
      <td>配偶单位账号：</td>
      <td><input type="text" class="form-control" name="podwzh" /></td>
      <td>配偶单位名称：</td>
      <td><input type="text" class="form-control" name="podwmc" /></td>
      </tr>
      
     
    </tbody>
</table>
  </form>

      <button  class="btn btn-default" style="width:250px;font-size:20px;" id="dianji">下一步</button>

 


  </body>
</html>
<script>
	$("#dianji").click(function tiaojian(){
			alert(JSON.stringify($("#form1").serializeObject()));
	     $.ajax({
	     url:"htxx/adda",
	       type:"post",
	       async : true,
        	contentType: "application/json; charset=utf-8",//需要制定
        	data : JSON.stringify($("#form1").serializeObject()),//将json对象转换成json格式的字符串
	       dataType:"json",
	       success:function(data){
					if(data=='1'){
						
						window.location.href="Dkgtjkr.jsp";
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

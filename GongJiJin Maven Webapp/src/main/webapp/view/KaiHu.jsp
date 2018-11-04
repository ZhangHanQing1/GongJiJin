<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'KaiHu.jsp' starting page</title>
    
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
<script
	src="resources/jquery-1.11.3.min.js"></script>
<script
	src="resources/jquery.form.js"></script>
	<style>
	  .form-control{border-radius:18px;width:200px;height:30px;}
	#dianji{margin-top:2%; }
	</style>
  </head>
  
  <body><center>
   <form class="form-horizontal" role="form" id="form1">
  <table class="table table-striped">
  <caption><h1>单位开户信息</h1></caption>

  <tbody>
    <tr>
      <td>公司名称：</td>
      <td><input type="text" class="form-control" name="dwmc2" /></td>
     <td>公司地址：</td>
      <td><input type="text" class="form-control" name="dwdz" /></td>
      <td>公司类型：</td>
      <td><select name="dwlxbh" class="form-control"><option value="1">有限责任公司</option><option value="2">合伙企业</option></select></td>
    </tr>
     <tr>
      <td>机构代码：</td>
      <td><input type="jgdm" class="form-control" name="dwmc" /></td>
     <td>所属行业：</td>
      <td><select name="hybh" class="form-control"><option value="1">制造业</option><option value="2">房地产业</option></select></td> 
      <td>经济类型：</td>
      <td><select name="jjlxbh" class="form-control"><option value="1">国有经济</option><option value="2">私有经济</option></select></td>
    </tr>
     <tr>
      <td>月发薪日：</td>
      <td><input type="text" class="form-control" name="fxr" /></td>
     <td>法人姓名：</td>
      <td><input type="text" class="form-control" name="frxm" /></td>
      <td>证件类型：</td>
      <td><select name="zjlxbh" class="form-control"><option value="1">身份证</option><option value="2">户口本</option></select></td>
    </tr>
     <tr>
      <td>证件号：</td>
      <td><input type="text" class="form-control" name="dwxz" /></td>
     <td>经办人姓名：</td>
      <td><input type="text" class="form-control" name="jbrxm" /></td>
      <td>经办人电话：</td>
      <td><input type="text" class="form-control" name="jbrdh" /></td> </tr>
     <tr>
      <td>公司成立日期：</td>
      <td><input type="date" class="form-control" name="gsclrq" /></td>
     <td>单位电话：</td>
      <td><input type="text" class="form-control" name="dwdh" /></td>
      <td>受托银行：</td>
      <td><select name="styhzj" class="form-control"><option value="1">中行</option><option value="2">建行</option></select></td>
    </tr>
     <tr>
      <td>单位缴存比例：</td>
      <td><input type="text" class="form-control" name="dwjcbl"placeholder="以%为单位" /></td>
     <td>个人缴存比例：</td>
      <td><input type="text" class="form-control" name="grjcbl"placeholder="以%为单位" /></td>
      <td>单位账户：</td>
      <td><input type="text" class="form-control" name="dwzh3" /></td>
       </tr>
     <tr>
     <td>单位开户日期：</td>
     <td><input type="date" class="form-control" name="dwkhrq" /></td>
     <td>账户状态：</td>
      <td><select name="dwzhztbh" class="form-control"><option value="1">正常</option><option value="2">封存</option><option value="3">销户</option></select></td>
      <td>操作人员：</td>
      <td><select name="userId" class="form-control"><option value="1">小波</option><option value="2">小谭</option></select></td>
    </tr>
   <tr style="display:none;">
     <td>单位账户余额：</td>
     <td><input type="text" class="form-control" name="dwzhye"  value="0"/></td>
     <td>单位缴存人数：</td>
     <td><input type="text" class="form-control" name="dwjcrs"  value="0"/></td>
     <td>缴至年月日：</td>
     <td><input type="text" class="form-control" name="jznyr"  value="暂时未缴"/></td>  
       </tr>
    </tbody>
</table>
  </form>

      <button  class="btn btn-default" style="width:250px;font-size:20px;" id="dianji">开户</button>

 


  </body>
</html>
<script>
	$("#dianji").click(function tiaojian(){
			alert(JSON.stringify($("#form1").serializeObject()));
	     $.ajax({
	     url:"KaiHu/add",
	       type:"post",
	       async : true,
        	contentType: "application/json; charset=utf-8",//需要制定
        	data : JSON.stringify($("#form1").serializeObject()),//将json对象转换成json格式的字符串
	       dataType:"text",
	       success:function(data){
	          alert(data);
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
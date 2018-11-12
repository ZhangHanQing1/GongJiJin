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
    			data:{"grbh":$("#account").val()},
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
    
       <form class="form-horizontal" role="form" id="form1">
       <table class="table table-striped">
           <caption><h1>贷款申请基本信息</h1></caption>
  <tbody>
    <tr>
      <td>借款人公积金账号：</td>
      <td><input type="text" class="form-control" name="grbh" id="account" onblur="checkaccount()"/></td>
      <td>借款人姓名：</td>
      <td><input type="text" class="form-control"  id="xingming"/></td>
      <td>借款人性别：</td>
      <td><input type="text" class="form-control"  id="xingbie"/></td>     
      <td>借款人手机号：</td>
      <td><input type="text" class="form-control"  id="sjhm2"/></td>
      <td>婚姻状态：</td>
      <td><input type="text" class="form-control"  id="hyzk"/></td>
     </tr>
     <tr>
      <td>借款人证件类型：</td>
      <td><select  class="form-control"><option value="1">身份证</option></select></td>           
      <td>借款人证件号：</td>   
      <td><input type="text" class="form-control" id="sbzh" /></td>                 
      <td>学历：</td>
      <td><input type="text" class="form-control"  id="xueli"/></td>
      <td>邮箱：</td>
      <td><input type="text" class="form-control"  id="dzxx"/></td>
      <td>职位：</td>
      <td><input type="text" class="form-control"  id="zhicheng"/></td>
     </tr>
     <tr>
      <td>家庭住址：</td>
      <td><input type="text" class="form-control"  id="jtzz"/></td>
      <td>开户日期：</td>
      <td><input type="text" class="form-control"  id="khrq"/></td>
      <td>月收入：</td>
      <td><input type="text" class="form-control"  name="jkrysr"/></td>
      <td>银行存款：</td>
      <td><input type="text" class="form-control"  name="jkryhck"/></td>    
      <td>委托银行：</td>
      <td><select name="swtyhmc" class="form-control"><option>中国银行</option><option >建设银行</option><option >农业银行</option><option >工商银行</option></select></td> 
      </tr>
      <tr>              
      <td>贷款金额：</td>
      <td><input type="text" class="form-control" name="htdkje" /></td>
      <td>贷款期数：</td>
      <td><input type="text" class="form-control" name="dkqs" /></td>
      <td>贷款利率：</td>
      <td><input type="text" class="form-control" name="dklx" /></td>
      <td>还款日：</td>
      <td><input type="text" class="form-control" name="ydhkr" /></td>      
      <td>还款方式：</td>
      <td><select name="dkhkfs" class="form-control"><option>等额本息还款</option><option>等额本金还款</option></select></td>
      </tr>  
        
      <tr>
      <td>收款人：</td>
      <td><input type="text" class="form-control" name="jkrxm" /></td>                        
      <td>开户银行：</td>  
      <td><select name="cxzhkhyhmc2" class="form-control"><option>中国银行</option><option >建设银行</option><option >农业银行</option><option >工商银行</option></select></td> 
      <td>还款账户号：</td>
      <td><input type="text" class="form-control" name="hkcxzh" /></td>
      <td>还款账户名：</td>
      <td><input type="text" class="form-control" name="hkzhmc" /></td>  
      <td>购房人姓名：</td>
      <td><input type="text" class="form-control" name="gfrxm" /></td>         
      </tr>  
      <tr>
      <td>房间类型：</td>
      <td><select name="fwlx" class="form-control" name="fwlx" ><option value="1">商品房</option><option value="2">房改房</option><option value="3">小产权房</option></select></td>
      <td>房屋位置：</td>
      <td><input type="text" class="form-control" name="fwzl" /></td>
      <td>房屋面积：</td>
      <td><input type="text" class="form-control" name="fwtnmj" /></td>
      <td>证件号码：</td>
      <td><input type="text" class="form-control" name="gfrsfzh" /></td>    
      <td>银行账户：</td>
      <td><input type="text" class="form-control" name="dkzh" /></td>     
      </tr>
      <tr>    
      <td>房屋总价：</td>
      <td><input type="text" class="form-control" name="fwzj" /></td>
      <td>购房首付款：</td>
      <td><input type="text" class="form-control" name="gfsfk" /></td>
      <td>房屋面积单价：</td>
      <td><input type="text" class="form-control" name="fwtnmjdj" /></td>
      
       </tr>      
     <tr>
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
	     url:"htxx/add",
	       type:"post",
	       async : true,
        	contentType: "application/json; charset=utf-8",//需要制定
        	data : JSON.stringify($("#form1").serializeObject()),//将json对象转换成json格式的字符串
	       dataType:"json",
	       success:function(data){
					if(data=='1'){
						
						window.location.href="Dkrpeiou.jsp";
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

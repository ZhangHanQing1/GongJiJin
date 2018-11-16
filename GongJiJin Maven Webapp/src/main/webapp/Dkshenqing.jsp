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
	<link rel="stylesheet" href="../layui/css/layui.css">	
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
    
    <form class="form-horizontal layui-form" role="form" id="form1">
    <table class="table table-striped">
           <caption><h1>基本信息</h1></caption>
  <tbody>
    <tr>
      <td>借款人公积金账号：</td>
      <td><input type="text" class="form-control" name="grbh" id="account" onblur="checkaccount()"/></td>      
      <td>借款人姓名：</td>
      <td><input type="text" class="form-control"  id="xingming"/></td>
      <td>借款人性别：</td>
      <td><input type="text" class="form-control"  id="xingbie"/></td>     
      </tr>
      <tr>
      <td>借款人手机号：</td>
      <td><input type="text" class="form-control"  id="sjhm2"/></td>
      <td>婚姻状态：</td>
      <td><input type="text" class="form-control"  id="hyzk"/></td>
      <td>邮箱：</td>
      <td><input type="text" class="form-control"  id="dzxx"/></td>
      </tr>                
      <tr>     
      <td>借款人证件类型：</td>
      <td><select  class="form-control"><option value="1">身份证</option></select></td>           
      <td>借款人证件号：</td>   
      <td><input type="text" class="form-control" id="sbzh" /></td>                 
      <td>学历：</td>
      <td><input type="text" class="form-control"  id="xueli"/></td>
      
     </tr>
     <tr>
      <td>职位：</td>
      <td><input type="text" class="form-control" id="zhicheng"   /></td>        
      <td>家庭住址：</td>
      <td><input type="text" class="form-control"  id="jtzz"/></td>
      <td>开户日期：</td>
      <td><input type="text" class="form-control"  id="khrq"/></td>
      </tr>

    
    </tbody>
</table>
 <table class="table table-striped">
           <caption><h1>还款信息</h1></caption>
  <tbody>
      <tr>
      <td>月收入：</td>
      <td><input type="text" class="form-control"  name="jkrysr"  placeholder="请输入" /></td>     
      <td>银行存款：</td>
      <td><input type="text" class="form-control"  name="jkryhck" placeholder="请输入金额"  /></td>    
      <td>委托银行：</td>
      <td><select name="swtyhmc" class="form-control"><option>中国银行</option><option >建设银行</option><option >农业银行</option><option >工商银行</option></select></td> 
      </tr>
      <tr> 
      <td>贷款金额：</td>
      <td><input type="text" class="form-control layui-input" name="htdkje" placeholder="请输入金额"   /></td>                  
      <td>贷款期数：</td>
      <td><select name="dkqs" class="form-control"><option value="12">12期</option><option value="24">24期</option><option value="36">36期</option><option value="48">48期</option><option value="60">60期</option><option value="120">120期</option><option value="240">240期</option></select></td>
      <td>贷款利率：</td>
      <td><select name="dklx" class="form-control"><option value="0.0371">等额本息利率</option><option value="0.0381">等额本金利率</option></select></td>
      
      </tr>  
      <tr>   
      <td>还款日：</td>
      <td><input type="text" class="form-control" name="ydhkr" placeholder="请输入每月几日还款"/></td> 
      <td>还款方式：</td>
      <td><select name="dkhkfs" class="form-control"><option>等额本息还款</option><option>等额本金还款</option></select></td>
      <td>收款人：</td>
      <td><input type="text" class="form-control" name="jkrxm" placeholder="请输入"   /></td>                        
      
      </tr>  
        
      <tr>
      
      <td>购房人姓名：</td>
      <td><input type="text" class="form-control" name="gfrxm" placeholder="请输入"   /></td>        
      <td>还款账户号：</td>
      <td><input type="text" class="form-control" name="hkcxzh" placeholder="请输入"  /></td>
      <td>还款账户名：</td>
      <td><input type="text" class="form-control" name="hkzhmc" placeholder="请输入"  /></td>  
      
      
       </tr>      
     <tr>
    </tbody>
</table>
 <table class="table table-striped">
           <caption><h1>购房信息</h1></caption>
  <tbody>

      <tr>
      <td>房间类型：</td>
      <td><select name="fwlx" class="form-control" name="fwlx" ><option value="1">商品房</option><option value="2">房改房</option><option value="3">小产权房</option></select></td>
      <td>房屋位置：</td>
      <td><input type="text" class="form-control" name="fwzl" placeholder="请输入"  /></td>
      <td>房屋面积：</td>
      <td><input type="text" class="form-control" name="fwtnmj" placeholder="请输入"   /></td>
     </tr>
     <tr>
      <td>开户银行：</td>  
      <td><select name="cxzhkhyhmc2" class="form-control"><option>中国银行</option><option >建设银行</option><option >农业银行</option><option >工商银行</option></select></td> 
      <td>证件号码：</td>
      <td><input type="text" class="form-control" name="gfrsfzh" placeholder="请输入" lay-verify="identity" /></td>    
      <td>银行账户：</td>
      <td><input type="text" class="form-control" name="dkzh" placeholder="请输入"  /></td>  
          
      </tr>
      <tr>    
      <td>房屋总价：</td>
      <td><input type="text" class="form-control" name="fwzj" placeholder="请输入金额"  /></td>
      <td>购房首付款：</td>
      <td><input type="text" class="form-control" name="gfsfk" placeholder="请输入金额"  /></td>
      <td>房屋面积单价：</td>
      <td><input type="text" class="form-control" name="fwtnmjdj" placeholder="请输入金额"  /></td>
      
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

 <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Goods.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">    
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="resources/jquery-1.11.3.min.js"></script>	
    <script src="resources/jquery.form.js"></script>
   <style type="text/css">
   .button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 3px 8px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
 .button3 {background-color: #f44336;} /* Red */ 
   </style>
	<script type="text/javascript">
		$(function(){			
			queryAll(1);			
		});
		//查询所有
		function queryAll(startPage){
			$("#tab1").html("");
			$.ajax({
				url:"ydtqsp/all",
				type:"post",
				data : {
					"startPage" : startPage
				},
				dataType:"json",
				success:function(data){
					var ary=data.list;
					for(var i=0;i<ary.length;i++){
						var obj=ary[i];												
						var tr="<tr>";
						tr+="<td>"+obj.YDTQSPZJ+"</td>";
						tr+="<td>"+obj.HTZJ+"</td>";
						tr+="<td>"+obj.GRBH+"</td>";
						tr+="<td>"+obj.SQR+"</td>";
						tr+="<td>"+obj.SQSJ+"</td>";
						tr+="<td>"+obj.SPZT2+"</td>";
						tr+="<td>"+obj.DKZH+"</td>";	
											
						tr+="<td><input type='button' value='结算' class='button' data-toggle='modal' data-target='#myModal' onclick='queryId("+obj.YDTQSPZJ+")'/></td>";						
						tr+="</tr>"; 
						$("#tab1").append(tr);
					}
				$("#currPage").val(data.pageNum);
				$("#aa").val(data.total);
				$("#bb").val(data.pageSize);
				$("#currPage").blur(function() {
					var last = Math.ceil(data.total / data.pageSize);
					var curr = $("#currPage").val();
					if(last<curr){
					   $("#currPage").val(last);
					   queryAll(last);
					}
					if(curr<=0){
					  $("#currPage").val(1);
					   queryAll(1);
					}
					 queryAll(curr);
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
		function syy(){
		var currPage = parseInt($("#currPage").val());
		queryAll(currPage - 1);
	}
	function xyy(){
		var currPage = parseInt($("#currPage").val());
		queryAll(currPage + 1);
	}
	function shouye(){
		queryAll(1);
	}
	function weiye(){
		var tt=$("#aa").val();
		var tt1=$("#bb").val();
		var last = Math.ceil(tt/tt1);
		queryAll(last);
				}
		//查询所有
		function gjjzxid(){
				$.ajax({
    			url:"ydtqsp/gjjzxid",
    			type:"post",   			
    			dataType:'json',
    			success:function(data){
 				    $("#zxid").val(data[0].zhid);  
    				$("#gjjzxye").val(data[0].gjjzxye);  
    				 for(var i=0;i<data.length;i++){
						var obj=data[i];											
						var option="<option>";
						option+=""+obj.gjjzxzh+"</option>";																						
						$("#unit").append(option);
					}		
    			}
    		})

		} 
		function updategjjzx(obj){
		    var zhid=obj
		    $.ajax({
				url:"ydtqsp/update9",
				type:"post",
				data:{
					"zhid":$("#zxid").val(),
					"gjjzxye":$("#gjjzxye").val()
				},								
				success:function(){
				
				}
				})	      
		}   
		function fillB(){
            var a=document.getElementById("Dkffe").value
            var b=document.getElementById("gjjzxye").value  
            document.getElementById("gjjzxye").value=b-a
        }
					
		//根据商品id查询单个商品信息
		function queryId(obj){
			var YDTQSPZJ=obj;			
			$.ajax({
				url:"ydtqsp/queryId",
				type:"post",
				data:{
					"ydtqspzj":YDTQSPZJ
				},
				dataType:'json',
				success:function(data){	
	                $("#did").val(data.YDTQSPZJ);    		     
                    $("#grbh").val(data.GRBH);					
					$("#xingming").val(data.XINGMING);
					$("#xingbie").val(data.XINGBIE);
					$("#sjhm2").val(data.SJHM2);
					$("#hyzk").val(data.HYZK);
					$("#zjmc").val(data.ZJMC);					
					$("#sbzh").val(data.SBZH);
					$("#xueli").val(data.XUELI);
					$("#dzxx").val(data.DZXX);					
					$("#jtzz").val(data.JTZZ);									
					$("#htdkje").val(data.HTDKJE);					
					$("#dkqs").val(data.DKQS);					
					$("#dklx").val(data.DKLX);
					$("#ydhkr").val(data.YDHKR);
					$("#dkhkfs").val(data.DKHKFS);
					$("#dkzh").val(data.DKZH);												
					$("#user_name").val(data.user_name);		
					gjjzxid();
				
				}
			})
		}                                 
    function shenhe(obj){
         	var YDTQSPZJ=obj;	
			$.ajax({
				url:"ydtqsp/update3",
				type:"post",
				data:{
					"ydtqspzj":$("#did").val(),
					"Dkffe":$("#Dkffe").val()
				},								
				success:function(){
				fillB(); 
				updategjjzx();  
				queryAll();
				
              }
         })
       } 
      
	</script>
  </head>
  	
  <body>
    <input type="hidden" id="aa"/>
<input type="hidden" id="bb"/>
    	<table class="table table-striped">
    
    	<thead>
    		<tr>
    			<th>贷款审批编号</th>
    			<th>贷款合同编号</th>
    			<th>个人账号</th>
    			<th>申请人</th>
    			<th>申请时间</th>
    			<th>审批状态</th>    			
    			<th>贷款账号</th>    	
    			<th>操作</th>		
    		</tr>
    		</thead>
    		<tbody id="tab1"></tbody>
    	</table>
    <ul class="pager" id="ul1" style="display: block;">
		<li><button type="button" class="btn btn-default" id="shouye" onclick="shouye()">首页</button></li>
		<li><button type="button" class="btn btn-default" id="syy" onclick="syy()">上一页</button></li>
		<li><button type="button" class="btn btn-default" id="xyy" onclick="xyy()">下一页</button></li>
		<li><button type="button" class="btn btn-default" id="weiye" onclick="weiye()">尾页</button></li>
		<li style="font-weight: lighter;">当前第<input type="text" id="currPage" style="height:35px;width:50px;border-radius:10px;text-align: center;"/>页</li>
		</ul>   
    <!-- 模态框（Modal） -->
<div class="modal fade " id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog " style="width:1500px;">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					贷款资金发放
				</h4>
			</div>
			<div class="modal-body">
				<!-- 在这里添加一些文本 -->
 <table class="table table-striped">
    
  <tbody id="tab1">
   <tr>
      <td>借款人公积金账号：</td>
      <td><input type="text" class="form-control"  id="grbh" readonly="readonly"/><input type="hidden" id="did"><input type="hidden" id="zxid"></td>
      <td>借款人姓名：</td>
      <td><input type="text" class="form-control"  id="xingming" readonly="readonly"/></td>
      </tr>
      <tr>
      <td>借款人性别：</td>
      <td><input type="text" class="form-control"  id="xingbie" readonly="readonly"/></td>     
      <td>借款人手机号：</td>
      <td><input type="text" class="form-control"  id="sjhm2" readonly="readonly"/></td>
      </tr>
      <tr>    
      <td>借款人证件类型：</td>
      <td><input type="text" class="form-control"  id="zjmc" readonly="readonly"/></td>           
      <td>借款人证件号：</td>   
      <td><input type="text" class="form-control" id="sbzh" readonly="readonly"/></td>     
      </tr>
      <tr>            
      <td>学历：</td>
      <td><input type="text" class="form-control"  id="xueli" readonly="readonly"/></td>
      <td>邮箱：</td>
      <td><input type="text" class="form-control"  id="dzxx" readonly="readonly"/></td>
      </tr>
      <tr>  
      <td>家庭住址：</td>
      <td><input type="text" class="form-control"  id="jtzz" readonly="readonly"/></td>
      <td>贷款期数：</td>
      <td><input type="text" class="form-control" id="dkqs" readonly="readonly"/></td>
      </tr>
      <tr>                       
      <td>贷款利率：</td>
      <td><input type="text" class="form-control" id="dklx" readonly="readonly" /></td>
      <td>还款日：</td>
      <td><input type="text" class="form-control" id="ydhkr" readonly="readonly" /></td>  
      </tr>  
      <tr>     
      <td>还款方式：</td>
      <td><input type="text" class="form-control" id="dkhkfs" readonly="readonly"/></td>
      <td>收款账户：</td>      
      <td><input type="text" class="form-control" id="dkzh" readonly="readonly"/></td>  
      </tr>        
      <tr>                
      <td>贷款金额：</td>
      <td><input type="text" class="form-control" id="htdkje"readonly="readonly" /></td>              
      <td>资金发放金额：</td>
      <td><input type="text" class="form-control" name="Dkffe" id="Dkffe"   /></td>      
      </tr>  
      <tr>  
      <td>资金发放账户：</td>
      <td><select id="unit"></select></td>  
      <td>账户余额：</td>
      <td><input type="text" class="form-control" name="gjjzxye" id="gjjzxye" readonly="readonly"/></td>       
      </tr>
      <tr>  
      <td>支付密码：</td>
      <td><input type="password" class="form-control" /></td>             
      <td>操作人员：</td>
      <td><select  class="form-control"><option>统一</option><option >老汉</option><option >酸菜</option><option >牛肉面</option></select></td>     
      </tr>    		
    </tbody>
</table>																														
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
				</button>				
				<button type="button" class="btn btn-primary"  data-dismiss="modal" onclick="shenhe()">
					结算
				</button>							
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>

  </body>
</html>

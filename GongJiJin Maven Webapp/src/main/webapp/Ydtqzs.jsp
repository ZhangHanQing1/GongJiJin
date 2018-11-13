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
			queryAll();			
		});
		//查询所有
		function queryAll(){
			$.ajax({
				url:"ydtqsp/all",
				type:"post",
				dataType:"json",
				success:function(data){
					for(var i=0;i<data.length;i++){
						var obj=data[i];	
						if(obj.SPZT2=="已初审"){											
						var tr="<tr>";
						tr+="<td>"+obj.YDTQSPZJ+"</td>";
						tr+="<td>"+obj.HTZJ+"</td>";
						tr+="<td>"+obj.GRBH+"</td>";
						tr+="<td>"+obj.SQR+"</td>";
						tr+="<td>"+obj.SQSJ+"</td>";
						tr+="<td>"+obj.SPZT2+"</td>";
						tr+="<td>"+obj.DKZH+"</td>";						
						tr+="<td><input type='button' value='审核审批' class='button' data-toggle='modal' data-target='#myModal' onclick='queryId("+obj.YDTQSPZJ+")'/><input type='button'class='button button3' value='拒绝通过' data-toggle='modal' data-target='#myModal2' onclick='queryId("+obj.YDTQSPZJ+")'/></td>";						
						tr+="</tr>"; 
						$("#tab1").append(tr);}
					}
				}
			})
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
					$("#zhicheng").val(data.ZHICHENG);
					$("#jtzz").val(data.JTZZ);
					$("#khrq").val(data.KHRQ);
					$("#jkrysr").val(data.JKRYSR);
					$("#jkryhck").val(data.JKRYHCK);
					$("#swtyhmc").val(data.SWTYHMC);
					$("#htdkje").val(data.HTDKJE);					
					$("#dkqs").val(data.DKQS);					
					$("#dklx").val(data.DKLX);
					$("#ydhkr").val(data.YDHKR);
					$("#dkhkfs").val(data.DKHKFS);
					$("#jkrxm").val(data.JKRXM);
					$("#cxzhkhyhmc2").val(data.CXZHKHYHMC2);
					$("#hkcxzh").val(data.HKCXZH);
					$("#hkzhmc").val(data.HKZHMC);					
					$("#gfrxm").val(data.GFRXM);
					$("#fwlx").val(data.FWLX);
					$("#fwzl").val(data.FWZL);					
					$("#fwtnmj").val(data.FWTNMJ);
					$("#gfrsfzh").val(data.GFRSFZH);
					$("#dkzh").val(data.DKZH);
					$("#fwzj").val(data.FWZJ);					
					$("#gfsfk").val(data.GFSFK);					
					$("#fwtnmjdj").val(data.FWTNMJDJ);
					$("#poxm").val(data.POXM);
					$("#ponl").val(data.PONL);
					$("#pozjlx").val(data.POZJLX);
					$("#pozjhm").val(data.POZJHM);
					$("#podwzh").val(data.PODWZH);
					$("#podwmc").val(data.PODWMC);
					$("#podwdh").val(data.PODWDH);
					$("#pogjjzh").val(data.POGJJZH);					
					$("#gtjkrgjjzh").val(data.GTJKRGJJZH);
					$("#gtjkrxm").val(data.GTJKRXM);
					$("#gtjkrsjhm").val(data.GTJKRSJHM);
					$("#gtjkrdwzh").val(data.GTJKRDWZH);
					$("#gddhhm2").val(data.GDDHHM2);
					$("#gtjkrdwmc").val(data.GTJKRDWMC);
					$("#gtjkrdwdh").val(data.GTJKRDWDH);					
					$("#gtjkrdwdz").val(data.GTJKRDWDZ);
					$("#gtjkrzjlx").val(data.GTJKRZJLX);
					$("#gtjkrzjhm").val(data.GTJKRZJHM);
					$("#dylx").val(data.DYLX);
					$("#dyrxm").val(data.DYRXM);
					$("#dyrsfzh").val(data.DYRSFZH);
					$("#dywsyqzh").val(data.DYWSYQZH);
					$("#dywtxqzh").val(data.DYWTXQZH);
					$("#dywdz").val(data.DYWDZ);
					$("#dbzt").val(data.DBZT);
					$("#dyje").val(data.DYJE);		
					$("#user_name").val(data.user_name);		
					
				}
			})
		}                                 
    function shenhe(obj){
         	var YDTQSPZJ=obj;	
			$.ajax({
				url:"ydtqsp/update4",
				type:"post",
				data:{
					"ydtqspzj":$("#did").val()
				},								
				success:function(){
				   
				queryAll();
				
              }
         })
       }
       function jujue(obj){
         	var YDTQSPZJ=obj;	
			$.ajax({
				url:"ydtqsp/update2",
				type:"post",
				data:{
					"ydtqspzj":$("#did").val()
				},								
				success:function(){
				   
				queryAll();
				
              }
         })
       }
	</script>
  </head>
  	
  <body>
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
    
    <!-- 模态框（Modal） -->
<div class="modal fade " id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog " style="width:1500px;">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					模态框（Modal）标题
				</h4>
			</div>
			<div class="modal-body">
				<!-- 在这里添加一些文本 -->
 <table class="table table-striped">
     <caption><h1>贷款申请基本信息</h1></caption>
  <tbody id="tab1">
   <tr>
      <td>借款人公积金账号：</td>
      <td><input type="text" class="form-control"  id="grbh" /><input type="hidden" id="did"></td>
      <td>借款人姓名：</td>
      <td><input type="text" class="form-control"  id="xingming" readonly="readonly"/></td>
      <td>借款人性别：</td>
      <td><input type="text" class="form-control"  id="xingbie" readonly="readonly"/></td>     
      <td>借款人手机号：</td>
      <td><input type="text" class="form-control"  id="sjhm2" readonly="readonly"/></td>
      <td>婚姻状态：</td>
      <td><input type="text" class="form-control"  id="hyzk" readonly="readonly"/></td>
     </tr>
     <tr>
      <td>借款人证件类型：</td>
      <td><input type="text" class="form-control"  id="zjmc" readonly="readonly"/></td>           
      <td>借款人证件号：</td>   
      <td><input type="text" class="form-control" id="sbzh" readonly="readonly" /></td>                 
      <td>学历：</td>
      <td><input type="text" class="form-control"  id="xueli" readonly="readonly"/></td>
      <td>邮箱：</td>
      <td><input type="text" class="form-control"  id="dzxx" readonly="readonly"/></td>
      <td>职位：</td>
      <td><input type="text" class="form-control"  id="zhicheng" readonly="readonly"/></td>
     </tr>
     <tr>
      <td>家庭住址：</td>
      <td><input type="text" class="form-control"  id="jtzz" readonly="readonly"/></td>
      <td>开户日期：</td>
      <td><input type="text" class="form-control"  id="khrq" readonly="readonly"/></td>
      <td>月收入：</td>
      <td><input type="text" class="form-control"  id="jkrysr" readonly="readonly"/></td>
      <td>银行存款：</td>
      <td><input type="text" class="form-control"  id="jkryhck" readonly="readonly"/></td>    
      <td>委托银行：</td>
      <td><input type="text" class="form-control"  id="swtyhmc" readonly="readonly"/></td>
      </tr>
      <tr>              
      <td>贷款金额：</td>
      <td><input type="text" class="form-control" id="htdkje" readonly="readonly"/></td>
      
      <td>贷款期数：</td>
      <td><input type="text" class="form-control" id="dkqs" readonly="readonly" /></td>
      
      <td>贷款利率：</td>
      <td><input type="text" class="form-control" id="dklx" readonly="readonly"/></td>
      <td>还款日：</td>
      <td><input type="text" class="form-control" id="ydhkr" readonly="readonly"/></td>      
      <td>还款方式：</td>
      <td><input type="text" class="form-control" id="dkhkfs" readonly="readonly"/></td>
      </tr>  
        
      <tr>
      <td>收款人：</td>
      <td><input type="text" class="form-control" id="jkrxm" readonly="readonly"/></td>                        
      <td>开户银行：</td>  
      <td><input type="text" class="form-control" id="cxzhkhyhmc2" readonly="readonly"/></td> 
      <td>还款账户号：</td>
      <td><input type="text" class="form-control" id="hkcxzh" readonly="readonly"/></td>
      <td>还款账户名：</td>
      <td><input type="text" class="form-control" id="hkzhmc" readonly="readonly"/></td>  
      <td>购房人姓名：</td>
      <td><input type="text" class="form-control" id="gfrxm" readonly="readonly"/></td>         
      </tr>  
      <tr>
      <td>房间类型：</td>
      <td><input type="text" class="form-control" id="fwlx" readonly="readonly"/></td>
      <td>房屋位置：</td>
      <td><input type="text" class="form-control" id="fwzl" readonly="readonly"/></td>
      <td>房屋面积：</td>
      <td><input type="text" class="form-control" id="fwtnmj" readonly="readonly"/></td>
      
      <td>证件号码：</td>
      <td><input type="text" class="form-control" id="gfrsfzh" readonly="readonly"/></td> 
         
      <td>银行账户：</td>
      <td><input type="text" class="form-control" id="dkzh" readonly="readonly"/></td>     
      </tr>
      <tr>    
      <td>房屋总价：</td>
      <td><input type="text" class="form-control" id="fwzj" readonly="readonly"/></td>
      <td>购房首付款：</td>
      <td><input type="text" class="form-control" id="gfsfk" readonly="readonly"/></td>
      <td>房屋面积单价：</td>
      <td><input type="text" class="form-control" id="fwtnmjdj" readonly="readonly"/></td>													
      </tr> 
      <tr>
      <td>配偶姓名：</td>
      <td><input type="text" class="form-control" id="poxm" readonly="readonly"/></td>
      <td>配偶年龄：</td>
      <td><input type="text" class="form-control" id="ponl" readonly="readonly"/></td>     
      <td>证件类型：</td>
      <td><input type="text" class="form-control" id="pozjlx" readonly="readonly"/></td>
      <td>证件号码：</td>
      <td><input type="text" class="form-control" id="pozjhm" readonly="readonly"/></td> 
      </tr> 
      <tr>
      <td>配偶单位账号：</td>
      <td><input type="text" class="form-control" id="podwzh" readonly="readonly"/></td>
      <td>配偶单位名称：</td>
      <td><input type="text" class="form-control" id="podwmc" readonly="readonly"/></td>
      <td>配偶单位电话：</td>
      <td><input type="text" class="form-control" id="podwdh" readonly="readonly"/></td>
      <td>配偶公积金账号：</td>
      <td><input type="text" class="form-control" id="pogjjzh" readonly="readonly"/></td>      
     </tr> 
     <tr>
      <td>个人账户：</td>
      <td><input type="text" class="form-control" id="gtjkrgjjzh" readonly="readonly"/></td>
      <td>姓名：</td>
      <td><input type="text" class="form-control" id="gtjkrxm" readonly="readonly"/></td>
      <td>手机号码：</td>
      <td><input type="text" class="form-control" id="gtjkrsjhm" readonly="readonly"/></td>
      <td>单位编号：</td>
      <td><input type="text" class="form-control" id="gtjkrdwzh" readonly="readonly"/></td>
      <td>固定电话号码：</td>
      <td><input type="text" class="form-control" id="gddhhm2" readonly="readonly"/></td>   
      </tr>
      <tr>
      <td>单位名称：</td>
      <td><input type="text" class="form-control" id="gtjkrdwmc" readonly="readonly"/></td>
      <td>单位电话：</td>
      <td><input type="text" class="form-control" id="gtjkrdwdh" readonly="readonly"/></td>     
      <td>单位地址：</td>
      <td><input type="text" class="form-control" id="gtjkrdwdz" readonly="readonly"/></td>
      <td>证件类型：</td>
      <td><input type="text" class="form-control" id="gtjkrzjlx" readonly="readonly"/></td>
      <td>证件号码：</td>
      <td><input type="text" class="form-control" id="gtjkrzjhm" readonly="readonly"/></td>      
    </tr>
    <tr>
     <td>抵押类型：</td>
     <td><input type="text" class="form-control" id="dylx" readonly="readonly"/></td>
     <td>抵押姓名：</td>
     <td><input type="text" class="form-control" id="dyrxm" readonly="readonly"/></td>
     <td>抵押身份证号：</td>
     <td><input type="text" class="form-control" id="dyrsfzh" readonly="readonly"/></td>
     <td>抵押所有权证号：</td>
     <td><input type="text" class="form-control" id="dywsyqzh" readonly="readonly"/></td>
     </tr> 
     <tr>
     <td>抵押他项权证号：</td>
     <td><input type="text" class="form-control" id="dywtxqzh" readonly="readonly"/></td>
     <td>抵押地址：</td>
     <td><input type="text" class="form-control" id="dywdz" readonly="readonly"/></td>
     <td>抵押物状态：</td>
     <td><input type="text" class="form-control" id="dbzt" readonly="readonly"/></td>    
     <td>抵押物金额：</td>
     <td><input type="text" class="form-control" id="dyje" readonly="readonly"/></td>    
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
					通过审核
				</button>							
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>
<!-- 模态框（Modal） -->
<div class="modal fade " id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog " style="width:500px;">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					还款
				</h4>
			</div>
			<div class="modal-body">
				请输入拒绝理由<input type="text" class="form-control">
				</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
				</button>
				<button type="button" class="btn btn-primary"  data-dismiss="modal" onclick="jujue()">
					拒绝通过
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>
  </body>
</html>

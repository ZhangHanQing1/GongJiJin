<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'hkjh.jsp' starting page</title>
    
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
						if(obj.SPZT2=="已发放"){					
						var tr="<tr>";
						tr+="<td>"+obj.YDTQSPZJ+"</td>";
						tr+="<td>"+obj.HTZJ+"</td>";
						tr+="<td>"+obj.GRBH+"</td>";
						tr+="<td>"+obj.SQR+"</td>";
						tr+="<td>"+obj.SQSJ+"</td>";
						tr+="<td>"+obj.SPZT2+"</td>";
						tr+="<td>"+obj.ZTZ+"</td>";	
						tr+="<td>"+obj.DKZH+"</td>";						
						tr+="<td><input type='button' value='结算' class='button' data-toggle='modal' data-target='#myModal' onclick='hkjhIdd("+obj.YDTQSPZJ+")'/></td>";						
						tr+="</tr>"; 
						$("#tab1").append(tr);}
						
					}
				}
			})
		}    
        //根据商品id查询单个商品信息
		function hkjhIdd(obj){
			var YDTQSPZJ=obj;
			var tr="<tr>";			
			$.ajax({
				url:"hkjh/hkjhIdd",
				type:"post",
				data:{
					"ydtqspzj":YDTQSPZJ
				},
				dataType:'json',
				success:function(data){	
				/* for(var i=0;i<data.length;i++){
						var obj=data[i];			 */	
	                $("#did").val(data.YDTQSPZJ);    		     
                    $("#jkrxm").val(data.JKRXM);
					$("#dkzh").val(data.DKZH);
					$("#htdkje").val(data.HTDKJE);
					$("#dkqs").val(data.DKQS);		
					$("#dklx").val(data.DKLX);
					$("#ydhkr").val(data.YDHKR);
					$("#dkhkfs").val(data.DKHKFS);
					$("#dkffe").val(data.TZZD2);
					$("#spsj").val(data.SPSJ);					
					$("#HKJHZJ").val(data.HKJHZJ);	
					$("#DKZH").val(data.DKZH);
					$("#TZZD2").val(data.TZZD2);
					$("#QIC").val(data.QIC);
					$("#user_name").val(data.user_name);										
				    $("#tab2").append(tr);
											
				}
			})
		} 
function shen(){
   
       var ben = document.getElementById("TZZD2").value;
       var qi = document.getElementById("QIC").value;
       var lv = document.getElementById("dklx").value;
       var v=1;      
        /*
             总利息 = 总贷款额 X 月利率 X ( 还款期数 - 1 ) /2
        */
      var zongxi = ben * lv * (qi -1) /2; 
         
        /*
     每月还款额 = 总贷款额 X 月利率 X ( 1+月利率 ) ^ 还款期数 / ( ( 1+月利率 ) ^ 还款期数 -1 )
      
        */      
      var moon =(Number(ben) * Number(lv) * (Math.pow(Number(v)+Number(lv),Number(qi))))/((Math.pow(Number(v)+Number(lv),Number(qi)))-1);
        
        
        //以还本金
        var yi_ben = 0;
        var z_xi=0;
        var tr="<tr>";	
        for(var i = 1;i<(Number(qi)+1);i++){
            //本月还的利息
            var moon_xi = (Number(ben) - Number(yi_ben)) * Number(lv);        
            
            z_xi += moon_xi;
            //本月还的本金
            var moon_ben = Number(moon)-Number(moon_xi);
            
            yi_ben +=  moon_ben;
            var sheng_ben = Number(ben) - Number(yi_ben);               
            var html = "<tr><td>"+i+"</td><td>"+moon_xi.toFixed(2)+"</td><td>"+moon_ben.toFixed(2)+"</td><td>"+moon.toFixed(2)+"</td><td>"+sheng_ben.toFixed(2)+"</td></tr>";
            $(".suning").append(html);

        }
          
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
    			<th>还款状态</th>    			
    			<th>贷款账号</th>    	
    			<th>操作</th>		
    		</tr>   		
    		</thead>
    		<tbody id="tab1"></tbody>
    	</table>     	    	
    	<!-- 模态框（Modal） -->
<div class="modal fade " id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog " style="width:1000px;">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					提前还款
				</h4>
			</div>
			<div class="modal-body">
				<table class="table table-striped">
     <caption><h1>还款信息</h1></caption>
  <tbody id="tab1">
      <tr>
      <td>计划编号：</td>
      <td><input type="text" class="form-control" id="HKJHZJ" readonly="readonly"/><input type="hidden" id="did">
      <td>收款人：</td>
      <td><input type="text" class="form-control" id="jkrxm" readonly="readonly"/></td>    
      <td>银行账户：</td>
      <td><input type="text" class="form-control" id="dkzh" readonly="readonly"/></td>                     
      </tr>
      <tr>              
      <td>贷款金额：</td>
      <td><input type="text" class="form-control" id="htdkje" readonly="readonly"/></td>      
      <td>贷款期数：</td>
      <td><input type="text" class="form-control" id="QIC" readonly="readonly"/></td>     
      <td>贷款利率：</td>
      <td><input type="text" class="form-control" id="dklx" readonly="readonly"/></td>     
      </tr>
      <tr>
      <td>还款日：</td>
      <td><input type="text" class="form-control" id="ydhkr" readonly="readonly"/></td>      
      <td>还款方式：</td>
      <td><input type="text" class="form-control" id="dkhkfs"readonly="readonly"/></td>
      <td>贷款账号：</td>
      <td><input type="text" class="form-control" id="DKZH"readonly="readonly" /></td>
      </tr>              
      <tr>
      <td>贷款发放额：</td>
      <td><input type="text" class="form-control" id="TZZD2" readonly="readonly"/></td>   
      <td>发放日期：</td>
      <td><input type="text" class="form-control" id="spsj" readonly="readonly"/></td>   
      <td>操作人员：</td>
      <td><select  class="form-control"><option>统一</option><option >老汉</option><option >酸菜</option><option >牛肉面</option></select></td>
         
      </tr>
    </tbody>
</table>	
<table class="table table-striped suning" id="suning">   	  
    	<thead>
    		<tr>   			
    			<th>期次</th>    			
    			<th>应还利息</th>
    			<th>应还本金</th>
    			<th>应还总额</th>
    			<th>剩余金额</th>   			     			  			    			    	    				
    		</tr>
    		<tr >  			
    					 
    			
				   			
    		</tr>
    		</thead>
    		<tbody id="tab2"></tbody>
    	</table>
    	<table class="table table-striped " >   	  
    	<thead>
    		<tr>   			
    			<th>还款金额</th>    			
    			<th>支付密码</th>
    			<th>操作</th>
    					     			  			    			    	    				
    		</tr>
    		<tr >  			
    			<td><input type="text" class="form-control" id="" /></</td>		 
    			<td><input type="password" class="form-control" id="" /></</td>
    			<td><button type="button">确认还款</button></td>		 
    			
				   			
    		</tr>
    		</thead>
    		<tbody id="tab2"></tbody>
    	</table>  													
				</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" onclick="shen()">生成计划
				</button>
				<button type="button" class="btn btn-primary"  data-dismiss="modal">
					完成
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>

  </body>
</html>

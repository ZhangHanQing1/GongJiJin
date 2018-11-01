<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ZhangHuC.jsp' starting page</title>
    
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
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
  <script>
  /* 点击的时候添加行 */		
var l=1;
     function dianji(){
     alert("");
		var tr="<tr>";
		tr+="<td><input type='text' readonly='readonly' name='list["+l+"].dwbh'/></td>";
		tr+="<td><input type='text'placeholder='公司名称检索' class='all'/></td>";
		tr+="<td><input type='text' name='list["+l+"].xgqdwbl'/></td>";
		tr+="<td><input type='text' name='list["+l+"].xgqgrbl'/></td>";
		tr+="<td><input type='text' name='list["+l+"].dwjcbl'/></td>";
		tr+="<td><input type='text' name='list["+l+"].grjcbl'/></td>";
		tr +="</tr>";
		$("#tbody").append(tr);
		l++;
		};
  /*单位比例修改前根据ID查询出来  */
  var zjm;
$(function(){
   $("#tbody").on("blur",".all",function(){
      zjm=this;
       $("#save").click();
       alert($(zjm).val());
        $.ajax({
	     url:"KaiHu/selectId",
	       type:"post",
	       async : true,
        	data :{"dwmc2":$(zjm).val()},
	       dataType:"json",
	       success:function(data){
	      
	          $("#ttbody").html();
	          $("#ttbody").empty();
	        for(var i=0;i<data.length;i++){
                 var tr="<tr>";
                 tr+="<td>"+data[i].dwbh+"</td>";
                 
                 tr+="<td>"+data[i].dwmc2+"</td>";
                 tr+="<td>"+data[i].dwjcbl+"</td>";
                 tr+="<td>"+data[i].grjcbl+"</td>";
                
                 tr+="</tr>";
                 $("#ttbody").append(tr);
              };
               /*点击给input赋值  */
         $("#ttbody tr").click(function() {
					$("#guan").click();
					for (var i = 0; i < $(this).children().length; i++) {
						$(zjm).parent().parent().children().eq(i).children().val($(this).children().eq(i).html());
					}   
	    });
	         
	       }  
    })
   })
})
/*修改比例并保存到记录表中  */
  function tijiao(){
  alert($("#form1").serialize());
 
      $.ajax({
        url:'KaiHu/BiLiUp',
        type:'post',
        async : true,
 
        	data :$("#form1").serialize(),
        dataType:'text',
        success:function(data){
            
        }
      })
  }
</script>
  <body><center>
 <form id="form1">
<table class="table table-hover">
	<caption><h1>比例修改页</h1></caption>
	<thead>
		<tr>
		<th>单位编号</th>
			
			<th>公司名称</th>
			<th>单位原缴存比例</th>
			<th>个人原缴存比例</th>
			<th>单位现缴存比例</th>
			<th>个人现缴存比例</th>		
		</tr>
	</thead>
	<tbody id="tbody">
      <tr>
							    	<td><input type="text"   name='list[0].dwbh' readonly="readonly"/></td>	    
										<td><input type="text"   placeholder="公司名称检索" class="all" /></td>
									<td><input type="text"   name='list[0].xgqdwbl' readonly="readonly"/></td>
									<td><input type="text"   name='list[0].xgqgrbl' readonly="readonly"/></td>
										<td><input type="text"  name="list[0].dwjcbl"/></td>
										<td><input type="text"  name="list[0].grjcbl"/></td>
										
								</tr>
	</tbody>
</table>
 <ul class="pagination pagination-lg">
		         <li><input type="button" value="增加"  id="hang" onclick="dianji()"  class="btn btn-primary btn-lg"/></li>
		         <li>          </li>
		         <li><input type="button" value="提交" onclick="tijiao()" class="btn btn-primary btn-lg"/></li>
		         </ul>
    </form>


<!-- 按钮触发模态框 -->
<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" style="display:none;"value="添加" id="save"/>
	开始演示模态框
</button>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" style="width:1000px;background-color:#66CCFF;>
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
				<table class="table table-hover">
	<caption><h1>单位账户信息表</h1></caption>
	<thead>
		<tr>
		<th>单位编号</th>
			<th>公司名称</th>
			<th>单位缴存比例</th>
			<th>个人缴存比例</th>
					
		</tr>
	</thead>
	<tbody id="ttbody">
    
	</tbody>
</table>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal" id="guan">关闭
				</button>
				<button type="button" class="btn btn-primary">
					提交更改
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>
  </body>
</html>



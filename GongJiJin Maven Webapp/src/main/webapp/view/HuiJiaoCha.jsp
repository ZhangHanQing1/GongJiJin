<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'HuiJiaoCha.jsp' starting page</title>
    
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
<style>
 th{text-align:center;}
</style>
  </head>
  
  <body><div style="position:absolute;top:80px;"> 
  <input type="text" id="jiansuo" class="btn btn-default btn-lg" placeholder="单位名称检索"/>
	<input type="text" id="jiansuo1" class="btn btn-default btn-lg" placeholder="日期检索"/></div>
     <table class="table table-bordered text-center" style="position: absolute; top:15%;" id="tabl">
	
	<thead>
		<tr>
			
			<th>单位名称</th>
			<th>发生人数</th>
			<th>发生金额</th>
			<th>缴至年月日</th>
	<th>发生月数</th>
	<th>缴交方式</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody id="tbody">
	</tbody>
	<tfoot id="tf"></tfoot>
</table>

<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" id="save" style="display:none;">
	开始演示模态框
</button>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" style="width:1100px;height:1100px;">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
				个人明细
				</h4>
			</div>
			<div class="modal-body">

			   			<table class="table table-bordered text-center" id="table">
						          <tbody id="ttbody">
              <tr>
              <td>个人姓名</td>
                <td>个人缴额</td>
                <td>单位缴额</td>
                  
                    <td>发生额</td>
              </tr>
    
 </tbody>
							</table>
							
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
				</button>
				<button type="button" class="btn btn-primary" id="dian" onclick="dian()">
					保存汇缴
				</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>

  </body>
</html>
<script>
//页面加载
   $(function(){
      selectHui(1);
   });
   //检索的时候
   $("#jiansuo").blur(function(){
       selectHui(1);
   })
   //查询单位账户信息
      function selectHui(startPage){
      
      $.ajax({
       url:"DWYW/selectHui",
       type:"post",
       data:{"startPage":startPage,"dwmc2":$("#jiansuo").val()},
       dataType:"json",
       success:function(data){    
        var list=data.list;
         $("#tbody").html();
	          $("#tbody").empty();
         for(var i=0;i<list.length;i++){
               var tr="<tr>";
                 
                 tr+="<td>"+list[i].DWMC2+"</td>";
                 tr+="<td>"+list[i].FSRS+"</td>";
                 tr+="<td>"+list[i].FSE3+"</td>";
                 tr+="<td>"+list[i].HBCJNY+"</td>";
                 tr+="<td>"+list[i].fsys+"</td>";
                 tr+="<td>"+list[i].jjmc+"</td>";
                 tr+="<td><input type='button' value='查看详情信息' class='all btn btn-primary' id='"+list[i].DWYWLSH+"'/></td>"; 
                 tr+="</tr>";
                          $("#tbody").append(tr);
         }   
        
         $("#tf").html();
         $("#tf").empty();
               var trr="<tr>"
                     trr+="<td colspan='8'><button class='btn btn-primary' onclick='selectHui("+1+")'>首页"
		                        +"</button>&nbsp;<button onclick='selectHui("+data.prePage+")' class='btn btn-primary'>上一页</button>"+
		                         "&nbsp;&nbsp;&nbsp;"+data.pageNum+"/"+data.pages+"&nbsp;&nbsp;&nbsp;"
		                        +"&nbsp;&nbsp;<button  onclick='selectHui("+data.nextPage+")' class='btn btn-primary'>下一页</button>&nbsp;"
		                        +"<button class='btn btn-primary' onclick='selectHui("+data.pages+")'>尾页</button></td></tr>";
         
            $("#tf").append(trr); 
       }
     }) 
        };
        var id;
        $(function(){
          $("#tbody").on("click",".all",function(){
          $("#save").click();
            id=this.id;
            alert(this.id);
            $.ajax({
               url:"DWYW/selectGRM",
               type:"post",
               data:{"DWYWLSH":this.id},
               dataType:"json",
               success:function(data){
                  $("#ttbody").html();
	          
    
                for(var i=0;i<data.length;i++){
                               var tr="<tr>";
                 
                 tr+="<td>"+data[i].xingming+"</td>";
                 tr+="<td>"+data[i].GRJE+"</td>";
                 tr+="<td>"+data[i].DWJE+"</td>";
                 tr+="<td>"+data[i].FSE3+"</td>";
                 tr+="</tr>";
                          $("#ttbody").append(tr);
                
                }               
               }
            })
          })
        
        })
</script>

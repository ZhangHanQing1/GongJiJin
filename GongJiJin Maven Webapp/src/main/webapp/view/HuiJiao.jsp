<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'HuiJiao.jsp' starting page</title>
    
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
  
</style>
  </head>
  
  <body>
  
<input type="button" value="点击" id="dian"/>

<table class="table table-bordered text-center" style="position: absolute; top:10%;" id="tabl">
	<caption><input type="text" id="jiansuo" class="btn btn-default btn-lg" placeholder="单位名称检索"/></caption>
	<thead>
		<tr>
			<th>单位编号</th>
			<th>单位名称</th>
			<th>单位 缴存比例</th>
			<th>个人缴存比例</th>
			<th>单位缴存人数</th>
			<th>单位账户余额</th>
			<th>单位状态</th>
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
	<div class="modal-dialog" style="width:1000px;">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					汇缴办理
				</h4>
			</div>
			<div class="modal-body">
			   			<table class="table table-bordered text-center" id="table">
						          <tbody>
    <tr>
      <td colspan="3">单位编号</td>
      <td colspan="3">单位名称</td>
      <td colspan="3">缴至年月日</td>
    </tr>
    <tr id="trr">
      
      <td colspan="3"><input type="text" name="dwbh"/></td> 
      <td colspan="3"><input type="text" name="dwmc2"/></td>
      <td colspan="3"><input type="text" name="jznyr"/></td>
    </tr>
    <tr>
      <td>汇缴月数</td>
      <td><select name="fsys"><option name="1">一个月</option>
       <option name="2">二个月</option>
       <option name="3">三个月</option>
       <option name="4">四个月</option>
       <option name="5">五个月</option>
       <option name="6">六个月</option>
       <option name="7">七个月</option>
       <option name="8">八个月</option>
       <option name="9">九个月</option>
       <option name="10">十个月</option>
       <option name="11">十一个月</option>
       <option name="12">十二个月</option>
      </select></td>
      <td>汇缴年月</td>
       <td colspan="2"><input type="text" name="ywblrq" id="date"></td>
      <td>缴交类型</td>
      <td><select name="jjbh" style="width:180px;">
         <option value="1">汇缴</option>
         <option value="2">补缴</option>
         <option value="3">冲缴</option>         
      </select></td>
    </tr>
    <tr>
      <td>Uma</td>
      <td>Pune</td>
      <td>411027</td>
      <td>Uma</td>
      <td>Pune</td>
      <td>411027</td>
    </tr>
       <tr>
      <td>Tanmay</td>
      <td>Bangalore</td>
      <td>560001</td>
      <td>Uma</td>
      <td>Pune</td>
      <td>411027</td>
    </tr>
    <tr>
      <td>Sachin</td>
      <td>Mumbai</td>
      <td>400003</td>
      <td>Uma</td>
      <td>Pune</td>
      <td>411027</td>
    </tr>
    <tr>
      <td>Uma</td>
      <td>Pune</td>
      <td>411027</td>
      <td>Uma</td>
      <td>Pune</td>
      <td>411027</td>
    </tr>
       <tr>
      <td>Tanmay</td>
      <td>Bangalore</td>
      <td>560001</td>
      <td>Uma</td>
      <td>Pune</td>
      <td>411027</td>
    </tr>
    <tr>
      <td>Sachin</td>
      <td>Mumbai</td>
      <td>400003</td>
      <td>Uma</td>
      <td>Pune</td>
      <td>411027</td>
    </tr>
  
 </tbody>
							</table>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
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


<script>

   $(function(){
      select(1);
   });
   
   $("#jiansuo").blur(function(){
       select(1);
   })
   //查询单位账户信息
      function select(startPage){
      
      $.ajax({
       url:"DWYW/select",
       type:"post",
       data:{"startPage":startPage,"dwmc2":$("#jiansuo").val()},
       dataType:"json",
       success:function(data){    
        var list=data.list;
         $("#tbody").html();
	          $("#tbody").empty();
         for(var i=0;i<list.length;i++){
               var tr="<tr>";
                 tr+="<td>"+list[i].dwbh+"</td>";
                 tr+="<td>"+list[i].dwmc2+"</td>";
                 tr+="<td>"+list[i].dwjcbl+"</td>";
                 tr+="<td>"+list[i].grjcbl+"</td>";
                 tr+="<td>"+list[i].dwjcrs+"</td>";
                 tr+="<td>"+list[i].dwzhye+"</td>";
                 tr+="<td>"+list[i].dwzhztmc+"</td>"; 
                 tr+="<td><input type='button' value='汇缴办理' class='all' id='"+list[i].dwbh+"'/></td>"; 
                 tr+="</tr>";
                          $("#tbody").append(tr);
         }   
         $("#tf").html();
         $("#tf").empty();
               var trr="<tr>"
                     trr+="<td colspan='8'><button onclick='select("+1+")'>首页"
		                        +"</button>&nbsp;<button onclick='select("+data.prePage+")'>上一页</button>"
		                        +"&nbsp;&nbsp;<button  onclick='select("+data.nextPage+")'>下一页</button>&nbsp;"
		                        +"<button  onclick='select("+data.pages+")'>尾页</button></td></tr>";
         
            $("#tf").append(trr); 
       }
     }) 
        };
   //查询单位和个人账户信息赋值给模态框
   var idd;
   $(function(){
   $("#tbody").on('click','.all',function(){
     $("#save").click();
     for(var i=0;i<3;i++){
       $("#trr").children().eq(i).children().val($(this).parent().parent().children().eq(i).html())
      }
      
       idd=this;
      /* alert( idd.id); */
      $.ajax({
        
      })
     
   })
   })
   /*获取系统时间  */
$(function(){
  var date=new Date();
  var dat=date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
   var da=dat.toLocaleString();
  $("#date").val(da);
});
</script>
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


<table class="table table-bordered text-center table-hover" style="position: absolute; top:10%;" id="tabl">
	<caption><input type="text" id="jiansuo" class="btn btn-default btn-lg" placeholder="单位名称检索"/></caption>
	<thead>
		<tr>
			<th>单位编号</th>
			<th>单位名称</th>
			<th>缴至年月日</th>
			<th>单位 缴存比例(%)</th>
			<th>个人缴存比例(%)</th>
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
	<div class="modal-dialog" style="width:1100px;height:1100px;">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					补缴办理
				</h4>
			</div>
			<div class="modal-body">
			<form id="uploadForm"   enctype="multipart/form-data">
			   			<table class="table table-bordered text-center" id="table">
						          <tbody>
    <tr>
      <td colspan="3">单位编号</td>
      <td colspan="2">单位名称</td>
      <td colspan="3">记账日期</td>
    </tr>
    <tr id="trr">
      <td colspan="3"  ><input type="text" name="dwbh"/></td> 
      <td colspan="2"><input type="text" /></td>
      <td colspan="3"><input type="text" name="hbcjny" id="date"></td>
    </tr>
    
    <tr>
      <td>汇缴月数</td>
      <td><select name="fsys" onchange="change()" id="gai"><option value="1">一个月</option>
       <option value="2">二个月</option>
       <option value="3">三个月</option>
       <option value="4">四个月</option>
       <option value="5">五个月</option>
       <option value="6">六个月</option>
       <option value="7">七个月</option>
       <option value="8">八个月</option>
       <option value="9">九个月</option>
       <option value="10">十个月</option>
       <option value="11">十一个月</option>
       <option value="12">十二个月</option>
      </select></td>
      <td>汇缴年月</td>
       <td colspan="2"><input type="file" name="file" id="file" onblur="shi()"/></td>
      <td>缴交类型</td>
      <td><select name="jjbh" style="width:180px;">
         
         <option value="2">补缴</option>
              
      </select></td>
    </tr>
    <tr>
    <td>发生人数</td>
      <td><input type="text" name="fsrs" id="renshu"/></td>
      <td colspan="2">个人缴存总基数</td>
      <td><input type="text" id="zongjs"/></td>
      <td>单位月缴存总额</td>
      <td><input type="text" id="dwzong"/></td>
    </tr>
       <tr>
      <td>个人月缴存总额</td>
      <td><input type="text" id="grzong" class="gg"/></td>
      <td colspan="2">月缴存额合计</td>
      <td><input type="text" class="zong"/></td>
      <td>办理人</td>
      <td rowspan="2"><select name="userId"  style="width:180px;"><option value="1">小波</option><option value="2">小谭</option></select></td>
    </tr>
    <tr>
      <td>实收金额</td>
      <td><input type="text" name="fse3" class="zong" id="a" /></td>
      <td colspan="4" id="aa"></td>
    </tr>
    
 </tbody>
							</table>
							</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
				</button>
				<button type="button" class="btn btn-primary" id="dian" onclick="dian()">
					保存补缴
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
      select(1);
   });
   //检索的时候
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
                 tr+="<td>"+list[i].jznyr+"</td>";
                 tr+="<td>"+list[i].dwjcbl+"</td>";
                 tr+="<td>"+list[i].grjcbl+"</td>";
                 tr+="<td>"+list[i].dwjcrs+"</td>";
                 tr+="<td>"+list[i].dwzhye+"</td>";
                 tr+="<td>"+list[i].dwzhztmc+"</td>"; 
                 tr+="<td><input type='button' value='补缴办理' class='all btn btn-primary' id='"+list[i].dwbh+"'/></td>"; 
                 tr+="</tr>";
                          $("#tbody").append(tr);
         }   
         $("#tf").html();
         $("#tf").empty();
               var trr="<tr>"
                     trr+="<td colspan='8'><button class='btn btn-primary' onclick='select("+1+")'>首页"
		                        +"</button>&nbsp;<button onclick='select("+data.prePage+")' class='btn btn-primary'>上一页</button>"
		                        +"&nbsp;&nbsp;<button  onclick='select("+data.nextPage+")' class='btn btn-primary'>下一页</button>&nbsp;"
		                        +"<button class='btn btn-primary' onclick='select("+data.pages+")'>尾页</button></td></tr>";
         
            $("#tf").append(trr); 
       }
     }) 
        };



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
   /*获取系统时间  */
$(function(){
  var date=new Date();
  var dat=date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
   var da=dat.toLocaleString();
  $("#date").val(da);
});

	     //查询个人账户信息赋值给模态框
   
   var idd;
   $(function(){
      $("#tbody").on('click','.all',function(){
      idd=this;
      alert( idd.id);       
	     $("#save").click();
	     
	     //过滤器赋值
	     for(var i=0;i<2;i++){
	       $("#trr").children().eq(i).children().val($(this).parent().parent().children().eq(i).html())
	      }
	       
	      
	      $.ajax({
	          url:'DWYW/selectGR',
	          type:"post",
	          data:{"dwbh":idd.id},
	          dataType:"json",
	          success:function(data){
	              var grzong=0;var dwzong=0;var zongjs=0;var renshu=1; var zong=0;
	              for(var i=0;i<data.length;i++){
	                     renshu+=i;  
	                    grzong+=data[i].GRYJCE;
	                     dwzong+=data[i].DWYJCE;
	                     zongjs+=data[i].GRJCJS3;                   
	              }
	              zong=dwzong+grzong;
	           $("#renshu").val(renshu);
	           $("#grzong").val(grzong);
	           $("#dwzong").val(dwzong);
	           $("#zongjs").val(zongjs);
	           $(".zong").val(zong);
	           $("#jin").html(zong);
	           $("#re").html(renshu);
	           //调用函数
	           changeMoneyToChinese(zong);
	   
	          }
	      })
	     
	   })
	})
	
	    
function dian(){
      var formData = new FormData();
		      /* var files=$("#file").prop('files');
		      formData.append("file", files[0]); */
		     var formData = new FormData($("#uploadForm")[0]);
 		      $.ajax({
		        url:'BuJiao/importexcel',
		        type:'post',
		        async:true,
		        encType: 'multipart/form-data',  //表明上传类型为文件
		        contentType: false, //禁止设置请求类型
		        processData: false, //禁止jquery对DAta数据的处理,默认会处理
		        //禁止的原因是,FormData已经帮我们做了处理
                data:formData,
		        dataType:"json",
		        success:function(data){
		            if(data==1){
		              alert("全部开户成功");
		              $("#grzhxx").reset();
		            }else{
		              alert("出现未知错误，请检查表格");
		            }
		        }
		      })
     
}	    
	


</script>
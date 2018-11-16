<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>个人账户</title>
	<meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap-theme.min.css">
	<script src="resources/jquery-1.11.3.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
  </head>
  <body>
      <table id="grzhs" class="table  text-center table-hover table-bordered" style="width:60%;margin-left:20%" >
        <caption class="text-center h2" >个人信息</caption>
        <thead>
          <tr>
            <td colspan="4">
              <form id="formOne">
                单位名称：<input type="text" name="dwmc2"/>&nbsp;&nbsp;
                姓名：<input type="text" name="xingming"/>&nbsp;&nbsp;
              <input type="button" class="btn btn-default" value="查找" onclick="findByConditions('#formOne',1)"/></form>
            </td>
            <td colspan="3">
              <form id="formTwo">个人账户&nbsp;&nbsp;
              <input type="text" name="grbh"/>&nbsp;&nbsp;
              <input type="button" class="btn btn-default" value="查找" onclick="findByConditions('#formTwo',1)"/></form>
            </td>
            <td>
              <form>
              <input type="button" class="btn btn-default" value="显示全部" onclick="findByConditions(0,1)"/></form>
            </td>
          </tr>
          <tr>
            <td>个人账号</td>
            <td>单位名称</td>
            <td>姓名</td>
            <td>月缴额</td>
            <td>账户余额</td>
            <td>开户日期</td>
            <td>个人资料</td>
            <td>账户状态</td>
          </tr>
        </thead>
        <tbody id="tabBody"></tbody>
        <tfoot id="tabFoot">
        </tfoot>
      </table>
		<!-- 模态框（Modal） -->
		<div class="modal fade" id="myModal" tabindex="-1"  style="margin-top:7%" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
			<div class="modal-dialog"style="width:60%">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
							&times;
						</button>
						<h4 class="modal-title text-center h2" id="myModalLabel">
							账户信息修改
						</h4>
					</div>
					<div class="modal-body">
					    <form id="grzl"><input type="text" id="grbh" name="grbh" style="display: none"/>
						    <table class="table text-center">
						      <tbody>
						      <tr>
						        <td>单位账户:</td>
						        <td><input type="text" class="form-control" name="dwbh" readonly="readonly"/></td>
						        <td>姓名:</td>
						        <td><input type="text" class="form-control"  name="xingming" readonly="readonly"/></td>
						        <td>姓名全拼:</td>
						        <td><input type="text" class="form-control"  name="xmqp" readonly="readonly"/></td>
						        <td>性别:</td>
						        <td><input type="text" class="form-control"  name="xingbie" readonly="readonly"/></td>
						      </tr>	      
						      <tr>
						        <td>证件类型:</td>
						        <td><input type="text" class="form-control" readonly="readonly" id="zjlxbh"/></td>
						        <td>证件编号:</td>
						        <td><input type="text" class="form-control"  name="sbzh" readonly="readonly"/></td>
						        <td>固话号码:</td>
						        <td><input type="text" class="form-control"  name="gddhhm2"/></td>
						        <td>手机号码:</td>
						        <td><input type="text" class="form-control"  name="sjhm2"/></td>
						      </tr>	      
						      <tr>
						        <td>出生年月:</td>
						        <td><input type="date" class="form-control"  name="csny" readonly="readonly"/></td>
						        <td>婚姻状况:</td>
						        <td id="hyzk"></td>
						        <td>职业:</td>
						        <td><input type="text" class="form-control"  name="zhiye"/></td>
						        <td>邮政编码:</td>
						        <td><input type="text" class="form-control"  name="yzbm"/></td>
						      </tr>
						      <tr>
						        <td>学历:</td>
						        <td><input type="text" class="form-control"  name="xueli"/></td>
						        <td>家庭住址:</td>
						        <td><input type="text" class="form-control"  name="jtzz"/></td>
						        <td>储蓄账户:</td>
						        <td><input type="text" class="form-control"  name="yhcxzh"/></td>
						        <td>缴存基数:</td>
						        <td><input type="text" class="form-control"  name="grjcjs3"/></td>
						      </tr>
						      </tbody>
						    </table>
						  </form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭
						</button>
						<button type="button" class="btn btn-primary" onclick="updateGrzl()">
							修改
						</button>
					</div>
				</div><!-- /.modal-content -->
			</div><!-- /.modal dialog -->
		</div><!-- /.modal fade -->
    <script>
      $(function(){
          findByConditions(0,1);
      })
      function findByConditions(ID,startPage){
          var data;
          var url;
          if(ID==0){
            data='{"1":1}';
          }else{
            data=JSON.stringify($(ID).serializeObject());
          }
          $.ajax({
		        url:'grzhxx/findByConditions?startPage='+startPage,
		        type:'post',
		        async:true,
		        contentType: "application/json;charset=utf-8",
		        data:data,
		        dataType:"json",
		        success:function(data){
		          var list=data.list;
		          if(list.length>0){
	                  $("#tabBody").empty();
	                  $("#tabFoot").empty();
			          var tbody;
			          $.each(list, function(){
			            var zhzt;
			            if(this.grzhzt=="正常"){zhzt="<a href='javascript:void(0)' onclick='fengcun("+this.grbh+")'>封存</a>"}
			            else if(this.grzhzt=="封存中"){zhzt="<a href='javascript:void(0)' onclick='qifeng("+this.grbh+")'>启封</a>"}
			            tbody+="<tr><td>"+this.grbh+"</td><td>"+this.dwmc2+"</td><td>"+this.xingming
			            +"</td><td>"+this.grjcjs3+"元*"+this.grjcbl+"%="+(this.grjcjs3*this.grjcbl/100)+"元</td><td>"
			            +this.grzhye+"元</td><td>"+this.khrq+"</td><td><a href='javascript:void(0)' data-toggle='modal' data-target='#myModal' onclick='getGrzl("+this.grbh+")'>详细信息</a></td><td>"
			            +this.grzhzt+"&nbsp;&nbsp;&nbsp;"+zhzt+"</td></tr>";
			          })
			          var options="<select onchange='findByConditions("+ID+","+'this.value'+")'>";
			          for (var i=1;i<=data.pages;i++){
			            if(i==data.pageNum){
			              options+="<option selected='selected' value='"+i+"'>"+i+"</option>"
			            }else{
			              options+="<option value='"+i+"'>"+i+"</option>"
			            }
			          }
			          options+="</select>";
			          var tfoot="<tr><td colspan='8''><button onclick='findByConditions("+ID+","+1+")'>首页"
			                        +"</button>&nbsp;<button onclick='findByConditions("+ID+","+data.prePage+")'>上一页</button>"
			                        +"&nbsp;"+options+"/"+data.pages+"&nbsp;<button  onclick='findByConditions("+ID+","+data.nextPage+")'>下一页</button>&nbsp;"
			                        +"<button  onclick='findByConditions("+ID+","+data.pages+")'>尾页</button></td></tr>";
			          $("#tabFoot").append(tfoot);
			          $("#tabBody").append(tbody);
		          }else{
	                  $("#tabBody").empty();
			          $("#tabBody").append("<tr><td colspan='8'>没有匹配的账户</td></tr>");
		          }
		        }
		  })
      }
      /* 获取个人资料 */
      function getGrzl(grbh){
          $.ajax({
		        url:'grzhxx/getGrzl',
		        type:'post',
		        async:true,
		        /* contentType: "application/json;charset=utf-8", */
				contentType : "application/x-www-form-urlencoded;charset=utf-8",
                data:{"grbh":grbh},
		        dataType:"json",
		        success:function(data){
		          $("#grzl input").each(function(){
		            $(this).val(data[$(this).attr("name")]);
		          })
		          if(data.zjlxbh==1){
		            $("#zjlxbh").val("身份证");
		          }else if(data.zjlxbh==2){
		            $("#zjlxbh").val("军官证");
		          }
		          $("#hyzk").empty();
		          if(data.hyzk=="未婚"){
		            $("#hyzk").append('<input type="radio" name="hyzk" value="未婚"  checked="checked"/>&nbsp;&nbsp;&nbsp;未婚'
		                                          +'&nbsp;&nbsp;&nbsp;<input type="radio" name="hyzk" value="已婚"/>&nbsp;&nbsp;&nbsp;已婚');
		          }else if(data.hyzk=="已婚"){
		            $("#hyzk").append('<input type="radio" name="hyzk" value="未婚"/>&nbsp;&nbsp;&nbsp;未婚'
		                                          +'&nbsp;&nbsp;&nbsp;<input type="radio" name="hyzk" value="已婚"   checked="checked"/>&nbsp;&nbsp;&nbsp;已婚');
		          }
		        }
		  })
      }
      /* 修改个人资料 */
      function updateGrzl(){
          $.ajax({
		        url:'grzhxx/updateGrzl',
		        type:'post',
		        async:true,
		        data:JSON.stringify($("#grzl").serializeObject()),
		        contentType: "application/json;charset=utf-8",
		        dataType:"json",
		        success:function(data){
		            alert("修改成功");
		        }
	      })
      }
      /* 封存个人账号 */
      function fengcun(grbh){
          $.ajax({
		        url:'grzhxx/fengcun',
		        type:'post',
		        async:true,
		        /* contentType: "application/json;charset=utf-8", */
				contentType : "application/x-www-form-urlencoded;charset=utf-8",
                data:{"grbh":grbh},
		        dataType:"json",
		        success:function(data){
		          findByConditions(0,1);
		        }
	      })
      }
      /* 封存个人账号 */
      function qifeng(grbh){
          $.ajax({
		        url:'grzhxx/qifeng',
		        type:'post',
		        async:true,
		        /* contentType: "application/json;charset=utf-8", */
				contentType : "application/x-www-form-urlencoded;charset=utf-8",
                data:{"grbh":grbh},
		        dataType:"json",
		        success:function(data){
		          findByConditions(0,1);
		        }
	      })
      }
        /* 序列化表单 */
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
  </body>
</html>

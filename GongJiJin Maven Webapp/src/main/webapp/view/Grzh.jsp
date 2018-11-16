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
              <form id="formOne">姓名：<input type="text" name="xingming"/>&nbsp;&nbsp;
                单位名称&nbsp;&nbsp;<input type="text" name="dwmc2"/>&nbsp;&nbsp;
              <input type="button" class="btn btn-default" value="查找" onclick="findByConditions('#formOne')"/></form>
            </td>
            <td colspan="3">
              <form id="formTwo">个人账户&nbsp;&nbsp;
              <input type="text" name="grbh"/>&nbsp;&nbsp;
              <input type="button" class="btn btn-default" value="查找" onclick="findByConditions('#formTwo')"/></form>
            </td>
            <td>
              <form id="formThree">
              <input type="button" class="btn btn-default" value="显示全部" onclick="findByConditions('#formThree')"/></form>
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
          <tr>
            <td colspan="8">
		        <!-- 按钮触发模态框 -->
				<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
					开始
				</button>
            </td>
          </tr>
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
					    <form action="grzhxx/insertSelective" method="post"  enctype="multipart/form-data" id="grzhxx">
						    <table class="table text-center">
						      <tbody>
						      <tr>
						        <td>单位账户:</td>
						        <td><input type="text" class="form-control" name="dwbh"/></td>
						        <td>姓名:</td>
						        <td><input type="text" class="form-control"  name="xingming"/></td>
						        <td>姓名全拼:</td>
						        <td><input type="text" class="form-control"  name="xmqp"/></td>
						        <td>性别:</td>
						        <td><input type="radio" name="xingbie" checked="checked" value="男"/>&nbsp;&nbsp;&nbsp;男&nbsp;&nbsp;&nbsp;
						                <input type="radio" name="xingbie" value="女"/>&nbsp;&nbsp;&nbsp;女</td>
						      </tr>	      
						      <tr>
						        <td>证件类型:</td>
						        <td><select name="zjlxbh" class="form-control"><option value="1">身份证</option><option value="2">军官证</option></select></td>
						        <td>证件编号:</td>
						        <td><input type="text" class="form-control"  name="sbzh"/></td>
						        <td>固话号码:</td>
						        <td><input type="text" class="form-control"  name="gddhhm2"/></td>
						        <td>手机号码:</td>
						        <td><input type="text" class="form-control"  name="sjhm2"/></td>
						      </tr>	      
						      <tr>
						        <td>出生年月:</td>
						        <td><input type="date" class="form-control"  name="csny"/></td>
						        <td>婚姻状况:</td>
						        <td><input type="radio" name="hyzk" value="未婚"  checked="checked"/>&nbsp;&nbsp;&nbsp;
						                   未婚&nbsp;&nbsp;&nbsp;<input type="radio" name="hyzk" value="已婚"/>&nbsp;&nbsp;&nbsp;已婚</td>
						        <td>职业:</td>
						        <td><select name="zhiye" class="form-control"><option value="程序员">程序员</option><option value="程序猿">程序猿</option><option value="其他">其他</option></select></td>
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
						<button type="button" class="btn btn-primary">
							确认
						</button>
					</div>
				</div><!-- /.modal-content -->
			</div><!-- /.modal dialog -->
		</div><!-- /.modal fade -->
    <script>
      $(function(){
          findByConditions(0);
      })
      function findByConditions(ID){
          var data;
          if(ID==0){
            data='{"1":1}';
          }else{
            data=JSON.stringify($(ID).serializeObject());
          }
          $.ajax({
		        url:'grzhxx/findByConditions',
		        type:'post',
		        async:true,
		        contentType: "application/json;charset=utf-8",
		        data:data,
		        dataType:"json",
		        success:function(data){
		          if(data.length>0){
	                  $("#tabBody").empty();
	                  /* $("#tabFoot").empty(); */
			          var tbody;
			          $.each(data, function(){
			            var zhzt;
			            if(this.grzhzt=="正常"){zhzt="<a href='javascript:void(0)'>封存</a>"}
			            else if(this.grzhzt=="封存中"){zhzt="<a href='javascript:void(0)'>启封</a>"}
			            tbody+="<tr><td>"+this.grbh+"</td><td>"+this.dwmc2+"</td><td>"+this.xingming
			            +"</td><td>"+this.grjcjs3+"元*"+this.grjcbl+"%="+(this.grjcjs3*this.grjcbl/100)+"元</td><td>"
			            +this.grzhye+"元</td><td>"+this.khrq+"</td><td><a href='javascript:void(0)'>详细信息</a></td><td>"
			            +this.grzhzt+"&nbsp;&nbsp;&nbsp;"+zhzt+"</td></tr>";
			          })
			          /* var tfoot="<tfoot><tr><td colspan='6''><button onclick='selectById("+grzh+","+1+","+PageSize+")'>&lt;&lt;"
			                        +"</button>&nbsp;<button onclick='selectById("+grzh+","+(data.pageNum-1)+","+PageSize+")'>&lt;</button>"
			                        +"&nbsp;"+data.pageNum+"/"+data.pages+"&nbsp;"
			                        +"<button  onclick='selectById("+grzh+","+(data.pageNum+1)+","+PageSize+")'>&gt;</button>&nbsp;"
			                        +"<button  onclick='selectById("+grzh+","+data.pages+","+PageSize+")'>&gt;&gt;</button></td></tr></tfoot>"; */
			          $("#tabBody").append(tbody);
			          /* $("#tabFoot").append(tfoot); */
		          }else{
	                  $("#tabBody").empty();
			          $("#tabBody").append("<tr><td colspan='8'>没有匹配的账户</td></tr>");
		          }
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
    <%-- var thead="<caption class='text-center h2' >个人信息</caption>"
		          +"<thead><tr><td colspan='5'><form id='formOne'>姓名：<input type='text' name='xingming'/>&nbsp;&nbsp;单位名称&nbsp;&nbsp;"
		          +"<input type='text' name='xingming'/>&nbsp;&nbsp;"
		          +"<input type='button' class='btn btn-default' value='查找' onclick='findByConditions("+"#fromOne"+")'/>"
		          +"</form></td><td colspan='3'><form id='formTwo'>"
		          +"个人账户&nbsp;&nbsp;<input type='text' name='grbh'/>&nbsp;&nbsp;"
		          +"<input type='button' class='btn btn-default' value='查找' onclick='findByConditions("+"#fromTwo"+")'/></form></td></tr>"
		          +"<tr><td>个人账号</td><td>个人账号</td><td>个人账号</td><td>个人账号</td><td>个人账号</td>"
		          +"<td>个人账号</td><td>个人账号</td><td>操作</td></tr></thead>" --%>
  </body>
</html>

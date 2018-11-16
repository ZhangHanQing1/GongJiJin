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
    <title>公积金提取</title>
	<meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap-theme.min.css">
	<script src="resources/jquery-1.11.3.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
	<style type="text/css">
	  #tab1 tr td{
	    padding-left: 12px;
	    padding-right: 12px;
	  }
	</style>
  </head>
  <body>
    <form id="form1">
      <table class="table table-bordered text-center" id="tab1" 
      style="width:60%;margin-left:20%;margin-top:6%;border-spacing:0px 20px ;border-collapse: collapse;border:0px">
        <caption class="text-center h2" >公积金提取</caption>
        <tbody>
          <tr>
            <td style="width:30%">
	            <div class="input-group">
		            <span class="input-group-addon">
		                个人账户:
		            </span>
		            <input type="text" class="form-control"  placeholder="请输入" id="grbh" name="grbh"/>
		            <span class="input-group-btn">
		              <input type="button" class="btn btn-default"  id="selectById" value="确认"/>
		            </span>
	            </div>
	        </td>
	        <td style="width:20%">
	            <div class="input-group">
		            <span class="input-group-addon">
		                职工姓名:
		            </span>
		            <input type="text" class="form-control" name="xingming"/>
	            </div>
	        </td>
	        <td style="width:20%">
	            <div class="input-group">
		            <span class="input-group-addon">
		                提取类型:
		            </span>
		            <select name="tqlx" class="form-control">
		              <option value="部分提取">部分提取</option>
		              <option value="全部提取">全部提取</option>
		            </select>
	            </div>
	        </td>
	        <td style="width:30%">
	          <div class="input-group">
	            <span class="input-group-addon">
	                证件号码:
	            </span>
	            <input type="text" class="form-control" name="wtrsfzh"/>
	          </div>
	        </td>
          </tr>
          <tr>
	        <td>
	            <div class="input-group">
		            <span class="input-group-addon">
		                单位账户:
		            </span>
		            <input type="text" class="form-control" name="dwzh3"/>
	            </div>
	        </td>
	        <td>
	            <div class="input-group">
		            <span class="input-group-addon">
		                单位名称:
		            </span>
		            <input type="text" class="form-control" name="dwmc2"/>
	            </div>
	        </td>
	        <td>
	          <div class="input-group">
	            <span class="input-group-addon">
	                账户余额:
	            </span>
	            <input type="text" class="form-control" name="grzhye"/>
	          </div>
	        </td>
	        <td>
	          <div class="input-group">
	            <span class="input-group-addon">
	                银行账户:
	            </span>
	            <input type="text" class="form-control" name="yhcxzh"/>
	          </div>
	        </td>
          </tr>
          <tr>
	        <td colspan="2">
	            <textarea style="width:100%" class="form-control" placeholder="提取原因..." name="tqyynr"></textarea>
	        </td>
	        <td>
	          <div class="input-group">
	            <span class="input-group-addon">
	                提取金额:
	            </span>
	            <input type="number" class="form-control" value="0" name="tqze"/>
	          </div>
	        </td>
	        <td style="vertical-align:middle">
	          <input type="button" class="btn btn-default" style="width:40%" value="提交申请" id="tijiao"/>
	        </td>
          </tr>
        </tbody>
      </table>
    </form>
    <script type="text/javascript">
      $("#selectById").click(function(){
          var grbh=$("#grbh").val();
	      $.ajax({
	        url:'grzhxx/selectByGrbh',
	        type:'post',
	        async:true,
	        /* contentType: "application/json;charset=utf-8", */
			contentType : "application/x-www-form-urlencoded;charset=utf-8",
            data:{"grbh":grbh},
	        dataType:"json",
	        success:function(data){
	            $("input[name='xingming']").val(data.xingming);
	            $("input[name='dwzh3']").val(data.dwbh);
	            $("input[name='dwmc2']").val(data.dwmc2);
	            $("input[name='wtrsfzh']").val(data.sbzh);
	            $("input[name='grzhye']").val(data.grzhye);
	            $("input[name='yhcxzh']").val(data.yhcxzh);
	        }
	      })
      })
      $("#tijiao").click(function(){
	      $.ajax({
	        url:'tqspb/insertTqspb',
	        type:'post',
	        async:true,
	        contentType: "application/json;charset=utf-8",
            data:JSON.stringify($("#form1").serializeObject()),
	        dataType:"text",
	        success:function(data){
	            if(data==1){
	              alert("提交申请成功!");
	              $("#form1").reset();
	            }
	        }
	      })
      })
      $("input[name='tqze']").blur(function(){
      var num=parseInt($("input[name='grzhye']").val());
        if($(this).val()>num){
          $(this).css("border","1px solid #F00");
        }else{
          $(this).css("border","1px solid #ddd");
        }
      })
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
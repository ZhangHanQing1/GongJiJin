<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>个人缴存</title>
    <link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap-theme.min.css">
	<script src="resources/jquery-1.11.3.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
  </head>
  <body>
      <form id="grywmxxx">
      <table class="table text-center" style="width:60%;margin-left:20%">
        <caption class="text-center h2" >个人缴费</caption>
        <tbody class="table-bordered">
          <tr>
            <td >个人账户</td>
            <td class="input-group">
	            <input type="text" class="form-control"  placeholder="请输入"  id="grbh" name="grbh"/>
	            <span class="input-group-btn">
	              <input type="button" class="btn btn-default" id="selectById" value="确认"/>
	            </span>
	        </td>
            <td>姓名</td>
            <td><input  type="text" class="form-control " name="xingming"/></td>
            <td>所属单位</td>
            <td><input  type="text" class="form-control " name="dwmc2"/></td>
          </tr>
          <tr>
            <td>缴存基数(元)</td>
            <td><input  type="text" class="form-control " name="grjcjs3"/></td>
            <td>缴存比例(%)</td>
            <td><input  type="text" class="form-control " name="grjcbl"/></td>
            <td>应缴金额(元)</td>
            <td><input  type="text" class="form-control " name="grje"/></td>
          </tr>
        </tbody>
        <tfoot>
            <tr>
              <td colspan="6"><button class="btn btn-default" onclick="insertGryw()">确认缴费</button></td>
            </tr>
        </tfoot>
      </table>
      </form>
    <!-- 缴费历史记录 -->  
    <table id="mxxxs" class="table table-bordered text-center table-hover" style="width:60%;margin-left:20%" >
    </table>
    <script type="text/javascript">
        /* 根据个人账户查询缴费相关信息 */
        $("#selectById").click(function(){
              var grbh=parseInt($("#grbh").val());
		      $.ajax({
		        url:'grzhxx/selectById',
		        type:'post',
		        async:true,
		        /* contentType: "application/json;charset=utf-8", */
				contentType : "application/x-www-form-urlencoded;charset=utf-8",
                data:{"grbh":grbh},
		        dataType:"json",
		        success:function(data){
		            $("input[name='xingming']").val(data.xingming);
		            $("input[name='dwmc2']").val(data.dwmc2);
		            $("input[name='grjcbl']").val(data.grjcbl);
		            $("input[name='grjcjs3']").val(data.grjcjs3);
		            $("input[name='grje']").val(data.grje);
		            selectById(grbh);
		        }
		      })
        })
        /* 进行个人缴存，保存记录 */
        function insertGryw(){alert(JSON.stringify($("#grywmxxx").serializeObject()));
          $.ajax({
		        url:'Gryw/insertGryw',
		        type:'post',
		        async:true,
		        contentType: "application/json;charset=utf-8",
                data:JSON.stringify($("#grywmxxx").serializeObject()),
		        dataType:"json",
		        success:function(data){
		            if(data==1){
		              alert("缴存成功");
		              /* $("#grzhxx").reset(); */
		            }else{
		              alert("缴存失败");
		            }
		        }
		  })
        }
        /* 分页查询个人缴费记录(pagehelper) */
        function selectById(grbh,startPage,PageSize){
          $.ajax({
		        url:'Gryw/selectById',
		        type:'post',
		        async:true,
		        /* contentType: "application/json;charset=utf-8", */
				contentType : "application/x-www-form-urlencoded;charset=utf-8",
                data:{"grbh":grbh,"startPage":startPage,"PageSize":PageSize},
		        dataType:"json",
		        success:function(data){
		          if(!data.hasPreviousPage){
		              data.prePage=1;
		          }else if(!data.hasNextPage){
		              data.nextPage=data.pages;
		          }
		          $("#mxxxs").empty();
		          var tbody="<tbody>";
		          $.each(data.list, function(){
		            var dwje;
		            if(this.dwje==null){
		              dwje=0;
		            }
		            tbody+="<tr><td>"+this.grywmxbh+"</td><td>"+this.gjywlx+"</td><td>"+this.ywfsrq
		            +"</td><td>"+this.cjsj3+"</td><td>"+this.grje+"元</td><td>"+dwje+"元</td></tr>";
		          })
		          tbody+="</tbody>"
		          var thead="<caption class='text-center h3'>缴费历史记录</caption>"
		                         +"<thead><tr><td colspan='3'>个人缴存余额</td><td colspan='3'>单位缴存余额</td></tr><tr><td>流水单号</td><td>缴费类型</td>"
		                         +"<td>缴费月份</td><td>缴费时间</td><td>个人缴额</td><td>单位缴额</td></tr></thead>"
		          var options="<select onchange='selectById("+grbh+","+'this.value'+","+PageSize+")'>";
		          for (var i=1;i<=data.pages;i++){
		            if(i==data.pageNum){
		              options+="<option selected='selected' value='"+i+"'>"+i+"</option>"
		            }else{
		              options+="<option value='"+i+"'>"+i+"</option>"
		            }
		          }
		          options+="</select>";
		          var tfoot="<tfoot><tr><td colspan='6''><button onclick='selectById("+grbh+","+1+","+PageSize+")'>首页"
		                        +"</button>&nbsp;<button onclick='selectById("+grbh+","+data.prePage+","+PageSize+")'>上一页</button>"
		                        +"&nbsp;"+options+"/"+data.pages+"&nbsp;<button  onclick='selectById("+grbh+","+data.nextPage+","+PageSize+")'>下一页</button>&nbsp;"
		                        +"<button  onclick='selectById("+grbh+","+data.pages+","+PageSize+")'>尾页</button></td></tr></tfoot>";
		          $("#mxxxs").append(thead);
		          $("#mxxxs").append(tbody);
		          $("#mxxxs").append(tfoot);
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
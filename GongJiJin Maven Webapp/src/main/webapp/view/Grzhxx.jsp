<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>个人开户</title>
    <link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap-theme.min.css">
	<script src="resources/jquery-1.11.3.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
 </head>
  <body>
    <div style="width:60%;margin-left: 20%;padding-bottom:20px;" class="text-center h2">
      <a href="javascript:void(0)" id="one">单个开户</a>&nbsp;/&nbsp;<a href="javascript:void(0)" id="many">批量开户</a>
    </div>
    <form method="post" >
	    <table class="table text-center" style="width:66%;margin-left:17%;"id="grzhxx">
	      <tbody >
	      <tr>
	        <td>单位账户:</td>
	        <td class="input-group">
		        <input type="text" class="form-control" name="dwbh" readonly="readonly"/>
	            <span class="input-group-btn">
	              <input type="button" class="btn btn-default" value="选择"/>
	            </span>
	        </td>
	        <td>姓名:</td>
	        <td><input type="text" class="form-control"  name="xingming"/></td>
	        <td>姓名全拼:</td>
	        <td><input type="text" class="form-control"  name="xmqp" readonly="readonly"/></td>
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
	        <td><input type="date" class="form-control"  name="csny" readonly="readonly"/></td>
	        <td>婚姻状况:</td>
	        <td><input type="radio" name="hyzk" value="未婚"  checked="checked"/>&nbsp;&nbsp;&nbsp;
	                   未婚&nbsp;&nbsp;&nbsp;<input type="radio" name="hyzk" value="已婚"/>&nbsp;&nbsp;&nbsp;已婚</td>
	        <td>职业:</td>
	        <td><select name="zhiye" class="form-control"><option value="程序员">程序员</option>
	                <option value="程序猿">程序猿</option><option value="其他">其他</option></select></td>
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
	      <tr>
	        <td colspan="8"><input type="button" class="btn btn-default" onclick="saveGrzhxx()" value="确认开户"/></td>
	      </tr>
	      </tbody>
	    </table>
	  </form>
	  <!-- 批量添加导入Excel -->
	  <form class="text-center" style="width:60%;margin-left:20%;" >
        <input id="file" type="file" name="file" style="display:none">  
		<div class="input-group" style="padding-left: 30%;padding-right: 32%"id="grzhxxs">  
		    <a class="btn btn-default input-group-addon" onclick="$('input[id=file]').click();">请选择</a>  
		    <input id="photoCover" class="form-control" type="text" style="height:35px;" readonly="readonly">
		    <span class="input-group-btn">
		      <input type="button" class="btn btn-default " onclick="saveGrzhxxs()" value="确认"/>
		    </span>
		</div>
	  </form>
	  <script type="text/javascript">
	    $(function(){
		    $("#grzhxxs").hide();
	    })
	    /* file框修饰 */
	    $('input[id=file]').change(function() {  
		    $('#photoCover').val($(this).val());
		});
	    /* 简易选择卡切换 */
		$("#one,#many").click(function(){
		  if(this.id=="one"){
		    $("#grzhxx").show();
		    $("#grzhxxs").hide();
		  }else if(this.id=="many"){
		    $("#grzhxx").hide();
		    $("#grzhxxs").show();
		  }
		})
		/* 单个开户 */
		  function saveGrzhxx(){
 		      $.ajax({
		        url:'grzhxx/insertSelective',
		        type:'post',
		        async:true,
		        contentType: "application/json;charset=utf-8",
                data:JSON.stringify($("#grzhxx").serializeObject()),
		        dataType:"text",
		        success:function(data){
		            if(data==1){
		              alert("开户成功");
		              $("#grzhxx").reset();
		            }else{
		              alert("开户失败");
		            }
		        }
		      })
	      }
	      /* 批量开户(导入Excel表格) */
		  function saveGrzhxxs(){
		      var formData = new FormData();
		      var files=$("#file").prop('files');
		      formData.append("file", files[0]);
 		      $.ajax({
		        url:'grzhxx/insertByExcel',
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
	     /* 表单序列化 */
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
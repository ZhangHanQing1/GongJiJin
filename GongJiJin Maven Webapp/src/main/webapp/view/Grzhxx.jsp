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
	<script src="resources/Mtils.js"></script>
 </head>
  <body>
    <div style="width:80%;margin-left: 10%;padding-bottom:20px;" class="text-center h2">
      <a href="javascript:void(0)" id="one">单个开户</a>&nbsp;/&nbsp;<a href="javascript:void(0)" id="many">批量开户</a>
    </div>
    <form method="post" id="insertGrzh">
	    <table class="table text-center" style="width:66%;margin-left:17%;"id="grzhxx">
	      <tbody >
	      <tr>
	        <td>单位账户:</td>
	        <td class="input-group">
		        <input type="text" class="form-control" name="dwbh" readonly="readonly"/>
	            <span class="input-group-btn">
	              <input type="button" class="btn btn-default" id="chooseDwbh" data-toggle="modal" data-target="#myModal" value="选择"/>
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
	        <td>出生年月:</td>
	        <td><input type="date" class="form-control"  name="csny" readonly="readonly"/></td>
	        <td>固话号码:</td>
	        <td><input type="text" class="form-control"  name="gddhhm2"/></td>
	      </tr>	      
	      <tr>
	        <td>手机号码:</td>
	        <td><input type="text" class="form-control"  name="sjhm2"/></td>
	        <td>婚姻状况:</td>
	        <td><input type="radio" name="hyzk" value="未婚"  checked="checked"/>&nbsp;&nbsp;&nbsp;
	                   未婚&nbsp;&nbsp;&nbsp;<input type="radio" name="hyzk" value="已婚"/>&nbsp;&nbsp;&nbsp;已婚</td>
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
	        <td><input type="number" class="form-control"  name="grjcjs3"/></td>
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
	    <!-- 模态框（Modal） -->
		<div class="modal fade" id="myModal" tabindex="-1"  style="margin-top:7%" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
			<div class="modal-dialog"style="width:40%">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
							X
						</button>
						<h4 class="modal-title text-center h2" id="myModalLabel">
							单位信息
						</h4>
					</div>
					<div class="modal-body">
					    <table class="table table-bordered table-hover text-center" id="dwzhs">
					      
					    </table>
					</div>
				</div><!-- /.modal-content -->
			</div><!-- /.modal dialog -->
		</div><!-- /.modal fade -->
	  <script type="text/javascript">
	    /* 页面加载时调用，隐藏多条添加的table */
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
		$("#chooseDwbh").click(function(){
		  chooseDwbh();
		})
		/* 个人开户时选择单位 */
		function chooseDwbh(startPage){
 		      $.ajax({
		        url:'grzhxx/findAllDwzh',
		        type:'post',
		        async:true,
                data:{"startPage":startPage},
				contentType : "application/x-www-form-urlencoded;charset=utf-8",
		        dataType:"json",
		        success:function(data){
		            $("#dwzhs").empty();
		            $.each(data.list, function(){
		              var caozuo='';
		              if(this.DWZHZTBH==1){
		                caozuo+="<button class='btn btn-default' data-dismiss='modal' aria-hidden='true' onclick='chooseThis("+this.DWBH+")'>选择</button>";
		              }else{
		                caozuo+="不可选择";
		              }
		              var tr="<tr>";
		              tr+="<td>"+this.DWBH+"</td>";
		              tr+="<td>"+this.DWMC2+"</td>";
		              tr+="<td>"+this.DWZHZTMC+"</td>";
		              tr+="<td>"+caozuo+"</td>";
		              tr+="</tr>"
		              $("#dwzhs").append(tr);
		            })
			          var options="<select onchange='chooseDwbh("+'this.value'+")'>";
			          for (var i=1;i<=data.pages;i++){
			            if(i==data.pageNum){
			              options+="<option selected='selected' value='"+i+"'>"+i+"</option>"
			            }else{
			              options+="<option value='"+i+"'>"+i+"</option>"
			            }
			          }
			          options+="</select>";
			          var tfoot="<tr><td colspan='4''><button onclick='chooseDwbh("+1+")'>首页"
			                        +"</button>&nbsp;<button onclick='chooseDwbh("+data.prePage+")'>上一页</button>"
			                        +"&nbsp;"+options+"/"+data.pages+"&nbsp;<button  onclick='chooseDwbh("+data.nextPage+")'>下一页</button>&nbsp;"
			                        +"<button  onclick='chooseDwbh("+data.pages+")'>尾页</button></td></tr>";
			          $("#dwzhs").append(tfoot);
		        }
		      })
		}
		/* 选择单位 */
		function chooseThis(dwbh){
		  $("input[name='dwbh']").val(dwbh);
		}
		/* 个人开户 */
		  function saveGrzhxx(){
		      var sbzh=$("input[name=sbzh]").val();
		      var dwbh=parseInt($("input[name=dwbh]").val());
		      $.ajax({
		        url:'grzhxx/checkSbzh',
		        type:'post',
		        async:true,
				contentType : "application/x-www-form-urlencoded;charset=utf-8",
                data:{"dwbh":dwbh,"sbzh":sbzh},
		        dataType:"text",
		        success:function(data){
		            if(!isCardNo($("input[name=sbzh]").val())){
					  $("input[name=sbzh]").css("border","1px solid #F00");
		            }else if(data==1){
		              alert("该员工已在该单位开过户！");
		            } else if(data==0){
					      $.ajax({
					        url:'grzhxx/insertSelective',
					        type:'post',
					        async:true,
					        contentType: "application/json;charset=utf-8",
			                data:JSON.stringify($("#insertGrzh").serializeObject()),
					        dataType:"text",
					        success:function(data){
					            if(data==1){
					              alert("开户成功");
					              $("#insertGrzh").reset();
					            }else{
					              alert("开户失败");
					            }
					        }
					      })
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
	    /* 当身份证号码框失去焦点时获取出生年月 */
		  $("input[name='sbzh']").blur(function(){
            if(isCardNo($(this).val())){
                $("input[name='csny']").val(getBirthdatByIdNo($("input[name='sbzh']").val()));
                $("input[name=sbzh]").css("border","1px solid #ddd");
            }else{
                $("input[name=sbzh]").css("border","1px solid #F00");
            }
		  })
         //获取出生日期
         function getBirthdatByIdNo(iIdNo) {
             var tmpStr = "";
             var strReturn = "";
             if (iIdNo.length == 15) {
                 tmpStr = iIdNo.substring(6, 12);
                 tmpStr = "19" + tmpStr;
                 tmpStr = tmpStr.substring(0, 4) + "-" + tmpStr.substring(4, 6) + "-" + tmpStr.substring(6)
                 return tmpStr;
             }
             else {
                 tmpStr = iIdNo.substring(6, 14);
                 tmpStr = tmpStr.substring(0, 4) + "-" + tmpStr.substring(4, 6) + "-" + tmpStr.substring(6)
                return tmpStr;
             }
         }
         /* 获取姓名的拼音 */
         $("input[name='xingming']").blur(function(){
           $("input[name='xmqp']").val(Mtils.utils.makePy($(this).val()));
         })
         function isCardNo(card){ 
		  // 身份证号码为15位或者18位，15位时全为数字，18位前17位为数字，最后一位是校验位，可能为数字或字符X 
		  var reg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/; 
		  if(reg.test(card) === false) {  
		      return false; 
		  }else{
		      return true;
		  }
		}
	  </script>
   </body>
</html>
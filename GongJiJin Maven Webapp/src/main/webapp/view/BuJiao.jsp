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
	<div class="modal-dialog" style="width:1350px;height:1100px;">
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
      <td>补缴年月</td>
    <td colspan="4"><input id="txt_Date1" type="date"/>&nbsp;&nbsp;&nbsp;&nbsp;至&nbsp;&nbsp;&nbsp;&nbsp;<input id="txt_Date2" type="date"  onblur="aaa()"/></td>
      <td>补缴月数</td>
      <td><input type="input" id="yueshu" name="fsys"/></td>
      </tr>
       <tr>
      <td>实收金额</td>
      <td><input type="text" name="fse3" class="zong" id="a" /></td>
      <td colspan="4" id="aa"></td>
    
    </tr>
      <tr>
      <td colspan="2">导入补缴人员</td>
       <td colspan="2"><input type="file" name="file" id="file" onblur="Excel()"/></td>
       
      	  <td colspan="2">缴交类型</td>
      <td><select name="jjbh" style="width:180px;">
         
         <option value="2">补缴</option>
              
      </select></td>
    </tr>
    <tr>
  <td><input type="button" value="新建" onclick="xinjian()"></td>
    <td>发生人数</td>
      <td><input type="text" name="fsrs" id="renshu"/></td>
      
      <td colspan="2">单位月缴存总额</td>
      <td><input type="text" id="dwzong"/></td>
    </tr>
       <tr>
      <td>个人月缴存总额</td>
      <td><input type="text" id="grzong" class="gg"/></td>
      <td colspan="2">月缴存额合计</td>
      <td><input type="text" class="zong" name="yz"/></td>
      <td>办理人</td>
      <td><select name="userId"  style="width:180px;"><option value="1">小波</option><option value="2">小谭</option></select></td>
    </tr>
   
     <tr>
      <td>个人编号</td>
      <td>姓名</td>
      <td colspan="2">个人月缴存额</td>
      <td colspan="2">单位月缴存额</td>
      <td>月总缴存额</td>
    
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
		                        +"</button>&nbsp;<button onclick='select("+data.prePage+")' class='btn btn-primary'>上一页</button>"+
		                        "&nbsp;&nbsp;&nbsp;"+data.pageNum+"/"+data.pages+"&nbsp;&nbsp;&nbsp;"
		                        +"&nbsp;&nbsp;<button  onclick='select("+data.nextPage+")' class='btn btn-primary'>下一页</button>&nbsp;"
		                        +"<button class='btn btn-primary' onclick='select("+data.pages+")'>尾页</button></td></tr>";
         
            $("#tf").append(trr); 
       }
     }) 
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
	          /*  $("#renshu").val(renshu);
	           $("#grzong").val(grzong);
	           $("#dwzong").val(dwzong);
	           $("#zongjs").val(zongjs);
	           $(".zong").val(zong);
	           $("#jin").html(zong);
	           $("#re").html(renshu); */
	           //调用函数
	           changeMoneyToChinese(zong);
	   
	          }
	      })
	     
	   })
	})
	
	    /*导入Excel表格  */
function Excel(){
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
		         
		           var grzong=0;var dwzong=0;var zongjs=0;var renshu=0; var zong=0;
		            for(var i=0;i<data.length;i++){
		            grzong+=parseInt(data[i].GRYJCE);
		            dwzong+=parseInt(data[i].DWYJCE);
		            zong+=parseInt(data[i].HJ);
		            renshu++;
		            var tr="<tr>";
                 tr+="<td>"+data[i].GRBH+"</td>";
                 tr+="<td>"+data[i].XINGMING+"</td>";              
                 tr+="<td colspan='2'>"+data[i].GRYJCE+"</td>";
                 tr+="<td colspan='2'>"+data[i].DWYJCE+"</td>";
                 tr+="<td>"+data[i].HJ+"</td>";
                 tr+="</tr>";
		            $("#table").append(tr);
		            $("#renshu").val(renshu);
		             $("#grzong").val(grzong);
	           $("#dwzong").val(dwzong);
	           $(".zong").val(zong);
	           changeMoneyToChinese(zong);
		            }
		        }
		      })
     
};
	
	    /*补缴添加  */
function dian(){
      var formData = new FormData();
		      /* var files=$("#file").prop('files');
		      formData.append("file", files[0]); */
		     var formData = new FormData($("#uploadForm")[0]);
 		      $.ajax({
		        url:'BuJiao/add',
		        type:'post',
		        async:true,
		        encType: 'multipart/form-data',  //表明上传类型为文件
		        contentType: false, //禁止设置请求类型
		        processData: false, //禁止jquery对DAta数据的处理,默认会处理
		        //禁止的原因是,FormData已经帮我们做了处理
                data:formData,
		        dataType:"json",
		        success:function(data){
		          
		            alert("补缴成功");
		            window.location.href="view/HuiJiaoCha.jsp"; 
		      
		        }
		      })
     
};
	
	    
	/*js获取俩个日期见得月数   */
    function aaa() {
    var yue=0;
                var d1 = document.getElementById("txt_Date1").value;//日期1
                var d2 = document.getElementById("txt_Date2").value;//日期2
                //年*12+月
                var m1 = parseInt(d1.split("-")[1].replace(/^0+/, "")) + parseInt(d1.split("-")[0]) * 12;
                var m2 = parseInt(d2.split("-")[1].replace(/^0+/, "")) + parseInt(d2.split("-")[0]) * 12;
                $("#yueshu").val(parseInt(m2-m1));
                yue=m2-m1;
               jisuan(yue);
            }
            /* 计算 */
            function jisuan(obj){
            alert(obj);
             var grzong= $("#grzong").val();
                var dwzong= $("#dwzong").val();
                var zong= $(".zong").val();
                  $("#grzong").val(grzong*obj);
	           $("#dwzong").val(dwzong*obj);
	          $(".zong").val(zong*obj);
            
            }
    //将阿拉伯数字转换为大写中文金额
function changeMoneyToChinese(money){
	    var cnNums = new Array("零","壹","贰","叁","肆","伍","陆","柒","捌","玖"); //汉字的数字
	    var cnIntRadice = new Array("","拾","佰","仟"); //基本单位
	    var cnIntUnits = new Array("","万","亿","兆"); //对应整数部分扩展单位
	    var cnDecUnits = new Array("角","分","毫","厘"); //对应小数部分单位
	    var cnInteger = "整"; //整数金额时后面跟的字符
	    var cnIntLast = "元"; //整型完以后的单位
	    var maxNum = 999999999999999.9999; //最大处理的数字
	    
	    var IntegerNum; //金额整数部分
	    var DecimalNum; //金额小数部分
	    var ChineseStr=""; //输出的中文金额字符串
	    var parts; //分离金额后用的数组，预定义
	    if( money == "" ){
	        return "";
	    }
	    money = parseFloat(money);
	    if( money >= maxNum ){
	        $.alert('超出最大处理数字');
	        return "";
	    }
	    if( money == 0 ){
	        ChineseStr = cnNums[0]+cnIntLast+cnInteger;
	        //document.getElementById("show").value=ChineseStr;
	        return ChineseStr;
	    }
	    money = money.toString(); //转换为字符串
	    if( money.indexOf(".") == -1 ){
	        IntegerNum = money;
	        DecimalNum = '';
	    }else{
	        parts = money.split(".");
	        IntegerNum = parts[0];
	        DecimalNum = parts[1].substr(0,4);
	    }
	    if( parseInt(IntegerNum,10) > 0 ){//获取整型部分转换
	        zeroCount = 0;
	        IntLen = IntegerNum.length;
	        for( i=0;i<IntLen;i++ ){
	            n = IntegerNum.substr(i,1);
	            p = IntLen - i - 1;
	            q = p / 4;
	            m = p % 4;
	            if( n == "0" ){
	                zeroCount++;
	            }else{
	                if( zeroCount > 0 ){
	                    ChineseStr += cnNums[0];
	                }
	                zeroCount = 0; //归零
	                ChineseStr += cnNums[parseInt(n)]+cnIntRadice[m];
	            }
	            if( m==0 && zeroCount<4 ){
	                ChineseStr += cnIntUnits[q];
	            }
	        }
	        ChineseStr += cnIntLast;
	        //整型部分处理完毕
	    }
	    if( DecimalNum!= '' ){//小数部分
	        decLen = DecimalNum.length;
	        for( i=0; i<decLen; i++ ){
	            n = DecimalNum.substr(i,1);
	            if( n != '0' ){
	                ChineseStr += cnNums[Number(n)]+cnDecUnits[i];
	            }
	        }
	    }
	    if( ChineseStr == '' ){
	        ChineseStr += cnNums[0]+cnIntLast+cnInteger;
	    }else if( DecimalNum == '' ){
	        ChineseStr += cnInteger;
	    }
	    $("#aa").html("大写："+ChineseStr);
	    
	}
            
        
</script>
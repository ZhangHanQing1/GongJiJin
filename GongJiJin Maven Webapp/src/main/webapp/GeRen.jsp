<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台管理系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<%-- <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap-theme.min.css">
  	<script src="${pageContext.request.contextPath}/resources/bootstrap/jquery-1.11.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script> --%>
	<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">  
	<script src="resources/jquery-1.11.3.min.js"></script>
	 <script src="resources/bootstrap/js/bootstrap.min.js"></script> 
	<link rel="stylesheet" href="resources/layui/css/layui.css" media="all">
	<script src="resources/jquery.form.js"></script>
	<script src="resources/jqueryExt.js"></script>
	<script src="resources/layui/layui.all.js" charset="utf-8"></script>
	<link href="<c:url value="/resources/layui/css/layui.css" />" rel="stylesheet">
	<link href="<c:url value="/demo/common/bootstrap/css/bootstrap.min.css" />" media="all" rel="stylesheet">
	<script src="<c:url value="/resources/jquery-1.11.3.min.js" />" charset="utf-8"></script>
	<script type="text/javascript" src="<c:url value="/demo/common/bootstrap/js/bootstrap.min.js" />"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<select id=zhiding>
  		<option value="2018">2018</option>
  		<option value="2017">2017</option>
  	</select>
    <div class="layui-form">
  	<table class="layui-table">
    <colgroup>
      <col width="150">
      <col width="150">
      <col width="200">
      <col>
    </colgroup>
    <thead>
      <tr>
      	<td>金额/人数</td>
        <th>一月</th>
        <th>二月</th>
        <th>三月</th>
        <th>四月</th>
        <th>五月</th>
        <th>六月</th>
        <th>七月</th>
        <th>八月</th>
        <th>九月</th>
        <th>十月</th>
        <th>十一月</th>
        <th>十二月</th>
      </tr> 
    </thead>
    <tbody>
      <tr>
        <td>贷款金额</td>
        <td id="a1"></td>
        <td id="a2"></td>
        <td id="a3"></td>
        <td id="a4"></td>
        <td id="a5"></td>
        <td id="a6"></td>
        <td id="a7"></td>
        <td id="a8"></td>
        <td id="a9"></td>
        <td id="a10"></td>
        <td id="a11"></td>
        <td id="a12"></td>
      </tr>
      <tr>
        <td>人数</td>
        <td id="b1"></td>
        <td id="b2"></td>
        <td id="b3"></td>
        <td id="b4"></td>
        <td id="b5"></td>
        <td id="b6"></td>
        <td id="b7"></td>
        <td id="b8"></td>
        <td id="b9"></td>
        <td id="b10"></td>
        <td id="b11"></td>
        <td id="b12"></td>
      </tr>
    </tbody>
  	</table>
	</div>
  </body>
</html>
<script type="text/javascript">
	function geren(date3){
		$("#a1").val("");
		$.ajax({
        	url : "grdk1",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a1").html(data);
        	}
 		});
	}
	function geren2(date3){
		$("#a2").val("");
		$.ajax({
        	url : "grdk2",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a2").html(data);
        	}
 		});
	}
	function geren3(date3){
		$("#a3").val("");
		$.ajax({
        	url : "grdk3",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a3").html(data);
        	}
 		});
	}
	function geren4(date3){
		$("#a4").val("");
		$.ajax({
        	url : "grdk4",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a4").html(data);
        	}
 		});
	}
	function geren5(date3){
		$("#a5").val("");
		$.ajax({
        	url : "grdk5",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a5").html(data);
        	}
 		});
	}
	function geren6(date3){
		$("#a6").val("");
		$.ajax({
        	url : "grdk6",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a6").html(data);
        	}
 		});
	}
	function geren7(date3){
		$("#a7").val("");
		$.ajax({
        	url : "grdk7",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		alert(data)
        		$("#a7").html(data);
        	}
 		});
	}
	function geren8(date3){
		$("#a8").val("");
		$.ajax({
        	url : "grdk8",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a8").html(data);
        	}
 		});
	}
	function geren9(date3){
		$("#a9").val("");
		$.ajax({
        	url : "grdk9",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a9").html(data);
        	}
 		});
	}
	function geren10(date3){
		$("#a10").val("");
		$.ajax({
        	url : "grdk10",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a10").html(data);
        	}
 		});
	}
	function geren11(date3){
		$("#a11").val("");
		$.ajax({
        	url : "grdk11",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a11").html(data);
        	}
 		});
	}
	function geren12(date3){
		$("#a12").val("");
		$.ajax({
        	url : "grdk12",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a12").html(data);
        	}
 		});
	}
	//-----------------
	function renshu(date3){
		$("#b1").val("");
		$.ajax({
        	url : "grdks1",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b1").html(data);
        	}
 		});
	}
	function renshu2(date3){
		$("#b2").val("");
		$.ajax({
        	url : "grdks2",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b2").html(data);
        	}
 		});
	}
	function renshu3(date3){
		$("#b3").val("");
		$.ajax({
        	url : "grdks3",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b3").html(data);
        	}
 		});
	}
	function renshu4(date3){
		$("#b4").val("");
		$.ajax({
        	url : "grdks4",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b4").html(data);
        	}
 		});
	}
	function renshu5(date3){
		$("#b5").val("");
		$.ajax({
        	url : "grdks5",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b5").html(data);
        	}
 		});
	}
	function renshu6(date3){
		$("#b6").val("");
		$.ajax({
        	url : "grdks6",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b6").html(data);
        	}
 		});
	}
	function renshu7(date3){
		$("#b7").val("");
		$.ajax({
        	url : "grdks7",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b7").html(data);
        	}
 		});
	}
	function renshu8(date3){
		$("#b8").val("");
		$.ajax({
        	url : "grdks8",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b8").html(data);
        	}
 		});
	}
	function renshu9(date3){
		$("#b9").val("");
		$.ajax({
        	url : "grdks9",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b9").html(data);
        	}
 		});
	}
	function renshu10(date3){
		$("#b10").val("");
		$.ajax({
        	url : "grdks10",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b10").html(data);
        	}
 		});
	}
	function renshu11(date3){
		$("#b11").val("");
		$.ajax({
        	url : "grdks11",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b11").html(data);
        	}
 		});
	}
	function renshu12(date3){
		$("#b12").val("");
		$.ajax({
        	url : "grdks12",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b12").html(data);
        	}
 		});
	}
	
	$(function(){  
    	//设置时间  
　 	 	var myDate = new Date();
	//获取当前年
	var year=myDate.getFullYear();
	//获取当前月
	var month=myDate.getMonth()+1;
	//获取当前日
	var date=myDate.getDate(); 
	var h=myDate.getHours();       //获取当前小时数(0-23)
	var m=myDate.getMinutes();     //获取当前分钟数(0-59)
	var s=myDate.getSeconds();  
	
	var now=p(year);
 　	 	geren(now);
 		geren2(now);
 		geren3(now);
 		geren4(now);
 		geren5(now);
 		geren6(now);
 		geren7(now);
 		geren8(now);
 		geren9(now);
 		geren10(now);
 		geren11(now);
 		geren12(now);
 		renshu(now);
 		renshu2(now);
 		renshu3(now);
 		renshu4(now);
 		renshu5(now);
 		renshu6(now);
 		renshu7(now);
 		renshu8(now);
 		renshu9(now);
 		renshu10(now);
 		renshu11(now);
 		renshu12(now);
	}); 
	function p(s) {
    return s < 10 ? '0' + s: s;
	}
	function gerens(){
		var date3=$("#zhiding").val();
		$("#a1").val("");
		$.ajax({
        	url : "grdk1",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a1").html(data);
        	}
 		});
	}
	function gerens2(){
		var date3=$("#zhiding").val();
		$("#a2").val("");
		$.ajax({
        	url : "grdk2",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a2").html(data);
        	}
 		});
	}
	function gerens3(){
		var date3=$("#zhiding").val();
		$("#a3").val("");
		$.ajax({
        	url : "grdk3",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a3").html(data);
        	}
 		});
	}
	function gerens4(){
		var date3=$("#zhiding").val();
		$("#a4").val("");
		$.ajax({
        	url : "grdk4",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a4").html(data);
        	}
 		});
	}
	function gerens5(){
		var date3=$("#zhiding").val();
		$("#a5").val("");
		$.ajax({
        	url : "grdk5",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a5").html(data);
        	}
 		});
	}
	function gerens6(){
		var date3=$("#zhiding").val();
		$("#a6").val("");
		$.ajax({
        	url : "grdk6",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a6").html(data);
        	}
 		});
	}
	function gerens7(){
		var date3=$("#zhiding").val();
		$("#a7").val("");
		$.ajax({
        	url : "grdk7",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a7").html(data);
        	}
 		});
	}
	function gerens8(){
		var date3=$("#zhiding").val();
		$("#a8").val("");
		$.ajax({
        	url : "grdk8",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a8").html(data);
        	}
 		});
	}
	function gerens9(){
		var date3=$("#zhiding").val();
		$("#a9").val("");
		$.ajax({
        	url : "grdk9",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a9").html(data);
        	}
 		});
	}
	function gerens10(){
		var date3=$("#zhiding").val();
		$("#a10").val("");
		$.ajax({
        	url : "grdk10",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a10").html(data);
        	}
 		});
	}
	function gerens11(){
		var date3=$("#zhiding").val();
		$("#a11").val("");
		$.ajax({
        	url : "grdk11",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a11").html(data);
        	}
 		});
	}
	function gerens12(){
		var date3=$("#zhiding").val();
		$("#a12").val("");
		$.ajax({
        	url : "grdk12",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#a12").html(data);
        	}
 		});
	}
	//--------------------------------------------
	function renshus(){
		var date3=$("#zhiding").val();
		$("#b1").val("");
		$.ajax({
        	url : "grdks1",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b1").html(data);
        	}
 		});
	}
	function renshus2(){
		var date3=$("#zhiding").val();
		$("#b2").val("");
		$.ajax({
        	url : "grdks2",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b2").html(data);
        	}
 		});
	}
	function renshus3(){
		var date3=$("#zhiding").val();
		$("#b3").val("");
		$.ajax({
        	url : "grdks3",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b3").html(data);
        	}
 		});
	}
	function renshus4(){
		var date3=$("#zhiding").val();
		$("#b4").val("");
		$.ajax({
        	url : "grdks4",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b4").html(data);
        	}
 		});
	}
	function renshus5(){
		var date3=$("#zhiding").val();
		$("#b5").val("");
		$.ajax({
        	url : "grdks5",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b5").html(data);
        	}
 		});
	}
	function renshus6(){
		var date3=$("#zhiding").val();
		$("#b6").val("");
		$.ajax({
        	url : "grdks6",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b6").html(data);
        	}
 		});
	}
	function renshus7(){
		var date3=$("#zhiding").val();
		$("#b7").val("");
		$.ajax({
        	url : "grdks7",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b7").html(data);
        	}
 		});
	}
	function renshus8(){
		var date3=$("#zhiding").val();
		$("#b8").val("");
		$.ajax({
        	url : "grdks8",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b8").html(data);
        	}
 		});
	}
	function renshus9(){
		var date3=$("#zhiding").val();
		$("#b9").val("");
		$.ajax({
        	url : "grdks9",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b9").html(data);
        	}
 		});
	}
	function renshus10(){
		var date3=$("#zhiding").val();
		$("#b10").val("");
		$.ajax({
        	url : "grdks10",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b10").html(data);
        	}
 		});
	}
	function renshus11(){
		var date3=$("#zhiding").val();
		$("#b11").val("");
		$.ajax({
        	url : "grdks11",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b11").html(data);
        	}
 		});
	}
	function renshus12(){
		var date3=$("#zhiding").val();
		$("#b12").val("");
		$.ajax({
        	url : "grdks12",
        	type : "post",
        	async : true,
        	data : {
        		"date3" : date3,
        	},//将json对象转换成json格式的字符串
       	 	dataType : 'json',//返回的数据类型
        	success : function(data) {
        		$("#b12").html(data);
        	}
 		});
	}
	$("#zhiding").change(function(){
		gerens();
		gerens2();
		gerens3();
		gerens4();
		gerens5();
		gerens6();
		gerens7();
		gerens8();
		gerens9();
		gerens10();
		gerens11();
		gerens12();
		renshus();
		renshus2();
		renshus3();
		renshus4();
		renshus5();
		renshus6();
		renshus7();
		renshus8();
		renshus9();
		renshus10();
		renshus11();
		renshus12();
	})
</script>

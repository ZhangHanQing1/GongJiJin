<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Grzhxx.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <div style="padding:3px 2px;border-bottom:1px solid #ccc">Form Validation</div>
    <form id="ff" method="post">
        <div>
            <label for="name">Name:</label>
            <input class="easyui-validatebox" type="text" name="name" required="true"></input>
        </div>
        <div>
            <label for="email">Email:</label>
            <input class="easyui-validatebox" type="text" name="email" required="true" validType="email"></input>
        </div>
        <div>
            <label for="subject">Subject:</label>
            <input class="easyui-validatebox" type="text" name="subject" required="true"></input>
        </div>
        <div>
            <label for="message">Message:</label>
            &lt;textarea name="message" style="height:60px;"&gt;&lt;/textarea&gt;
        </div>
        <div>
            <input type="submit" value="Submit">
        </div>
    </form>
  </body>
</html>

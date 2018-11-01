<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'BiLiCha.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap-theme.min.css">
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="resources/layui/css/layui.css"  media="all">
<script
	src="resources/jquery-1.11.3.min.js"></script>
  </head>
  
  <body>
  <center>
      
<table class="layui-hide" id="test" lay-filter="test"></table>
 
 
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="Bian" >编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
              
          
                     
<script src="resources/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 
<script>
layui.use('table', function(){
  var table = layui.table;
  
  table.render({
  title:'比例变更记录表'
    ,elem: '#test'
    ,url:'BiLi/select'
    ,cols: [[
      {field:'bgjlbh', width:150, title: '变更编号', sort: true,width:150}
     ,{field:'dwmc2', width:150, title: '单位名称',width:150}
     ,{field:'xgqdwbl', width:150, title: '修改前单位 缴存比例',width:150}
     ,{field:'xgqgrbl', width:150, title: '修改前个人缴存比例', sort: true,width:150}
     ,{field:'dwjcbl', width:150, title: '现在单位 缴存比例',width:150}
     ,{field:'grjcbl', width:150, title: '现在个人缴存比例', sort: true,width:150}
       ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:200}
    ]]
    ,page: true
  });
  
/*   //头工具栏事件
  table.on('toolbar(test)', function(obj){
    var checkStatus = table.checkStatus(obj.config.id);
    switch(obj.event){
      case 'getCheckData':
        var data = checkStatus.data;
        layer.alert(JSON.stringify(data));
      break;
      case 'getCheckLength':
        var data = checkStatus.data;
        layer.msg('选中了：'+ data.length + ' 个');
      break;
      case 'isAll':
        layer.msg(checkStatus.isAll ? '全选': '未全选');
      break;
    };
  }); */
  
  //监听行工具事件
  table.on('tool(test)', function(obj){
    var data = obj.data;
    var DWBH=data.DWBH;
    
    //console.log(obj)
    if(obj.event === 'del'){
      layer.confirm('真的删除行么', function(index){
        obj.del();
        layer.close(index);
      });
    } else if(obj.event === 'Bian'){
		      layer.open({
		  type: 2,
		 shade: [0.4, '#393D49'],
		area: ['1000px', '800px'],
		  content:"http://localhost:8080/GongJiJin/KaiHu/selectId"+data.DWBH	 //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
	});
    }
  }); 
});
</script>
   
   </body>
</html>

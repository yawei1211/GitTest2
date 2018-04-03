<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户操作</title>
<link rel="stylesheet" type="text/css" href="res/easyui.css">
<link rel="stylesheet" type="text/css" href="res/icon.css">
<link rel="stylesheet" type="text/css" href="res/demo.css">
<script type="text/javascript" src="res/jquery.min.js"></script>
<script type="text/javascript" src="res/jquery.easyui.min.js"></script>
<script type="text/javascript" src="res/jquery.edatagrid.js"></script>
<script type="text/javascript">
		$(function(){
			$('#tt').edatagrid({
				url:"api/findAllScenic",
				saveUrl:"addScenichou",
				updateUrl:"updataScenichou", 
				destroyMsg:{
						norecord:{    // 在没有记录选择的时候执行
							title:'警告：',
							msg:'您并未选中任何数据！'
						},
						confirm:{       // 在选择一行的时候执行		
							title:'提醒：',
							msg:'您确定要删除所选数据么?'
						}	
					},
					
			    
				onDestroy: function(index,row){
					
						$.ajax({
							type : "POST",
							url : "deleteScenichou",
							data : "sid="+row.sid,
							success : function(msg) {
								$("#tt").datagrid('reload');
							}
						});
						
					},
					

			});
	
		});
		
	</script>

</head>
<body>
	<h1>景点管理</h1>
	<div style="margin-bottom: 10px">
		<a href="#" onClick="javascript:$('#tt').edatagrid('addRow')">添加</a>
		<a href="#" onClick="javascript:$('#tt').edatagrid('saveRow')">保存</a>
		<a href="#" onClick="javascript:$('#tt').edatagrid('reload')">刷新</a>
		<a href="#" onClick="javascript:$('#tt').edatagrid('destroyRow')">删除</a>
	</div>
	<table id="tt" style="width: auto; height: auto"
		title="景点" singleSelect="true">
		<thead>
			<tr>
				<th field="sid" width="100" editor="text" editor="numberbox">景点Id</th>
				
				<th field="sname" width="150" editor="text" >景点名称</th>
				<th field="sintro" width="auto" editor="text" >景点简介</th>
				<th field="sheat" width="150" editor="text" >景点热度</th>
				<th field="scommentNum" width="150" editor="text" >评论数量</th>
				
			</tr>
		</thead>
	</table>
</body>
</html>
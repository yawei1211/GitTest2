<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="res/easyui.css">
	<link rel="stylesheet" type="text/css" href="res/icon.css">
	
	<script type="text/javascript" src="res/jquery.min.js"></script>
	<script type="text/javascript" src="res/jquery.easyui.min.js"></script>
</head>
<body>
	<table id="tt" class="easyui-datagrid" title="会员列表" style="width:auto;height:auto"
			data-options="singleSelect:true,collapsible:true,url:'api/findDetailByPage',method:'get'
			" 
			pagesize="5"
			pagelist="[1,2,3,4,5,6,7,8,9,10]"
			rownumbers="true"
			pagination="true">
		<thead>
			<tr>
				<th data-options="field:'did'" width="80" >景点明细ID</th>
				<th data-options="field:'dprice'" width="80">景点明细介绍</th>
				<th data-options="field:'minprice',align:'right'" width="80">景点简介</th>
				
			</tr>
		</thead>
	</table>
</body>
</html>
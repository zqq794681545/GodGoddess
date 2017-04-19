<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>帮助文档</title>
		<script type="text/javascript" src="../js/jquery-1.8.3.min.js" charset="UTF-8"></script>
		<script type="text/javascript" src="../js/easyui/jquery.easyui.min.js" charset="UTF-8"></script>
		<script type="text/javascript" src="../js/easyui/easyui.tree.extend.js"  charset="UTF-8"></script>
		<script type="text/javascript" src="../js/easyui/locale/easyui-lang-zh_CN.js" charset="UTF-8"></script>
		<link rel="stylesheet" type="text/css" href="../js/easyui/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="../css/base.css">
		<link rel="stylesheet" type="text/css" href="../js/easyui/themes/icon.css">
		<link rel="stylesheet" type="text/css" href="../css/button.css">
		<script type="text/javascript" src="../js/easyui.common.js"  charset="UTF-8"></script>
		<script type="text/javascript" src="../js/util.common.js"  charset="UTF-8"></script>
		<script type="text/javascript" src="../js/project.common.js"  charset="UTF-8"></script>
		<script type="text/javascript" src="helpDoc.js" charset="UTF-8"></script>
		<script type="text/javascript" src="../js/banbk.js"  charset="UTF-8"></script>
</head>
<body class="easyui-layout">  
    <div data-options="region:'west',title:'帮助目录',split:true,iconCls:'icon-directory'" style="width:230px;">
    	&nbsp;名称：
    	<input type="text" id="_name_tree" size=10>
    	<a href="#" onclick="doSearch()" class="easyui-linkbutton" id="_search_button" data-options="plain:true,iconCls:'i_app_search'">查询</a>
    	<ul id="_help_tree"></ul>
    </div>  
    
    <div data-options="region:'center',iconCls:'icon-document',title:'帮助文档'" >
		<div id="_help_panel" class="easyui-panel" style="width:$(windows).width()"  
        	data-options="href:'pages/test.jsp',fit:true,border:false,closable:true,collapsible:false,minimizable:false,maximizable:false">  
		</div>  
    </div>  
</body>  

</html>
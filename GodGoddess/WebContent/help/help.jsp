<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>帮助配置</title>
		<script type="text/javascript" src="../js/jquery-1.8.3.min.js" charset="UTF-8"></script>
		<script type="text/javascript" src="../js/easyui/jquery.easyui.min.js" charset="UTF-8"></script>
		<script type="text/javascript" src="../js/easyui/easyui.treegrid.extend.js"  charset="UTF-8"></script>
		<script type="text/javascript" src="../js/easyui/easyui.tree.extend.js"  charset="UTF-8"></script>
		<script type="text/javascript" src="../js/easyui/locale/easyui-lang-zh_CN.js" charset="UTF-8"></script>
		<link rel="stylesheet" type="text/css" href="../js/easyui/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="../css/base.css">
		<link rel="stylesheet" type="text/css" href="../js/easyui/themes/icon.css">
		<link rel="stylesheet" type="text/css" href="../css/button.css">
		<script type="text/javascript" src="../js/easyui.common.js"  charset="UTF-8"></script>
		<script type="text/javascript" src="../js/util.common.js"  charset="UTF-8"></script>
		<script type="text/javascript" src="../js/project.common.js"  charset="UTF-8"></script>
		<script type="text/javascript" src="help.js" charset="UTF-8"></script>
		<script type="text/javascript" src="../js/banbk.js"  charset="UTF-8"></script>
		
	</head>
	<body class="easyui-layout" id="_layout">
		<div region="center" data-options="title:'帮助信息',border:false">
			<ul id="_help_treegrid"></ul>
			
		</div>
		
		<div region="east" data-options="title:'用户授权',border:true" style="width:250px;">
			<ul id="base_role"></ul>
		</div>
		
		<div id="_add_window" class="easyui-window" data-options="width:300,height:150,draggable:true,shadow:true,modal:true,closed:true,closable:true,minimizable:false,maximizable:false,collapsible:false">
			<form action="" method="post" id="_addForm">
				<table width="100%">
					<br>
					<tr>
						<td width="80" align="right">
							<i class="labelrequired">*</i>&nbsp;名称：
						</td>
						<td width="100">
							<input type="text" size="20" id="_name" name="e.name" />
						</td>
					<tr>
						<td width="80" align="right">
							链接地址：
						</td>
						<td width="100">
							<input type="text" size="20" id="_url" name="e.url"/>
						</td>
					</tr>
					<tr>
						<td colspan="4" style="text-align: center;">
						<input type="hidden" id="_id" name="e.id"/>
						<input type="hidden" id="_pid" name="e.pid"/>
						<br>
						<a id="_add_save" href="javascript:addSave();" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-save'">保存</a>
							&nbsp;&nbsp;&nbsp;
						<a id="_add_close" href="javascript:addClose();" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-cancel'">关闭</a> 
						</td>
					</tr>
				</table>
				</form>
		</div>
		
		<div id="_classify_edit" class="easyui-window" data-options="width:300,height:150,draggable:true,shadow:true,modal:true,closed:true,closable:true,minimizable:false,maximizable:false,collapsible:false">
			<form action="" method="post" id="_classify_form">
				<table width="100%">
					<tr>
						<td width="90px" align="right">
							<i class="labelrequired">*</i>&nbsp;分类名称：
						</td>
						<td width="140px">
							<input type="text" size="15" id="_classify_name" name="tBaseTypeEntity.name"   required="true"  />
						</td>
					</tr>
					<tr>
						<td width="90px" align="right">
							<i class="labelrequired">*</i>&nbsp;分类编码：
						</td>
						<td width="140px">
							<input type="text" size="15" id="_classify_code" name="tBaseTypeEntity.code"   required="true"  />
						</td>
					</tr>
					<tr>
						<td width="90px" align="right">
							<i class="labelrequired">*</i>&nbsp;数据类型：
						</td>
						<td width="140px">
							<input type="radio" name="tBaseTypeEntity.type" value="NORMAL"/>普通
							<input type="radio" name="tBaseTypeEntity.type" value="TREE"/>树 
						</td>
					</tr>
					<tr>
						<td colspan="4" style="text-align: center;">
							<input type="hidden" id="_classify_id" name="tBaseTypeEntity.id"/>
							<input type="hidden" id="_classify_status" name="tBaseTypeEntity.status"/>
							<a id="_classify_save" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-save'">保存</a> 
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a id="_classify_cancel" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-cancel'">关闭</a> 
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>
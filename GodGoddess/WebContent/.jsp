<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Strict//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="../javascript/easyui/themes/bootstrap/easyui.css">
		<link rel="stylesheet" type="text/css" href="../javascript/easyui/themes/bootstrap/easyui-extend.css">
		<link rel="stylesheet" type="text/css" href="../javascript/easyui/themes/icon.css">
		<link rel="stylesheet" type="text/css" href="../css/button.css">
		<link rel="stylesheet" type="text/css" href="../javascript/easyui/themes/color.css">
		<script type="text/javascript" src="../javascript/easyui/jquery.min.js"></script>
		<script type="text/javascript" src="../javascript/easyui/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="../javascript/easyui/easyui.tree.extend.js"></script>
		<script type="text/javascript" src="../javascript/easyui/easyui.treegrid.extend.js"></script>
		<script type="text/javascript" src="../javascript/easyui/tabs.ext.js"></script>
		<script type="text/javascript" src="../javascript/easyui/locale/easyui-lang-zh_CN.js"></script>
		<script type="text/javascript" src="../javascript/project.common.js"></script>
		<script type="text/javascript" src="../javascript/jquery.cookie.js"></script>
		<script type="text/javascript" src="../javascript/util.js"></script>
		<script type="text/javascript" src="../javascript/easyuiutil.js"></script>
		<script type="text/javascript" src="../javascript/basecombobox.js"></script>
		<script type="text/javascript" src="../javascript/util.common.js"></script>
		<script type="text/javascript" src="../javascript/store.js"></script>
		<script type="text/javascript" src="../javascript/basetype.js"></script>
		<script type="text/javascript" src="../javascript/baseutil.js"></script>
		<link rel="stylesheet" type="text/css" href="../css/loading.css">
		<script type="text/javascript" src="../javascript/loading.js" charset="UTF-8"></script>
	</head>
	<body>
		<div id='loading' class="_loading"></div>
		<div class="easyui-layout" data-options="fit:true">
			<div region="north" data-options="border:false,title:'查询',iconCls:'i_app_magnify',collapsible:false" style="height:65px;">
				<form action="" method="post" id="__search_form"> 
					<table>
						<tr>
							<td>
								<a href="javascript:void(0);" id="__search_button" class="easyui-linkbutton" data-options="plain:true,iconCls:'i_app_search'">查询</a>
								<a href="javascript:void(0);" id="__reset_button"  class="easyui-linkbutton" data-options="plain:true,iconCls:'i_app_refresh'">重置</a> 
							</td>
						</tr>
					</table>
				</form>
			</div>
			<div region="center" data-options="border:false">
				<table id="__table" data-options="striped:true,fit:true"></table>
			</div>
		</div>
		
		<div id="__add_window" class="easyui-window" data-options="title:'新增',width:350,draggable:true,shadow:true,modal:true,closed:true,closable:true,minimizable:false,maximizable:false,collapsible:false">
			<form action="" method="post" id="__add_form">
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelemail" id="__add_modelemail" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-datebox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelcjsj" id="__add_modelcjsj" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-datebox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelbq" id="__add_modelbq" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-datebox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelbirthday" id="__add_modelbirthday" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelbust" id="__add_modelbust" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelage" id="__add_modelage" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelheight" id="__add_modelheight" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelavatar" id="__add_modelavatar" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelname" id="__add_modelname" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelcup" id="__add_modelcup" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelweight" id="__add_modelweight" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelintroduction" id="__add_modelintroduction" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelwaist" id="__add_modelwaist" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelhipline" id="__add_modelhipline" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelsex" id="__add_modelsex" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelphone" id="__add_modelphone" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelnickname" id="__add_modelnickname" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.id" id="__add_id" />
				</div>
				<div style="margin-top:15px;margin-bottom:15px;text-align: center;">
					<a href="javascript:void(0);" id="__add_save_button" class="easyui-linkbutton" data-options="">保存</a>
					<a href="javascript:void(0);" id="__add_cancel_button" class="easyui-linkbutton" data-options="">取消</a>
				</div>
			</form>
		</div>
		
		<div id="__edit_window" class="easyui-window" data-options="title:'编辑',width:350,draggable:true,shadow:true,modal:true,closed:true,closable:true,minimizable:false,maximizable:false,collapsible:false">
			<form action="" method="post" id="__edit_form">
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelemail" id="__edit_modelemail" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-datebox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelcjsj" id="__edit_modelcjsj" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-datebox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelbq" id="__edit_modelbq" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-datebox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelbirthday" id="__edit_modelbirthday" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelbust" id="__edit_modelbust" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelage" id="__edit_modelage" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelheight" id="__edit_modelheight" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelavatar" id="__edit_modelavatar" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelname" id="__edit_modelname" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelcup" id="__edit_modelcup" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelweight" id="__edit_modelweight" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelintroduction" id="__edit_modelintroduction" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelwaist" id="__edit_modelwaist" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelhipline" id="__edit_modelhipline" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelsex" id="__edit_modelsex" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelphone" id="__edit_modelphone" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.modelnickname" id="__edit_modelnickname" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300"  name="e.id" id="__edit_id" />
				</div>
				<div style="margin-top:15px;margin-bottom:15px;text-align: center;">
					<a href="javascript:void(0);" id="__edit_save_button" class="easyui-linkbutton" data-options="">保存</a>
					<a href="javascript:void(0);" id="__edit_cancel_button" class="easyui-linkbutton" data-options="">取消</a>
				</div>
			</form>
		</div>
		
		<div id="__view_window" class="easyui-window" data-options="title:'查看',width:350,draggable:true,shadow:true,modal:true,closed:true,closable:true,minimizable:false,maximizable:false,collapsible:false">
			<form action="" method="post" id="__view_form">
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelemail" id="__view_modelemail" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelcjsj" id="__view_modelcjsj" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelbq" id="__view_modelbq" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelbirthday" id="__view_modelbirthday" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelbust" id="__view_modelbust" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelage" id="__view_modelage" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelheight" id="__view_modelheight" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelavatar" id="__view_modelavatar" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelname" id="__view_modelname" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelcup" id="__view_modelcup" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelweight" id="__view_modelweight" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelintroduction" id="__view_modelintroduction" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelwaist" id="__view_modelwaist" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelhipline" id="__view_modelhipline" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelsex" id="__view_modelsex" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelphone" id="__view_modelphone" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.modelnickname" id="__view_modelnickname" />
				</div>
				<div style="margin-top:15px">
					<input type="text" class="easyui-textbox" data-options="label:'：',required:true,labelAlign:'right',labelWidth:100,width:300,readonly:true"  name="e.id" id="__view_id" />
				</div>
				<div style="margin-top:15px;margin-bottom:15px;text-align: center;">
					<a href="javascript:void(0);" id="__view_cancel_button" class="easyui-linkbutton" data-options="">取消</a>
				</div>
			</form>
		</div>
		
		<script type="text/javascript" src="../.js" charset="UTF-8"></script>	
	</body>
</html>
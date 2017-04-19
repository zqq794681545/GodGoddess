<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>厦门市建设用地批后动态监管系统</title>
		<link rel="stylesheet" type="text/css" href="../css/base.css">
		<link rel="stylesheet" type="text/css" href="../javascript/easyui/themes/bootstrap/easyui.css">
		<link rel="stylesheet" type="text/css" href="../javascript/easyui/themes/bootstrap/easyui-extend.css">
		<link rel="stylesheet" type="text/css" href="../javascript/easyui/themes/icon.css">
		<link rel="stylesheet" type="text/css" href="../css/button.css">
		<link rel="stylesheet" type="text/css" href="../javascript/easyui/themes/color.css">
		<script type="text/javascript" src="../js/jquery-1.8.3.js" charset="UTF-8"></script>
		<script type="text/javascript" src="../javascript/easyui/jquery.min.js"></script>
		<script type="text/javascript" src="../js/easyui/jquery.easyui.min.js" charset="UTF-8"></script>
		<script type="text/javascript" src="../javascript/easyui/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="../javascript/easyui/easyui.tree.extend.js"></script>
		<script type="text/javascript" src="../javascript/easyui/easyui.treegrid.extend.js"></script>
		<script type="text/javascript" src="../javascript/easyui/tabs.ext.js"></script>
		<script type="text/javascript" src="../javascript/easyui/locale/easyui-lang-zh_CN.js"></script>
		
		<script type="text/javascript" src="../javascript/jquery.cookie.js"></script>
		<script type="text/javascript" src="../javascript/easyuiutil.js"></script>
		<script type="text/javascript" src="../javascript/basecombobox.js"></script>
		<script type="text/javascript" src="../javascript/phjg.common.js"></script>
		<script type="text/javascript" src="../javascript/store.js"></script>
		<script type="text/javascript" src="../javascript/basetype.js"></script>
		
		<script type="text/javascript" charset="utf-8" src="../javascript/ueditor/ueditor.config.js"> </script>
		<script type="text/javascript" charset="utf-8" src="../javascript/ueditor/ueditor.all.js"></script>
	    <script type="text/javascript" charset="utf-8" src="../javascript/ueditor/lang/zh-cn/zh-cn.js"></script>
		
		<link rel="stylesheet" type="text/css" href="../css/loading.css">
		<script type="text/javascript" src="../javascript/loading.js" charset="UTF-8"></script>
		<script type="text/javascript" src="main.js" charset="UTF-8"></script>
		
	</head>
	<style>
	    img {
	    	border:0;
	    }
	    ul {
	    	list-style: none outside none;
	    	margin:0;
	    	padding: 42px 30px 0px 40px;
	    }
	    body .mainmenu:after {
	    	clear: both;
	    	content: " ";
	    	display: block;
	    }
	    body .mainmenu li{ 
	        float:left;
	        width: 336px;
	        overflow:hidden;
	    }
	    body .mainmenu li a{
	    	-webkit-box-sizing: border-box;
	    	height:100%;
	    	width:100%;
	    	display:block;
	    	padding: 6px;
	    	text-align:center;
	    }
	     body .mainmenu li a div{
	    	position: relative;
		    left: 0;
		    top: 0;
		    width: 100%;
		    height: 100%;
		    overflow: hidden;
	    }
	     body .mainmenu li a div font{
	     	margin-left: 8px;
	        display: block;
	     	float:left;
	    	text-align:center;
	    	font-size: 25px;
	    }
	   body .mainmenu li img{
	       display: block;
	    	float: left;
    		margin-left: 8%;
    		margin-top: 20px;
	    }

	    body .mainmenu li span{
	   		margin-left: 8px;
	        margin-top: 20px;
	    	padding-top:1em;
	    	display:block;
	    	color: #fff;
	    	font-size:16px;
	    	font-weight: 350;
	    }
	    
	    body .mainmenu li:nth-child(8n+1) a div {
	    	background-color:#fd8774;
	    }
	    body .mainmenu li:nth-child(8n+2)  a div {
	    	background-color:#bfbdbd;
	    }
	    body .mainmenu li:nth-child(8n+3)  a div {
	    	background-color:#5ab7df;
	    }
	    body .mainmenu li:nth-child(8n+4)  a div {
	    	background-color:#ebc95e;
	    }
	    body .mainmenu li:nth-child(8n+5)  a div {
	    	background-color:#bfbdbd;
	    }
	    body .mainmenu li:nth-child(8n+6)  a div {
	    	background-color:#5ab7df;
	    }
	    body .mainmenu li:nth-child(8n+7)  a div {
	    	background-color:#64cfa7;
	    }
	    body .mainmenu li:nth-child(8n+8)  a div {
	    	background-color:#bfbdbd;
	    }
	    body .mainmenu li:nth-child(8n+9)  a div {
	    	background-color:#5ab7df;
	    }
	    body .mainmenu li:nth-child(8n+10)  a div {
	    	background-color:#bfbdbd;
	    }
	    body .mainmenu li:nth-child(8n+11)  a div {
	    	background-color:#5ab7df;
	    }
	    body .mainmenu li:nth-child(8n+12)  a div {
	    	background-color:#64cfa7;
	    }
	    body .mainmenu li:nth-child(8n+13)  a div {
	    	background-color:#fd8774;
	    }
	    body .mainmenu li:nth-child(8n+14)  a div {
	    	background-color:#64cfa7;
	    }
	   	body .mainmenu li:nth-child(8n+15)  a div {
	    	background-color:#ebc95e;
	    }

	    body .mainmenu li:nth-child(8n+16)  a div {
	    	background-color:#bfbdbd;
	    }
	    body .mainmenu li{
	    	background-color:white;
	    	height:130px;
	    }
 		body .mainmenu li  a div:hover{
	    	transition: all 200ms;
    		-ms-transition: all 200ms;
    		-moz-transition: all 200ms;
    		-webkit-transition: all 200ms;
    		padding: 3px;
    		top: -3px;
    		left: -3px;
    		z-index: 44;
    		box-shadow: 1px 1px 3px #888888;
	    }
	    .north_background{
	    	background-repeat:repeat; 
			background-size:contain; 
	    }
	    
	</style>
	<body id="_menu" class="easyui-layout">
		<div id='loading' class="_loading"></div>
		<input type="hidden" id="_wininput">
			<div id="win" class="easyui-window" data-options="modal:true,closed:true,fit:true,collapsible:false,minimizable:false,maximizable:false,draggable:false,resizable:false">
				
			</div> 
			<div region="north" class="north_background" style="height: 58px;text-align: left;" >
				<table height="100%">
					<tr>
						<td width="80%" height="100%">
							<img alt=""  src="../image/login3/inner3.png">
						</td>
						 <td width="6%" ">
							<a href="../j_spring_security_logout"  ><img title="退出系统" alt="登出" src="../image/login3/dc.png"></a> 
						</td>
						<td width="6%">
							<a href="#"	id="_help"   ><img title="帮助文档" alt="帮助文档" src="../image/login3/bz.png"></a>
						</td> 
					</tr>
				</table>
			</div>
			<div region="south" style="height:30px;">
			</div>
			<div id="_center" region="center">
				<div id="main_tabs" class="easyui-tabs" data-options="fit:true">  
				</div>
			</div>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html> 
<head><title>test</title> 
<script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="../js/upload/plupload/jquery.plupload.queue/css/jquery.plupload.queue.css">
<script type="text/javascript" src="../js/upload/plupload/plupload.full.js"></script>
<script type="text/javascript" src="../js/upload/plupload/jquery.plupload.queue/jquery.plupload.queue.js"></script>
<script type="text/javascript" src="../js/upload/plupload/i18n/cn.js"></script>
<script type="text/javascript" src="../javascript/phjg.common.js"></script>
<script type="text/javascript" src="../js/banbk.js"  charset="UTF-8"></script>
<script type="text/javascript">
$(document).ready(function(){
	var operatype = getParameter("operatype");
	var operaid = getParameter("operaid");
	$("#uploader").pluploadQueue({
		runtimes:'flash,html5,html4',
		url:'../tBaseFile/upload.action',
		max_file_size:'1000mb',
		unique_names:true,
		chunk_size:'100mb',
		filters:[
			{title:"图片文件",extensions:"jpg,gif,png,jepg"}
		],
		flash_swf_url:'../js/upload/plupload/plupload.flash.swf',
		silverlight_xap_url:'../js/upload/plupload/plupload.silverlight.xap',
		multipart_params: {'operaid': operaid, 'operatype': operatype}
	});
});
	
</script>
</head>
<body>
	<div id="uploader">
		<p>您的浏览器未安装 Flash, Silverlight, Gears, BrowserPlus 或者支持 HTML5 .</p>
	</div>
</body>
</html>
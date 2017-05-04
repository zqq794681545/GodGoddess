<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>The FileUplaodDemo In Struts2</title>
</head>

<body>
<s:form action="../tBaseFile/fileUpload.action" method="post" enctype="multipart/form-data" namespace="/">
<s:file name="myFile" label="MyFile" ></s:file>
<s:textfield name="caption" label="Caption"></s:textfield>
<s:submit label="提交"></s:submit>
</s:form>
</body>
</html>
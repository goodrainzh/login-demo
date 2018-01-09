<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<title>login page</title>
</head>
<body>
        欢迎<% ${sessionScope.username} %>登录
</body>
</html>

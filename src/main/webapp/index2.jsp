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
        <h2>欢迎${sessionScope.uname}登录</h2>
</body>
</html>

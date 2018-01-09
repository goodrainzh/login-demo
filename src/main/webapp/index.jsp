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
    <form action="servlet/LoginServlet" method="post">
            <table border="0" al align="center">
                <tr>
                <td>用户名：</td>
                <td><input type="text" name="username"></td>
                </tr>
                <tr>
                <td>密码：<br></td>
                <td><input type="password" name="password"></td>
                </tr> 
                <tr>
                <td colspan="2" align="center"><input type="submit" name="submit" value="登录"></td>
                </tr>
            </table>
    </form>
    

</body>
</html>

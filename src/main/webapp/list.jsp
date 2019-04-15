<%--
  Created by IntelliJ IDEA.
  User: XT
  Date: 2019/4/14
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Success Page</h2>
    <a href="/shiro/testShiroAnnotation">权限注解</a>
    <br>
    Welcome: <shiro:principal/>
    <br><br>
    <shiro:hasRole name="admin">
        <a href="admin.jsp">Admin Page</a><br>
    </shiro:hasRole>
    <shiro:hasRole name="user">
        <a href="index.jsp">User Page</a><br>
    </shiro:hasRole>
    <a href="/shiro/logout">Logout</a>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: XT
  Date: 2019/4/14
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Login Page</h2>
    <br><br>
    <form action="shiro/login" method="post">
        username: <input type="text" name="username"><br>
        password: <input type="password" name="password"><br>
        <input type="submit" value="login">
    </form>
</body>
</html>

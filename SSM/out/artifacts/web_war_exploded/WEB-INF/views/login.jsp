<%--
  Created by IntelliJ IDEA.
  User: 10598
  Date: 2019/5/17
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>login</title>
    </head>
    <body>
    <form action="${pageContext.request.contextPath}/login.do" method="post">
        用户名：<input type="text" name="username"><br>
        密码：<input type="text" name="password"><br>
        <input type="submit" value="登陆">
    </form>
    </body>
</html>

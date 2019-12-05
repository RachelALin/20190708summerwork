<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/7/25
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/adminServlet" method="post">
    <div style="margin: 0 auto;">
        name:<input type="text" name="name"><br>
        password:<input type="password" name="password"><br>
        <input type="submit" value="提交">
    </div>

</form>
</body>
</html>

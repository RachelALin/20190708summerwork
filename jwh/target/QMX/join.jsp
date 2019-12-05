<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/7/25
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--路径为被识别时添加下面的语句--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Join</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/userServlet" method="post">
    <div style="margin: 0 auto;">
        姓名:<input type="text" name="name"><br>
        学号:<input type="text" name="schoolnum"><br>
        学院:<input type="text" name="college"><br>
        专业:<input type="text" name="majorin"><br>
        QQ:<input type="text" name="qq"><br>
        联系电话:<input type="text" name="tel"><br>
        组别:<input type="text" name="group"><br>
        <input type="submit" value="提交">
    </div>
</form>
</body>
</html>

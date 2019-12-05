<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/7/29
  Time: 2:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="row">
        <table id="b1" class="table table-bordered table-striped table-responsive table-hover mb-5">
            <tr>
                <th>姓名</th>
                <th>学号</th>
                <th>学院</th>
                <th>专业</th>
                <th>QQ号</th>
                <th>联系方式</th>
                <th>组别</th>
                <th>操作</th>
                <th>操作</th>
            </tr>

            <c:forEach items="${list_}" var="l">
                <tr>

                    <td><c:out value="${l.name}"/></td>
                    <td><c:out value="${l.schoolnum}"/></td>
                    <td><c:out value="${l.college}"/></td>
                    <td><c:out value="${l.majorin}"/></td>
                    <td><c:out value="${l.qq}"/></td>
                    <td><c:out value="${l.tel}"/></td>
                    <td><c:out value="${l.group}"/></td>

                </tr>
            </c:forEach>

        </table>
</div>
</body>
</html>

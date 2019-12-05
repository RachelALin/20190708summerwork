<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/8/2
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Author</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .table th, .table td {
            text-align: center;
            vertical-align: middle!important;
        }
    </style>
</head>
<body>
<h1 style="text-align: center">Comment</h1>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>内容</th>
                    <th>评论时间</th>
                    <th>博客编号</th>
                    <th>修改</th>
                    <th>删除</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="item" items="${tclist}">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.content}</td>
                        <td>${item.commentData}</td>
                        <td>${item.blogId}</td>
                        <td>修改</td>
                        <td><a href="${pageContext.request.contextPath}/deleteTbCommentById?id=${item.id}">删除</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/8/2
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form class="user" action="${pageContext.request.contextPath}/updateTbAuthorById" method="post">
    <div class="form-group row">
        <div class="col-sm-6 mb-3 mb-sm-0">
            <input type="hidden" class="form-control form-control-user" name="id" placeholder="id" value="${tbAuthor.id}">
            <input type="text" class="form-control form-control-user" name="userName" placeholder="userName" value="${tbAuthor.userName}">
        </div>
        <div class="col-sm-6">
            <input type="text" class="form-control form-control-user" name="password" placeholder="password" value="${tbAuthor.password}">
        </div>
    </div>

    <div class="form-group row">
        <div class="col-sm-6 mb-3 mb-sm-0">
            <input type="email" class="form-control form-control-user" name="email" placeholder="email" value="${tbAuthor.email}">
        </div>
        <div class="col-sm-6">
            <input type="text" class="form-control form-control-user" name="address" placeholder="address" value="${tbAuthor.address}">
        </div>
    </div>
    <div class="form-group row">
        <div class="col-sm-6 mb-3 mb-sm-0">
            <input type="text" class="form-control form-control-user" name="phone" placeholder="phone" value="${tbAuthor.phone}">
        </div>
    </div>

    <div class="form-group row">
        <div class="col-sm-6" style="margin: 0 auto;">
            <input type="submit" class="form-control form-control-user" value="update">
        </div>
    </div>
    <hr>

</form>
</body>
</html>

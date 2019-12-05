<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/7/27
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>

<%@page import="ctgu.qmx.studentEntity.studentEntity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    //获取绝对路径路径
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="<%=basePath %>" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="icon" type="imges/x-icon" href="welcome/img/logo.png">
    <title>启明星</title>
    <link rel="stylesheet" type="text/css" href="welcome/bootstrap-3.3.7/css/bootstrap.min.css">
    <script src="welcome/bootstrap-3.3.7/js/jquery.min.js"></script>
    <script src="welcome/bootstrap-3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="welcome/csses/qmx.css">
    <link rel="stylesheet" type="text/css" href="welcome/csses/hd.css">
</head>
<body>
<div class="count-agileits" id="stats">
    <div class="box" style="top:20px;">
        <form role="form" action="Update" method="post" id="form1">
            <h2>修改信息</h2>
            <div class="form-group">
                <label>姓名：</label>
                <input type="text" class="form-control" name="name" id="name" value="${user.name }">
                <div id="namesId"></div>
            </div>
            <div class="form-group">
                <label>学号：</label>
                <input type="text" class="form-control " name="schoolnum" id="schoolnum" value="${user.schoolnum }">
                <div id="xuehaoId"></div>
            </div>
            <div class="form-group">
                <label>学院：</label>
                <input type="text" class="form-control " name="college" id="college" value="${user.college }">
                <div id="xueyuanId"></div>
            </div>
            <div class="form-group">
                <label>专业：</label>
                <input type="text" class="form-control " name="majorin" id="majorin" value="${user.majorin }">
                <div id="zhuanyeId"></div>
            </div>
            <div class="form-group">
                <label>QQ：</label>
                <input type="text" class="form-control " name="qq" id="qq" value="${user.qq }">
                <div id="qqId"></div>
            </div>
            <div class="form-group">
                <label>联系电话：</label>
                <input type="text" class="form-control " name="tel" id="tel" value="${user.tel }">
                <div id="dianhuaId"></div>
            </div>
            <div class="form-group">
                <label>组别：</label>
                <input type="text" class="form-control radio-inline" name="group"  value="${user.group }">
            </div>

            <input class="btn1 btn-primary" type="submit" value="确定修改"/>
        </form>
    </div>
</div>
</body>
</html>
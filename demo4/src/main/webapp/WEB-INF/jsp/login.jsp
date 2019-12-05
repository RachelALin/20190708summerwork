<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/7/30
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>咸鱼头条</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/xy.css">

</head>
<body>
<div class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="xianyu.html">
            </a>
            <ul class="nav navbar-nav">
                <li class="active"><a href="xianyu.html">首页</a></li>
                <li><a href="http://tv.cctv.com/live/cctv1/">国内</a></li>
                <li><a href="http://tv.cctv.com/live/cctv1/">国际</a></li>
                <li><a href="http://tv.cctv.com/lm/zfj/">致富</a></li>
                <li><a href="https://baike.baidu.com/item/%E7%A4%BE%E4%BC%9A%E4%B8%BB%E4%B9%89%E6%A0%B8%E5%BF%83%E4%BB%B7%E5%80%BC%E8%A7%82/3271832?fr=aladdin">社会</a></li>
            </ul>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li class="active"><a href="login.html">登陆</a></li>
            <li><a href="signup.html">注册</a></li>
        </ul>
    </div>
</div>
<div class="container container-small">
    <h1>登录
        <small>没有账号？<a href="signup.html">注册</a></small>
    </h1>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <div class="form-group">
            <label>用户名/手机号码/邮箱</label>
            <input type="text" class="form-control" name="username">
        </div>
        <div class="form-group">
            <label>密码</label>
            <input type="password" class="form-control" name="password">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">登陆</button>
        </div>
        <div class="form-group">
            <a href="#">
                忘记密码？
            </a>

        </div>
    </form>
</div>
<div class="footer">
    ©2018 咸鱼 使用咸鱼前必读 | 关于咸鱼 | 联系咸鱼 | 表情包 | 咸ICP证040186号
</div>
</body>
</html>

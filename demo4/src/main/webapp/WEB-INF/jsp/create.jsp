<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<%--若是en则网页会提示是否需要翻译，若是zh-cn则不会提示--%>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>CREARTE</title>

    <!-- Custom fonts for this template-->
    <link href="${pageContext.request.contextPath}/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="${pageContext.request.contextPath}/css/sb-admin-2.min.css" rel="stylesheet">
<%--    <script src="${pageContext.request.contextPath}/js/sb-admin-2.min.js"></script>--%>

</head>

<body class="bg-gradient-primary">

<div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
        <div class="card-body p-0">
            <!-- Nested Row within Card Body -->
            <div class="row">
                <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                <div class="col-lg-7">
                    <div class="p-5">
                        <div class="text-center">
                            <h1 class="h4 text-gray-900 mb-4">Create an information!</h1>
                        </div>
                        <form class="user" action="${pageContext.request.contextPath}/update" method="post">
                            <div class="form-group row">
<%--                                <div class="col-sm-6 mb-3 mb-sm-0" >--%>
<%--                                    <input type="hidden" class="form-control form-control-user" name="id" placeholder="id" value="${user.id}">--%>
<%--                                </div>--%>
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                    <input type="hidden" class="form-control form-control-user" name="id" placeholder="id" value="${user.id}">
                                    <input type="text" class="form-control form-control-user" name="name" placeholder="name" value="${user.name}">
                                </div>
                                <div class="col-sm-6">
                                    <input type="email" class="form-control form-control-user" name="email" placeholder="email" value="${user.email}">
                                </div>
                            </div>

                            <div class="form-group row">
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                    <input type="text" class="form-control form-control-user" name="age" placeholder="age" value="${user.age}">
                                </div>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control form-control-user" name="sex" placeholder="sex" value="${user.sex}">
                                </div>
                            </div>

                            <div class="form-group row">
                                <div class="col-sm-6" style="margin: 0 auto;">
                                    <input type="submit" class="form-control form-control-user" value="update">
                                </div>
                            </div>
                            <hr>

                        </form>
                        <hr>
                        <div class="text-center">
                            <a class="small" href="forgot-password.html">Forgot Password?</a>
                        </div>
                        <div class="text-center">
                            <a class="small" href="login.html">Already have an account? Login!</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

<!-- Bootstrap core JavaScript-->
<script src="${pageContext.request.contextPath}/vendor/jquery/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="${pageContext.request.contextPath}/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="${pageContext.request.contextPath}/js/sb-admin-2.min.js"></script>

</body>

</html>


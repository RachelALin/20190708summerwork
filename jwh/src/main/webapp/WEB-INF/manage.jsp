<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false"%>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/7/25
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>后台</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">

    <style type="text/css">

        .black{color: #6e6262;}
    </style>

</head>


<!-- 导航栏 -->

<nav class="navbar navbar-default has-primary">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <!--    标题名navbar-brand -->
            <a class="navbar-brand" href="#">BACK_MANAGEMENT</a>
        </div>
        <div class="form-group">
            <form action="${pageContext.request.contextPath}/searchServlet" method="post">
                学号:<input type="text" name="schoolnum">
                <input type="submit" value="查找">
            </form>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

            <form class="navbar-form navbar-left">



                <!-- Button trigger modal -->
                <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal1" id="a3">
                    添加
                </button>

                <!-- Modal -->
                <div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel1">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="myModalLabel1">Modal title</h4>
                            </div>
                            <div class="modal-body">

<%--                                <form action="${pageContext.request.contextPath}/useraddServlet" method="get">--%>

                                        姓名:<input type="text" name="name"><br>
                                        学号:<input type="text" name="schoolnum"><br>
                                        学院:<input type="text" name="college"><br>
                                        专业:<input type="text" name="majorin"><br>
                                        QQ:<input type="text" name="qq"><br>
                                        联系电话:<input type="text" name="tel"><br>
                                        组别:<input type="text" name="group"><br>
                                        <input type="submit" value="提交">

<%--                                </form>--%>

                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                <button type="button" class="btn btn-primary">Save changes</button>
                            </div>
                        </div>
                    </div>
                </div>


            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#" data-toggle="modal" data-target="#myModal">登录</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">管理员 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">个人资料</a></li>
                        <li><a href="#">设置</a></li>
                        <li><a href="#">帮助</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">退出登录</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<div class="container">
    <div class="col-md-3">
        <!-- <div class="panel panel-default">
            <div class="panel-body"> -->
        <!-- 菜单栏 -->

        <ul class="nav nav-pills nav-stacked has-primary" >
            <li role="presentation" class="">
                <a href="#" data-toggle="collapse" data-target="#list" class="black">后台菜单</a>
                <ul id="list" class="collapse">
                    <li class="">
                        <a href="#" data-toggle="collapse" data-target="#list2" class="black">按年级</a>
                        <ul id="list2" class="collapse">
                            <li onclick="show()">按班级</a>
                            </li>
                            <li><a href="" class="black">按专业</a></li>
                        </ul>
                    </li>
                    <li><a href="" class="black">按组别</a></li>
                </ul>
            </li>

            <li role="presentation"><a href="#" class="black">咨询平台</a></li>
            <li role="presentation"><a href="#" class="black">帮助</a></li>
            <li role="presentation"><a href="#" class="black">关于系统</a></li>
            <li role="presentation"><a href="#" class="black" onclick="zhuce()">关于注册</a></li>
        </ul>
    </div>


    <div class="col-md-9 ma zc">
        <div class="row">
            <form action="${pageContext.request.contextPath}/adminServlet" method="get">
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

                    <c:forEach items="${list}" var="l">
                        <tr>

                            <td><c:out value="${l.name}"/></td>
                            <td><c:out value="${l.schoolnum}"/></td>
                            <td><c:out value="${l.college}"/></td>
                            <td><c:out value="${l.majorin}"/></td>
                            <td><c:out value="${l.qq}"/></td>
                            <td><c:out value="${l.tel}"/></td>
                            <td><c:out value="${l.group}"/></td>

                            <th>
                                <a  href="${pageContext.request.contextPath}/DeleteServlet?schoolnum=${l.schoolnum}" onclick="return window.confirm('确认删除吗?')" class="btn btn-danger">删除</a>
                            </th>

                        </tr>
                    </c:forEach>

                </table>
            </form>
        </div>

    </div>



    <!-- 模态框 -->
    <!-- Button trigger modal -->
    <!-- <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
      Launch demo modal
    </button> -->

    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">管理员登录</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal"  onsubmit="return validate_form(this)" method="post" >
                        <div class="form-group">
                            <label for="inputEmail3" class="col-sm-2 control-label">账号</label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" id="inputEmail3" placeholder="账号">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" id="inputPassword3" placeholder="密码">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox">记住密码
                                    </label>
                                </div>
                            </div>
                        </div>

                    </form>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" value="Submit" >Save changes</button>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>


    <div class="row"></div>
    <div class="row">
        <div class="col-md-6"></div>
        <div class="col-md-6"></div>
    </div>
    <div class="row">
        <form action="${pageContext.request.contextPath}/updateServlet" method="get">
            姓名:<input type="text" name="name"><br>
            学号:<input type="text" name="schoolnum"><br>
            学院:<input type="text" name="college"><br>
            专业:<input type="text" name="majorin"><br>
            QQ:<input type="text" name="qq"><br>
            联系电话:<input type="text" name="tel"><br>
            组别:<input type="text" name="group"><br>
            <input type="submit" value="修改">
        </form>
    </div>
</div>

<script type="text/javascript">
   /* //查找
    function myFunction() {
        var input, table, tr, td, i, filter;
        input = document.getElementById("a1");
        filter = input.value.toUpperCase();
        table = document.getElementById("b1");
        tr = table.getElementsByTagName("tr");
        for (var i = tr.length - 1; i > 0; i--) {
            td = tr[i].getElementsByTagName("td")[1];
            if (td) {
                if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                    tr[i].style.display = "";
                } else {
                    tr[i].style.display = "none";
                }
            }
        }
    }*/
       $(document).ready(function(){
           $("button").click(function(){
               alert($(":text").val());
           });
       });
        //取消查找
        function cancel(){
            document.getElementById("a1").value="";
            var table,tr,td,i;
            table=document.getElementById("b1");
            tr = table.getElementsByTagName("tr");
            for (var i = tr.length - 1; i >= 0; i--){
                tr[i].style.display="";
            }
        }

    $('#myModal').on('shown.bs.modal', function () {
        $('#myInput').focus()
    })
</script>


</body>
</html>
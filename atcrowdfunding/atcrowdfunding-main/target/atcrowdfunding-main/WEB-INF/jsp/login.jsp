<%--
  Created by IntelliJ IDEA.
  User: XXIAO
  Date: 2020/8/31
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="keys" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="static/css/font-awesome.min.css">
    <link rel="stylesheet" href="static/css/login.css">
    <style>

    </style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <div><a class="navbar-brand" href="index.html" style="font-size:32px;">尚筹网-创意产品众筹平台</a></div>
        </div>
    </div>
</nav>

<div class="container">

    <form id="loginForm" class="form-signin" role="form" action="dologin" method="post">
        <h2 class="form-signin-heading"><i class="glyphicon glyphicon-log-in"></i> 用户登录</h2>
        <c:if test="${not empty message}">
        <div class="form-group has-success has-feedback">
            ${message }
        </div>
        </c:if>
        <div class="form-group has-success has-feedback">

            <input type="text" class="form-control" id="loginacct" name="loginacct" v<%--value="${param.loginacct}" --%> value="zhangsan" placeholder="请输入登录账号" autofocus>
            <span class="glyphicon glyphicon-user form-control-feedback"></span>

        </div>
        <div class="form-group has-success has-feedback">
            <input type="password" class="form-control" id="userpwd" name="userpwd" placeholder="请输入登录密码" value="123456" style="margin-top:10px;">
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
        </div>

        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> 记住我
            </label>
            <br>
            <label>
                忘记密码
            </label>
            <label style="float:right">
                <a href="reg.html">我要注册</a>
            </label>
        </div>
        <a class="btn btn-lg btn-success btn-block" onclick="dologin()" > 登录</a>
    </form>
</div>
<%--<script src="static/jquery/jquery-2.1.1.min.js"></script>--%>
<%--<script src="static/bootstrap/js/bootstrap.min.js"></script>--%>
<%@include file="/WEB-INF/jsp/js.jsp"%>
<script>
    function dologin() {
        // var type = $(":selected").val();
        // if ( type == "user" ) {
        //     window.location.href = "main.html";
        // } else {
        //     window.location.href = "index.html";
        // }

        let loginacct = $("#loginacct").val()
        let userpwd = $("#userpwd").val()

        if ($.trim(loginacct) == ""){

            layer.msg("用户名不能为空",{time:2000,icon:5})
            return  false
        }

        if ($.trim(userpwd).length < 3 ){
            layer.msg("密码位数不能小于3",{time:2000,icon:5})
            return  false
        }



        $("#loginForm").submit()
    }
</script>
</body>
</html>
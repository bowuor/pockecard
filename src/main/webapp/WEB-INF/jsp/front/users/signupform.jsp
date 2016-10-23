<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/resources/images/ic_launcher2.png">

    <title>REGISTER</title>

    <!-- Bootstrap core CSS -->
    <link type="text/css" href="/resources/components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link type="text/css" href="/resources/css/dashboard.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script type="application/javascript" src="/resources/js/ie10-viewport-bug-workaround.js"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script type="application/javascript" src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script type="application/javascript" src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="body-Login-back">

<div class="login-container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4 text-center logo-margin ">
            <a href="/"><img src="/resources/images/logosmall.png" alt=""/></a>
        </div>
        <div class="col-md-offset-4 col-md-4 main text-center logo-margin">
            <div class="login-panel panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Admin Signup</h3>
                </div>
            <form:form acceptCharset="UTF-8" action="/users/signup" method="post" modelAttribute="user" cssClass="form-horizontal" role="form">
                <div class="form-group">
                    <div class="col-sm-12">
                        <form:input path="loginId" id="loginId" type="text" cssClass="form-control" placeholder="Username" />
                        <form:errors path="loginId" cssClass="form-inline" />
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-12">
                        <form:input path="email" id="email" type="email" cssClass="form-control" placeholder="email" />
                        <form:errors path="email" cssClass="form-inline" />
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-12">
                        <form:input path="name" id="name" type="text" cssClass="form-control" placeholder="Name"/>
                        <form:errors path="name" cssClass="form-inline" />
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-12">
                        <form:input path="password" id="password" type="password" cssClass="form-control" placeholder="Password" />
                        <form:errors path="password" cssClass="form-inline" />
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-12">
                        <input class="login-btn btn-success" type="submit" value="Submit">
                    </div>
                </div>
            </form:form>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="/WEB-INF/jsp/common/head.jsp">
        <jsp:param name="title" value="POCKECARD"/>
    </jsp:include>
    <link type="text/css" href="/resources/css/carousel.css" rel="stylesheet">
</head>

<jsp:include page="/WEB-INF/jsp/common/topmenu.jsp"/>

<body class="body-Login-back">

<div class="login-container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4 text-center logo-margin ">

        </div>
        <div class="col-md-offset-4 col-md-4 main text-center logo-margin">
            <div class="login-panel panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Admin Signup</h3>
                </div>
            <form:form acceptCharset="UTF-8" action="/users/signup" method="post" modelAttribute="user" cssClass="form-horizontal" role="form">
                <div class="panel-body">
                    <div class="form-group">
                        <div class="col-sm-12">
                            <form:input path="name" id="name" type="text" cssClass="form-control" placeholder="Name"/>
                            <form:errors path="name" cssClass="form-inline" />
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
                            <form:input path="loginId" id="loginId" type="text" cssClass="form-control" placeholder="Username" />
                            <form:errors path="loginId" cssClass="form-inline" />
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

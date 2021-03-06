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
        <div class="col-md-4 col-md-offset-4 main">
            <c:if test="${isFailed}">
                <div class="col-md-12">
                    <div class="alert alert-danger">
                        <span class="red-text text-darken-2">Login failed due to ${SPRING_SECURITY_LAST_EXCEPTION.message}</span>
                    </div>
                </div>
            </c:if>
            <div class="login-panel panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Sign in</h3>
                </div>
                <div class="panel-body">
                    <form:form acceptCharset="UTF-8" action="/users/login" method="post" cssClass="form-horizontal" role="form">
                        <div class="form-group">
                            <div class="col-sm-12">
                                <input type="text" name="username" id="username" class="form-control" placeholder="Username or Email" required autofocus>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-12">
                                <input type="password" name="password" id="password" class="form-control" placeholder="Password" required>
                            </div>
                        </div>
                            <div class="checkbox">
                                <label>
                                    <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                </label>
                            </div>
                        <div class="form-group">
                            <div class="col-sm-12">
                                <input class="login-btn btn-success" type="submit" value="Login">
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">POCKECARD</a>
        </div>
        <div class="navbar-collapse collapse">
                <%--<div class="panel-body">
                    <form:form acceptCharset="UTF-8" action="/users/login" method="post" cssClass="form-horizontal" role="form">
                        <input class="form-control" placeholder="Username or email" name="username" id="username" type="username" autofocus required>
                        <input class="form-control" placeholder="Password" name="password" id="password" type="password" required>
                        <input class="btn btn-sm btn-success" type="submit" value="Login">
                    </form:form>
                </div>--%>
            <ul class="nav navbar-nav navbar-right">
                <sec:authorize access="isAnonymous()">
                    <li><a href="/users/signupform">Signup</a></li>
                    <li><a href="/users/loginform">Login</a></li>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <sec:authentication property="principal" var="principal" />
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">New<span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="#">Test</a></li>
                            <li><a href="#">Group</a></li>
                        </ul>
                    </li>
                    <li><a href="#">${principal.user.name}</a></li>
                    <li><a href="/users/logout">Logout</a></li>
                </sec:authorize>
            </ul>
            <%--<form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Search...">
            </form>--%>
        </div>
    </div>
</div>
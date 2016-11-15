<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<body class="skin-blue sidebar-mini">
<div class="wrapper">
 <header class="main-header">
    <!-- Logo -->
    <a href="/admin/" class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>A</b>P</span>
        <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>Admin</b>Panel</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top" role="navigation">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>
        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="/resources/images/default.png" class="user-image" alt="User image">
                        <sec:authorize access="isAuthenticated()">
                            <sec:authentication property="principal" var="principal"/>
                            <span class="hidden-xs">${principal.user.loginId}</span>
                        </sec:authorize>

                    </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header">
                                <img src="/resources/images/default.png" class="user-image" alt="User image">
                            <p>
                                <sec:authorize access="isAuthenticated()">
                                    <sec:authentication property="principal" var="principal"/>
                                    <span class="hidden-xs">${principal.user.loginId}</span>
                                </sec:authorize>
                                <small>Administrator</small>
                            </p>
                        </li>
                        <!-- Menu Body -->
                        <li class="user-body">
                            <div class="col-xs-12 text-center">
                                <a href="/">Site Home</a>
                            </div>
                        </li>
                        <!-- Menu Footer-->
                        <li class="user-footer">
                            <div class="pull-left">
                                <a href="#" class="btn btn-default btn-flat">Profile</a>
                            </div>
                            <div class="pull-right">
                                <form:form method="post" action="/users/logout">
                                    <input class="btn btn-default btn-flat" type="submit" value="Sign out">
                                </form:form>
                            </div>
                        </li>
                    </ul>
                </li>
                <!-- Control Sidebar Toggle Button -->
                <li>
                    <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
                </li>
            </ul>
        </div>
    </nav>
</header>

<!-- Left side column. contains the logo and sidebar -->
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="/resources/images/default.png" class="img-circle" alt="User image">
            </div>
            <div class="pull-left info">
                <p>
                    <sec:authorize access="isAuthenticated()">
                        <sec:authentication property="principal" var="principal"/>
                        <span class="hidden-xs">${principal.user.loginId}</span>
                    </sec:authorize>
                </p>

                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
        <!-- search form -->
        <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
                <input type="text" name="q" class="form-control" placeholder="Search..."/>
          <span class="input-group-btn">
            <button type='submit' name='search' id='search-btn' class="btn btn-flat"><i class="fa fa-search"></i></button>
          </span>
            </div>
        </form>
        <!-- /.search form -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">NAVIGATION</li>
            <li>
                <a href="/admin/home"><i class="fa fa-tachometer"></i> <span>Dashboard</span></a>
            </li>
            <li>
                <a href="/admin/school"><i class="fa fa-files-o"></i> <span>Schools</span></a>
            </li>
            <li>
                <a href="/admin/users"><i class="fa fa-files-o"></i> <span>Users</span></a>
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o"></i> <span>Transactions</span></a>
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o"></i> <span>Reconciliation</span></a>
            </li>
            <li>
                <a href="/admin/reports"><i class="fa fa-files-o"></i> <span>Reports</span></a>
            </li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">

    <!-- Main content -->
    <section class="content">





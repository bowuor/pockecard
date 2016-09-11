<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="/WEB-INF/jsp/common/adminHeader.jsp">
        <jsp:param name="title" value="POCKECARD"/>
    </jsp:include>

    <link href="/resources/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
</head>
<jsp:include page="/WEB-INF/jsp/common/adminHead.jsp"/>

<!-- Carousel
================================================== -->
<%--body--%>
<div class="box">
    <div class="box-header with-border">
        <h3 class="box-title">POCKECARD ADMIN</h3>
        <div class="box-tools">

            <%--<div class="input-group">--%>
                <%--<input type="text" name="table_search" class="form-control input-sm pull-right" style="width: 150px;" placeholder="Search"/>--%>
                <%--<div class="input-group-btn">--%>
                    <%--<button class="btn btn-sm btn-default"><i class="fa fa-search"></i></button>--%>
                <%--</div>--%>
            <%--</div>--%>
        </div>
    </div><!-- /.box-header -->
    <div class="box-body table-responsive no-padding">
        <div class="row">
            <div class="col-lg-8">

                <!--Transactions chart-->
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <i class="fa fa-bar-chart-o fa-fw"></i>Sales Summary
                    </div>

                    <div class="panel-body">
                        <div id="morris-area-chart"></div>
                    </div>

                </div>
                <!--End transactions chart -->
                <!--Simple table -->
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <i class="fa fa-bar-chart-o fa-fw"></i>Settlement
                        <div class="pull-right">
                            <div class="btn-group">
                                <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">
                                    Options
                                    <span class="caret"></span>
                                </button>
                                <ul class="dropdown-menu pull-right" role="menu">
                                    <li><a href="#">Sort</a>
                                    </li>
                                    <li><a href="#">Filter</a>
                                    </li>
                                    <li><a href="#">Search</a>
                                    </li>
                                    <li class="divider"></li>
                                    <li><a href="#">Clear</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>

                    <div class="panel-body">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="table-responsive">
                                    <table class="table table-bordered table-hover table-striped">
                                        <thead>
                                        <tr>
                                            <th>Date</th>
                                            <th>School</th>
                                            <th>Trxn Count</th>
                                            <th>Amount (Kes.)</th>
                                            <th>Status</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${schoolPage.content}" var="item">
                                            <tr>
                                                <td>${item.date}</td>
                                                <td>${item.name}</td>
                                                <td>${item.description}</td>
                                                <td></td>
                                                <td></td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div>

                            </div>

                        </div>
                        <!-- /.row -->
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!--End simple table -->

            </div>

            <div class="col-lg-4">
                <!-- Donut -->
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <i class="fa fa-bar-chart-o fa-fw"></i>Sales Chart
                    </div>
                    <div class="panel-body">
                        <div id="morris-donut-chart"></div>
                        <a href="#" class="btn btn-default btn-block">View Details</a>
                    </div>
                </div>
                <!--End Donut-->
                <div class="panel panel-primary text-center no-boder">
                    <div class="panel-body yellow">
                        <i class="fa fa-bar-chart-o fa-3x"></i>
                        <h3>800,000</h3>
                    </div>
                    <div>
                        <a href="#" class="btn btn-default btn-block">Total Students</a>
                    </div>
                </div>
                <div class="panel panel-primary text-center no-boder">
                    <div class="panel-body blue">
                        <i class="fa fa-pencil-square-o fa-3x"></i>
                        <h3>206 </h3>
                    </div>
                    <div>
                        <a href="#" class="btn btn-default btn-block">Pending Payments</a>
                    </div>
                </div>
                <div class="panel panel-primary text-center no-boder">
                    <div class="panel-body green">
                        <i class="fa fa fa-floppy-o fa-3x"></i>
                        <h3>2,000</h3>
                    </div>
                    <div>
                        <a href="#" class="btn btn-default btn-block">Top-Ups</a>
                    </div>
                </div>
                <div class="panel panel-primary text-center no-boder">
                    <div class="panel-body red">
                        <i class="fa fa-thumbs-up fa-3x"></i>
                        <h3>7,000 </h3>
                    </div>
                    <div>
                        <a href="#" class="btn btn-default btn-block">Registered Schools</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- end page-wrapper -->

</div>
<!-- end wrapper -->

    </div>
</div>
<%--end body--%>
<!-- start of footer section -->

<jsp:include page="/WEB-INF/jsp/common/adminFooter.jsp"/>
</html>

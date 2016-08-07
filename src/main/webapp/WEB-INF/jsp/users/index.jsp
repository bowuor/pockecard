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
    <link href="assets/plugins/morris/morris-0.4.3.min.css" rel="stylesheet" />
</head>
<jsp:include page="/WEB-INF/jsp/common/usersHead.jsp"/>

<!-- Carousel
================================================== -->
<%--body--%>
<div class="box">
    <div class="box-header with-border">
        <h3 class="box-title">POCKECARD MANAGER</h3>
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
                <c:choose>
                    <c:when test="${school ==null}">
                        <h3> Not yet Assigned</h3>
                    </c:when>
                    <c:otherwise>
                        <h3>${school.name}</h3>
                    </c:otherwise>
                </c:choose>
            </div>
        <!--Simple table -->
            <div class="col-lg-8">
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
                                        <th>Trxn Count</th>
                                        <th>Amount (Kes.)</th>
                                        <th>Status</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>21 July 2016</td>
                                        <td>324</td>
                                        <td>250,000.00</td>
                                        <td>Unpaid</td>
                                    </tr>
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
            <div class="panel panel-primary text-center no-boder">
                <div class="panel-body yellow">
                    <i class="fa fa-bar-chart-o fa-3x"></i>
                    <h3>800  </h3>
                </div>
                <div class="panel-footer">
            <span class="panel-eyecandy-title">issued Students ID
            </span>
                </div>
            </div>
            <div class="panel panel-primary text-center no-boder">
                <div class="panel-body blue">
                    <i class="fa fa-pencil-square-o fa-3x"></i>
                    <h3>75 </h3>
                </div>
                <div class="panel-footer">
            <span class="panel-eyecandy-title">Total Items
            </span>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- end page-wrapper -->
</div>
<%--end body--%>
<!-- start of footer section -->

<jsp:include page="/WEB-INF/jsp/common/adminFooter.jsp"/>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Ben
  Date: 07-Jul-16
  Time: 10:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="col-sm-3 blog-sidebar">
    <%--<h4>Search our Products</h4>
    <form>
        <div class="input-group">
            <input class="form-control input-md" id="appendedInputButtons" type="text">
                    <span class="input-group-btn">
                        <button class="btn btn-md" type="button">Search</button>
                    </span>
        </div>
    </form>--%>
    <h4>Links</h4>
    <ul class="recent-posts">
        <li><a href="pronto.html">Pronto</a></li>
        <li><a href="emergency-loan.html">Emergency Loan</a></li>
        <li><a href="development-loan.html">Development Loan</a></li>
        <li><a href="movable-asset-financing.html">Movable Asset Financing</a></li>
        <li><a href="fixed-asset-financing.html">Fixed Asset Financing</a></li>
    </ul>
    <h4>Other Products</h4>
    <ul class="blog-categories">
        <li><a href="#">Shares</a></li>
        <li><a href="#">Deposits</a></li>
    </ul>
</div>

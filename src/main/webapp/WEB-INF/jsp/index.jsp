<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="/WEB-INF/jsp/common/head.jsp">
        <jsp:param name="title" value="POCKECARD | About"/>
    </jsp:include>
    <link type="text/css" href="/resources/css/carousel.css" rel="stylesheet">
</head>

<body style="background-color: #000">
<jsp:include page="/WEB-INF/jsp/common/topmenu.jsp"/>

<!-- Carousel
================================================== -->
<!-- contact section -->
<sec:authorize access="isAuthenticated()">
    <sec:authentication property="principal" var="principal" />
        <section id="contact">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 col-sm-12 text-center">
                        <div class="section-title">
                            <h1> &nbsp;</h1>
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-12">
                        <div>
                            <h3>NOTICEBOARD</h3>
                            <hr>
                        </div>
                        <div id="notice" class="col-md-12 col-sm-12">
                            <p>POCKECARD is still under development<br>Login to see the trial version with the following credentials:</p>
                            <p>User: test<br>Password: test1234</p>
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-12">
                        <h3>FEEDBACK & SUPPORT</h3>
                        <hr>
                        <div class="col-md-6 col-sm-4">
                            <p>EMAIL: <a href="mailto:support@pockecard.co.ke">support@pockecard.co.ke</a></p>
                        </div>
                        <div>
                            <p>PHONES: 0725-980-165 | 0726-457-704</p>
                        </div>
                        <div>
                            <form action="#" method="get">
                                <div class="col-md-6 col-sm-6">
                                    <input type="text" class="form-control" placeholder="Name" name="name">
                                </div>
                                <div class="col-md-6 col-sm-6">
                                    <input type="email" class="form-control" placeholder="Email" name="email">
                                </div>
                                <div class="col-md-12 col-sm-12">
                                    <textarea class="form-control" placeholder="Message" rows="7" name="message"></textarea>
                                </div>
                                <div class="col-md-6 col-sm-6">
                                    <input type="submit" class="form-control" value="SEND MESSAGE">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
</sec:authorize>

<sec:authorize access="isAnonymous()">
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="item active">
                <img src="/resources/images/breaktime.jpg" alt="First slide">
                <div class="container">
                    <div class="carousel-caption ">
                        <h1>Pocket Money Management</h1>
                        <p>PockeCard help schools manage goods sold at school canteens and allows parents monitor how pocket money is spent at school.</p>
                        <%--<p><a class="btn btn-lg btn-primary" href="#" role="button">Sign up today</a></p>--%>
                    </div>
                </div>
            </div>
            <div class="item">
                <img src="/resources/images/images-1.jpg" alt="Second slide">
                <div class="container">
                    <div class="carousel-caption">
                        <h1>School Fees Provision</h1>
                        <p></p>
                        <%--<p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>--%>
                    </div>
                </div>
            </div>
            <div class="item">
                <img src="/resources/images/3.jpg" alt="Third slide">
                <div class="container">
                    <div class="carousel-caption">
                        <h1>A united fraternity for success</h1>
                        <p></p>
                        <%--<p><a class="btn btn-lg btn-primary" href="#" role="button">Browse gallery</a></p>--%>
                    </div>
                </div>
            </div>
        </div>
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
    </div>
</sec:authorize>
<!-- /.carousel -->



<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<%--<div class="container marketing">

    <!-- Three columns of text below the carousel -->
    <div class="row">
        <div class="col-lg-4">
            <img class="img-circle" src="/resources/images/images-1.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
            <h2>Heading</h2>
            <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>
            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
            <img class="img-circle" src="/resources/images/images-1.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
            <h2>Heading</h2>
            <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.</p>
            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
            <img class="img-circle" src="/resources/images/images-2.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
            <h2>Heading</h2>
            <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
    </div><!-- /.row -->


    <!-- START THE FEATURETTES -->

    <hr class="featurette-divider">

    <div class="row featurette">
        <div class="col-md-7">
            <h2 class="featurette-heading">First featurette heading. <span class="text-muted">It'll blow your mind.</span></h2>
            <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
        </div>
        <div class="col-md-5">
            <img class="featurette-image img-responsive" src="/resources/images/images-2.jpg" alt="Generic placeholder image">
        </div>
    </div>

    <hr class="featurette-divider">

    <div class="row featurette">
        <div class="col-md-5">
            <img class="featurette-image img-responsive" src="/resources/images/images-1.jpg" alt="Generic placeholder image">
        </div>
        <div class="col-md-7">
            <h2 class="featurette-heading">Oh yeah, it's that good. <span class="text-muted">See for yourself.</span></h2>
            <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
        </div>
    </div>

    <hr class="featurette-divider">

    <div class="row featurette">
        <div class="col-md-7">
            <h2 class="featurette-heading">And lastly, this one. <span class="text-muted">Checkmate.</span></h2>
            <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
        </div>
        <div class="col-md-5">
            <img class="featurette-image img-responsive" src="/resources/images/images-3.jpg" alt="Generic placeholder image">
        </div>
    </div>

    <hr class="featurette-divider">--%>

    <!-- /END THE FEATURETTES -->


    <!-- FOOTER -->
    <footer>
        <h5 style="text-align: center;">&copy; 2016-POCKECARD &middot; All Rights Reserved &middot; <a href="#">Privacy Policy</a> &middot; <a href="#">Terms of Service</a> &middot; Powered by <a href="https://necxuss.co.ke">Necxuss</a></h5>
    </footer>

<!-- /.container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="/resources/components/jquery/dist/jquery.min.js"></script>
<script src="/resources/components/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="/resources/components/holderjs/holder.js"></script>
</body>
</html>

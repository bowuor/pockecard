<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="/WEB-INF/jsp/common/head.jsp">
        <jsp:param name="title" value="POCKECARD"/>
    </jsp:include>
    <link type="text/css" href="/resources/css/carousel.css" rel="stylesheet">
</head>

<body>
<jsp:include page="/WEB-INF/jsp/common/topmenu.jsp"/>

    <!-- Carousel
    ================================================== -->
<section id="home">
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="item active">
                <img src="/resources/images/4.jpg" alt="First slide">
                <div class="container">
                    <div class="carousel-caption ">
                        <p>Payments the 'Pocke' way</p>
                        <%--<p><a class="btn btn-lg btn-primary" href="#" role="button">Sign up today</a></p>--%>
                    </div>
                </div>
            </div>
            <div class="item">
                <img src="/resources/images/breaktime.jpg" alt="Second slide">
                <div class="container">
                    <div class="carousel-caption">
                        <p>Promote order and efficiency in our schools</p>
                        <%--<p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>--%>
                    </div>
                </div>
            </div>
            <div class="item">
                <img src="/resources/images/3.jpg" alt="Third slide">
                <div class="container">
                    <div class="carousel-caption">
                        <p>Join a fraternity united for success</p>
                        <%--<p><a class="btn btn-lg btn-primary" href="#" role="button">Browse gallery</a></p>--%>
                    </div>
                </div>
            </div>
        </div>
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
    </div>
</section>

<%--services secton--%>
<section id="services">
    <div class="container">
        <div class="row">
            <div class="col-md-12 col-sm-12">
                <div class="section-title">
                    <h1 class="heading bold">Services</h1>
                    <hr>
                </div>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-4 wow fadeInUp" data-wow-delay="0.6s">
                <img src="/resources/images/images.png">
                <h3>PAYMENTS</h3>
                <hr>
                <p>PockeCard facilitates making payments for the many transactions made by students throughout their daily activities and stay at schools.<br><br>We relieve schools from the extra burden of managing students' finances leaving only the core functions.</p>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-4 wow fadeInUp" data-wow-delay="0.9s">
                <img src="/resources/images/remmit.jpg">
                <h3>REMMITANCES</h3>
                <hr>
                <p>PockeCard offers a means for parents to remit finances to their students at their own convenience and at preferred intervals.<br><br> This eliminates the worries of giving too much money to students and risk of loss.</p>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-4 wow fadeInUp" data-wow-delay="1s">
                <img src="/resources/images/control.jpg">
                <h3>CONTROL</h3>
                <hr>
                <p>PockeCard ensure students' expenses are monitored by the parents and at the same time controlled by the school to ensure good health and co-existence.<br><br> This gives both parties peace of mind knowing that their students are safer with no avenue for vices.</p>
            </div>
        </div>
    </div>
</section>

<!--about section -->
<section id="about">
    <div class="container">
        <div class="row">
            <div class="col-md-12 col-sm-12 text-center">
                <div class="section-title">
                    <h1 class="heading bold">About us</h1>
                    <hr>
                </div>
            </div>
            <div class="col-md-6 col-sm-12">
                <img src="/resources/images/about.jpg" class="img-responsive" alt="about img">
            </div>
            <div class="col-md-6 col-sm-12">
                <h2 class="bold">PockeCard</h2>
                <h4><em>School payments, the easy way</em></h4>
                <p>PockeCard focuses on bringing technology to the way payments are made in the education fraternity in an effort to provide the following benefits to:</p>
                <!-- Nav tabs -->
                <ul class="nav nav-tabs" role="tablist">
                    <li class="active"><a href="#parents" aria-controls="parents" role="tab" data-toggle="tab">Parents</a></li>
                    <li><a href="#schools" aria-controls="schools" role="tab" data-toggle="tab">Schools</a></li>
                    <li><a href="#students" aria-controls="students" role="tab" data-toggle="tab">Students</a></li>
                    <!--<li><a href="#refine" aria-controls="refine" role="tab" data-toggle="tab">REFINE</a></li>-->
                </ul>
                <!-- tab panes -->
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active" id="parents">
                        <li>Ease of sending money to students directly</li>
                        <li>Ability to monitor students' expense patterns</li>
                        <li>Pay fees conveniently</li>
                        <li>Control student expenditure in order to discipline </li>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="schools">
                        <li>Curb vices among students (drinking, smoking, theft, etc)</li>
                        <li>Control what is sold to students</li>
                        <li>Relieve manual issuance of cash to students</li>
                        <li>Reduce cases of discrimination among students</li>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="students">
                        <li>Peace of mind knowing their money is safe</li>
                        <li>Make easy, safe and convenient payments</li>
                        <li>Develop a saving culture</li>
                    </div>
                    <!--<div role="tabpanel" class="tab-pane" id="refine">
                        <p>Pellentesque elementum, lacus sit amet <a href="#">hendrerit</a> posuere, quam quam tristique nisi, nec ornare ligula magna id nisl. Donec blandit enim ac semper facilisis. Curabitur eu laoreet mauris, eget fermentum velit.</p>
                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet. Dolore magna aliquam erat volutpat.</p>
                    </div>-->
                </div>
            </div>
        </div>
    </div>
</section>

<!-- contact section -->
<section id="contact">
    <div class="container">
        <div class="row">
            <div class="col-md-12 col-sm-12 text-center">
                <div class="section-title">
                    <h6>Are you an School administrator and need to control expenses in your School Canteen?</h6>
                    <h1 class="heading bold">Get in touch</h1>
                    <h6>Join the 'Pocke' Fraternity</h6>
                    <hr>
                </div>
            </div>
            <div class="col-md-6 col-sm-12 contact-info">
                <div class="col-md-3 col-xs-6 text-center">
                    <h3><i data-wow-delay="0.6s"></i>Call us:</h3>
                    <p>0725-980-165</p>
                    <p>0704-033-581</p>
                </div>
                <div class="col-md-12 col-sm-8">
                    <h3><i data-wow-delay="0.6s"></i>Follow us:</h3>
                    <ul class="social-icon">
                        <li><a href="https://facebook.com/PockeCardKE"><img src="/resources/images/facebook.png"></a></li>
                        <li><a href="https://twitter.com/PockeCardKE"><img src="/resources/images/twitter.png"></a></li>
                        <%--<li><a href="#"><img src="/resources/images/instagram.png"></a></li>
                        <li><a href="#"><img src="/resources/images/YouTube.png"></a></li>--%>
                    </ul>
                </div>
            </div>
            <div class="col-md-6 col-sm-12">
                <h3><i data-wow-delay="0.6s"></i>Drop us a message:</h3>
                <form action="mailto:info@pockecard.com" method="post" class="wow fadeInUp" data-wow-delay="0.6s">
                    <div class="col-md-6 col-sm-6">
                        <input type="text" class="form-control" placeholder="Name" name="name">
                    </div>
                    <div class="col-md-6 col-sm-6">
                        <input type="email" class="form-control" placeholder="Email" name="email">
                    </div>
                    <div class="col-md-12 col-sm-12">
                        <textarea class="form-control" placeholder="Message/comment/suggestion" rows="7" name="message"></textarea>
                    </div>
                    <div class="col-md-offset-4 col-md-4 col-sm-offset-3 col-sm-4" style="float: right">
                        <input type="submit" class="form-control" value="SEND MESSAGE">
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<jsp:include page="/WEB-INF/jsp/common/footer.jsp"/>

<!-- /.container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="/resources/components/jquery/dist/jquery.min.js"></script>
<script src="/resources/js/smoothscroll.js"></script>
<script src="/resources/components/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="/resources/components/holderjs/holder.js"></script>
<script src="/resources/js/wow.min.js"></script>
<script src="/resources/js/jquery.bxSlider.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        $('#slider').bxSlider({
            ticker: true,
            tickerSpeed: 5000,
            tickerHover: true
        });
    });
</script>
</body>
</html>

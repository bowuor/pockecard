<%--
  Created by IntelliJ IDEA.
  User: Ben
  Date: 10-Jul-16
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="/WEB-INF/jsp/common/head.jsp">
        <jsp:param name="title" value="POCKECARD | FAQ"/>
    </jsp:include>
    <link type="text/css" href="/resources/css/carousel.css" rel="stylesheet">
</head>

<body>
<jsp:include page="/WEB-INF/jsp/common/topmenu.jsp"/>
<div class="section">
    <div class="container">
        <div class="row">
            <div class="col-md-12 faq-wrapper">
                <div class="panel-group" id="accordion2">
                    <h3>General Questions</h3>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2">
                                What is PockeCard?
                            <span class="caret"></span></a>
                        </div>
                        <div class="accordion-body collapse">
                            <div class="accordion-inner">
                                <div class="answer">&nbsp;</div>
                                <p>PockeCard is a payments wallet that allows Students to hold money and make payments using their Student IDs</p>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2">
                                How does it work?
                            <span class="caret"></span></a>
                        </div>
                        <div class="accordion-body collapse">
                            <div class="accordion-inner">
                                <div class="answer">&nbsp;</div>
                                <p>Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias</p>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#">
                                How do I join PockeCard?
                            <span class="caret"></span></a>
                        </div>
                        <div class="accordion-body collapse">
                            <div class="accordion-inner">
                                <div class="answer">&nbsp;</div>
                                <p>Pellentesque in velit et enim porta aliquam. Curabitur eget ligula dui, a euismod lectus. Phasellus eget facilisis nulla. Suspendisse sit amet dui nisl.</p>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#">
                                What is the eligibility?
                            <span class="caret"></span></a>
                        </div>
                        <div class="accordion-body collapse">
                            <div class="accordion-inner">
                                <div class="answer">&nbsp;</div>
                                <p>Aenean nec mi a nisl molestie pretium nec sed velit. Vestibulum ultrices, arcu vitae varius pulvinar, justo sapien mollis dui, eget dapibus massa felis sed nulla. Maecenas in varius nulla. Praesent mollis diam vitae libero sollicitudin commodo lobortis tortor tempor. Fusce rutrum orci consequat nunc ultricies egestas. Sed vitae tortor sapien. Vivamus ac libero eu arcu aliquet pretium eu vitae sem. Sed tincidunt varius pellentesque.</p>
                            </div>
                        </div>
                    </div>
                    <%--<h3>Orders</h3>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#">
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor?
                            </a>
                        </div>
                        <div class="accordion-body collapse">
                            <div class="accordion-inner">
                                <div class="answer">&nbsp;</div>
                                <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque</p>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#">
                                Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem?
                            </a>
                        </div>
                        <div class="accordion-body collapse">
                            <div class="accordion-inner">
                                <div class="answer">&nbsp;</div>
                                <p>Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias</p>
                            </div>
                        </div>
                    </div>--%>
                    <h3>Card Operations</h3>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#">
                                How do I top-up my childs' card?
                            <span class="caret"></span></a>
                        </div>
                        <div class="accordion-body collapse">
                            <div class="accordion-inner">
                                <div class="answer">&nbsp;</div>
                                <p>Go to Mpesa <br> Lipa na Mpesa <br> Paybill Number 000000 <br> Account Number is the student number* <h6><em>(*e.g. MGHS1234 - where MGHS is the school code & 1234 the student admission number)</em></h6></p>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#">
                                How do I check a card's balance?
                            <span class="caret"></span></a>
                        </div>
                        <div class="accordion-body collapse">
                            <div class="accordion-inner">
                                <div class="answer">&nbsp;</div>
                                <p>Send a message with the student number to 00000.<br> <h6><em>Only phone numbers registered and linked to a card can check the balance</em></h6><br><h6><em></em></h6></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="/WEB-INF/jsp/common/footer.jsp"/>

<script src="/resources/components/jquery/dist/jquery.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
<script>
    var acc = document.getElementsByClassName("panel-heading");
    var i;

    for (i = 0; i < acc.length; i++) {
        acc[i].onclick = function(){
            this.classList.toggle("active");
            this.nextElementSibling.classList.toggle("show");
        }
    }
</script>

</body>
</html>

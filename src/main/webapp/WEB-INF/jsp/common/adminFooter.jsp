<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

</section><!-- right col -->
</div><!-- /.row (main row) -->

</section><!-- /.content -->
</div><!-- /.content-wrapper -->
<footer class="main-footer">
    <div class="pull-right hidden-xs">
        <b>Version</b> 1.0
    </div>
    <strong>Copyright &copy; 2017 <a href="http://www.pockecard.com">PockeCard</a>.</strong> All rights reserved.
</footer>

<!-- Control Sidebar -->
<aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
        <li><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>

        <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
    </ul>
</aside><!-- /.control-sidebar -->
<!-- Add the sidebar's background. This div must be placed
immediately after the control sidebar -->
<div class='control-sidebar-bg'></div>
</div><!-- ./wrapper -->
<%--boostrap js--%>
<script type="application/javascript" src="/resources/components/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="/resources/js/morris/morris.js"></script>
<script src="/resources/js/morris/raphael-2.1.0.min.js"></script>
<script src="/resources/js/dashboard-demo.js"></script>
<script type='text/javascript'>
    $(".sidebar-menu>li").each(function() {
        var navItem = $(this);
        if (navItem.find("a").attr("href") == location.pathname) {
            navItem.addClass("active");
        }
    });
</script>
<%--<script>--%>
    <%--$.widget.bridge('uibutton', $.ui.button);--%>
<%--</script>--%>
</body>

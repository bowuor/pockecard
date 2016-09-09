//package com.concretepage;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.ws.transport.http.MessageDispatcherServlet;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
///**
// * Created by wladek on 9/9/16.
// */
//public class WebAppInitializer implements WebApplicationInitializer {
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(AppConfig.class);
//        ctx.setServletContext(servletContext);
//        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
//        servlet.setApplicationContext(ctx);
//        servlet.setTransformWsdlLocations(true);
//        ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcher",servlet);
//        dynamic.addMapping("/soapws/*");
//        dynamic.setLoadOnStartup(1);
//    }
//}

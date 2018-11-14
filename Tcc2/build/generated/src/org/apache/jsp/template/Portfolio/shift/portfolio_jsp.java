package org.apache.jsp.template.Portfolio.shift;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class portfolio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<title>Shift &mdash; Free Website Template, Free HTML5 Template by FreeHTML5.co</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<meta name=\"description\" content=\"Free HTML5 Website Template by FreeHTML5.co\" />\n");
      out.write("\t<meta name=\"keywords\" content=\"free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive\" />\n");
      out.write("\t<meta name=\"author\" content=\"FreeHTML5.co\" />\n");
      out.write("\n");
      out.write("\t<!-- <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\"> -->\n");
      out.write("\t\n");
      out.write("\t<!-- Animate.css -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\t<!-- Icomoon Icon Fonts-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("\t<!-- Bootstrap  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\t<!-- Theme style  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("\t<!-- Modernizr JS -->\n");
      out.write("\t<script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("\t<!-- FOR IE9 below -->\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"js/respond.min.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t\n");
      out.write("\t<div class=\"fh5co-loader\"></div>\n");
      out.write("\t\n");
      out.write("\t<div id=\"page\">\n");
      out.write("\t\n");
      out.write("\t<div id=\"fh5co-work\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 text-center animate-box\">\n");
      out.write("\t\t\t\t\t<a class=\"work\" href=\"portfolio_detail.html\">\n");
      out.write("\t\t\t\t\t\t<div class=\"work-grid\" style=\"background-image:url(images/project-1.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"desc\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Folding Light</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"cat\">Branding</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 text-center animate-box\">\n");
      out.write("\t\t\t\t\t<a class=\"work\" href=\"portfolio_detail.html\">\n");
      out.write("\t\t\t\t\t\t<div class=\"work-grid\" style=\"background-image:url(images/project-2.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Power Led Light</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"cat\">Illustration</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 text-center animate-box\">\n");
      out.write("\t\t\t\t\t<a class=\"work\" href=\"portfolio_detail.html\">\n");
      out.write("\t\t\t\t\t\t<div class=\"work-grid\" style=\"background-image:url(images/project-3.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Elephant Origami</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"cat\">Logo</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 text-center animate-box\">\n");
      out.write("\t\t\t\t\t<a class=\"work\" href=\"portfolio_detail.html\">\n");
      out.write("\t\t\t\t\t\t<div class=\"work-grid\" style=\"background-image:url(images/project-4.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Electric Kick Scooter</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"cat\">Web Design</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 text-center animate-box\">\n");
      out.write("\t\t\t\t\t<a class=\"work\" href=\"portfolio_detail.html\">\n");
      out.write("\t\t\t\t\t\t<div class=\"work-grid\" style=\"background-image:url(images/project-5.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Shark Diver</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"cat\">Branding</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 text-center animate-box\">\n");
      out.write("\t\t\t\t\t<a class=\"work\" href=\"portfolio_detail.html\">\n");
      out.write("\t\t\t\t\t\t<div class=\"work-grid\" style=\"background-image:url(images/project-6.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Objekte Unserer Tage Berlin</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"cat\">Logo</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 text-center animate-box\">\n");
      out.write("\t\t\t\t\t<a class=\"work\" href=\"portfolio_detail.html\">\n");
      out.write("\t\t\t\t\t\t<div class=\"work-grid\" style=\"background-image:url(images/project-7.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Aloha Shirt</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"cat\">Web Design</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 text-center animate-box\">\n");
      out.write("\t\t\t\t\t<a class=\"work\" href=\"portfolio_detail.html\">\n");
      out.write("\t\t\t\t\t\t<div class=\"work-grid\" style=\"background-image:url(images/project-8.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Olafur Elliasson Waterfall Versailles</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"cat\">Branding</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 text-center animate-box\">\n");
      out.write("\t\t\t\t\t<a class=\"work\" href=\"portfolio_detail.html\">\n");
      out.write("\t\t\t\t\t\t<div class=\"work-grid\" style=\"background-image:url(images/project-9.jpg);\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"desc\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Hand Care</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"cat\">Logo</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<footer id=\"fh5co-footer\" role=\"contentinfo\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row copyright\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12 text-center\">\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<small class=\"block\">&copy; 2016 Free HTML5. All Rights Reserved.</small> \n");
      out.write("\t\t\t\t\t\t<small class=\"block\">Designed by <a href=\"http://freehtml5.co/\" target=\"_blank\">FreeHTML5.co</a> Demo Images: <a href=\"http://unsplash.co/\" target=\"_blank\">Unsplash</a> &amp; <a href=\"http://blog.gessato.com/\" target=\"_blank\">Gessato</a></small>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<ul class=\"fh5co-social-icons\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-linkedin\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-dribbble\"></i></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"gototop js-top\">\n");
      out.write("\t\t<a href=\"#\" class=\"js-gotop\"><i class=\"icon-arrow-up\"></i></a>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- jQuery -->\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t<!-- jQuery Easing -->\n");
      out.write("\t<script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<!-- Waypoints -->\n");
      out.write("\t<script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("\t<!-- Main -->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

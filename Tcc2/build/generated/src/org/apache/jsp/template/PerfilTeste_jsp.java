package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PerfilTeste_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("\tPrologue by HTML5 UP\n");
      out.write("\thtml5up.net | @ajlkn\n");
      out.write("\tFree for personal and commercial use under the CCA 3.0 license (html5up.net/license)\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Prologue by HTML5 UP</title>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/Perfil/assets/css/main.css\" />\n");
      out.write("\t</head>\n");
      out.write("\t<body class=\"is-preload\">\n");
      out.write("\n");
      out.write("\t\t<!-- Header -->\n");
      out.write("\t\t\t<div id=\"header\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"top\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t\t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"image avatar48\"><img src=\"images/avatar.jpg\" alt=\"\" /></span>\n");
      out.write("\t\t\t\t\t\t\t<h1 id=\"title\">Jane Doe</h1>\n");
      out.write("\t\t\t\t\t\t\t<p>Hyperspace Engineer</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Nav -->\n");
      out.write("\t\t\t\t\t\t<nav id=\"nav\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#top\" id=\"top-link\"><span class=\"icon fa-home\">Intro</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#portfolio\" id=\"portfolio-link\"><span class=\"icon fa-th\">Portfolio</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#about\" id=\"about-link\"><span class=\"icon fa-user\">About Me</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#contact\" id=\"contact-link\"><span class=\"icon fa-envelope\">Contact</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"bottom\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Social Icons -->\n");
      out.write("\t\t\t\t\t\t<ul class=\"icons\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"icon fa-twitter\"><span class=\"label\">Twitter</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"icon fa-facebook\"><span class=\"label\">Facebook</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"icon fa-github\"><span class=\"label\">Github</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"icon fa-dribbble\"><span class=\"label\">Dribbble</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"icon fa-envelope\"><span class=\"label\">Email</span></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Main -->\n");
      out.write("\t\t\t<div id=\"main\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- About Me -->\n");
      out.write("\t\t\t\t\t<section id=\"about\" class=\"three\">\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t\t<h2>About Me</h2>\n");
      out.write("\t\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t\t<p>Tincidunt eu elit diam magnis pretium accumsan etiam id urna. Ridiculus\n");
      out.write("\t\t\t\t\t\t\tultricies curae quis et rhoncus velit. Lobortis elementum aliquet nec vitae\n");
      out.write("\t\t\t\t\t\t\tlaoreet eget cubilia quam non etiam odio tincidunt montes. Elementum sem\n");
      out.write("\t\t\t\t\t\t\tparturient nulla quam placerat viverra mauris non cum elit tempus ullamcorper\n");
      out.write("\t\t\t\t\t\t\tdolor. Libero rutrum ut lacinia donec curae mus vel quisque sociis nec\n");
      out.write("\t\t\t\t\t\t\tornare iaculis.</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Portfolio -->\n");
      out.write("\t\t\t\t\t<section id=\"portfolio\" class=\"two\">\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Portfolio</h2>\n");
      out.write("\t\t\t\t\t\t\t</header>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<p>Vitae natoque dictum etiam semper magnis enim feugiat convallis convallis\n");
      out.write("\t\t\t\t\t\t\tegestas rhoncus ridiculus in quis risus amet curabitur tempor orci penatibus.\n");
      out.write("\t\t\t\t\t\t\tTellus erat mauris ipsum fermentum etiam vivamus eget. Nunc nibh morbi quis\n");
      out.write("\t\t\t\t\t\t\tfusce hendrerit lacus ridiculus.</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-4 col-12-mobile\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<article class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"image fit\"><img src=\"images/pic02.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Ipsum Feugiat</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\t\t\t<article class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"image fit\"><img src=\"images/pic03.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Rhoncus Semper</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-4 col-12-mobile\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<article class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"image fit\"><img src=\"images/pic04.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Magna Nullam</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\t\t\t<article class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"image fit\"><img src=\"images/pic05.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Natoque Vitae</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-4 col-12-mobile\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<article class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"image fit\"><img src=\"images/pic06.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Dolor Penatibus</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\t\t\t<article class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"image fit\"><img src=\"images/pic07.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Orci Convallis</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Contact -->\n");
      out.write("\t\t\t\t\t<section id=\"contact\" class=\"four\">\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Contact</h2>\n");
      out.write("\t\t\t\t\t\t\t</header>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<p>Elementum sem parturient nulla quam placerat viverra\n");
      out.write("\t\t\t\t\t\t\tmauris non cum elit tempus ullamcorper dolor. Libero rutrum ut lacinia\n");
      out.write("\t\t\t\t\t\t\tdonec curae mus. Eleifend id porttitor ac ultricies lobortis sem nunc\n");
      out.write("\t\t\t\t\t\t\torci ridiculus faucibus a consectetur. Porttitor curae mauris urna mi dolor.</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<form method=\"post\" action=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-6 col-12-mobile\"><input type=\"text\" name=\"name\" placeholder=\"Name\" /></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-6 col-12-mobile\"><input type=\"text\" name=\"email\" placeholder=\"Email\" /></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<textarea name=\"message\" placeholder=\"Message\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Send Message\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Footer -->\n");
      out.write("\t\t\t<div id=\"footer\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Copyright -->\n");
      out.write("\t\t\t\t\t<ul class=\"copyright\">\n");
      out.write("\t\t\t\t\t\t<li>&copy; Untitled. All rights reserved.</li><li>Design: <a href=\"http://html5up.net\">HTML5 UP</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Scripts -->\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.scrolly.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.scrollex.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/browser.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/breakpoints.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/util.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
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

package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CategoriasServicos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/template/Cabecalho2.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <link href=\"styleCategorias.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("        <!-- portfolio-->\n");
      out.write("        \n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template -->\n");
      out.write("        <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/agency.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <!-- Navigation -->\n");
      out.write("    ");
      out.write("\n");
      out.write("<html >\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />\n");
      out.write("        <title>TCC</title>\n");
      out.write("        <!--<link href=\"../Cabecalho/css/layout.css\" rel=\"stylesheet\" type=\"text/css\" />-->\n");
      out.write("        <link href=\"Cabecalho/css/menu.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>  \n");
      out.write("        <nav>\n");
      out.write("          \n");
      out.write("                <ul class=\"ulC\">\n");
      out.write("                    <li><a href=\"SiteCtl?acao=listarServicosEmpregador\">Serviços</a></li>\n");
      out.write("                      <li>\n");
      out.write("                        <a href=\"SiteCtl?acao=perfilEmpregador&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregador.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Perfil</a>\n");
      out.write("                    </li>\n");
      out.write("                      <li>\n");
      out.write("                        <a href=\"SiteCtl?acao=verCategorias&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregador.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Ver Categorias de Empregados</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"../admin/categoria/\">ADMINISTRADOR</a></li>\n");
      out.write("                    <li><a href=\"SiteCtl?acao=sair&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregador.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Sair</a></li>\n");
      out.write("                </ul>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section id=\"services\" class=\"section-servico\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-12 text-center\">\n");
      out.write("            <h2 class=\"section-heading text-uppercase\">Serviços</h2>\n");
      out.write("            <h3 class=\"section-subheading text-muted\">Um novo jeito de contratar </h3>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!--          <div class=\"col-md-4\">\n");
      out.write("            <span class=\"fa-stack fa-4x\">\n");
      out.write("              <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\n");
      out.write("              <i class=\"fa fa-play fa-stack-1x fa-inverse\"></i>\n");
      out.write("            </span>\n");
      out.write("            <h4 class=\"service-heading\">Responsive Design</h4>\n");
      out.write("            <p class=\"text-muted\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam architecto quo inventore harum ex magni, dicta impedit.</p>\n");
      out.write("          </div>-->\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <span class=\"fa-stack fa-4x\">\n");
      out.write("              <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\n");
      out.write("                <i class=\"fa fa-lock fa-stack-1x fa-inverse\"></i>\n");
      out.write("            </span>\n");
      out.write("            <h4 class=\"service-heading\">Web Security</h4>\n");
      out.write("            <p class=\"text-muted\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam architecto quo inventore harum ex magni, dicta impedit.</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Bootstrap core JavaScript -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Plugin JavaScript -->\n");
      out.write("    <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Contact form JavaScript -->\n");
      out.write("    <script src=\"js/jqBootstrapValidation.js\"></script>\n");
      out.write("    <script src=\"js/contact_me.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom scripts for this template -->\n");
      out.write("    <script src=\"js/agency.min.js\"></script>\n");
      out.write("  </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categorias}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("obj");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                \n");
          out.write("          <div class=\"col-md-4\">\n");
          out.write("            <span class=\"fa-stack fa-4x\">\n");
          out.write("              <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\n");
          out.write("              <a href=\"SiteCtl?acao=listaEmpregados&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.icon}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" fa-stack-1x fa-inverse\"></i></a>\n");
          out.write("            </span>\n");
          out.write("            <h4 class=\"service-heading\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("            <p class=\"text-muted\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam architecto quo inventore harum ex magni, dicta impedit.</p>\n");
          out.write("          </div>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}

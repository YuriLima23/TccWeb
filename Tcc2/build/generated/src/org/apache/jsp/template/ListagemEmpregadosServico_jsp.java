package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ListagemEmpregadosServico_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html >\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->\n");
      out.write("        <title>Listagem de Empregados</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"styleListagemServicosEmpregados.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"fundo\">\n");
      out.write("        ");
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
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"tab-content\">\n");
      out.write("                    <h2 class=\"section-heading text-uppercase\" id=\"teste1\">Crie Um Contrato Agora Mesmo</h2>\n");
      out.write("                    <h3 class=\"section-subheading text-muted\" id=\"teste2\">Faça Sua Solicitação</h3>\n");
      out.write("                    <div class=\"tab-pane active\" id=\"comments-logout\">\n");
      out.write("                        <ul class=\"media-list\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <li class=\"media\">\n");
      out.write("                                <a class=\"pull-left\" href=\"#\">\n");
      out.write("                                    <img class=\"media-object img-circle\" src=\"img/about/1.jpg\" alt=\"profile\">\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                    <div class=\"well well-lg\">\n");
      out.write("                                        <h4 class=\"media-heading text-uppercase reviews\">Marco </h4>\n");
      out.write("                                        <ul class=\"media-date text-uppercase reviews list-inline\">\n");
      out.write("                                            <li class=\"dd\">22</li>\n");
      out.write("                                            <li class=\"mm\">09</li>\n");
      out.write("                                            <li class=\"aaaa\">2014</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <p class=\"media-comment\">\n");
      out.write("                                            Great snippet! Thanks for sharing.\n");
      out.write("                                        </p>\n");
      out.write("                                        <a class=\"btn btn-info btn-circle text-uppercase\" href=\"#\" id=\"reply\"><span class=\"glyphicon glyphicon-user\"></span> Ver Perfil</a>\n");
      out.write("                                        <a class=\"btn btn-success btn-circle text-uppercase\" data-toggle=\"collapse\" href=\"#replyOne\"><span class=\"glyphicon glyphicon-ok-sign\"></span>Contratar</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregados}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("obj");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"media\">\n");
          out.write("                                    <a class=\"pull-left\" href=\"#\">\n");
          out.write("                                        <img class=\"media-object img-circle\" src=\"../imagem/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.foto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" height=\"120\" width=\"120\" alt=\"profile\">\n");
          out.write("                                    </a>\n");
          out.write("                                    <div class=\"media-body\">\n");
          out.write("                                        <div class=\"well well-lg\">\n");
          out.write("                                            <h4 class=\"media-heading text-uppercase reviews\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </h4>\n");
          out.write("                                            <ul class=\"media-date text-uppercase reviews list-inline\">\n");
          out.write("                                                <!--aqui vai ser a avaliacao do empregado-->\n");
          out.write("                                                <li class=\"dd\">22</li>\n");
          out.write("                                                <li class=\"mm\">09</li>\n");
          out.write("                                                <li class=\"aaaa\">2014</li>\n");
          out.write("\n");
          out.write("                                            </ul>\n");
          out.write("                                            <p class=\"media-comment\">\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </p>\n");
          out.write("                                            <a class=\"btn btn-info btn-circle text-uppercase\" href=\"#\" id=\"reply\"><span class=\"glyphicon glyphicon-user\"></span> Ver Perfil</a>\n");
          out.write("                                            <a class=\"btn btn-success btn-circle text-uppercase\" data-toggle=\"collapse\" href=\"#replyOne\"><span class=\"glyphicon glyphicon-ok-sign\"></span> Contratar</a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("\n");
          out.write("\n");
          out.write("                                </li>\n");
          out.write("                            ");
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

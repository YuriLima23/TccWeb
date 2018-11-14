package org.apache.jsp.admin.categoria;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/categoria/../cabecalho.jsp");
    _jspx_dependants.add("/admin/categoria/../rodape.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
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

      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Livraria</title>\n");
      out.write("    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"../inicial\">Área Administrativa</a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-right top-nav\">\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> \n");
      out.write("                        Thaís Rodrigues <b class=\"caret\"></b></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-fw fa-user\"></i> Profile</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-fw fa-envelope\"></i> Inbox</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-fw fa-gear\"></i> Settings</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-fw fa-power-off\"></i> Log Out</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav side-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../empregador/EmpregadorCtl\"><i class=\"fa fa-fw fa-edit\"></i>Empregador</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../empregado/EmpregadoCtl\"><i class=\"fa fa-fw fa-edit\"></i>Empregado</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../album/AlbumCtl?acao=list\"><i class=\"fa fa-fw fa-edit\"></i>Album</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../categoria/CategoriaCtl\"><i class=\"fa fa-fw fa-edit\"></i>Categoria</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../tarefa/TarefaCtl\"><i class=\"fa fa-fw fa-edit\"></i>Tarefa</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../solucao/SolucaoCtl\"><i class=\"fa fa-fw fa-edit\"></i>Solucao</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../contrato/ContratoCtl\"><i class=\"fa fa-fw fa-edit\"></i>contrato</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../../template/SiteCtl\"><i class=\"fa fa-fw fa-edit\"></i>Site</a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">");
      out.write('\n');

    String msg = "testando";
    String classe = "alert-danger";

      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-lg-12\">\n");
      out.write("        <h1 class=\"page-header\">\n");
      out.write("            Sistema\n");
      out.write("            <small>Admin</small>\n");
      out.write("        </h1>\n");
      out.write("        <ol class=\"breadcrumb\">\n");
      out.write("            <li>\n");
      out.write("                <i class=\"fa fa-dashboard\"></i>  <a href=\"index.jsp\">Área Administrativa</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"active\">\n");
      out.write("                <i class=\"fa fa-file\"></i> Aqui vai o conteúdo de apresentação\n");
      out.write("            </li>\n");
      out.write("        </ol>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"panel-heading\"> Album </div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            <div class=\"alert ");
      out.print(classe);
      out.write("\">\n");
      out.write("                ");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <form action=\"CategoriaCtl\" method=\"post\" enctype=\"multipart/form-data\" >                \n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <label>Nome da Categoria</label>\n");
      out.write("                        <input class=\"form-control\" type=\"text\"  required name=\"nome\"/>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <label>Icon categoria</label>\n");
      out.write("                        <input class=\"form-control\" type=\"text\"  required name=\"icone\"/>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <label>Imagem da Categoria</label>\n");
      out.write("                        <input class=\"form-control\" type=\"file\" name=\"arquivo\" required accept=\"image/*\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <label>descrição</label>\n");
      out.write("                        <input class=\"form-control\" type=\"text\"  required name=\"descricao\"/>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <button class=\"btn btn-primary btn-sm\" type=\"submit\">Salvar</button>                \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- /#wrapper -->\n");
      out.write("\n");
      out.write("<!-- jQuery -->\n");
      out.write("<script src=\"../js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core JavaScript -->\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}

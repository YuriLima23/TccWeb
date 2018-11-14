package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AlterarEmpregado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <link href=\"styleRegistro.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"http://ajax.aspnetcdn.com/ajax/jQuery/jquery-2.2.4.min.js\"></script>\n");
      out.write("        <script src=\"registroJavascript.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("                    <div class=\"panel panel-login\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xs-6\">\n");
      out.write("                                    <a href=\"#\" class=\"active\" id=\"login-form-link\">Registro Empregado</a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-6\">\n");
      out.write("                                    <a href=\"#\" id=\"register-form-link\">Registro Empregador</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <hr>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <form id=\"login-form\" action=\"SiteCtl?acao=addEmpregado\" method=\"post\"  enctype=\"multipart/form-data\" role=\"form\" style=\"display: block;\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"nome\" id=\"username\" class=\"form-control\" placeholder=\"Nome\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"email\" name=\"email\" id=\"email\" class=\"form-control\" placeholder=\"Email\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" name=\"senha\" id=\"password\"  class=\"form-control\" placeholder=\"Senha\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"number\" name=\"telefone\"  class=\"form-control\" placeholder=\"Telefone\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <select class=\"form-control\" id=\"estados\">\n");
      out.write("                                                <option>- Selecione seu estado - </option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <select class=\"form-control\" name=\"cidade\" id=\"cidades\">\n");
      out.write("                                                <option>- Selecione sua cidade - </option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <textArea type=\"text\" name=\"descricao\"  class=\"form-control\" placeholder=\"Descreva você mesmo como trabalhador\" required></textarea>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <select  name=\"categoria\"  class=\"form-control\" placeholder=\"Cidade\" required>\n");
      out.write("                                                <option >- Selecione uma Categoria -</option>\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"file\" name=\"arquivo\" tabindex=\"2\" class=\"form-control\" placeholder=\"Foto\" accept=\"image/*\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6 col-sm-offset-3\">\n");
      out.write("                                                    <input type=\"submit\"  id=\"register-submit\"  class=\"form-control btn btn-register\" value=\"Registrar-se\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                             <h5 style=\"text-align: center\"><a href=\"login.jsp\" >Fazer Login</a></h5>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                    \n");
      out.write("                                    <!--FORMULARIO EMPREGADOR _------------------------------------------------------------------------>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("          <script>\n");
      out.write("              $(document).ready(function () {\n");
      out.write("\n");
      out.write("                  $.getJSON('estados_cidades.json', function (data) {\n");
      out.write("                      var items = [];\n");
      out.write("                      var options = '<option value=\"\">escolha um estado</option>';\n");
      out.write("                      $.each(data, function (key, val) {\n");
      out.write("                          options += '<option value=\"' + val.nome + '\">' + val.nome + '</option>';\n");
      out.write("                      });\n");
      out.write("                      $(\"#estados\").html(options);\n");
      out.write("\n");
      out.write("                      $(\"#estados\").change(function () {\n");
      out.write("\n");
      out.write("                          var options_cidades = '';\n");
      out.write("                          var str = \"\";\n");
      out.write("\n");
      out.write("                          $(\"#estados option:selected\").each(function () {\n");
      out.write("                              str += $(this).text();\n");
      out.write("                          });\n");
      out.write("\n");
      out.write("                          $.each(data, function (key, val) {\n");
      out.write("                              if (val.nome == str) {\n");
      out.write("                                  $.each(val.cidades, function (key_city, val_city) {\n");
      out.write("                                      options_cidades += '<option value=\"' + val_city + '\">' + val_city + '</option>';\n");
      out.write("                                  });\n");
      out.write("                              }\n");
      out.write("                          });\n");
      out.write("                          $(\"#cidades\").html(options_cidades);\n");
      out.write("\n");
      out.write("                      }).change();\n");
      out.write("\n");
      out.write("                  });\n");
      out.write("\n");
      out.write("              });\n");
      out.write("              $(document).ready(function () {\n");
      out.write("\n");
      out.write("                  $.getJSON('estados_cidades.json', function (data) {\n");
      out.write("                      var items = [];\n");
      out.write("                      var options = '<option value=\"\">escolha um estado</option>';\n");
      out.write("                      $.each(data, function (key, val) {\n");
      out.write("                          options += '<option value=\"' + val.nome + '\">' + val.nome + '</option>';\n");
      out.write("                      });\n");
      out.write("                      $(\"#estadoss\").html(options);\n");
      out.write("\n");
      out.write("                      $(\"#estadoss\").change(function () {\n");
      out.write("\n");
      out.write("                          var options_cidades = '';\n");
      out.write("                          var str = \"\";\n");
      out.write("\n");
      out.write("                          $(\"#estadoss option:selected\").each(function () {\n");
      out.write("                              str += $(this).text();\n");
      out.write("                          });\n");
      out.write("\n");
      out.write("                          $.each(data, function (key, val) {\n");
      out.write("                              if (val.nome == str) {\n");
      out.write("                                  $.each(val.cidades, function (key_city, val_city) {\n");
      out.write("                                      options_cidades += '<option value=\"' + val_city + '\">' + val_city + '</option>';\n");
      out.write("                                  });\n");
      out.write("                              }\n");
      out.write("                          });\n");
      out.write("                          $(\"#cidadess\").html(options_cidades);\n");
      out.write("\n");
      out.write("                      }).change();\n");
      out.write("\n");
      out.write("                  });\n");
      out.write("\n");
      out.write("              });\n");
      out.write("\n");
      out.write("</script>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categorias}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("obj");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                \n");
          out.write("                                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                ");
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

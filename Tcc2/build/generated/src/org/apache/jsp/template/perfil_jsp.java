package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/template/CabecalhoPerfil1.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<html lang=\"en-US\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Perfil TCC</title>\n");
      out.write("    <meta name=\"description\" content=\"Creative CV is a HTML resume template for professionals. Built with Bootstrap 4, Now UI Kit and FontAwesome, this modern and responsive design template is perfect to showcase your portfolio, skils and experience.\"/>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700,200\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"Perfil2/css/aos.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"Perfil2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"Perfil2/styles/main.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("  <body id=\"top\" style=\"background-color:#343a40\">\n");
      out.write("      <div class=\"profile-page sidebar-collapse\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg fixed-top navbar-transparent bg-primary\" color-on-scroll=\"400\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"navbar-translate\"><a class=\"navbar-brand\" href=\"#\" rel=\"tooltip\">TCC</a>\n");
      out.write("              <button class=\"navbar-toggler navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\" aria-controls=\"navigation\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-bar bar1\"></span><span class=\"navbar-toggler-bar bar2\"></span><span class=\"navbar-toggler-bar bar3\"></span></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse justify-content-end\" id=\"navigation\">\n");
      out.write("              <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link smooth-scroll\" href=\"SiteCtl?acao=listarServicos\">Serviços</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link smooth-scroll\" href=\"SiteCtl?acao=perfilEmpregado&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregado.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Perfil</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link smooth-scroll\" href=\"#experience\">Alterar Perfil</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link smooth-scroll\" href=\"SiteCtl?acao=port&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregado.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Gerenciar Portfolio</a></li>\n");
      out.write("               <li class=\"nav-item\"><a class=\"nav-link smooth-scroll\" href=\"SiteCtl?acao=sair&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregado.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Sair</a></li>\n");
      out.write("                 \n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("      </div>");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    #card{\n");
      out.write("\n");
      out.write("        width: 50%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<div class=\"page-content\" >\n");
      out.write("    <div>\n");
      out.write("        <div class=\"profile-page\">\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div class=\"page-header page-header-small\" filter-color=\"green\">\n");
      out.write("                    <div class=\"page-header-image\" data-parallax=\"true\" ></div>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"content-center\">\n");
      out.write("                            <div class=\"cc-profile-image\"><a href=\"#\"><img src=\"../imagem/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregado.foto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Image\"/></a></div>\n");
      out.write("                            <div class=\"h2 title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregado.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                            <p class=\"category text-white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregado.categoria.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"section\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"button-container\"><a class=\"btn btn-default btn-round btn-lg btn-icon\" href=\"#\" rel=\"tooltip\" title=\"Follow me on Facebook\"><i class=\"fa fa-facebook\"></i></a><a class=\"btn btn-default btn-round btn-lg btn-icon\" href=\"#\" rel=\"tooltip\" title=\"Follow me on Twitter\"><i class=\"fa fa-twitter\"></i></a><a class=\"btn btn-default btn-round btn-lg btn-icon\" href=\"#\" rel=\"tooltip\" title=\"Follow me on Google+\"><i class=\"fa fa-google-plus\"></i></a><a class=\"btn btn-default btn-round btn-lg btn-icon\" href=\"#\" rel=\"tooltip\" title=\"Follow me on Instagram\"><i class=\"fa fa-instagram\"></i></a></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"section\" id=\"about\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"card\" data-aos=\"fade-up\" data-aos-offset=\"10\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-6 col-md-12\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"h4 mt-0 title\">Sobre</div>\n");
      out.write("                                <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregado.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6 col-md-12\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"h4 mt-0 title\">Basic Information</div>\n");
      out.write("\n");
      out.write("                                <div class=\"row mt-3\">\n");
      out.write("                                    <div class=\"col-sm-4\"><strong class=\"text-uppercase\">Email:</strong></div>\n");
      out.write("                                    <div class=\"col-sm-8\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregado.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row mt-3\">\n");
      out.write("                                    <div class=\"col-sm-4\"><strong class=\"text-uppercase\">Telefone:</strong></div>\n");
      out.write("                                    <div class=\"col-sm-8\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregado.telefone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row mt-3\">\n");
      out.write("                                    <div class=\"col-sm-4\"><strong class=\"text-uppercase\">Cidade:</strong></div>\n");
      out.write("                                    <div class=\"col-sm-8\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregado.cidade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"section\" id=\"skill\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"h4 text-center mb-4 title\">Avaliação Média</div>\n");
      out.write("                <div class=\"card\" id=\"card\"  data-aos=\"fade-up\" data-aos-anchor-placement=\"top-bottom\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"progress-container progress-primary\"><span class=\"progress-badge\"><i class=\"fa fa fa-star\"></i></span>\n");
      out.write("                                    <div class=\"progress\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-primary\" data-aos=\"progress-full\" data-aos-offset=\"10\" data-aos-duration=\"2000\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 10%;\"></div><span class=\"progress-value\"><i class=\"fa fa fa-star\"></i><i class=\"fa fa fa-star\"></i><i class=\"fa fa fa-star\"></i><i class=\"fa fa fa-star\"></i><i class=\"fa fa fa-star\"></i></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!--                            <div class=\"col-md-6\">\n");
      out.write("                                                            <div class=\"progress-container progress-primary\"><span class=\"progress-badge\">CSS</span>\n");
      out.write("                                                                <div class=\"progress\">\n");
      out.write("                                                                    <div class=\"progress-bar progress-bar-primary\" data-aos=\"progress-full\" data-aos-offset=\"10\" data-aos-duration=\"2000\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 75%;\"></div><span class=\"progress-value\">75%</span>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>-->\n");
      out.write("                        </div>\n");
      out.write("                        <!--                        <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-6\">\n");
      out.write("                                                        <div class=\"progress-container progress-primary\"><span class=\"progress-badge\">JavaScript</span>\n");
      out.write("                                                            <div class=\"progress\">\n");
      out.write("                                                                <div class=\"progress-bar progress-bar-primary\" data-aos=\"progress-full\" data-aos-offset=\"10\" data-aos-duration=\"2000\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%;\"></div><span class=\"progress-value\">60%</span>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-6\">\n");
      out.write("                                                        <div class=\"progress-container progress-primary\"><span class=\"progress-badge\">SASS</span>\n");
      out.write("                                                            <div class=\"progress\">\n");
      out.write("                                                                <div class=\"progress-bar progress-bar-primary\" data-aos=\"progress-full\" data-aos-offset=\"10\" data-aos-duration=\"2000\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%;\"></div><span class=\"progress-value\">60%</span>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-6\">\n");
      out.write("                                                        <div class=\"progress-container progress-primary\"><span class=\"progress-badge\">Bootstrap</span>\n");
      out.write("                                                            <div class=\"progress\">\n");
      out.write("                                                                <div class=\"progress-bar progress-bar-primary\" data-aos=\"progress-full\" data-aos-offset=\"10\" data-aos-duration=\"2000\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 75%;\"></div><span class=\"progress-value\">75%</span>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-6\">\n");
      out.write("                                                        <div class=\"progress-container progress-primary\"><span class=\"progress-badge\">Photoshop</span>\n");
      out.write("                                                            <div class=\"progress\">\n");
      out.write("                                                                <div class=\"progress-bar progress-bar-primary\" data-aos=\"progress-full\" data-aos-offset=\"10\" data-aos-duration=\"2000\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 70%;\"></div><span class=\"progress-value\">70%</span>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"section\" id=\"portfolio\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 ml-auto mr-auto\">\n");
      out.write("                        <div class=\"h4 text-center mb-4 title\">Portfolio</div>\n");
      out.write("                        <div class=\"nav-align-center\">\n");
      out.write("                            <ul class=\"nav nav-pills nav-pills-primary\" role=\"tablist\">\n");
      out.write("                                <li class=\"nav-item\"><a class=\"nav-link active\" data-toggle=\"tab\" href=\"#web-development\" role=\"tablist\"><i class=\"fa fa-laptop\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                <li class=\"nav-item\"><a class=\"nav-link\" data-toggle=\"tab\" href=\"#graphic-design\" role=\"tablist\"><i class=\"fa fa-picture-o\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                <li class=\"nav-item\"><a class=\"nav-link\" data-toggle=\"tab\" href=\"#Photography\" role=\"tablist\"><i class=\"fa fa-camera\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tab-content gallery mt-5\">\n");
      out.write("                    <div class=\"tab-pane active\" id=\"web-development\">\n");
      out.write("                        <div class=\"ml-auto mr-auto\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"cc-porfolio-image img-raised\" data-aos=\"fade-up\" data-aos-anchor-placement=\"top-bottom\"><a href=\"SiteCtl?acao=listarFotos&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregado.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            <figure class=\"cc-effect\"><img src=\"Perfil2/images/project-3.jpg\" alt=\"Image\"/>\n");
      out.write("                                                <figcaption>\n");
      out.write("                                                    <div class=\"h4\">Album Projetos</div>\n");
      out.write("                                                    <p>Visualizar</p>\n");
      out.write("                                                </figcaption>\n");
      out.write("                                            </figure></a></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"section\" id=\"experience\">\n");
      out.write("            <div class=\"container cc-experience\">\n");
      out.write("                <div class=\"h4 text-center mb-4 title\">Contratos Pendentes</div>\n");
      out.write("                <div class=\"card\" data-aos=\"zoom-in\">\n");
      out.write("                    <div class=\"row\" >\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"section\" id=\"reference\">\n");
      out.write("        <div class=\"container cc-reference\">\n");
      out.write("            <div class=\"h4 mb-4 text-center title\">References</div>\n");
      out.write("            <div class=\"card\" data-aos=\"zoom-in\">\n");
      out.write("                <div class=\"carousel slide\" id=\"cc-Indicators\" data-ride=\"carousel\">\n");
      out.write("                    <ol class=\"carousel-indicators\">\n");
      out.write("                        <li class=\"active\" data-target=\"#cc-Indicators\" data-slide-to=\"0\"></li>\n");
      out.write("                        <li data-target=\"#cc-Indicators\" data-slide-to=\"1\"></li>\n");
      out.write("                        <li data-target=\"#cc-Indicators\" data-slide-to=\"3\"></li>\n");
      out.write("\n");
      out.write("                    </ol>\n");
      out.write("                    <div class=\"carousel-inner\">\n");
      out.write("                        <div class=\"carousel-item active\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-2 col-md-3 cc-reference-header\">\n");
      out.write("                                    <img src=\"Perfil2/images/reference-image-1.jpg\" alt=\"Image\"/>\n");
      out.write("                                    <div class=\"h5 pt-2\">Aiyana</div>\n");
      out.write("                                    <p class=\"category\">CEO / WEBM</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-10 col-md-9\">\n");
      out.write("                                    <p> Habitasse venenatis commodo tempor eleifend arcu sociis sollicitudin ante pulvinar ad, est porta cras erat ullamcorper volutpat metus duis platea convallis, tortor primis ac quisque etiam luctus nisl nullam fames. Ligula purus suscipit tempus nascetur curabitur donec nam ullamcorper, laoreet nullam mauris dui aptent facilisis neque elementum ac, risus semper felis parturient fringilla rhoncus eleifend.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-2 col-md-3 cc-reference-header\"><img src=\"Perfil2/images/reference-image-2.jpg\" alt=\"Image\"/>\n");
      out.write("                                    <div class=\"h5 pt-2\">Braiden</div>\n");
      out.write("                                    <p class=\"category\">CEO / Creativem</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-10 col-md-9\">\n");
      out.write("                                    <p> Habitasse venenatis commodo tempor eleifend arcu sociis sollicitudin ante pulvinar ad, est porta cras erat ullamcorper volutpat metus duis platea convallis, tortor primis ac quisque etiam luctus nisl nullam fames. Ligula purus suscipit tempus nascetur curabitur donec nam ullamcorper, laoreet nullam mauris dui aptent facilisis neque elementum ac, risus semper felis parturient fringilla rhoncus eleifend.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-2 col-md-3 cc-reference-header\"><img src=\"Perfil2/images/reference-image-3.jpg\" alt=\"Image\"/>\n");
      out.write("                                    <div class=\"h5 pt-2\">Alexander</div>\n");
      out.write("                                    <p class=\"category\">CEO / Webnote</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-10 col-md-9\">\n");
      out.write("                                    <p> Habitasse venenatis commodo tempor eleifend arcu sociis sollicitudin ante pulvinar ad, est porta cras erat ullamcorper volutpat metus duis platea convallis, tortor primis ac quisque etiam luctus nisl nullam fames. Ligula purus suscipit tempus nascetur curabitur donec nam ullamcorper, laoreet nullam mauris dui aptent facilisis neque elementum ac, risus semper felis parturient fringilla rhoncus eleifend.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-2 col-md-3 cc-reference-header\"><img src=\"Perfil2/images/reference-image-3.jpg\" alt=\"Image\"/>\n");
      out.write("                                    <div class=\"h5 pt-2\">Alexander</div>\n");
      out.write("                                    <p class=\"category\">CEO / Webnote</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-10 col-md-9\">\n");
      out.write("                                    <p> Habitasse venenatis commodo tempor eleifend arcu sociis sollicitudin ante pulvinar ad, est porta cras erat ullamcorper volutpat metus duis platea convallis, tortor primis ac quisque etiam luctus nisl nullam fames. Ligula purus suscipit tempus nascetur curabitur donec nam ullamcorper, laoreet nullam mauris dui aptent facilisis neque elementum ac, risus semper felis parturient fringilla rhoncus eleifend.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div></div>\n");
      out.write("</div>\n");
      out.write("<footer class=\"footer\">\n");
      out.write("    <div class=\"container text-center\"><a class=\"cc-facebook btn btn-link\" href=\"#\"><i class=\"fa fa-facebook fa-2x \" aria-hidden=\"true\"></i></a><a class=\"cc-twitter btn btn-link \" href=\"#\"><i class=\"fa fa-twitter fa-2x \" aria-hidden=\"true\"></i></a><a class=\"cc-google-plus btn btn-link\" href=\"#\"><i class=\"fa fa-google-plus fa-2x\" aria-hidden=\"true\"></i></a><a class=\"cc-instagram btn btn-link\" href=\"#\"><i class=\"fa fa-instagram fa-2x \" aria-hidden=\"true\"></i></a></div>\n");
      out.write("    <div class=\"h4 title text-center\">Anthony Barnett</div>\n");
      out.write("    <div class=\"text-center text-muted\">\n");
      out.write("        <p>&copy; Creative CV. All rights reserved.<br>Design - <a class=\"credit\" href=\"https://templateflip.com\" target=\"_blank\">TemplateFlip</a></p>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("<script src=\"Perfil2/js/core/jquery.3.2.1.min.js\"></script>\n");
      out.write("<script src=\"Perfil2/js/core/popper.min.js\"></script>\n");
      out.write("<script src=\"Perfil2/js/core/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"Perfil2/js/now-ui-kit.js?v=1.1.0\"></script>\n");
      out.write("<script src=\"Perfil2/js/aos.js\"></script>\n");
      out.write("<script src=\"Perfil2/scripts/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaContratos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("obj");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                            <div class=\"col-md-3 bg-primary\"  data-aos=\"fade-right\" data-aos-offset=\"50\" data-aos-duration=\"500\">\n");
          out.write("                                <div class=\"card-body\" ><img src=\"../imagem/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.empregador.foto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" height=\"auto\" width=\"auto\"  alt=\"Image\"/>\n");
          out.write("\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"col-md-9\" data-aos=\"fade-left\"  data-aos-offset=\"50\" data-aos-duration=\"500\">\n");
          out.write("                                <div class=\"card-body\" >\n");
          out.write("                                    <div class=\"h5\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.empregador.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </div>\n");
          out.write("\n");
          out.write("                                <a style=\"float: right; margin-right: 30px; \" class=\"btn btn-danger\"  data-aos=\"zoom-in\" data-aos-anchor=\"data-aos-anchor\">\n");
          out.write("                                    <i style=\"font-size:20px;\" class=\"fa fa-remove\"></i></a> \n");
          out.write("                                <a class=\"btn btn-primary smooth-scroll mr-2\" style=\"float: right;\"  href=\"SiteCtl?acao=aceitaContrato&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empregado.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&idContrato=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"  >\n");
          out.write("                                    <i class=\"fa fa-check\" style=\"font-size:20px;\"></i></a>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                        ");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.status == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <div class=\"col-md-3 bg-primary\" data-aos=\"fade-right\" data-aos-offset=\"50\" data-aos-duration=\"500\">\n");
        out.write("                                    <div class=\"card-body\" ><img src=\"../imagem/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.empregador.foto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" height=\"auto\" width=\"auto\"  alt=\"Image\"/>\n");
        out.write("\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"col-md-9\" data-aos=\"fade-left\" data-aos-offset=\"50\" data-aos-duration=\"500\">\n");
        out.write("                                    <div class=\"card-body\">\n");
        out.write("                                        <div class=\"h5\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.empregador.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("                                        <p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${obj.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </div>\n");
        out.write("\n");
        out.write("                                    <i class=\"fa fa-check\" style=\"font-size:50px; color: green; float:right; margin-right: 30px;\"></i>\n");
        out.write("                                </div>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}

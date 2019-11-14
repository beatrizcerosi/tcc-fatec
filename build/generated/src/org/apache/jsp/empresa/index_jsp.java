package org.apache.jsp.empresa;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty empresa}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("        \n");
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("        <html lang=\"en\">\n");
        out.write("\n");
        out.write("            <head>\n");
        out.write("                <meta charset=\"utf-8\">\n");
        out.write("                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
        out.write("                <meta name=\"description\" content=\"\">\n");
        out.write("                <meta name=\"author\" content=\"Dashboard\">\n");
        out.write("                <meta name=\"keyword\" content=\"Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina\">\n");
        out.write("                <title>Perfil</title>\n");
        out.write("\n");
        out.write("                <!-- Favicons -->\n");
        out.write("                <link href=\"img/favicon.png\" rel=\"icon\">\n");
        out.write("                <link href=\"img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
        out.write("\n");
        out.write("                <!-- Bootstrap core CSS -->\n");
        out.write("                <link href=\"lib/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
        out.write("                <!--external css-->\n");
        out.write("                <link href=\"lib/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
        out.write("                <link rel=\"stylesheet\" type=\"text/css\" href=\"css/zabuto_calendar.css\">\n");
        out.write("                <link rel=\"stylesheet\" type=\"text/css\" href=\"lib/gritter/css/jquery.gritter.css\" />\n");
        out.write("                <!-- Custom styles for this template -->\n");
        out.write("                <link href=\"css/style.css\" rel=\"stylesheet\">\n");
        out.write("                <link href=\"css/style-responsive.css\" rel=\"stylesheet\">\n");
        out.write("                <script src=\"lib/chart-master/Chart.js\"></script>\n");
        out.write("\n");
        out.write("                <!-- =======================================================\n");
        out.write("                  Template Name: Dashio\n");
        out.write("                  Template URL: https://templatemag.com/dashio-bootstrap-admin-template/\n");
        out.write("                  Author: TemplateMag.com\n");
        out.write("                  License: https://templatemag.com/license/\n");
        out.write("                ======================================================= -->\n");
        out.write("            </head>\n");
        out.write("\n");
        out.write("            <body>\n");
        out.write("                <section id=\"container\">\n");
        out.write("                    <!-- **********************************************************************************************************************************************************\n");
        out.write("                        TOP BAR CONTENT & NOTIFICATIONS\n");
        out.write("                        *********************************************************************************************************************************************************** -->\n");
        out.write("                    <!--header start-->\n");
        out.write("                    <header class=\"header black-bg\">\n");
        out.write("                        <div class=\"sidebar-toggle-box\">\n");
        out.write("                            <div class=\"fa fa-bars tooltips\" data-placement=\"right\" data-original-title=\"Toggle Navigation\"></div>\n");
        out.write("                        </div>\n");
        out.write("                        <!--logo start-->\n");
        out.write("                        <a href=\"index.html\" class=\"logo\"><b>Master<span>controll</span></b></a>\n");
        out.write("                        <!--logo end-->\n");
        out.write("                        <div class=\"nav notify-row\" id=\"top_menu\">\n");
        out.write("                            <!--  notification start -->\n");
        out.write("                            <ul class=\"nav top-menu\">\n");
        out.write("                                <!-- settings start -->\n");
        out.write("                                <li class=\"dropdown\">\n");
        out.write("                                    <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"index.html#\">\n");
        out.write("                                        <i class=\"fa fa-tasks\"></i>\n");
        out.write("                                        <span class=\"badge bg-theme\">4</span>\n");
        out.write("                                    </a>\n");
        out.write("                                    <ul class=\"dropdown-menu extended tasks-bar\">\n");
        out.write("                                        <div class=\"notify-arrow notify-arrow-green\"></div>\n");
        out.write("                                        <li>\n");
        out.write("                                            <p class=\"green\">You have 4 pending tasks</p>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li>\n");
        out.write("                                            <a href=\"index.html#\">\n");
        out.write("                                                <div class=\"task-info\">\n");
        out.write("                                                    <div class=\"desc\">Dashio Admin Panel</div>\n");
        out.write("                                                    <div class=\"percent\">40%</div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"progress progress-striped\">\n");
        out.write("                                                    <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\">\n");
        out.write("                                                        <span class=\"sr-only\">40% Complete (success)</span>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                            </a>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li>\n");
        out.write("                                            <a href=\"index.html#\">\n");
        out.write("                                                <div class=\"task-info\">\n");
        out.write("                                                    <div class=\"desc\">Database Update</div>\n");
        out.write("                                                    <div class=\"percent\">60%</div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"progress progress-striped\">\n");
        out.write("                                                    <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\">\n");
        out.write("                                                        <span class=\"sr-only\">60% Complete (warning)</span>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                            </a>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li>\n");
        out.write("                                            <a href=\"index.html#\">\n");
        out.write("                                                <div class=\"task-info\">\n");
        out.write("                                                    <div class=\"desc\">Product Development</div>\n");
        out.write("                                                    <div class=\"percent\">80%</div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"progress progress-striped\">\n");
        out.write("                                                    <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%\">\n");
        out.write("                                                        <span class=\"sr-only\">80% Complete</span>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                            </a>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li>\n");
        out.write("                                            <a href=\"index.html#\">\n");
        out.write("                                                <div class=\"task-info\">\n");
        out.write("                                                    <div class=\"desc\">Payments Sent</div>\n");
        out.write("                                                    <div class=\"percent\">70%</div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"progress progress-striped\">\n");
        out.write("                                                    <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"70\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 70%\">\n");
        out.write("                                                        <span class=\"sr-only\">70% Complete (Important)</span>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                            </a>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li class=\"external\">\n");
        out.write("                                            <a href=\"#\">See All Tasks</a>\n");
        out.write("                                        </li>\n");
        out.write("                                    </ul>\n");
        out.write("                                </li>\n");
        out.write("                                <!-- settings end -->\n");
        out.write("                                <!-- inbox dropdown start-->\n");
        out.write("                                <li id=\"header_inbox_bar\" class=\"dropdown\">\n");
        out.write("                                    <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"index.html#\">\n");
        out.write("                                        <i class=\"fa fa-envelope-o\"></i>\n");
        out.write("                                        <span class=\"badge bg-theme\">5</span>\n");
        out.write("                                    </a>\n");
        out.write("                                    <ul class=\"dropdown-menu extended inbox\">\n");
        out.write("                                        <div class=\"notify-arrow notify-arrow-green\"></div>\n");
        out.write("                                        <li>\n");
        out.write("                                            <p class=\"green\">You have 5 new messages</p>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li>\n");
        out.write("                                            <a href=\"index.html#\">\n");
        out.write("                                                <span class=\"photo\"><img alt=\"avatar\" src=\"img/ui-zac.jpg\"></span>\n");
        out.write("                                                <span class=\"subject\">\n");
        out.write("                                                    <span class=\"from\">Zac Snider</span>\n");
        out.write("                                                    <span class=\"time\">Just now</span>\n");
        out.write("                                                </span>\n");
        out.write("                                                <span class=\"message\">\n");
        out.write("                                                    Hi mate, how is everything?\n");
        out.write("                                                </span>\n");
        out.write("                                            </a>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li>\n");
        out.write("                                            <a href=\"index.html#\">\n");
        out.write("                                                <span class=\"photo\"><img alt=\"avatar\" src=\"img/ui-divya.jpg\"></span>\n");
        out.write("                                                <span class=\"subject\">\n");
        out.write("                                                    <span class=\"from\">Divya Manian</span>\n");
        out.write("                                                    <span class=\"time\">40 mins.</span>\n");
        out.write("                                                </span>\n");
        out.write("                                                <span class=\"message\">\n");
        out.write("                                                    Hi, I need your help with this.\n");
        out.write("                                                </span>\n");
        out.write("                                            </a>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li>\n");
        out.write("                                            <a href=\"index.html#\">\n");
        out.write("                                                <span class=\"photo\"><img alt=\"avatar\" src=\"img/ui-danro.jpg\"></span>\n");
        out.write("                                                <span class=\"subject\">\n");
        out.write("                                                    <span class=\"from\">Dan Rogers</span>\n");
        out.write("                                                    <span class=\"time\">2 hrs.</span>\n");
        out.write("                                                </span>\n");
        out.write("                                                <span class=\"message\">\n");
        out.write("                                                    Love your new Dashboard.\n");
        out.write("                                                </span>\n");
        out.write("                                            </a>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li>\n");
        out.write("                                            <a href=\"index.html#\">\n");
        out.write("                                                <span class=\"photo\"><img alt=\"avatar\" src=\"img/ui-sherman.jpg\"></span>\n");
        out.write("                                                <span class=\"subject\">\n");
        out.write("                                                    <span class=\"from\">Dj Sherman</span>\n");
        out.write("                                                    <span class=\"time\">4 hrs.</span>\n");
        out.write("                                                </span>\n");
        out.write("                                                <span class=\"message\">\n");
        out.write("                                                    Please, answer asap.\n");
        out.write("                                                </span>\n");
        out.write("                                            </a>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li>\n");
        out.write("                                            <a href=\"index.html#\">See all messages</a>\n");
        out.write("                                        </li>\n");
        out.write("                                    </ul>\n");
        out.write("                                </li>\n");
        out.write("                                <!-- inbox dropdown end -->\n");
        out.write("                                <!-- notification dropdown start-->\n");
        out.write("                                <li id=\"header_notification_bar\" class=\"dropdown\">\n");
        out.write("                                    <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"index.html#\">\n");
        out.write("                                        <i class=\"fa fa-bell-o\"></i>\n");
        out.write("                                        <span class=\"badge bg-warning\">7</span>\n");
        out.write("                                    </a>\n");
        out.write("                                    <ul class=\"dropdown-menu extended notification\">\n");
        out.write("                                        <div class=\"notify-arrow notify-arrow-yellow\"></div>\n");
        out.write("                                        <li>\n");
        out.write("                                            <p class=\"yellow\">You have 7 new notifications</p>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li>\n");
        out.write("                                            <a href=\"index.html#\">\n");
        out.write("                                                <span class=\"label label-danger\"><i class=\"fa fa-bolt\"></i></span>\n");
        out.write("                                                Server Overloaded.\n");
        out.write("                                                <span class=\"small italic\">4 mins.</span>\n");
        out.write("                                            </a>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li>\n");
        out.write("                                            <a href=\"index.html#\">\n");
        out.write("                                                <span class=\"label label-warning\"><i class=\"fa fa-bell\"></i></span>\n");
        out.write("                                                Memory #2 Not Responding.\n");
        out.write("                                                <span class=\"small italic\">30 mins.</span>\n");
        out.write("                                            </a>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li>\n");
        out.write("                                            <a href=\"index.html#\">\n");
        out.write("                                                <span class=\"label label-danger\"><i class=\"fa fa-bolt\"></i></span>\n");
        out.write("                                                Disk Space Reached 85%.\n");
        out.write("                                                <span class=\"small italic\">2 hrs.</span>\n");
        out.write("                                            </a>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li>\n");
        out.write("                                            <a href=\"index.html#\">\n");
        out.write("                                                <span class=\"label label-success\"><i class=\"fa fa-plus\"></i></span>\n");
        out.write("                                                New User Registered.\n");
        out.write("                                                <span class=\"small italic\">3 hrs.</span>\n");
        out.write("                                            </a>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li>\n");
        out.write("                                            <a href=\"index.html#\">See all notifications</a>\n");
        out.write("                                        </li>\n");
        out.write("                                    </ul>\n");
        out.write("                                </li>\n");
        out.write("                                <!-- notification dropdown end -->\n");
        out.write("                            </ul>\n");
        out.write("                            <!--  notification end -->\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"top-menu\">\n");
        out.write("                            <ul class=\"nav pull-right top-menu\">\n");
        out.write("                                <li><a class=\"logout\" href=\"login.html\">Logout</a></li>\n");
        out.write("                            </ul>\n");
        out.write("                        </div>\n");
        out.write("                    </header>\n");
        out.write("                    <!--header end-->\n");
        out.write("                    <!-- **********************************************************************************************************************************************************\n");
        out.write("                        MAIN SIDEBAR MENU\n");
        out.write("                        *********************************************************************************************************************************************************** -->\n");
        out.write("                    <!--sidebar start-->\n");
        out.write("                    <aside>\n");
        out.write("                        <div id=\"sidebar\" class=\"nav-collapse \">\n");
        out.write("                            <!-- sidebar menu start-->\n");
        out.write("                            <ul class=\"sidebar-menu\" id=\"nav-accordion\">\n");
        out.write("                                <p class=\"centered\"><a href=\"profile.html\"><img src=\"img/ui-sam.jpg\" class=\"img-circle\" width=\"80\"></a></p>\n");
        out.write("                                <h5 class=\"centered\">Carlos Daniel</h5>\n");
        out.write("                                <li class=\"mt\">\n");
        out.write("                                    <a class=\"active\" href=\"#\">\n");
        out.write("                                        <i class=\"fa fa-dashboard\"></i>\n");
        out.write("                                        <span>Perfil</span>\n");
        out.write("                                    </a>\n");
        out.write("                                </li>\n");
        out.write("                                <li class=\"sub-menu\">\n");
        out.write("                                    <a href=\"javascript:;\">\n");
        out.write("                                        <i class=\"fa fa-desktop\"></i>\n");
        out.write("                                        <span>Etapas</span>\n");
        out.write("                                    </a>\n");
        out.write("                                    <ul class=\"sub\">                                \n");
        out.write("                                        <li><a href=\"#\">Cadastrar Etapas</a></li>\n");
        out.write("                                        <li><a href=\"#\">Listar Etapas</a></li>                                  \n");
        out.write("                                    </ul>\n");
        out.write("                                </li>\n");
        out.write("                                <li class=\"sub-menu\">\n");
        out.write("                                    <a href=\"javascript:;\">\n");
        out.write("                                        <i class=\"fa fa-cogs\"></i>\n");
        out.write("                                        <span>Produtos</span>\n");
        out.write("                                    </a>\n");
        out.write("                                    <ul class=\"sub\">\n");
        out.write("                                        <li><a href=\"grids.html\">Cadastrar Produtos</a></li>\n");
        out.write("                                        <li><a href=\"calendar.html\">Listar Produtos </a></li>                                        \n");
        out.write("                                    </ul>\n");
        out.write("                                </li>\n");
        out.write("                                <li class=\"sub-menu\">\n");
        out.write("                                    <a href=\"javascript:;\">\n");
        out.write("                                        <i class=\"fa fa-archive\"></i>                                \n");
        out.write("                                        <span>Status</span>\n");
        out.write("                                    </a>                            \n");
        out.write("                                    <ul class=\"sub\">\n");
        out.write("                                        <li><a href=\"etapaPedido.jsp\">Status do Pedido</a></li>                                \n");
        out.write("                                    </ul>\n");
        out.write("                                </li>\n");
        out.write("                            </ul>\n");
        out.write("                            <!-- sidebar menu end-->\n");
        out.write("                        </div>\n");
        out.write("                    </aside>\n");
        out.write("                    <!--sidebar end-->\n");
        out.write("                    <!-- **********************************************************************************************************************************************************\n");
        out.write("                        MAIN CONTENT\n");
        out.write("                        *********************************************************************************************************************************************************** -->\n");
        out.write("                    <!--main content start-->\n");
        out.write("                    <section id=\"main-content\">\n");
        out.write("                        <section class=\"wrapper\">\n");
        out.write("                            <h3><i class=\"\"></i>Perfil da Empresa</h3>\n");
        out.write("                            <!-- BASIC FORM ELELEMNTS -->\n");
        out.write("                            <div class=\"row\">\n");
        out.write("                                <div class=\"col-md-10 mb-5 order-2\">\n");
        out.write("                                    <div class=\"form-panel\">\n");
        out.write("                                        <h4 class=\"mb\"><i></i>Empresa</h4>\n");
        out.write("                                        <input value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empresa.idEmpresa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" type=\"hidden\" class=\"form-control\">\n");
        out.write("                                        <form class=\"form-horizontal style-form\" method=\"get\">\n");
        out.write("                                            <div class=\"form-group\">\n");
        out.write("                                                <label class=\"col-md-2\">Nome Razão</label>\n");
        out.write("                                                <div class=\"col-sm-5\">\n");
        out.write("                                                    <input value=\"MasterControll Sistema de Monitoramento LTDA.\" type=\"text\" readonly class=\"form-control\">\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>                  \n");
        out.write("                                                \n");
        out.write("                                            <div class=\"form-group\">\n");
        out.write("                                                <label class=\"col-md-2\">Nome Fantasia</label>\n");
        out.write("                                                <div class=\"col-sm-5\">\n");
        out.write("                                                    <input  value=\"MasterControll - Tecnologia e Informação\" type=\"text\" readonly class=\"form-control\">\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>                                    \n");
        out.write("                                            <div class=\"form-group\">\n");
        out.write("                                                <label class=\"col-md-2\">CNPJ</label>\n");
        out.write("                                                <div class=\"col-sm-3\">\n");
        out.write("                                                    <input value=\"61.721.482/0001-63\" type=\"text\" readonly class=\"form-control\">\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>                                                                        \n");
        out.write("                                            <div class=\"form-group\">\n");
        out.write("                                                <label class=\"col-md-2\">Inscrição Estadual</label>\n");
        out.write("                                                <div class=\"col-sm-2\">\n");
        out.write("                                                    <input  value=\"405.862.333.801\" type=\"text\" readonly class=\"form-control\">\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>                                                                        \n");
        out.write("                                            <div class=\"form-group\">\n");
        out.write("                                                <label class=\"col-md-2\">Endereço</label>\n");
        out.write("                                                <div class=\"col-sm-6\">\n");
        out.write("                                                    <input value=\"Avenida da Saudade, Nº: 3356\" readonly type=\"text\" class=\"form-control\">\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>                                                                        \n");
        out.write("                                            <div class=\"form-group\">\n");
        out.write("                                                <label class=\"col-md-2\">Cidade</label>\n");
        out.write("                                                <div class=\"col-sm-5\">\n");
        out.write("                                                    <input  value=\"Fernandópolis\" type=\"text\" readonly class=\"form-control\">\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>                                                                        \n");
        out.write("                                            <div class=\"form-group\">\n");
        out.write("                                                <label class=\"col-md-2\">Estado</label>\n");
        out.write("                                                <div class=\"col-sm-1\"> \n");
        out.write("                                                    <select class=\"form-control\" readonly>\n");
        out.write("                                                        <option>SP</option>\n");
        out.write("                                                    </select>\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>                                                                        \n");
        out.write("                                            <div class=\"form-group\">\n");
        out.write("                                                <label class=\"col-md-2\">Telefone</label>\n");
        out.write("                                                <div class=\"col-sm-3\">\n");
        out.write("                                                    <input value=\"(17) 3456-6915\" readonly type=\"text\" class=\"form-control\">\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>                                                        \n");
        out.write("                                            <div class=\"form-group\">\n");
        out.write("                                                <label class=\"col-md-2\">Tipo</label>\n");
        out.write("                                                <div class=\"col-sm-4\">\n");
        out.write("                                                    <select readonly name=\"idEstabelecimento\" name=\"idEstabelecimento\" class=\"form-control\" redeonly required>\n");
        out.write("                                                        <option value=\"\" selected disabled>Monitoramento</option>\n");
        out.write("                                                        ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    </select>\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>           \n");
        out.write("                                            <input type=\"submit\"  class=\"btn btn-lg\" value=\"Alterar\"/>                                            \n");
        out.write("                                        </form>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                                <!-- col-lg-12-->\n");
        out.write("                            </div>\n");
        out.write("                            <!-- /row -->\n");
        out.write("                        </section>\n");
        out.write("                    </section>\n");
        out.write("                    <!--main content end-->                    \n");
        out.write("                </section>\n");
        out.write("                <!-- js placed at the end of the document so the pages load faster -->\n");
        out.write("                <script src=\"lib/jquery/jquery.min.js\"></script>\n");
        out.write("\n");
        out.write("                <script src=\"lib/bootstrap/js/bootstrap.min.js\"></script>\n");
        out.write("                <script class=\"include\" type=\"text/javascript\" src=\"lib/jquery.dcjqaccordion.2.7.js\"></script>\n");
        out.write("                <script src=\"lib/jquery.scrollTo.min.js\"></script>\n");
        out.write("                <script src=\"lib/jquery.nicescroll.js\" type=\"text/javascript\"></script>\n");
        out.write("                <script src=\"lib/jquery.sparkline.js\"></script>\n");
        out.write("                <!--common script for all pages-->\n");
        out.write("                <script src=\"lib/common-scripts.js\"></script>\n");
        out.write("                <script type=\"text/javascript\" src=\"lib/gritter/js/jquery.gritter.js\"></script>\n");
        out.write("                <script type=\"text/javascript\" src=\"lib/gritter-conf.js\"></script>\n");
        out.write("                <!--script for this page-->\n");
        out.write("                <script src=\"lib/sparkline-chart.js\"></script>\n");
        out.write("                <script src=\"lib/zabuto_calendar.js\"></script>\n");
        out.write("                <script type=\"text/javascript\">\n");
        out.write("                    $(document).ready(function () {\n");
        out.write("                        var unique_id = $.gritter.add({\n");
        out.write("                            // (string | mandatory) the heading of the notification\n");
        out.write("                            title: 'Bem vindo!!!',\n");
        out.write("                            // (string | mandatory) the text inside the notification\n");
        out.write("                            text: 'Nesta página você pode efetuar o cadastro de produtos, alterar suas informações pessoais e efetuar o cadastro de etapas.',\n");
        out.write("                            // (string | optional) the image to display on the left\n");
        out.write("                            image: 'img/ui-sam.jpg',\n");
        out.write("                            // (bool | optional) if you want it to fade out on its own or just sit there\n");
        out.write("                            sticky: false,\n");
        out.write("                            // (int | optional) the time you want it to be alive for before fading out\n");
        out.write("                            time: 8000,\n");
        out.write("                            // (string | optional) the class name you want to apply to that specific message\n");
        out.write("                            class_name: 'my-sticky-class'\n");
        out.write("                        });\n");
        out.write("\n");
        out.write("                        return false;\n");
        out.write("                    });\n");
        out.write("                </script>\n");
        out.write("                <script type=\"application/javascript\">\n");
        out.write("                    $(document).ready(function() {\n");
        out.write("                    $(\"#date-popover\").popover({\n");
        out.write("                    html: true,\n");
        out.write("                    trigger: \"manual\"\n");
        out.write("                    });\n");
        out.write("                    $(\"#date-popover\").hide();\n");
        out.write("                    $(\"#date-popover\").click(function(e) {\n");
        out.write("                    $(this).hide();\n");
        out.write("                    });\n");
        out.write("\n");
        out.write("                    $(\"#my-calendar\").zabuto_calendar({\n");
        out.write("                    action: function() {\n");
        out.write("                    return myDateFunction(this.id, false);\n");
        out.write("                    },\n");
        out.write("                    action_nav: function() {\n");
        out.write("                    return myNavFunction(this.id);\n");
        out.write("                    },\n");
        out.write("                    ajax: {\n");
        out.write("                    url: \"show_data.php?action=1\",\n");
        out.write("                    modal: true\n");
        out.write("                    },\n");
        out.write("                    legend: [{\n");
        out.write("                    type: \"text\",\n");
        out.write("                    label: \"Special event\",\n");
        out.write("                    badge: \"00\"\n");
        out.write("                    },\n");
        out.write("                    {\n");
        out.write("                    type: \"block\",\n");
        out.write("                    label: \"Regular event\",\n");
        out.write("                    }\n");
        out.write("                    ]\n");
        out.write("                    });\n");
        out.write("                    });\n");
        out.write("\n");
        out.write("                    function myNavFunction(id) {\n");
        out.write("                    $(\"#date-popover\").hide();\n");
        out.write("                    var nav = $(\"#\" + id).data(\"navigation\");\n");
        out.write("                    var to = $(\"#\" + id).data(\"to\");\n");
        out.write("                    console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);\n");
        out.write("                    }\n");
        out.write("                </script>\n");
        out.write("            </body>\n");
        out.write("        </html>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_forEach_0.setVar("estabelecimento");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estabelecimentos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estabelecimento.idEstabelecimento}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estabelecimento.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </option>  \n");
          out.write("                                                        ");
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

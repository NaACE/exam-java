/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-09 07:25:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import org.itstep.Masters;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005fvar_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005fvar_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005fvar_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>home</title>\n");
      out.write("    <meta charset=\"utf-8\"/>\n");
      out.write("    <link href=\"/resources/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <script src=\"/resources/js.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("    <a href=\"#\">About</a>\n");
      out.write("    <a href=\"#\">Services</a>\n");
      out.write("    <a href=\"#\">Clients</a>\n");
      out.write("    <a href=\"#\">Contact</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"header\">\n");
      out.write("    <ul id=\"menu\"> <!-- main menu -->\n");
      out.write("        <li><a href=\"#about\">О нас</a></li>\n");
      out.write("        <li><a href=\"#services\">Услуги</a></li>\n");
      out.write("        <li><a href=\"#masters\">Мастера</a></li>\n");
      out.write("        <li><a href=\"#contacts\">Контакты</a></li>\n");
      out.write("        <li style=\"margin-left: 6%\"><img src=\"https://pp.userapi.com/c849528/v849528520/7a1e1/7nXTDF0suIs.jpg\" style=\"max-width: 420px;\"></li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <!-- mini manu -->\n");
      out.write("    <!-- Simulate a smartphone / tablet -->\n");
      out.write("    <div class=\"mobile-container\">\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("            <a href=\"#home\" class=\"active\"><br></a>\n");
      out.write("            <div id=\"myLinks\">\n");
      out.write("                <a href=\"#blank1\">О нас</a>\n");
      out.write("                <a href=\"#blank2\">Услуги</a>\n");
      out.write("                <a href=\"#blank3\">Мастера</a>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"myFunction()\">\n");
      out.write("                <i class=\"fa fa-bars\"></i>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"body\">\n");
      out.write("    <div class=\"blank\">\n");
      out.write("        <div class=\"show_cat\">\n");
      out.write("            <a class=\"blank_info\" name=\"about\">О НАС</a><!-- ссылка на главный блог -->\n");
      out.write("        </div>\n");
      out.write("        <p>  <!-- вся информация -->\n");
      out.write("            <span class=\"colorRed\"> Exam </span>— это база в самом сердце города, где можно скрыться в любой удобной для тебя форме. Мужская стрижка, уход за бородой, классическое бритье, и разговор с теми, кому не все равно.\n");
      out.write("        </p>\n");
      out.write("        <p class=\"textCenter\">\n");
      out.write("            Ждём тебя, чтобы поделиться этим всем. Нальём джин-тоник с огурцом или 50 рома, посидим и отдохнём. Заглядывай и оставайся надолго.<br><br>\n");
      out.write("            Мы всегда на расстоянии звонка.<br><br>\n");
      out.write("\n");
      out.write("            <span class=\"button\" onclick=\"openNav()\">Записаться</span> <!-- кнопка регистрации -->\n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"blank\" style=\"text-align: center\"> <!-- все услуги -->\n");
      out.write("        <div class=\"show_cat\">\n");
      out.write("            <a class=\"blank_info\" name=\"services\">УСЛУГИ</a> <!-- ссылка на услуги -->\n");
      out.write("        </div>\n");
      out.write("        <img style=\"width: 100%\" src=\"https://pp.userapi.com/c844417/v844417066/fec80/htjqcDHw9BQ.jpg\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"blank\"> <!-- все мастера -->\n");
      out.write("        <div class=\"show_cat\">\n");
      out.write("            <a class=\"blank_info\" name=\"masters\">МАСТЕРА</a> <!-- ссылка на мастеров -->\n");
      out.write("        </div><br>\n");
      out.write("\n");
      out.write("        <div class=\"center\">\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- end все мастера -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"blank\">\n");
      out.write("        <div class=\"show_cat\">\n");
      out.write("            <a class=\"blank_info\" name=\"contacts\">КОНТАКТЫ</a> <!-- ссылка на мастеров -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div style=\"width: 100%;\">\n");
      out.write("            <div style=\"width: 45%;display:inline-block;\">\n");
      out.write("                <p style=\"font-size: 2vmax; margin-bottom: 2%;margin-top: 2%;\">Время работы:</p>\n");
      out.write("                <p style=\"font-size: 1vmax\">с 10:00 до 22:00<br>Без выходных</p>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"width: 45%;display:inline-block; float: right\">\n");
      out.write("                <p style=\"font-size: 2vmax; margin-bottom: 2%;margin-top: 2%\">Адрес: г. Днепропетровск</p>\n");
      out.write("                <p style=\"font-size: 1vmax\">Email: hfp4e@vmani.coms<br>Телефон: (180)212-03-66</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"width: 100%; background-color: #111111; height: 10px\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <p style=\"font-size: 2vmax; margin-bottom: 2%;margin-top: 2%;\">Время работы:</p>\n");
      out.write("        <p style=\"font-size: 1vmax\">с 10:00 до 22:00<br>Без выходных</p>\n");
      out.write("        <p style=\"font-size: 2vmax; margin-bottom: 2%;margin-top: 2%\">Адрес: г. Днепропетровск</p>\n");
      out.write("        <p style=\"font-size: 1vmax\">Email: hfp4e@vmani.coms<br>Телефон: (180)212-03-66</p>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005fvar_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/view/index.jsp(77,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${master != null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    // /WEB-INF/view/index.jsp(77,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setVar("isMasterPresent");
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <table>\n");
        out.write("                    <tr>\n");
        out.write("                            ");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </tr>\n");
        out.write("                </table>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005fvar_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005fvar_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/view/index.jsp(81,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/index.jsp(81,24) '${master}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${master}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/view/index.jsp(81,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("master");
    // /WEB-INF/view/index.jsp(81,24) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <th>\n");
          out.write("                                <p class=\"inactive_employee_withdrawal\" style=\"font-size: 2vmax;\">\n");
          out.write("                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${master.img}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"><br><br>\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${master.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\n");
          out.write("                                </p>\n");
          out.write("                            </th>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}

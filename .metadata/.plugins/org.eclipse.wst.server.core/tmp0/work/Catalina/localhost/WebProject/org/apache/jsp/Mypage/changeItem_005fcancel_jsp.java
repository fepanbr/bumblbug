/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-06-01 14:35:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changeItem_005fcancel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");

    String p_idx = request.getParameter("p_idx");
    String pay_idx = request.getParameter("pay_idx");
    String u_idx = (String) session.getAttribute("u_idx");
    String pj_idx = (String) session.getAttribute("pj_idx");
    out.println("u_idx: "+u_idx);
    out.println("p_idx: " +p_idx);
    out.println("pay_idx: " + pay_idx);
    out.println("pj_idx:" + pj_idx);
    
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>jQuery Style</title>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    function check()\r\n");
      out.write("    {\r\n");
      out.write("        msg = \"정말로 삭제할건가요??\";\r\n");
      out.write("        if (confirm(msg)!=0) {\r\n");
      out.write("             // Yes click\r\n");
      out.write("        \tdocument.getElementById(\"delFrm\").submit();\r\n");
      out.write("             \r\n");
      out.write("        } else {\r\n");
      out.write("            // no click\r\n");
      out.write("        \t\r\n");
      out.write("            \r\n");
      out.write("}\r\n");
      out.write("    }; // myconfirm\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        * {\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            color: #676363;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul {\r\n");
      out.write("            color: #676363;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("            list-style: none;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        li {\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            overflow-x: hidden;\r\n");
      out.write("            min-height: 100%;\r\n");
      out.write("            height: auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .header {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            border-bottom: 1px solid #efefef;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .header-title {\r\n");
      out.write("\r\n");
      out.write("            font-size: 22px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .scanline {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("\r\n");
      out.write("            position: relative;\r\n");
      out.write("            background: #fafafa\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .b-align {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 50px;\r\n");
      out.write("            background-repeat: no-repeat;\r\n");
      out.write("            background-position: 50%;\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .b-menu-item {\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .dek {\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .b-container-wrap {\r\n");
      out.write("            padding-top: 20px;\r\n");
      out.write("            position: relative;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .b-container {\r\n");
      out.write("            width: 700px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cancel-box {\r\n");
      out.write("            color: #676363;\r\n");
      out.write("            line-height: 28px;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            background-color: #ebeae5;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cancel-box-head {\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            margin-bottom: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        .cancel-box-mid{\r\n");
      out.write("            display: flex;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cancel-box-img {\r\n");
      out.write("            \r\n");
      out.write("            margin-right: 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cancel-box-content {\r\n");
      out.write("            width:50%;\r\n");
      out.write("            width: 65%;\r\n");
      out.write("            height: 150px;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cancel-box-price {\r\n");
      out.write("            background-color: #433;\r\n");
      out.write("            color: #f4f3f3;\r\n");
      out.write("            font-size: 13px;\r\n");
      out.write("            padding-top: 2px;\r\n");
      out.write("            padding-bottom: 2px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cancel-box-footer {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .cancel-button{\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            min-height: 1em;\r\n");
      out.write("            outline: none;\r\n");
      out.write("            border: none;\r\n");
      out.write("            vertical-align: baseline;\r\n");
      out.write("            box-shadow: 0px 0px 0px 1px transparent inset, 0px 0em 0px 0px rgba(0, 0, 0, 0.1) inset;\r\n");
      out.write("            -webkit-user-select: none;\r\n");
      out.write("            -moz-user-select: none;\r\n");
      out.write("            -ms-user-select: none;\r\n");
      out.write("            user-select: none;\r\n");
      out.write("            -webkit-transition: opacity 0.1s ease, background-color 0.1s ease, color 0.1s ease, box-shadow 0.1s ease, background 0.1s ease;\r\n");
      out.write("            transition: opacity 0.1s ease, background-color 0.1s ease, color 0.1s ease, box-shadow 0.1s ease, background 0.1s ease;\r\n");
      out.write("            -webkit-tap-highlight-color: transparent;\r\n");
      out.write("            margin: 0 .25em 0 0;\r\n");
      out.write("            border-radius: 0.28571429rem;\r\n");
      out.write("            text-transform: none;\r\n");
      out.write("            text-shadow: none;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            line-height: 1em;\r\n");
      out.write("            font-style: normal;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            -webkit-text-decoration: none;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: rgba(0, 0, 0, .6);\r\n");
      out.write("            background-color: #e7e7e7;\r\n");
      out.write("            background-color: #fa6462;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            padding: 1em 1.5em;\r\n");
      out.write("            font-size: 1em;\r\n");
      out.write("            width: 20%;\r\n");
      out.write("            opacity: 1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cancel-button {\r\n");
      out.write("            margin: 0 .42857143em 0 -.21428571em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cancel-button:hover,\r\n");
      out.write("        .cancel-button:focus,\r\n");
      out.write("        .cancel-button:active {\r\n");
      out.write("            background-color: #d9d9d9;\r\n");
      out.write("            color: rgba(0, 0, 0, 8);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cancel-button:hover,\r\n");
      out.write("        .cancel-button:focus,\r\n");
      out.write("        .cancel-button:active {\r\n");
      out.write("            background-color: #ff4543;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $(function () {\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <div class=\"header-title\">bumblebug</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"scanline\">\r\n");
      out.write("        <div class=\"b-align\" style=\"background-image: url(images/background.jpeg)\">\r\n");
      out.write("            <h1>변경하기</h1>\r\n");
      out.write("            <p class=\"dek\">\r\n");
      out.write("                언제 어디서든 신선한 필름, '전국 필름 자판기 설치' 프로젝트\r\n");
      out.write("            </p>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"changeItem.jsp\" class=\"b-menu-item\"> 선물/금액변경</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"Mypage_payment.jsp\" class=\"b-menu-item\">지불수단 변경</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <form name=\"delFrm\" method=\"post\" action=\"delete.jsp\">\r\n");
      out.write("                        <a href=\"#\" class=\"b-menu-item\">취소하기</a>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"b-container-wrap\">\r\n");
      out.write("        <div class=\"b-container\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"cancel-box\">\r\n");
      out.write("                <div class=\"cancel-box-head\">\r\n");
      out.write("                    취소되는 항목\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cancel-box-mid\">\r\n");
      out.write("                    <div class=\"cancel-box-img\">\r\n");
      out.write("                        <img style=\"width:200px; height:150px;\" src=\"images/background.jpeg\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"cancel-box-content\">\r\n");
      out.write("                        <strong>예약된 금액</strong>\r\n");
      out.write("                        <span class=\"cancel-box-price\">7500원</span>\r\n");
      out.write("                        <div style=\"padding-bottom: 10px;\"><strong>선택한 선물</strong>ㅇㅇㅇ</div>\r\n");
      out.write("                        <div>선물:너의 손을 잡아줄 개/개개</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"cancel-box-footer\">\r\n");
      out.write("            \r\n");
      out.write("            <form id=\"delFrm\" name=\"delFrm\" method=\"post\" action=\"changeItem_cancelproc.jsp\">\r\n");
      out.write("                <input class=\"cancel-button\" type=\"button\" value=\"취소하기\"  onClick=\"check()\">\r\n");
      out.write("                <input class=\"cancel-button\" type=\"button\" value=\"다시생각\"  onClick=\"javascript:location.href= 'Mypage_fund.jsp'\">\r\n");
      out.write("                <input type=\"hidden\" name=\"p_idx\" value=\"");
      out.print(p_idx );
      out.write("\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html></html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-05-26 08:01:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MypageFund_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>후원현황 :: 텀블벅</title>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        * {\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container_2 {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("           \r\n");
      out.write("            background-color: #f1f1f1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .img_box {\r\n");
      out.write("            width: 800px;\r\n");
      out.write("            \r\n");
      out.write("            height: 100%;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 35px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .smile_size {\r\n");
      out.write("            width: 160px;\r\n");
      out.write("            height: 120px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .text_setting {\r\n");
      out.write("            margin-top: -0.2rem;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .middle_box {\r\n");
      out.write("            width: 500px;\r\n");
      out.write("            height: 600px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .icon_funding_pay_search {\r\n");
      out.write("            width: 800px;\r\n");
      out.write("            height: 64px;\r\n");
      out.write("         \r\n");
      out.write("            padding-bottom: 1em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .icon_funding_pay_all_box {\r\n");
      out.write("            width: 800px;\r\n");
      out.write("            height: 92%;\r\n");
      out.write("          \r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .icon_funding_pay_left {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            width: 400px;\r\n");
      out.write("            height: 64px;\r\n");
      out.write("        \r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .icon_funding_pay_right {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            width: 398px;\r\n");
      out.write("            height: 64px;\r\n");
      out.write("          \r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            float: right;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .click_1 {\r\n");
      out.write("            border-color: #3a6ff2 !important;\r\n");
      out.write("            color: #3a6ff2 !important;\r\n");
      out.write("            border-radius: .28571429rem;\r\n");
      out.write("            box-shadow: none;\r\n");
      out.write("            background: rgba(0, 0, 0, .05);\r\n");
      out.write("            align-self: center;\r\n");
      out.write("            border: none;\r\n");
      out.write("            padding: .71428571em .92857143em;\r\n");
      out.write("            margin: 0 .35714286em;\r\n");
      out.write("            transition: color .1s ease;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            line-height: 1;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            -webkit-tap-highlight-color: transparent;\r\n");
      out.write("            flex: 0 0 auto;\r\n");
      out.write("            user-select: none;\r\n");
      out.write("            text-transform: none;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .click_icon_1 {\r\n");
      out.write("            background: #999;\r\n");
      out.write("            margin-left: 1em;\r\n");
      out.write("            padding: .3em .71428571em;\r\n");
      out.write("            background-color: #3a6ff2 !important;\r\n");
      out.write("            border-color: #3a6ff2 !important;\r\n");
      out.write("            color: #fff !important;\r\n");
      out.write("            margin-right: 0;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            line-height: 1;\r\n");
      out.write("            vertical-align: baseline;\r\n");
      out.write("            text-transform: none;\r\n");
      out.write("            font-weight: 700;\r\n");
      out.write("            border: 0 solid transparent;\r\n");
      out.write("            border-radius: .28571429rem;\r\n");
      out.write("            transition: background .1s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .none_click_2 {\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            align-self: center;\r\n");
      out.write("            box-shadow: none;\r\n");
      out.write("            border: none;\r\n");
      out.write("            padding: .71428571em .92857143em;\r\n");
      out.write("            margin: 0 .35714286em;\r\n");
      out.write("            background: none;\r\n");
      out.write("            transition: color .1s ease;\r\n");
      out.write("            border-radius: .28571429rem;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            line-height: 1;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            -webkit-tap-highlight-color: transparent;\r\n");
      out.write("            flex: 0 0 auto;\r\n");
      out.write("            user-select: none;\r\n");
      out.write("            text-transform: none;\r\n");
      out.write("            color: rgba(0, 0, 0, .87);\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .none_icon_2 {\r\n");
      out.write("            background: #999;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            margin-left: 1em;\r\n");
      out.write("            padding: .3em .71428571em;\r\n");
      out.write("            margin-right: 0;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            line-height: 1;\r\n");
      out.write("            vertical-align: baseline;\r\n");
      out.write("            text-transform: none;\r\n");
      out.write("            font-weight: 700;\r\n");
      out.write("            border: 0 solid transparent;\r\n");
      out.write("            border-radius: .28571429rem;\r\n");
      out.write("            transition: background .1s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .search_1 {\r\n");
      out.write("            align-self: center;\r\n");
      out.write("            box-shadow: none;\r\n");
      out.write("            border: none;\r\n");
      out.write("            padding: .71428571em .92857143em;\r\n");
      out.write("            margin: 0px 4.357143em;\r\n");
      out.write("            background: none;\r\n");
      out.write("            transition: color .1s ease;\r\n");
      out.write("            border-radius: .28571429rem;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            line-height: 1;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            -webkit-tap-highlight-color: transparent;\r\n");
      out.write("            flex: 0 0 auto;\r\n");
      out.write("            user-select: none;\r\n");
      out.write("            text-transform: none;\r\n");
      out.write("            color: rgba(0, 0, 0, .87);\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            padding-right: 0 !important;\r\n");
      out.write("            padding-left: 0 !important;\r\n");
      out.write("            width: 20rem;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .search_2 {\r\n");
      out.write("            position: relative;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            margin: -.5em 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            font-size: 1em;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            font-style: normal;\r\n");
      out.write("            display: inline-flex;\r\n");
      out.write("            color: rgba(0, 0, 0, .87);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .search_img {\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            line-height: 1;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            right: 0;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            width: 2.67142857em;\r\n");
      out.write("            border-radius: 0 .28571429rem .28571429rem 0;\r\n");
      out.write("            transition: opacity .3s ease;\r\n");
      out.write("            opacity: 1 !important;\r\n");
      out.write("            font-size: 1em;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            font-family: Icons;\r\n");
      out.write("            font-style: normal;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            text-decoration: inherit;\r\n");
      out.write("            -webkit-font-smoothing: antialiased;\r\n");
      out.write("            backface-visibility: hidden;\r\n");
      out.write("            box-sizing: inherit;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .result_funding {\r\n");
      out.write("            width: 800px;\r\n");
      out.write("            height: 52px;\r\n");
      out.write("           \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .result_funding_in {\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("            margin-top: 0;\r\n");
      out.write("            color: #545454;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            min-height: 1em;\r\n");
      out.write("            background: rgba(0, 0, 0, .03);\r\n");
      out.write("            padding-left: 25px;\r\n");
      out.write("            line-height: 1.7em;\r\n");
      out.write("            transition: opacity .1s ease, color .1s ease, background .1s ease, box-shadow .1s ease;\r\n");
      out.write("            border-radius: .28571429rem;\r\n");
      out.write("            box-shadow: inset 0 0 0 0 rgba(34, 36, 38, .22), 0 0 0 0 transparent;\r\n");
      out.write("            margin-bottom: 1em !important;\r\n");
      out.write("            padding-top: 10px;\r\n");
      out.write("            padding-bottom: 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .list_lmg {\r\n");
      out.write("            margin-bottom: 0;\r\n");
      out.write("            margin-top: 0;\r\n");
      out.write("            margin-right: .6em;\r\n");
      out.write("            font-size: 1.14285714em;\r\n");
      out.write("            padding-bottom: 0;\r\n");
      out.write("            line-height: 1;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            color: #767676 !important;\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            opacity: 1;\r\n");
      out.write("            width: 1.18em;\r\n");
      out.write("            height: 1em;\r\n");
      out.write("            font-family: Icons;\r\n");
      out.write("            font-style: normal;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            text-decoration: inherit;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            -webkit-font-smoothing: antialiased;\r\n");
      out.write("            backface-visibility: hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .gift_box {\r\n");
      out.write("            width: 800px;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("           \r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            padding: 10px 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .gift_box_img_text {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            width: 891px;\r\n");
      out.write("            height: 112px;\r\n");
      out.write("            margin-left: auto !important;\r\n");
      out.write("            margin-right: auto !important;\r\n");
      out.write("            display: block;\r\n");
      out.write("            max-width: 100% !important;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .gift_box_text {\r\n");
      out.write("            opacity: .45;\r\n");
      out.write("            margin-bottom: 0;\r\n");
      out.write("            font-size: 1.28rem;\r\n");
      out.write("            border: none;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            font-family: SpoqaHanSans, Helvetica Neue, Arial, Helvetica, sans-serif;\r\n");
      out.write("            font-weight: 700;\r\n");
      out.write("            line-height: 1.2857em;\r\n");
      out.write("            text-transform: none;\r\n");
      out.write("            color: #767676;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .number_chart {\r\n");
      out.write("            width: 800px;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            \r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .text_number_div {\r\n");
      out.write("            width: 50px;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("          \r\n");
      out.write("            margin: 0px 370px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .number_start {\r\n");
      out.write("            border-top: none;\r\n");
      out.write("            padding-top: .92857143em;\r\n");
      out.write("            background-color: rgba(0, 0, 0, .05);\r\n");
      out.write("            color: rgba(0, 0, 0, .95);\r\n");
      out.write("            box-shadow: none;\r\n");
      out.write("            border-radius: 0 .28571429rem .28571429rem 0;\r\n");
      out.write("            min-width: 3em;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            background: rgba(0, 0, 0, .05);\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            line-height: 1;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            -webkit-tap-highlight-color: transparent;\r\n");
      out.write("            flex: 0 0 auto;\r\n");
      out.write("            user-select: none;\r\n");
      out.write("            padding: .92857143em 1.14285714em;\r\n");
      out.write("            text-transform: none;\r\n");
      out.write("            transition: background .1s ease, box-shadow .1s ease, color .1s ease;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("            $(function () {\r\n");
      out.write("                $(\".none_click_2\").on(\"click\", function(){\r\n");
      out.write("                    if($(this).hasClass(\"click_1\")){\r\n");
      out.write("                        $(this).removeClass(\"click_1\").children().removeClass(\"click_icon_1\");\r\n");
      out.write("                    }else{\r\n");
      out.write("                        $(this).addClass(\"click_1\").children().addClass(\"click_icon_1\");\r\n");
      out.write("                        $(this).siblings().removeClass(\"click_1\").children().removeClass(\"click_icon_1\");\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    if($(\"#all-fund\").hasClass(\"click_1\")){\r\n");
      out.write("                    $(\".show-funding\").attr(\"style\",\"display:block;\");\r\n");
      out.write("                }else{\r\n");
      out.write("                    $(\".show-funding\").attr(\"style\",\"display:none;\");\r\n");
      out.write("                }\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            });\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("        </script>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"overflow: auto;\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"img_box\"><img class=\"smile_size\" src=\"img/smile.PNG\">\r\n");
      out.write("            <h3 class=\"text_setting\">OOO님의 후원 현황</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container_2\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"icon_funding_pay_all_box\">\r\n");
      out.write("            <div class=\"icon_funding_pay_search\">\r\n");
      out.write("                <div class=\"icon_funding_pay_left\">\r\n");
      out.write("                    <a class=\"none_click_2 click_1\" id=\"all-fund\">모두보기\r\n");
      out.write("                        <div class=\"none_icon_2 click_icon_1\"> 0 </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a class=\"none_click_2\"id=\"ing-fund\">펀딩 진행중\r\n");
      out.write("                        <div class=\"none_icon_2\"> 0 </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a class=\"none_click_2\" id=\"ed-fund\">결제 완료\r\n");
      out.write("                        <div class=\"none_icon_2\"> 0 </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"icon_funding_pay_right\">\r\n");
      out.write("                    <div class=\"search_1\">\r\n");
      out.write("                        <div class=\"search_2\">\r\n");
      out.write("                            <input type=\"text\" placeholder=\"  프로젝트, 선물, 창작자를 검색하세요\" value=\"\"\r\n");
      out.write("                                style=\"width: 100%; height: 35px;\">\r\n");
      out.write("                            <div class=\"search_img\">\r\n");
      out.write("                                <img src=\"img/search.PNG\" style=\"width:40px; height:35px; padding: 1px;\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"show-funding\">\r\n");
      out.write("                <div class=\"result_funding\">\r\n");
      out.write("                    <div class=\"result_funding_in\">\r\n");
      out.write("                        <i class=\"list_lmg\">\r\n");
      out.write("                            <img src=\"img/list.png\" style=\"width: 23px; height: 17px;\">\r\n");
      out.write("                        </i>\r\n");
      out.write("                        총 0건의 후원 결과가 있습니다.\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"gift_box\">\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <!--  include!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1 -->\r\n");
      out.write("                \r\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "MypageProjectbox.jsp", out, false);
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                <!--  include!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1 -->\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"number_chart\">\r\n");
      out.write("                    <div class=\"text_number_div\">\r\n");
      out.write("                        <numberchart class=\"number_start\">1</numberchart>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
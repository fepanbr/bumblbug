/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-05-21 06:43:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajax1_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    ");

    
    	request.setCharacterEncoding("UTF-8");
    	String city = request.getParameter("city");
    	String zipcode = request.getParameter("zipcode");
    	
    	out.println("get 방식으로 전달된 메세지 입니다.");
    	out.println("city: "+city);
    	out.println("zipcode: "+ zipcode);
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
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
      out.write("                    <div class=\"gift_box_img_text\">\r\n");
      out.write("                        <img src=\"img/gift.png\" style=\"width: 60px; height: 60px;\">\r\n");
      out.write("                        <h3 class=\"gift_box_text\">후원 내역이 없습니다.</h3>\r\n");
      out.write("                    </div>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

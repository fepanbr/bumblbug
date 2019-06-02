/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-05-21 04:18:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class board_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
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
      out.write(" \r\n");

	Connection conn = null;
	ResultSet  rs = null;	
	PreparedStatement pstmt = null;

	request.setCharacterEncoding("UTF-8");

	Class.forName("org.mariadb.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/website", "root", "1234");
 
	String sql = "select b_idx, b_useridx, b_name, b_title, b_email, b_file, b_regdate, b_hit from board1 order by b_idx desc";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>리스트</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<center><h2>리스트</h2></center>\r\n");
      out.write("\t<table align=\"center\" border=\"1\" width=\"800\">\r\n");
      out.write("\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t<td width=\"80\">글번호</td>\r\n");
      out.write("\t\t\t<td width=\"320\">제목</td>\r\n");
      out.write("\t\t\t<td width=\"80\">이름</td>\r\n");
      out.write("\t\t\t<td width=\"80\">조회수</td>\r\n");
      out.write("\t\t\t<td width=\"190\">날짜</td>\r\n");
      out.write("\t\t\t<td width=\"50\">파일</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t");

		while(rs.next()){
			String b_idx 		= rs.getString("b_idx");
			String b_useridx 	= rs.getString("b_useridx");
			String b_name 		= rs.getString("b_name");
			String b_title 		= rs.getString("b_title");
			String b_email 		= rs.getString("b_email");
			String b_regdate	= rs.getString("b_regdate").substring(0, 10);
			//String b_file 	= rs.getString("b_file");
			String b_hit 		= rs.getString("b_hit");
	
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print(b_idx);
      out.write("</td>\r\n");
      out.write("\t\t\t<td><a href=\"board_view.jsp?b_idx=");
      out.print(b_idx);
      out.write('"');
      out.write('>');
      out.print(b_title);
      out.write("</a></td>\r\n");
      out.write("\t\t\t<td>");
      out.print(b_name);
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(b_hit);
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(b_regdate);
      out.write("</td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("\t</table>\t\r\n");
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
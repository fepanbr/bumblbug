/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-06-01 16:25:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Bean.*;

public final class MypagePresentbox_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1558675377959L));
    _jspx_dependants.put("jar:file:/C:/Users/사공정훈/Desktop/eclipse/workspace(jsp)/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/WebProject/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("Bean");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      DAO.MypageDAO MypageDAO = null;
      MypageDAO = (DAO.MypageDAO) _jspx_page_context.getAttribute("MypageDAO", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (MypageDAO == null){
        MypageDAO = new DAO.MypageDAO();
        _jspx_page_context.setAttribute("MypageDAO", MypageDAO, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");

	request.setCharacterEncoding("UTF-8");

	String u_idx = (String) session.getAttribute("u_idx");
	String pj_idx = (String)session.getAttribute("pj_idx");
	String pre_p_idx = request.getParameter("p_idx");
	String f_idx = request.getParameter("f_idx");
	
	
	
	out.println("u_idx= "+u_idx);
	out.println("pre_p_idx= "+pre_p_idx);
	out.println("pj_idx= "+pj_idx);
	out.println("f_idx= "+f_idx);


	ArrayList<PresentBean> list = MypageDAO.getPresentList(pj_idx);

      out.write("\r\n");
      out.write("\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      boolean _jspx_th_c_005fset_005f0_reused = false;
      try {
        _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fset_005f0.setParent(null);
        // /Mypage/MypagePresentbox.jsp(25,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f0.setVar("list");
        // /Mypage/MypagePresentbox.jsp(25,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f0.setValue(list );
        int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
        if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        _jspx_th_c_005fset_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>선물 변경 페이지</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/MypagePresentbox.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /Mypage/MypagePresentbox.jsp(41,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("Presentbean");
        // /Mypage/MypagePresentbox.jsp(41,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/Mypage/MypagePresentbox.jsp(41,1) '${list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t<div>선물idx: ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.p_idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</div>\r\n");
              out.write("\t\t<div>선물최소금액idx: ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.min_price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</div>\r\n");
              out.write("\t\t<div>선물이름: ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.p_nm}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</div>\r\n");
              out.write("\t\t<div>예정날짜: ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.due_dt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</div>\r\n");
              out.write("\t\t<div>후원자수: ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.supmem_cnt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</div>\r\n");
              out.write("\t\t<div>제한 수량: ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.limit_amount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</div>\r\n");
              out.write("\t\t<div>프로젝트선물idx: ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.pj_p_idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</div>\r\n");
              out.write("\t\t<div>선물설명: ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.p_explain}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</div>\r\n");
              out.write("\t\t<div>f_idx : ");
              out.print(f_idx );
              out.write("</div>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t");
              if (_jspx_meth_c_005fset_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                return;
              out.write("\r\n");
              out.write("\t\t");
              //  c:choose
              org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
              boolean _jspx_th_c_005fchoose_005f0_reused = false;
              try {
                _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
                _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
                if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\r\n");
                    out.write("\t\t\t");
                    if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                      return;
                    out.write("\r\n");
                    out.write("\t\t\t");
                    //  c:otherwise
                    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
                    try {
                      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
                      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n");
                          out.write("\t\t\t\t<div class=\"i-panel\">\r\n");
                          out.write("\t\t\t\t\t<input type=\"radio\" name=\"pledge[reward_id]\"\r\n");
                          out.write("\t\t\t\t\t\tid=\"");
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.p_idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                          out.write("\" value=\"");
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.p_idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                          out.write("\"\r\n");
                          out.write("\t\t\t\t\t\tclass=\"hidden-selector\"> <label for=\"");
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.p_idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                          out.write("\"\r\n");
                          out.write("\t\t\t\t\t\tclass=\"b-panel b-panel_reward\">\r\n");
                          out.write("\t\t\t\t\t\t<div class=\"b-panel__head\">\r\n");
                          out.write("\t\t\t\t\t\t\t<h3 class=\"b-panel__title\">\r\n");
                          out.write("\t\t\t\t\t\t\t\t<span>");
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.min_price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                          out.write("</span> <span>원 이상 밀어주시는 분께</span>\r\n");
                          out.write("\t\t\t\t\t\t\t\t<span class=\"for-screenreader\">드리는 특전</span>\r\n");
                          out.write("\t\t\t\t\t\t\t</h3>\r\n");
                          out.write("\t\t\t\t\t\t\t<span class=\"b-panel__title\">\r\n");
                          out.write("\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t<!-- 폼으로 넘기는 부분!!!!!!!!!!! -->\r\n");
                          out.write("\t\t\t\t\t\t\t\t<form  name=\"changePresent\"  method=\"post\" action=\"changeItemproc.jsp\">\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t<input id=\"");
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.p_idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                          out.write("\" type=\"tel\" name=\"pledge_money\"\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\tmin=");
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.min_price }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                          out.write(" max=\"10000000\"\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.min_price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                          out.write("\" class=\"b-form__input\">\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t<span>원</span> \r\n");
                          out.write("\t\t\t\t\t\t\t<!-- 선물 idx 넘겨준다. -->\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"p_idx\" value=\"");
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.p_idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                          out.write("\" /> \r\n");
                          out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"pre_p_idx\" value=\"");
                          out.print(pre_p_idx );
                          out.write("\" />\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"f_idx\" value=\"");
                          out.print(f_idx );
                          out.write("\" /> \r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t<!-- submit -->\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t<input type='submit' class=\"b-panel__next-button\" value=\"변경하기\" >\r\n");
                          out.write("\t\t\t\t\t\t\t\t</form> \r\n");
                          out.write("\t\t\t\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t\t<span class=\"b-panel__subtitle\">더 많이 입력하실 수 있습니다</span>\r\n");
                          out.write("\t\t\t\t\t\t\t</span>\r\n");
                          out.write("\t\t\t\t\t\t</div>\r\n");
                          out.write("\t\t\t\t\t\t<div class=\"b-panel__body\">\r\n");
                          out.write("\t\t\t\t\t\t\t<b>");
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.p_explain}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                          out.write("</b>\r\n");
                          out.write("\t\t\t\t\t\t\t<ul>\r\n");
                          out.write("\t\t\t\t\t\t\t\t<!-- ItemBean 활용하기 -->\r\n");
                          out.write("\t\t\t\t\t\t\t\t<div>\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t<li><span>선물이름: ");
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.p_nm}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                          out.write("</span></li>\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t<form\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\tclass=\"b-form b-form_animate_enterance b-form_theme_modern\">\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"b-form__row\">\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"b-form__input\">\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div></div>\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
                          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
                          out.write("\t\t\t\t\t\t\t\t<div>\r\n");
                          out.write("\t\t\t\t\t\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t<form\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\tclass=\"b-form b-form_animate_enterance b-form_theme_modern\">\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"b-form__row\">\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"b-form__input\">\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div></div>\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
                          out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
                          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
                          out.write("\t\t\t\t\t\t\t</ul>\r\n");
                          out.write("\t\t\t\t\t\t</div>\r\n");
                          out.write("\t\t\t\t\t\t<div class=\"b-panel__footer\">\r\n");
                          out.write("\t\t\t\t\t\t\t<span class=\"color-primary\">");
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.supmem_cnt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                          out.write("</span> <span>명이\r\n");
                          out.write("\t\t\t\t\t\t\t\t선택하였습니다</span> <span> <span>/</span> <strong>");
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.limit_amount - Presentbean.supmem_cnt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                          out.write("</strong>\r\n");
                          out.write("\t\t\t\t\t\t\t\t<span>개 남음</span>\r\n");
                          out.write("\t\t\t\t\t\t\t</span> <br> <span>예상 전달일: ");
                          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.due_dt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                          out.write("</span>\r\n");
                          out.write("\t\t\t\t\t\t</div>\r\n");
                          out.write("\t\t\t\t\t</label>\r\n");
                          out.write("\t\t\t\t</div>\r\n");
                          out.write("\t\t\t");
                          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
                      _jspx_th_c_005fotherwise_005f0_reused = true;
                    } finally {
                      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
                    }
                    out.write("\r\n");
                    out.write("\t\t");
                    int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
                _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
                _jspx_th_c_005fchoose_005f0_reused = true;
              } finally {
                org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
              }
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
        _jspx_th_c_005fforEach_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
      }
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

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f1_reused = false;
    try {
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /Mypage/MypagePresentbox.jsp(53,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("amount");
      // /Mypage/MypagePresentbox.jsp(53,2) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/Mypage/MypagePresentbox.jsp(53,2) '${Presentbean.limit_amount - Presentbean.supmem_cnt}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${Presentbean.limit_amount - Presentbean.supmem_cnt}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      _jspx_th_c_005fset_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /Mypage/MypagePresentbox.jsp(56,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${amount eq 0}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<div class=\"i-panel\">\r\n");
          out.write("\t\t\t\t\t<div class=\"b-panel b-panel_reward b-panel_reward_soldout\">\r\n");
          out.write("\t\t\t\t\t\t<div class=\"b-panel__head\">\r\n");
          out.write("\t\t\t\t\t\t\t<h3 class=\"b-panel__title\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.min_price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</span> <span>원 이상 밀어주시는 분께</span>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"for-screenreader\">드리는 특전</span>\r\n");
          out.write("\t\t\t\t\t\t\t</h3>\r\n");
          out.write("\t\t\t\t\t\t\t<span class=\"b-panel__title\"> <input id=\"111220843\"\r\n");
          out.write("\t\t\t\t\t\t\t\ttype=\"tel\" name=\"pledge[money]\" min=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.min_price\r\n								}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" max=\"10000000\" value=\"48,000\" class=\"b-form__input\"> <span>원</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t<a class=\"b-panel__next-button\"></a> <span\r\n");
          out.write("\t\t\t\t\t\t\t\tclass=\"b-panel__subtitle\">더 많이 입력하실 수 있습니다</span>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t</span>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"b-panel__body\">\r\n");
          out.write("\t\t\t\t\t\t\t<b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.p_explain}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</b>\r\n");
          out.write("\t\t\t\t\t\t\t<ul>\r\n");
          out.write("\t\t\t\t\t\t\t\t<!-- ItemBean 활용하기 -->\r\n");
          out.write("\t\t\t\t\t\t\t\t<div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><span>선물이름: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.p_nm}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<span>)</span></li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<form\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tclass=\"b-form b-form_animate_enterance b-form_theme_modern\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"b-form__row\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"b-form__input\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div></div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<form\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tclass=\"b-form b-form_animate_enterance b-form_theme_modern\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"b-form__row\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"b-form__input\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div></div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"b-panel__footer\">\r\n");
          out.write("\t\t\t\t\t\t\t<span class=\"color-primary\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.supmem_cnt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</span> <span>명이\r\n");
          out.write("\t\t\t\t\t\t\t\t선택하였습니다</span> <span> <span>/</span> <strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.limit_amount - Presentbean.supmem_cnt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</strong>\r\n");
          out.write("\t\t\t\t\t\t\t\t<span>개 남음</span>\r\n");
          out.write("\t\t\t\t\t\t\t</span> <br> <span>예상 전달일: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Presentbean.due_dt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }
}

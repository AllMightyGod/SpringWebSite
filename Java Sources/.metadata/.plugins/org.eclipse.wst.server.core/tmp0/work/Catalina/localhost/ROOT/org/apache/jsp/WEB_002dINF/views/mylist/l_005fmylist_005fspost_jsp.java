/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-10-10 00:48:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.mylist;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import com.in.team2.vo.PostVO;
import com.in.team2.vo.UserVO;

public final class l_005fmylist_005fspost_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.in.team2.vo.UserVO");
    _jspx_imports_classes.add("com.in.team2.vo.PostVO");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script src='/jquery/jquery-3.2.1.js'></script>\r\n");
      out.write("<style>\r\n");
      out.write(".postBoard {border-collapse: collapse;}\r\n");
      out.write(".postBoard tr{cursor:pointer;}\r\n");
      out.write(".postBoard tr:HOVER {background-color: gray;}\r\n");
      out.write(".tableHead td{border: 1px solid black;width: 10%;}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t<div id='menuDiv'>\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/menubar/menubar.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<div id='chat'>\t\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/chat/chat.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id='content'>\r\n");
      out.write("\t\t<div style='border-bottom-color: black; border-bottom-style: solid; border-bottom-width: 1px; margin-top: 2vh; margin-left: 2%;'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t<select style=\"height: 3vh;\">\r\n");
      out.write("\t\t\t\t<option value=\"category\">상품 카테고리</option>\r\n");
      out.write("\t\t\t\t<option value=\"item_name\">상품명</option>\r\n");
      out.write("\t\t\t\t<option value=\"title\">게시물 제목</option>\r\n");
      out.write("\t\t\t\t<option value=\"content\">게시물 내용</option>\r\n");
      out.write("\t\t\t\t<option value=\"userId\">작성자</option>\r\n");
      out.write("\t\t\t\t<option value=\"titleAndContent\">제목+내용</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<input type=\"text\" style=\"height: 3vh; width: 30%;\" placeholder=\"검색 키워드를 입력해주세요.\">\r\n");
      out.write("\t\t\t<button id = 'searchBtn' type=\"button\" style=\"height: 3vh;\">검색</button>\r\n");
      out.write("\t\t<a href = \"/jsp/post/s_post/l_spost_create.jsp\"><button id = 'searchBtn' type=\"button\" style=\"height: 3vh;\">글쓰기</button></a>\r\n");
      out.write("\t\t");
if(session.getAttribute("userId")!=null){
      out.write("\r\n");
      out.write("\t\t\t<a class = 'menu' onclick=\"document.location.href='/action/S_post_showMySellList'\"><button type=\"button\" style=\"height: 3vh;\">내 판매게시물 보기</button></a>\r\n");
      out.write("\t\t ");
} 
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<h1>This is MySellingList page</h1>\r\n");
      out.write("\t\t<form class=\"postList\">\r\n");
      out.write("\t\t<input name='postNum' type=\"hidden\" id='postNum'>\t\r\n");
      out.write("\t\t\t<table class='postBoard'>\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr class='tableHead'>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" style='width: 8% '>등록 번호</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" style='width: 20% '>사진</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" style='width: 10% '>카테고리</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" style='width: 10% '>상품명</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" style='width: 5% '>상품 등급</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" style='width: 27% '>제목</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" style='width: 10% '>등록일자</td>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	List<PostVO> postMySellList = (List)request.getAttribute("postMySellList");
	
		if(postMySellList.size()>0){
			for(int i=0;i<postMySellList.size();i++){
				PostVO post = postMySellList.get(i);

      out.write("\r\n");
      out.write("\t<tr onclick=\"getPost(this)\" id ='");
      out.print(post.getPostNum() );
      out.write("'>\r\n");
      out.write("\t\t<td align=\"center\" id='postNum'>");
      out.print(post.getPostNum() );
      out.write("</td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<td align=\"center\" id='postPhoto'> <img src=\"");
      out.print("/"+post.getPostPhoto() );
      out.write("\" style='width: 100%;height: 10vh'> </td>\r\n");
      out.write("\t\t<td align=\"center\" id='itemCategory'>");
      out.print(post.getItemCategory());
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"center\" id='itemName'>");
      out.print(post.getItemName());
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"center\" id='itemClass'>");
      out.print(post.getItemClass());
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"center\" id='postTitle'>");
      out.print(post.getPostTitle() );
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"center\" id='regDate'>");
      out.print(post.getRegDate());
      out.write("</td>\t\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t");
if(session.getAttribute("userId")!=null&&session.getAttribute("userId").equals(post.getUserId())){ 
      out.write("\r\n");
      out.write("\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t<button type='button'  class='postDelete' id='");
      out.print(post.getPostNum());
      out.write("'>삭제</button>\t\r\n");
      out.write("\t\t</td>\t\t\r\n");
      out.write("\r\n");
}}} 
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t</form>\t\t\r\n");
      out.write("\t\t\t<script >\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tvar postNum = -1;\r\n");
      out.write("\t\t\t\tfunction getPost(data){\r\n");
      out.write("\t\t\t\t\tpostNum=data.id;\r\n");
      out.write("\t\t\t\t\tdocument.location.href='/action/S_post_showDetail?postNum='+postNum;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t/* 게시물 삭제 */\r\n");
      out.write("\t\t\t\t$('.postDelete').click(function(){\r\n");
      out.write("\t\t\t\t\t$('#postNum').val($(this).attr('id'));\r\n");
      out.write("\t\t \t\t\t$('.postList').attr('action','/action/S_post_deletePost')\r\n");
      out.write("\t\t \t\t\t$('.postList').attr('method','post');\r\n");
      out.write("\t\t \t\t\t$('.postList').submit();\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- content div ends-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t<div id='commercial' align=\"center\">\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/ad/ad.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\t\t\t\t\r\n");
      out.write("\t<div id='footer' align=\"center\">\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/footer/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
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

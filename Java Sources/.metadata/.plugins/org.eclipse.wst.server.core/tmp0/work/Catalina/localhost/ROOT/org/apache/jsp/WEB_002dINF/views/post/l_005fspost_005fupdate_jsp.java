/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-09-29 07:51:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.in.team2.vo.CommentVO;
import java.util.List;
import java.util.ArrayList;
import com.in.team2.vo.PostVO;

public final class l_005fspost_005fupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.in.team2.vo.PostVO");
    _jspx_imports_classes.add("com.in.team2.vo.CommentVO");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script src='/jquery/jquery-3.2.1.js'></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 상품상세이름 스크립트 혁연이 컴퓨터를 서버로 목록을 가져옴-->\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$('#itemName').empty();\r\n");
      out.write("\t\tif($('#itemCategory').val()==\"카테고리 선택\"){\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl:'http://192.168.0.15:9000/returnItemName?itemCategory='+$(\"#itemCategory\").val(),\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tdataType:'xml',\r\n");
      out.write("\t\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t\tvar itemNames = $($(data).find('result')).find('item');\r\n");
      out.write("\t\t\t\t\tvar itemName=null;\r\n");
      out.write("\t\t\t\t\tfor(i=0;i<itemNames.length;i++){\r\n");
      out.write("\t\t\t\t\t\titemName=itemNames[i];\r\n");
      out.write("\t\t\t\t\t\t$('#itemName').append(\"<option ");
      out.write(">\"+($(itemName).text()).trim()+\"</option>\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror: function(e){\r\n");
      out.write("\t\t\t\t\tconsole.log(\"ERROR! \"+e.message)\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t$('#itemCategory').change(function(){\r\n");
      out.write("\t\t$('#itemName').empty();\r\n");
      out.write("\t\tif($('#itemCategory').val()==\"카테고리 선택\"){\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl:'http://192.168.0.15:9000/returnItemName?itemCategory='+$(\"#itemCategory\").val(),\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tdataType:'xml',\r\n");
      out.write("\t\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t\tvar itemNames = $($(data).find('result')).find('item');\r\n");
      out.write("\t\t\t\t\tvar itemName=null;\r\n");
      out.write("\t\t\t\t\tfor(i=0;i<itemNames.length;i++){\r\n");
      out.write("\t\t\t\t\t\titemName=itemNames[i];\r\n");
      out.write("\t\t\t\t\t\t$('#itemName').append(\"<option>\"+($(itemName).text()).trim()+\"</option>\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror: function(e){\r\n");
      out.write("\t\t\t\t\tconsole.log(\"ERROR! \"+e.message)\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t$('#itemName').change(function(){\r\n");
      out.write("\t\tif($('#itemName').val()!=null){\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t<div id='menuDiv' style='width: 100%; height: 10vh; border-color: black; border-style: solid; border-width: 1px;'>\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/menubar/menubar.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id='chat' style='width: 20%; height: 80vh; border-color: black; border-style: solid; border-width: 1px; float: left;' align=\"center\">\t\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/chat/chat.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("<!-- PostVO 변수 만들기 -->\t\t\r\n");
PostVO detail = (PostVO)request.getAttribute("detail");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id='content' style='width: 60%; border-color: black; border-style: solid; border-width: 1px; float: left; min-height: 80vh;overflow: auto;'>\t\t\r\n");
      out.write("\t\t<form method = 'post' enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t<div style='height:40vh; width: 90%; margin-top: 5vh; margin-left: 5%;'>\r\n");
      out.write("\t\t\t\t<!-- 제목 div 시작 -->\r\n");
      out.write("\t\t\t\t<div style='height:5vh; width: 90.2%; border: 1px solid black;'>\r\n");
      out.write("\t\t\t\t\t<input name = 'postTitle' type='text' style='width: 99.5%; height: 4vh;' value=\"");
      out.print(detail.getPostTitle());
      out.write("\">\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 제목 div end-->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- photo div start-->\r\n");
      out.write("\t<div style='height:40vh; width: 60%; border: 1px solid black; float: left'>\t\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t<input type=\"file\" class=\"postPhotoFile\" id=\"postPhotoFile\" name='fileName'>\r\n");
      out.write("\t<input type='hidden' name='postPhoto' id='postPhoto'>\r\n");
      out.write("    \r\n");
      out.write("\t<script>\r\n");
      out.write("    \t$('#postPhotoFile').change(function(){\r\n");
      out.write("    \t\t$('#postPhoto').val($('#postPhotoFile').val());    \t\t\r\n");
      out.write("    \t})\r\n");
      out.write("    </script>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- photo div end-->\r\n");
      out.write("\t\t\t\t<input name='postNum' type=\"hidden\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.postNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'>\r\n");
      out.write("\t\t\t\t<!-- informatoin div start-->\r\n");
      out.write("\t\t\t\t\t<div style='height:40vh; width: 30%; border: 1px solid black; float: left'>\r\n");
      out.write("\t\t\t\t\t\t<!-- 카테고리 -->\r\n");
      out.write("\t\t\t\t\t\t<select name='itemCategory' id='itemCategory' style='width:99%; height: 5vh;'>\r\n");
      out.write("\t\t\t\t\t\t\t<option selected=\"selected\">카테고리 선택</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>SAMSUNG</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>APPLE</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>LG</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t<!-- 상품상세이름 -->\r\n");
      out.write("\t\t\t\t\t\t<select name='itemName' id='itemName' style='width:99%; height: 5vh;'>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input name='itemCurPrice' type=\"text\" readonly value='");
      out.print(detail.getItemCurPrice());
      out.write("' style='width:99%; height: 5vh;'><br>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<!-- 상품상태 -->\r\n");
      out.write("\t\t\t\t\t\t<select name='itemClass'style='width:99%; height: 5vh;'>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"A\">상급</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"B\">중급</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"C\">하급</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input name='itemIncrease' id ='itemIncrease' type='hidden' value=\"1000\" style='width:99%; height: 5vh;'><br>\r\n");
      out.write("\t\t\t\t\t\t<input name='userId' id = 'userId' type=\"hidden\"  value=\"user1\" style='width:99%; height: 5vh;'><br>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" readonly value='");
      out.print(detail.getItemExpireDate() );
      out.write("' style='width:99%; height: 5vh;'><br>\r\n");
      out.write("\t\t\t\t\t\t<input id = 'increasePrice' type=\"text\" readonly value='");
      out.print(detail.getItemIncrease());
      out.write("' style='width:99%; height: 5vh;'><br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\t<!-- informatoin div ends-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- post Content div start-->\r\n");
      out.write("\t\t\t<div style='width: 81.5%; margin-top: 5vh; margin-left: 5%;'>\t\t\r\n");
      out.write("\t\t\t\t<textarea name= 'postContent' style=\"width: 99%; height: 25vh;\">");
      out.print(detail.getPostContent() );
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t<div style='width: 99.5%' align=\"center\">\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" id='wtf' formaction=\"/action/l_spost_update\">수정</button>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" onclick=\"document.location.href='/action/S_post_showList'\">목록으로 돌아가기</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- content div ends-->\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t<div id='commercial' style='width: 19.5%; height: 80vh; border-color: black; border-style: solid; border-width: 1px; float: left;' align=\"center\">\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/ad/ad.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\t\t\t\t\r\n");
      out.write("\t<div id='footer' style='width: 99.8%; height: 10vh; border-color: black; border-style: solid; border-width: 1px; float: none;' align=\"center\" >\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/footer/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$('#footer').ready(function() {\r\n");
      out.write("\t\t\t$('#footer').css('margin-top',$('#content').css('height'));\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$('window').resize(function() {\r\n");
      out.write("\t\t\t$('#footer').css('margin-top',$('#content').css('height'));\r\n");
      out.write("\t\t})\t\t\r\n");
      out.write("\t</script>\r\n");
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

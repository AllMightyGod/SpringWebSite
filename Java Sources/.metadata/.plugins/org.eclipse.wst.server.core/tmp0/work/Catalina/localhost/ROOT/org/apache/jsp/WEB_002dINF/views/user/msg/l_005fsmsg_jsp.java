/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-10-10 07:20:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user.msg;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.in.team2.vo.MsgVO;
import java.util.ArrayList;

public final class l_005fsmsg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.in.team2.vo.MsgVO");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".pageIndex:HOVER {cursor: pointer}\r\n");
      out.write(".msgTitleList:HOVER {background-color: gray; cursor: pointer;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src='/jquery/jquery-3.2.1.js'></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tvar pageNum = 1;\r\n");
      out.write("\t\r\n");
      out.write("\t");
if(request.getAttribute("pageNum")!=null){
      out.write("\r\n");
      out.write("\t\tpageNum=");
      out.print(request.getAttribute("pageNum"));
      out.write('\r');
      out.write('\n');
      out.write('	');
}
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(window).ready(function(){\r\n");
      out.write("\t\t\t$('#pageNum').val(pageNum);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$('.pageIndex').click(function(){\r\n");
      out.write("\t\t\t$('#pageNum').val($(this).text());\r\n");
      out.write("\t\t\tdocument.location.href='/action/Msg_showSMsgList?pageNum='+$(this).text();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t$('.msgTitleList').click(function(){\r\n");
      out.write("\t\t\t$('#pageNum').val(pageNum);\r\n");
      out.write("\t\t\t$('#msgNum').val($(this).attr('id'));\r\n");
      out.write("\t\t\t$('#sentMSGPost').attr('action','/action/Msg_showSMsgDetail');\r\n");
      out.write("\t\t\t$('#sentMSGPost').submit();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#sendMsgBtn').click(function(){\r\n");
      out.write("\t\t\tdocument.location.href='/jsp/user/msg/l_msg_create.jsp?pageNum='+pageNum;\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('.deleteMsgBtn').click(function(){\r\n");
      out.write("\t\t\tif(confirm(\"このメールを消しますか。\")){\r\n");
      out.write("\t\t\t\t$('#pageNum').val(pageNum);\r\n");
      out.write("\t\t\t\t$('#msgNum').val($(this).val());\r\n");
      out.write("\t\t\t\t$('#sentMSGPost').attr('method','post');\r\n");
      out.write("\t\t\t\t$('#sentMSGPost').attr('action','/action/Msg_deleteSMsg');\r\n");
      out.write("\t\t\t\t$('#sentMSGPost').submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
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
      out.write("\t\r\n");
      out.write("\t<div id='content'>\r\n");
      out.write("\t\t<div style='border-bottom-color: black; border-bottom-style: solid; border-bottom-width: 1px; margin-top: 2vh; margin-left: 2%;'>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<button id='showRMsgList'>受信箱</button>\r\n");
      out.write("\t\t\t\t<button id='showSMsgList'>送信箱</button>\r\n");
      out.write("\t\t\t\t<button id='sendMsgBtn'>メール作成</button>\r\n");
      out.write("\t\t\t</div><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t$('#showRMsgList').click(function(){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\tdocument.location.href='/action/Msg_showRMsgList';\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('#showSMsgList').click(function(){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\tdocument.location.href='/action/Msg_showSMsgList';\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h3>送信メール</h3>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<div class='msgDiv'>\r\n");
      out.write("\t\t\t<form id='sentMSGPost' method='get'>\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t ");
ArrayList<MsgVO> msgList = (ArrayList)request.getAttribute("msgList");				 
				 if(msgList.size()>0){
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<table class='msgBoard'>\r\n");
      out.write("\t\t\t\t\t<thead class='tableHead'>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>メール番号</td>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td>タイトル</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>受信人</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>送信日</td>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td>削除</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t");
	MsgVO msg=null;
						for(int i=0;i<msgList.size();i++){
							msg=msgList.get(i);
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(msg.getMsgNum());
      out.write("</td>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td class='msgTitleList' id='");
      out.print(msg.getMsgNum());
      out.write('\'');
      out.write('>');
      out.print(msg.getMsgTitle());
      out.write("</td>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(msg.getReceiverId());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(msg.getRegDate());
      out.write("</td>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td><button type=\"button\" value='");
      out.print(msg.getMsgNum());
      out.write("' class='deleteMsgBtn'>削除</button></td>\r\n");
      out.write("\t\t\t\t\t\t<tr>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t");
	
				}else{
      out.write("\r\n");
      out.write("\t\t\t\t\t送信箱が空いています。\t\t\t\r\n");
      out.write("\t\t\t\t");
} 
      out.write(" \r\n");
      out.write("\t\t\t\t<input type='hidden' name='pageNum' id='pageNum'>\t\t\t\r\n");
      out.write("\t\t\t\t<input type='hidden' name='msgNum' id='msgNum'>\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t");

		 	long pageNum=(long)request.getAttribute("pageNum");
			long dataNum=(long)request.getAttribute("dataNum");
			long numbs=(long)request.getAttribute("numbs");
			long numbOfPageIndex=10; //한 페이지에 들어가는 페이지 인덱스의 수
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 페이지 번호가 numbOfPageIndex의 배수가 아닐 떄 시작! -->\t\t\t\r\n");
      out.write("\t\t\t");
if(pageNum%numbOfPageIndex!=0){
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
	long firstPage=(long)(pageNum/numbOfPageIndex)*numbOfPageIndex+1;
					long lastPage=(long)(pageNum/numbOfPageIndex)*numbOfPageIndex+numbOfPageIndex;					
					
					long endPage=dataNum/numbs;
					if(dataNum%numbs!=0){
						endPage+=1;
					}					
					if(lastPage>endPage){
						lastPage=endPage;
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
if(pageNum>numbOfPageIndex){
      out.write("\r\n");
      out.write("\t\t\t\t\t<a class='pageIndex' id='");
      out.print(firstPage-1);
      out.write("'>前に</a>\t\t\t\t\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t");
for(long i=firstPage;i<=lastPage;i++){
      out.write("\r\n");
      out.write("\t\t\t\t \t<a class='pageIndex' id='");
      out.print(i );
      out.write("'\r\n");
      out.write("\t\t\t\t \t\r\n");
      out.write("\t\t\t\t \t");
//현재 페이지일 때 붉게 표시!
				 	if(pageNum==i){
      out.write("\t\t\t\t \t\t\r\n");
      out.write("\t\t\t\t \t\tstyle='color: red;'\t\t\t\t \t\t\t\t\t \t\r\n");
      out.write("\t\t\t\t \t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t \t\r\n");
      out.write("\t\t\t\t \t>");
      out.print(i);
      out.write("</a>\t\t\t\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
if(dataNum>lastPage*numbs){
      out.write("\r\n");
      out.write("\t\t\t\t \t<a class='pageIndex' id='");
      out.print(lastPage+1 );
      out.write("'>次に</a>\t\t\t\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t<!-- 페이지 번호가 numbOfPageIndex의 배수가 아닐 떄 끝! -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 페이지 번호가 numbOfPageIndex의 배수일 때 시작! -->\t\t\r\n");
      out.write("\t\t\t");
}else{
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t");
if(pageNum>numbOfPageIndex){
      out.write("\r\n");
      out.write("\t\t\t\t\t<a class='pageIndex' id='");
      out.print(pageNum-numbOfPageIndex );
      out.write("'>前に</a>\t\t\t\t\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
for(long i=pageNum-(numbOfPageIndex-1);i<=pageNum;i++){
      out.write("\r\n");
      out.write("\t\t\t\t\t<a class='pageIndex' id='");
      out.print(i);
      out.write("'\r\n");
      out.write("\t\t\t\t\t");
//현재 페이지일 때 붉게 표시!
					if(pageNum==i){
      out.write("\r\n");
      out.write("\t\t\t\t \t\tstyle='color: red;'\t\t\t\t \t\r\n");
      out.write("\t\t\t\t \t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t>");
      out.print(i);
      out.write("</a>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
if(dataNum>pageNum*numbs){
      out.write("\r\n");
      out.write("\t\t\t\t\t<a class='pageIndex' id='");
      out.print(pageNum+1);
      out.write("'>次に</a>\t\t\t\t\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t");
}
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 페이지 번호가 numbOfPageIndex의 배수일 때 끝! -->\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t<!-- PAGING END! -->\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<!-- content div ends-->\r\n");
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
      out.write("\t</div>\t\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
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

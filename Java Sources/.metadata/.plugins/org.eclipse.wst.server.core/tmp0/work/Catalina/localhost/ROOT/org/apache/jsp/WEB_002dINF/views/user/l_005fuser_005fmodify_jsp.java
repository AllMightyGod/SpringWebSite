/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-09-28 07:02:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class l_005fuser_005fmodify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/user/Desktop/team2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/team2/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1503031307456L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script src=\"/jquery/jquery-3.2.1.js\"></script>\r\n");
      out.write("<script src=\"http://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js\"></script>\r\n");
      out.write("<script src=\"/jquery/jquery_validate_additionalREX.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\t\r\n");
      out.write("\tvar emailDuplicated = false;\r\n");
      out.write("</script>\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id='menuDiv' style='width: 100%; height: 10vh; border-color: black; border-style: solid; border-width: 1px;'>\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/menubar/menubar.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<div id='chat' style='width: 20%; height: 80vh; border-color: black; border-style: solid; border-width: 1px; float: left;' align=\"center\">\t\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/chat/chat.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t<div id='content' style='width: 60%; height: 80vh; border-color: black; border-style: solid; border-width: 1px; float: left;'>\t\t\r\n");
      out.write("\t\t<div style='width: 99.8%; height: 50vh;' align='center'>\r\n");
      out.write("\t\t\t<div style='margin-top: 30vh;'>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form method=\"post\" id='modifyForm' action='/action/User_modify'>\t\t\t\t\r\n");
      out.write("\t\t\t\t<div style=\"display: table; width: 40%;\">\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div style=\"display: table-row;\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t\t이름 : \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type='text' style=\"width: 99.8%; height: 2vh;\"   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"userName\"  >\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"display: table-row;\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t\t이메일 : \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\" style=\"width: 99.8%; height: 2vh;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userEmail }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"userEmail\" id='userEmail'>\r\n");
      out.write("\t\t\t\t\t\t\t<button type='button' id='emailDuplicatedCheck'>중복확인</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"display: table-row;\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t\t연락처 : \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" style=\"width: 99.8%; height: 2vh;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userPhone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"userPhone\"  >\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id='modifyBtn' style='margin-top:2vh;height:3vh;'>수정 완료</button>\r\n");
      out.write("\t\t\t\t</div>\t\t\r\n");
      out.write("</form>\t\t\t\t\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\t\t\t\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id='commercial' style='width: 19.5%; height: 80vh; border-color: black; border-style: solid; border-width: 1px; float: left;' align=\"center\">\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/ad/ad.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\t\t\t\r\n");
      out.write("\t<div id='footer' style='width: 99.8%; height: 10vh; border-color: black; border-style: solid; border-width: 1px; float: none;' align=\"center\" >\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/footer/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t    $('#modifyForm').validate({\r\n");
      out.write("\t        debug: false,\r\n");
      out.write("\t        onfocusout: false,\r\n");
      out.write("\t        rules: {\t        \t\r\n");
      out.write("\t           \t userName: {\r\n");
      out.write("\t                 required: true,\r\n");
      out.write("\t                 rangelength: [2, 20],\r\n");
      out.write("\t                 nameRex: true\r\n");
      out.write("\t             }, userEmail: {\r\n");
      out.write("\t                 required: true,\r\n");
      out.write("\t                 email: true,\r\n");
      out.write("\t                 maxlength:30\r\n");
      out.write("\t             }, userPhone: {\r\n");
      out.write("\t            \t required: true,\r\n");
      out.write("\t            \t rangelength: [6, 20],\r\n");
      out.write("\t            \t phoneRex: true\r\n");
      out.write("\t             }\r\n");
      out.write("\t        }, messages: {\r\n");
      out.write("\t        \tuserName: {\r\n");
      out.write("\t                 required: \"성함을 입력해주세요.\",\r\n");
      out.write("\t                 rangelength: \"이름은 2자에서 20자까지만 유효합니다.\",\r\n");
      out.write("\t                 nameRex:'이름은 대소영문자, 한글, 숫자만 가능합니다.'\r\n");
      out.write("\t             }, userEmail: {\r\n");
      out.write("\t                 required: \"이메일을 입력해주세요.\",\r\n");
      out.write("\t                 email: \"올바른 이메일 형식이 아닙니다.\",\r\n");
      out.write("\t                 maxlength: \"최대 30자까지만 입력할 수 있습니다.\"\r\n");
      out.write("\t             }, userPhone: {\r\n");
      out.write("\t            \t required: \"연락처를 입력해주세요.\",\r\n");
      out.write("\t            \t rangelength: \"6자에서 20자까지만 유효합니다.\",\r\n");
      out.write("\t            \t phoneRex: \"숫자만 입력 가능합니다.-는 생략해주십시오.\"\r\n");
      out.write("\t             } \t\r\n");
      out.write("\t        \t\r\n");
      out.write("\t           \r\n");
      out.write("\t        }, errorPlacement: function(error, element) {\r\n");
      out.write("\t        \t error.insertAfter(element);\t        \t\r\n");
      out.write("\t        }\r\n");
      out.write("\t    });\r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    //이메일 중복 확인 했는지//\r\n");
      out.write("\t    $('#modifyBtn').click(function(){\t    \t\r\n");
      out.write("\t    \tif(emailDuplicated==true){\r\n");
      out.write("\t    \t\t$('#modifyForm').submit();\r\n");
      out.write("\t    \t}\t    \t\r\n");
      out.write("\t    \telse if(emailDuplicated==false){\r\n");
      out.write("\t    \t\talert('이메일 중복확인을 해주세요!');\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    })\r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    //이메일 변화 시 중복확인 초기화//\t  \t    \r\n");
      out.write("\t    $('#userEmail').change(function(){\r\n");
      out.write("\t    \temailDuplicated=false;\r\n");
      out.write("\t    })\r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    $('#emailDuplicatedCheck').click(function(){\r\n");
      out.write("\t    \tconsole.log('DDD');\r\n");
      out.write("\t    \tvar userEmail=$('#userEmail').val();\r\n");
      out.write("\t    \tif(userEmail.match(/^([a-zA-Z0-9])+@([a-zA-Z0-9])+\\.([a-zA-Z0-9])+$/)/* &userEmail.length>=6&userEmail.length<=30 */){\r\n");
      out.write("\t    \t\t\r\n");
      out.write("\t    \t\tif(userEmail.length>=6&userEmail.length<=30){\r\n");
      out.write("\t    \t\t\t$.ajax({\r\n");
      out.write("\t\t\t    \t\turl:'/action/User_emailDuplicatedCheck2',\r\n");
      out.write("\t\t\t    \t\ttype:'post',\r\n");
      out.write("\t\t\t    \t\tdata: {userEmail:userEmail},\r\n");
      out.write("\t\t\t    \t\tdataType:'xml',\r\n");
      out.write("\t\t\t    \t\tsuccess:function(data){\r\n");
      out.write("\t\t\t    \t\t\tvar result = $(data).find('result').text().trim();\r\n");
      out.write("\t\t\t    \t\t\tresult=Number(result);\r\n");
      out.write("\t\t\t    \t\t\tconsole.log($(data).find('result').text().trim());\r\n");
      out.write("\t\t\t    \t\t\tif(result==0){\r\n");
      out.write("\t\t\t    \t\t\t\temailDuplicated=true;\t\t\t    \t\t\t\r\n");
      out.write("\t\t\t    \t\t\t\talert('사용가능한 이메일입니다.');\r\n");
      out.write("\t\t\t    \t\t\t}\r\n");
      out.write("\t\t\t    \t\t\telse if(result==1){\r\n");
      out.write("\t\t\t    \t\t\t\talert('이미 사용 중인 이메일입니다. 다른 이메일을 입력해주세요');\r\n");
      out.write("\t\t\t    \t\t\t}\r\n");
      out.write("\t\t\t    \t\t\telse{\r\n");
      out.write("\t\t\t    \t\t\t\tconsole.log('WTF!!!!');\r\n");
      out.write("\t\t\t    \t\t\t}\r\n");
      out.write("\t\t\t    \t\t},\r\n");
      out.write("\t\t\t    \t\terror:function(e){\r\n");
      out.write("\t\t\t    \t\t\tconsole.log(e.message);\r\n");
      out.write("\t\t\t    \t\t}\r\n");
      out.write("\t\t\t    \t})\r\n");
      out.write("\t    \t\t}\r\n");
      out.write("\t    \t\telse{\r\n");
      out.write("\t    \t\t\talert('이메일의 길이는 6자부터 30자까지만 가능합니다.');\r\n");
      out.write("\t    \t\t}\t    \t\t\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    \telse{\r\n");
      out.write("\t    \t\talert('알맞은 아이디 형식이 아닙니다.');\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    })\r\n");
      out.write("\t    \r\n");
      out.write("\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\r\n");
      out.write("\t\t$('#footer').ready(function() {\r\n");
      out.write("\t\t\t$('#footer').css('margin-top',$('#content').css('height'));\r\n");
      out.write("\t\t})\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(window).resize(function(){\r\n");
      out.write("\t\t\trelocateFooter();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t$('#footer').ready(function() {\r\n");
      out.write("\t\t\trelocateFooter();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction relocateFooter(){\r\n");
      out.write("\t\t\t$('#footer').css('margin-top',$('#content').css('height'));\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
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
      out.write("\t\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/user/l_user_modify.jsp(18,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty param.modifyError}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<script>\t\r\n");
          out.write("\talert('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.modifyError}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("');\r\n");
          out.write("</script>\t\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
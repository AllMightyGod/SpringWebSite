/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-10-10 08:13:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.logIn;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class p_005fjoin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script src=\"/jquery/jquery-3.2.1.js\"></script>\r\n");
      out.write("<script src=\"http://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js\"></script>\r\n");
      out.write("<script src=\"/jquery/jquery_validate_additionalREX.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tvar idDuplicated = false;\r\n");
      out.write("\tvar emailDuplicated = false;\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id='content'>\r\n");
      out.write("\t\t<div style='width: 99.8%; height: 50vh;' align='center'>\r\n");
      out.write("\t\t\t<div style='margin-top: 30vh;'>\r\n");
      out.write("\t\t \t<form method=\"post\" action=\"/action/User_join\" id='joinForm'>\t \r\n");
      out.write("\t\t\t\t<div style=\"display: table; width: 40%;\">\r\n");
      out.write("\t\t\t\t\t<div style=\"display: table-row; \">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell; \">\r\n");
      out.write("\t\t\t\t\t\tID : \r\n");
      out.write("</div>\r\n");
      out.write("\t \t\t\t\t\t<div style=\"display: table-cell;\">\t \t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t \t<input type=\"text\" name=\"userId\" id='userId' style=\"width: 60%; height: 2vh;\" >\r\n");
      out.write("\t\t\t\t\t\t \t<button type='button' id='idDuplicatedCheck'>重複検査 </button><br>\r\n");
      out.write("\t\t\t\t\t\t \t<span id='idDuplicatedCheckResult'>重複検査 してください！</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"display: table-row;\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t\t暗証番号 : \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t \t<input type='password' id=\"userPw\" name=\"userPw\" style=\"width: 99.8%; height: 2vh;\">\t \t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<div style=\"display: table-row;\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t\t暗証番号確認: \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t \t<input type='password' id=\"confirmPw\" name=\"confirmPw\" style=\"width: 99.8%; height: 2vh;\">\t \t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div style=\"display: table-row;\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t\tお名前 : \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t\t <input type='text' name=\"userName\" style=\"width: 99.8%; height: 2vh;\">\t \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"display: table-row;\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t\tメール : \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t \t<input type=\"text\" name=\"userEmail\" id='userEmail' style=\"width: 60%; height: 2vh;\">\t\r\n");
      out.write("\t\t\t\t\t\t \t<button type='button' id='emailDuplicatedCheck'>重複検査 </button> <br>\r\n");
      out.write("\t\t\t\t\t\t \t<span id='emailDuplicatedCheckResult'>重複検査 してください！</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"display: table-row;\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t\t連絡先 : \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display: table-cell;\">\r\n");
      out.write("\t\t\t\t\t\t \t<input type=\"text\" name=\"userPhone\" style=\"width: 99.8%; height: 2vh;\">\t\t \r\n");
      out.write("\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t \t<input type='button' id='joinBtn' value=\"加入\" style='margin-top:2vh;height:3vh;'>\t\t \r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t \t</form>\t\t \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t    $('#joinForm').validate({\r\n");
      out.write("\t        debug: false,\r\n");
      out.write("\t        onfocusout: false,\r\n");
      out.write("\t        rules: {\r\n");
      out.write("\t        \tuserId: {\r\n");
      out.write("\t                 required: true,\r\n");
      out.write("\t                 rangelength: [4, 20],\r\n");
      out.write("\t                 idRex: true \r\n");
      out.write("\t             }, userPw: {\r\n");
      out.write("\t                 required: true,\r\n");
      out.write("\t                 rangelength: [6, 20],\r\n");
      out.write("\t                 pwRex:true\r\n");
      out.write("\t             }, confirmPw: {\r\n");
      out.write("\t                 required: true,\r\n");
      out.write("\t                 rangelength: [6, 20],\r\n");
      out.write("\t                 equalTo: '#userPw'\r\n");
      out.write("\t             }, userName: {\r\n");
      out.write("\t                 required: true,\r\n");
      out.write("\t                 rangelength: [2, 20],\r\n");
      out.write("\t                 nameRex: true\r\n");
      out.write("\t             }, userEmail: {\r\n");
      out.write("\t                 required: true,\r\n");
      out.write("\t                 emailRex: true,\r\n");
      out.write("\t                 rangelength: [6, 30],\r\n");
      out.write("\t             }, userPhone: {\r\n");
      out.write("\t            \t required: true,\r\n");
      out.write("\t            \t rangelength: [6, 20],\r\n");
      out.write("\t            \t phoneRex: true\r\n");
      out.write("\t             }\r\n");
      out.write("\t        }, messages: {\r\n");
      out.write("\t        \tuserId: {\r\n");
      out.write("\t                 required: \"IDを入力してください。\",\r\n");
      out.write("\t                 rangelength: \"IDは４文字から２０文字まで可能です。\",\r\n");
      out.write("\t                 idRex:'IDは大文字・小文字の英文、数字、ハングルが可能です。'\r\n");
      out.write("\t             }, userPw: {\r\n");
      out.write("\t                 required: \"暗証番号を入力してください。\",\r\n");
      out.write("\t                 rangelength: \"暗証番号は６文字から２０文字まで可能です。\",\r\n");
      out.write("\t                 pwRex: '暗証番号は大文字・小文字の英文、数字、ハングル、特殊文字!@#$%^&が可能です。'\r\n");
      out.write("\t             }, confirmPw: {\r\n");
      out.write("\t                 required: \"暗証番号を確認してください。\",\r\n");
      out.write("\t                 rangelength: \"暗証番号は６文字から２０文字まで可能です。\",\r\n");
      out.write("\t                 equalTo: '暗証番号一致しません。確認してください。'\r\n");
      out.write("\t             }, userName: {\r\n");
      out.write("\t                 required: \"お名前を入力してください。\",\r\n");
      out.write("\t                 rangelength: \"お名前は２文字から２０文字まで可能です。\",\r\n");
      out.write("\t                 nameRex:'暗証番号は大文字・小文字の英文、数字、ハングルが可能です。'\r\n");
      out.write("\t             }, userEmail: {\r\n");
      out.write("\t                 required: \"メールを入力してください。\",\r\n");
      out.write("\t                 emailRex: \"正しい形式ではございません。\",\r\n");
      out.write("\t                 maxlength: \"メールは６文字から３０文字まで可能です。\"\r\n");
      out.write("\t             }, userPhone: {\r\n");
      out.write("\t            \t required: \"連絡先を入力してください。\",\r\n");
      out.write("\t            \t rangelength: \"６文字から２０文字まで可能です。\",\r\n");
      out.write("\t            \t phoneRex: \"数字のみ入力してください。\"\r\n");
      out.write("\t             } \t\r\n");
      out.write("\t        \t\r\n");
      out.write("\t           \r\n");
      out.write("\t        }, errorPlacement: function(error, element) {\r\n");
      out.write("\t        \t error.insertAfter(element);\t        \t\r\n");
      out.write("\t        }\r\n");
      out.write("\t    });\r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    //아이디, 이메일 중복 확인 했는지//\r\n");
      out.write("\t    $('#joinBtn').click(function(){\t    \t\r\n");
      out.write("\t    \tif(idDuplicated==true & emailDuplicated==true){\r\n");
      out.write("\t    \t\t$('#joinForm').submit();\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    \telse if(idDuplicated==false){\r\n");
      out.write("\t    \t\talert('ID重複検査してください！');\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    \telse if(emailDuplicated==false){\r\n");
      out.write("\t    \t\talert('メール重複検査してください！');\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    })\r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    //아이디, 이메일 변화 시 중복확인 초기화//\r\n");
      out.write("\t    $('#userId').change(function() {\n");
      out.write("\t    \tidDuplicated=false;\r\n");
      out.write("\t    \t$('#idDuplicatedCheckResult').text('重複検査してください！');\n");
      out.write("\t    })\r\n");
      out.write("\t    \r\n");
      out.write("\t    $('#userEmail').change(function(){\r\n");
      out.write("\t    \temailDuplicated=false;\r\n");
      out.write("\t    \t$('#emailDuplicatedCheckResult').text('重複検査してください！');\r\n");
      out.write("\t    })\r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    $('#idDuplicatedCheck').click(function(){\r\n");
      out.write("\t    \tvar userId=$('#userId').val();\r\n");
      out.write("\t    \tif(userId.match(/^[A-Za-z0-9ㄱ-ㅎ|ㅏ-ㅣ|가-힣]{4,20}$/)){\r\n");
      out.write("\t    \t\t$.ajax({\r\n");
      out.write("\t\t    \t\turl:'/action/User_idDuplicatedCheck',\r\n");
      out.write("\t\t    \t\ttype:'post',\r\n");
      out.write("\t\t    \t\tdata: {userId:userId},\r\n");
      out.write("\t\t    \t\tdataType:'xml',\r\n");
      out.write("\t\t    \t\tsuccess:function(data){\r\n");
      out.write("\t\t    \t\t\tvar result = $(data).find('result').text().trim();\r\n");
      out.write("\t\t    \t\t\tresult=Number(result);\r\n");
      out.write("\t\t    \t\t\tconsole.log($(data).find('result').text().trim());\r\n");
      out.write("\t\t    \t\t\tif(result==0){\r\n");
      out.write("\t\t    \t\t\t\tidDuplicated=true;\r\n");
      out.write("\t\t    \t\t\t\t$('#idDuplicatedCheckResult').text('使用可能');\r\n");
      out.write("\t\t    \t\t\t\talert('使用可能なIDです。');\r\n");
      out.write("\t\t    \t\t\t}\r\n");
      out.write("\t\t    \t\t\telse if(result==1){\r\n");
      out.write("\t\t    \t\t\t\talert('すでに使用中でございます。他のIDを入力してください。');\r\n");
      out.write("\t\t    \t\t\t}\r\n");
      out.write("\t\t    \t\t\telse{\r\n");
      out.write("\t\t    \t\t\t\tconsole.log('WTF!!!!');\r\n");
      out.write("\t\t    \t\t\t}\r\n");
      out.write("\t\t    \t\t},\r\n");
      out.write("\t\t    \t\terror:function(e){\r\n");
      out.write("\t\t    \t\t\tconsole.log(e.message);\r\n");
      out.write("\t\t    \t\t}\r\n");
      out.write("\t\t    \t})\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    \telse{\r\n");
      out.write("\t    \t\talert('正しい形式ではございません。');\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    })\r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    $('#emailDuplicatedCheck').click(function(){\r\n");
      out.write("\t    \tvar userEmail=$('#userEmail').val();\r\n");
      out.write("\t    \tif(userEmail.match(/^[0-9a-zA-Z][_0-9a-zA-Z-]*@[_0-9a-zA-Z-]+(\\.[_0-9a-zA-Z-]+)$/)){\r\n");
      out.write("\t    \t\t\r\n");
      out.write("\t    \t\tif(userEmail.length>=6&userEmail.length<=30){\r\n");
      out.write("\t    \t\t\t$.ajax({\r\n");
      out.write("\t\t\t    \t\turl:'/action/User_emailDuplicatedCheck',\r\n");
      out.write("\t\t\t    \t\ttype:'post',\r\n");
      out.write("\t\t\t    \t\tdata: {userEmail:userEmail},\r\n");
      out.write("\t\t\t    \t\tdataType:'xml',\r\n");
      out.write("\t\t\t    \t\tsuccess:function(data){\r\n");
      out.write("\t\t\t    \t\t\tvar result = $(data).find('result').text().trim();\r\n");
      out.write("\t\t\t    \t\t\tresult=Number(result);\r\n");
      out.write("\t\t\t    \t\t\tconsole.log($(data).find('result').text().trim());\r\n");
      out.write("\t\t\t    \t\t\tif(result==0){\r\n");
      out.write("\t\t\t    \t\t\t\temailDuplicated=true;\r\n");
      out.write("\t\t\t    \t\t\t\t$('#emailDuplicatedCheckResult').text('使用可能');\r\n");
      out.write("\t\t\t    \t\t\t\talert('使用可能なメールです。');\r\n");
      out.write("\t\t\t    \t\t\t}\r\n");
      out.write("\t\t\t    \t\t\telse if(result==1){\r\n");
      out.write("\t\t\t    \t\t\t\talert('すでに使用中でございます。他のメールを入力してください。');\r\n");
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
      out.write("\t    \t\t\talert('メールは６文字から３０文字まで可能です。');\r\n");
      out.write("\t    \t\t}\t    \t\t\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    \telse{\r\n");
      out.write("\t    \t\talert('正しい形式ではございません。');\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    })\r\n");
      out.write("\t    \r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
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
      out.write("\t\t\r\n");
      out.write("\t\r\n");
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
      // /jsp/logIn/p_join.jsp(27,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty param.joinError}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("<script>\r\n");
          out.write("$(function(){\r\n");
          out.write("\t$(window).ready(function(){\r\n");
          out.write("\t\talert('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.joinError}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("');\r\n");
          out.write("\t})\r\n");
          out.write("})\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("</script>\r\n");
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

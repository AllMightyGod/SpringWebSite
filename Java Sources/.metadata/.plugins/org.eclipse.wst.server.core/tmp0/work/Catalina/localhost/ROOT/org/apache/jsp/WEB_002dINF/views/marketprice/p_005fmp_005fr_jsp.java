/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-10-10 08:35:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.marketprice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.in.team2.vo.MPVO;
import java.util.List;
import com.in.team2.vo.MsgVO;

public final class p_005fmp_005fr_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.in.team2.vo.MPVO");
    _jspx_imports_classes.add("com.in.team2.vo.MsgVO");
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
      out.write("\r\n");
      out.write("<script src='/jquery/jquery-3.2.1.js'></script>\r\n");
      out.write("<script src=\"https://code.highcharts.com/highcharts.js\"></script>\r\n");
      out.write("<script src=\"https://code.highcharts.com/modules/exporting.js\"></script>\r\n");
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
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$('#itemName').empty();\t\t\r\n");
      out.write("\t\t$('#itemCategory').val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mp.itemCategory}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'); \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($('#itemCategory').val()==\"製造社選択\"){\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl:'/action/returnItemName?itemCategory='+$(\"#itemCategory\").val(),\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tdataType:'xml',\r\n");
      out.write("\t\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t\tvar itemNames = $($(data).find('result')).find('item');\r\n");
      out.write("\t\t\t\t\tvar itemName=null;\r\n");
      out.write("\t\t\t\t\tfor(i=0;i<itemNames.length;i++){\r\n");
      out.write("\t\t\t\t\t\titemName=itemNames[i];\r\n");
      out.write("\t\t\t\t\t\t$('#itemName').append(\"<option>\"+($(itemName).text()).trim()+\"</option>\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$('#itemName').val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mp.itemName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("\t\t\t\t\t$('#itemClass').val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mp.itemClass}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar searchInterval = document.getElementsByName('searchInterval');\r\n");
      out.write("\t\t\t\t\tsearchInterval = searchInterval[0];\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(searchInterval).val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mp.searchInterval}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("\t\t\t\t\t \r\n");
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
      out.write("\t\tif($('#itemCategory').val()==\"製造社選択\"){\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl:'/action/returnItemName?itemCategory='+$(\"#itemCategory\").val(),\r\n");
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
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror: function(e){\r\n");
      out.write("\t\t\t\t\tconsole.log(\"ERROR! \"+e.message)\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t$('#search').click(function(){\r\n");
      out.write("\t\tif($('#itemCategory').val()!=\"製造社選択\"){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('#searchForm').submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("})\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id='content'>\r\n");
      out.write("\t\t<div style='border-bottom-color: black; border-bottom-style: solid; border-bottom-width: 1px; margin-top: 2vh;'>\r\n");
      out.write("\t\t\t<div style=\"margin-left: 2% \">\r\n");
      out.write("\t\t\t\t<form action='/action/MP_seacrhPrice' method='get' id='searchForm'>\r\n");
      out.write("\t\t\t\t\t\t<select id='itemCategory' name='itemCategory' style='width: 10%;height: 3vh;'>\r\n");
      out.write("\t\t\t\t\t\t\t<option>SAMSUNG</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>APPLE</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>LG</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<select id='itemName' name='itemName' style='width: 15%;height: 3vh;'>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<select id='itemClass' name='itemClass' style='width: 10%;height: 3vh;'>\r\n");
      out.write("\t\t\t\t\t\t\t<option selected=\"selected\">A</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>B</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>C</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<a>今日から</a>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<select name='searchInterval' style='width: 10%;height: 3vh;'>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='week'>１週間</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='month'>１ヶ月間</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='3months'>３ヶ月間</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='6months'>６ヶ月間</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='year'>１年間</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<button type='button' id='search'>相場検索</button>\r\n");
      out.write("\t\t\t\t\t</form>\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t<div id=\"container\" style=\"width: 60%; margin-top: 10vh;\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- content div ends-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
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
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t\tHighcharts.setOptions({\r\n");
      out.write("\t\t    lang: {\r\n");
      out.write("\t\t        numericSymbols: null //otherwise by default ['k', 'M', 'G', 'T', 'P', 'E']\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tHighcharts.chart('container', {\r\n");
      out.write("\r\n");
      out.write("\t\t    title: {\r\n");
      out.write("\t\t        text: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mp.itemCategory}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('会');
      out.write('社');
      out.write('の');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mp.itemName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("製品(等級:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mp.itemClass}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(')');
      out.write('の');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${searchInterval}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("の平均相場'\r\n");
      out.write("\t\t    },\r\n");
      out.write("\r\n");
      out.write("\t\t    xAxis:{\r\n");
      out.write("                categories:[");

            		List<MPVO> list = ((MPVO)request.getAttribute("mp")).getResultSet();
            		for(int i=0;i<list.size();i++){
      out.write("\r\n");
      out.write("            \t\t'");
      out.print(list.get(i).getSearchInterval());
      out.write("'\r\n");
      out.write("            \t\t");
if(i!=list.size()-1){
      out.write("\r\n");
      out.write("        \t\t\t\t,\r\n");
      out.write("            \t\t");
}
      out.write("\t\t        \t\t\r\n");
      out.write("            \t\t");
}
            	
      out.write("]\r\n");
      out.write("            }, \r\n");
      out.write("\r\n");
      out.write("\t\t    yAxis: {\r\n");
      out.write("\t\t        title: {\r\n");
      out.write("\t\t            text: '平均価格'\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    },\r\n");
      out.write("\t\t    legend: {\r\n");
      out.write("\t\t        layout: 'vertical',\r\n");
      out.write("\t\t        align: 'right',\r\n");
      out.write("\t\t        verticalAlign: 'middle'\r\n");
      out.write("\t\t    },\r\n");
      out.write("\r\n");
      out.write("\t\t      \r\n");
      out.write("\t\t    series: [{\r\n");
      out.write("\t\t        name: null,\r\n");
      out.write("\t\t        data: [\r\n");
      out.write("\t\t        \t\r\n");
      out.write("\t\t        \t");

		        		for(int i=0;i<list.size();i++){
      out.write("\r\n");
      out.write("\t\t        \t\t");
      out.print(list.get(i).getItemCurPrice());
      out.write("\r\n");
      out.write("\t\t        \t\t");
if(i!=list.size()-1){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t,\r\n");
      out.write("\t\t        \t\t");
}
      out.write("\t\t        \t\t\r\n");
      out.write("\t\t        \t\t");
}
		        	
      out.write("\r\n");
      out.write("\t\t        \t\r\n");
      out.write("\t\t        \t]\r\n");
      out.write("\t\t    }],\r\n");
      out.write("\r\n");
      out.write("\t\t    responsive: {\r\n");
      out.write("\t\t        rules: [{\r\n");
      out.write("\t\t            condition: {\r\n");
      out.write("\t\t                maxWidth: 500\r\n");
      out.write("\t\t            },\r\n");
      out.write("\t\t            chartOptions: {\r\n");
      out.write("\t\t                legend: {\r\n");
      out.write("\t\t                    layout: 'horizontal',\r\n");
      out.write("\t\t                    align: 'center',\r\n");
      out.write("\t\t                    verticalAlign: 'bottom'\r\n");
      out.write("\t\t                }\r\n");
      out.write("\t\t            }\r\n");
      out.write("\t\t        }]\r\n");
      out.write("\t\t    }\r\n");
      out.write("\r\n");
      out.write("\t\t});\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</script>\r\n");
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

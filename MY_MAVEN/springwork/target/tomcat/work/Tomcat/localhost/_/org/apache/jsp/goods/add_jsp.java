/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2019-01-04 09:25:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>预约详情页</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/css/bootstrap-theme.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/css/bootstrap-datetimepicker.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.11.3.js\" charset=\"UTF-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/js/bootstrap-datetimepicker.js\" charset=\"UTF-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/js/bootstrap-datetimepicker.zh-CN.js\" charset=\"UTF-8\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t/* 日期插件 */\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t$('.form_date').datetimepicker({\r\n");
      out.write("\t\t        language:  'zh-CN',\r\n");
      out.write("\t\t        weekStart: 1,\r\n");
      out.write("\t\t        todayBtn:  1,\r\n");
      out.write("\t\t\t\tautoclose: 1,\r\n");
      out.write("\t\t\t\ttodayHighlight: 1,\r\n");
      out.write("\t\t\t\tstartView: 2,\r\n");
      out.write("\t\t\t\tminView: 2,\r\n");
      out.write("\t\t\t\tforceParse: 0\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function () {\r\n");
      out.write("            //查询所有的类\r\n");
      out.write("            $.get(\"/category/findAll\",function (data) {\r\n");
      out.write("\t\t\t\tvar categorys=data.data\r\n");
      out.write("\t\t\t\tfor (var i = 0; i < categorys.length; i++){\r\n");
      out.write("                    var category = categorys[i];\r\n");
      out.write("                    var ht = \"<option value='\" + category.cid + \"'>\" + category.cname + \"</option>\";\r\n");
      out.write("                    $(\"#categoryId\").append($(ht));\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("            },\"json\")\r\n");
      out.write("        })\r\n");
      out.write("\t\tfunction cheak() {\r\n");
      out.write("            //获取输入框中的值\r\n");
      out.write("            var goodsName = $(\"#goodsName\").val();\r\n");
      out.write("            //alert(goodsName)\r\n");
      out.write("            //发送异步请求\r\n");
      out.write("            $.post(\"/goods/findByName\", {goods_name: goodsName}, function (data) {\r\n");
      out.write("                if (data.flag) {\r\n");
      out.write("                    $(\"#checkName\").html(data.errorMsg);\r\n");
      out.write("                } else {\r\n");
      out.write("                    $(\"#checkName\").html(\"可以放心使用\");\r\n");
      out.write("                }\r\n");
      out.write("            }, \"json\")\r\n");
      out.write("        }\r\n");
      out.write("\t\t\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t<div class=\"panel-heading text-center\">\r\n");
      out.write("\t\t\t\t<h2>商品添加</h2>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 商品添加form表单 -->\r\n");
      out.write("\t\t\t<form action=\"/goods/add\" method=\"post\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t<table class=\"table table-hover\">\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"goodsName\">商品名称</label> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" onblur=\"cheak()\" name=\"goods_name\" value=\"\" class=\"form-control\" id=\"goodsName\" placeholder=\"商品名称\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"checkName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- 输入数量鼠标离焦后，此处展示商品名称是否可用提示信息 -->\r\n");
      out.write("                                    \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"categoryId\">商品分类</label> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select name=\"cid\" id=\"categoryId\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>-- 请选择分类 --</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"goodsNumber\">商品数量</label> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"goods_number\" value=\"\" class=\"form-control\" id=\"goodsNumber\" placeholder=\"商品数量\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"goodsPrice\">商品价格</label> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"goods_price\" value=\"\" class=\"form-control\" id=\"goodsPrice\" placeholder=\"商品价格\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t                <label class=\"control-label\">保质期</label>\r\n");
      out.write("\t\t\t\t\t\t                <div class=\"controls input-append date form_date\" data-date=\"\" data-date-format=\"yyyy-mm-dd\" data-link-field=\"guaranteePeriod\" data-link-format=\"yyyy-mm-dd\">\r\n");
      out.write("\t\t\t\t\t\t                    <input size=\"26\" type=\"text\" value=\"\" readonly>\r\n");
      out.write("\t\t\t\t\t\t                    <span class=\"add-on\"><i class=\"icon-remove\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-th\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t\t\t                <!-- 保质期：选择日期会自动赋值给下面输入框value-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"guaranteePeriod\" name=\"guarantee_period\" value=\"\" /><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"panel-body text-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- 表单提交按钮 -->\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary btn-lg\" >\r\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-copy\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t添加商品\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-07-05 03:40:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>EShopper - Bootstrap Shop Template</title>\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("    <meta content=\"Free HTML Templates\" name=\"keywords\">\r\n");
      out.write("    <meta content=\"Free HTML Templates\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Web Fonts -->\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\"> \r\n");
      out.write("\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Libraries Stylesheet -->\r\n");
      out.write("    <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Topbar Start -->\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row bg-secondary py-2 px-xl-5\">\r\n");
      out.write("            <div class=\"col-lg-6 d-none d-lg-block\">\r\n");
      out.write("                <div class=\"d-inline-flex align-items-center\">\r\n");
      out.write("                    <a class=\"text-dark\" href=\"\">FAQs</a>\r\n");
      out.write("                    <span class=\"text-muted px-2\">|</span>\r\n");
      out.write("                    <a class=\"text-dark\" href=\"\">Help</a>\r\n");
      out.write("                    <span class=\"text-muted px-2\">|</span>\r\n");
      out.write("                    <a class=\"text-dark\" href=\"\">Support</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-6 text-center text-lg-right\">\r\n");
      out.write("                <div class=\"d-inline-flex align-items-center\">\r\n");
      out.write("                    <a class=\"text-dark px-2\" href=\"\">\r\n");
      out.write("                        <i class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a class=\"text-dark px-2\" href=\"\">\r\n");
      out.write("                        <i class=\"fab fa-twitter\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a class=\"text-dark px-2\" href=\"\">\r\n");
      out.write("                        <i class=\"fab fa-linkedin-in\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a class=\"text-dark px-2\" href=\"\">\r\n");
      out.write("                        <i class=\"fab fa-instagram\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a class=\"text-dark pl-2\" href=\"\">\r\n");
      out.write("                        <i class=\"fab fa-youtube\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row align-items-center py-3 px-xl-5\">\r\n");
      out.write("            <div class=\"col-lg-3 d-none d-lg-block\">\r\n");
      out.write("                <a href=\"\" class=\"text-decoration-none\">\r\n");
      out.write("                    <h1 class=\"m-0 display-5 font-weight-semi-bold\"><span class=\"text-primary font-weight-bold border px-3 mr-1\">E</span>Shopper</h1>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("            <div class=\"col-lg-3 col-6 text-right\">\r\n");
      out.write("                <a href=\"\" class=\"btn border\">\r\n");
      out.write("                    <i class=\"fas fa-heart text-primary\"></i>\r\n");
      out.write("                    <span class=\"badge\">0</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"\" class=\"btn border\">\r\n");
      out.write("                    <i class=\"fas fa-shopping-cart text-primary\"></i>\r\n");
      out.write("                    <span class=\"badge\">0</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Topbar End -->\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <div class=\"col-lg-9\">\r\n");
      out.write("                <nav class=\"navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0\">\r\n");
      out.write("                    <a href=\"\" class=\"text-decoration-none d-block d-lg-none\">\r\n");
      out.write("                        <h1 class=\"m-0 display-5 font-weight-semi-bold\"><span class=\"text-primary font-weight-bold border px-3 mr-1\">E</span>Shopper</h1>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\r\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\r\n");
      out.write("                        <div class=\"navbar-nav mr-auto py-0\">\r\n");
      out.write("                            <a href=\"index.jsp\" class=\"nav-item nav-link active\">Home</a>\r\n");
      out.write("                            <a href=\"shop.jsp\" class=\"nav-item nav-link\">Shop</a>\r\n");
      out.write("                            <a href=\"detail.jsp\" class=\"nav-item nav-link\">Shop Detail</a>\r\n");
      out.write("                            <div class=\"nav-item dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Pages</a>\r\n");
      out.write("                                <div class=\"dropdown-menu rounded-0 m-0\">\r\n");
      out.write("                                    <a href=\"cart.html\" class=\"dropdown-item\">Shopping Cart</a>\r\n");
      out.write("                                    <a href=\"checkout.html\" class=\"dropdown-item\">Checkout</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a href=\"contact.jsp\" class=\"nav-item nav-link\">Contact</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"navbar-nav ml-auto py-0\">\r\n");
      out.write("                            \r\n");
      out.write("                           \r\n");
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("<br>	\r\n");
      out.write("<br>");
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
/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-01-29 17:55:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.vue.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("\r\n");
      out.write("    <title>Components / Accordion - NiceAdmin Bootstrap Template</title>\r\n");
      out.write("    <meta content=\"\" name=\"description\">\r\n");
      out.write("    <meta content=\"\" name=\"keywords\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicons -->\r\n");
      out.write("    <link href=\"public/assets/images/icons/favicon.ico\" rel=\"icon\">\r\n");
      out.write("    <link href=\"public/assets/images/icons/map-marker.png\" rel=\"apple-touch-icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Fonts -->\r\n");
      out.write("    <link href=\"https://fonts.gstatic.com\" rel=\"preconnect\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Vendor CSS Files -->\r\n");
      out.write("    <link href=\"public/assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"public/assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"public/assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"public/assets/vendor/quill/quill.snow.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"public/assets/vendor/quill/quill.bubble.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"public/assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"public/assets/vendor/simple-datatables/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Main CSS File -->\r\n");
      out.write("    <link href=\"public/assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- =======================================================\r\n");
      out.write("    * Template Name: NiceAdmin - v2.4.1\r\n");
      out.write("    * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/\r\n");
      out.write("    * Author: BootstrapMade.com\r\n");
      out.write("    * License: https://bootstrapmade.com/license/\r\n");
      out.write("    ======================================================== -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- ======= Header ======= -->\r\n");
      out.write("<header id=\"header\" class=\"header fixed-top d-flex align-items-center\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"d-flex align-items-center justify-content-between\">\r\n");
      out.write("        <a href=\"index.html\" class=\"logo d-flex align-items-center\">\r\n");
      out.write("            <images src=\"assets/images/logo.png\" alt=\"\">\r\n");
      out.write("                <span class=\"d-none d-lg-block\">NiceAdmin</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <i class=\"bi bi-list toggle-sidebar-btn\"></i>\r\n");
      out.write("    </div><!-- End Logo -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"search-bar\">\r\n");
      out.write("        <form class=\"search-form d-flex align-items-center\" method=\"POST\" action=\"#\">\r\n");
      out.write("            <input type=\"text\" name=\"query\" placeholder=\"Search\" title=\"Enter search keyword\">\r\n");
      out.write("            <button type=\"submit\" title=\"Search\"><i class=\"bi bi-search\"></i></button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div><!-- End Search Bar -->\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"header-nav ms-auto\">\r\n");
      out.write("        <ul class=\"d-flex align-items-center\">\r\n");
      out.write("\r\n");
      out.write("            <li class=\"nav-item d-block d-lg-none\">\r\n");
      out.write("                <a class=\"nav-link nav-icon search-bar-toggle \" href=\"#\">\r\n");
      out.write("                    <i class=\"bi bi-search\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li><!-- End Search Icon-->\r\n");
      out.write("\r\n");
      out.write("            <li class=\"nav-item dropdown\">\r\n");
      out.write("\r\n");
      out.write("                <a class=\"nav-link nav-icon\" href=\"#\" data-bs-toggle=\"dropdown\">\r\n");
      out.write("                    <i class=\"bi bi-bell\"></i>\r\n");
      out.write("                    <span class=\"badge bg-primary badge-number\">4</span>\r\n");
      out.write("                </a><!-- End Notification Icon -->\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow notifications\">\r\n");
      out.write("                    <li class=\"dropdown-header\">\r\n");
      out.write("                        You have 4 new notifications\r\n");
      out.write("                        <a href=\"#\"><span class=\"badge rounded-pill bg-primary p-2 ms-2\">View all</span></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <hr class=\"dropdown-divider\">\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"notification-item\">\r\n");
      out.write("                        <i class=\"bi bi-exclamation-circle text-warning\"></i>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <h4>Lorem Ipsum</h4>\r\n");
      out.write("                            <p>Quae dolorem earum veritatis oditseno</p>\r\n");
      out.write("                            <p>30 min. ago</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <hr class=\"dropdown-divider\">\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"notification-item\">\r\n");
      out.write("                        <i class=\"bi bi-x-circle text-danger\"></i>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <h4>Atque rerum nesciunt</h4>\r\n");
      out.write("                            <p>Quae dolorem earum veritatis oditseno</p>\r\n");
      out.write("                            <p>1 hr. ago</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <hr class=\"dropdown-divider\">\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"notification-item\">\r\n");
      out.write("                        <i class=\"bi bi-check-circle text-success\"></i>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <h4>Sit rerum fuga</h4>\r\n");
      out.write("                            <p>Quae dolorem earum veritatis oditseno</p>\r\n");
      out.write("                            <p>2 hrs. ago</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <hr class=\"dropdown-divider\">\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"notification-item\">\r\n");
      out.write("                        <i class=\"bi bi-info-circle text-primary\"></i>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <h4>Dicta reprehenderit</h4>\r\n");
      out.write("                            <p>Quae dolorem earum veritatis oditseno</p>\r\n");
      out.write("                            <p>4 hrs. ago</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <hr class=\"dropdown-divider\">\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"dropdown-footer\">\r\n");
      out.write("                        <a href=\"#\">Show all notifications</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </ul><!-- End Notification Dropdown Items -->\r\n");
      out.write("\r\n");
      out.write("            </li><!-- End Notification Nav -->\r\n");
      out.write("\r\n");
      out.write("            <li class=\"nav-item dropdown\">\r\n");
      out.write("\r\n");
      out.write("                <a class=\"nav-link nav-icon\" href=\"#\" data-bs-toggle=\"dropdown\">\r\n");
      out.write("                    <i class=\"bi bi-chat-left-text\"></i>\r\n");
      out.write("                    <span class=\"badge bg-success badge-number\">3</span>\r\n");
      out.write("                </a><!-- End Messages Icon -->\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow messages\">\r\n");
      out.write("                    <li class=\"dropdown-header\">\r\n");
      out.write("                        You have 3 new messages\r\n");
      out.write("                        <a href=\"#\"><span class=\"badge rounded-pill bg-primary p-2 ms-2\">View all</span></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <hr class=\"dropdown-divider\">\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"message-item\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <images src=\"public/assets/images/messages-1.jpg\" alt=\"\" class=\"rounded-circle\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <h4>Maria Hudson</h4>\r\n");
      out.write("                                    <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>\r\n");
      out.write("                                    <p>4 hrs. ago</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <hr class=\"dropdown-divider\">\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"message-item\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <images src=\"public/assets/images/messages-2.jpg\" alt=\"\" class=\"rounded-circle\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <h4>Anna Nelson</h4>\r\n");
      out.write("                                    <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>\r\n");
      out.write("                                    <p>6 hrs. ago</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <hr class=\"dropdown-divider\">\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"message-item\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <images src=\"public/assets/images/messages-3.jpg\" alt=\"\" class=\"rounded-circle\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <h4>David Muldon</h4>\r\n");
      out.write("                                    <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>\r\n");
      out.write("                                    <p>8 hrs. ago</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <hr class=\"dropdown-divider\">\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"dropdown-footer\">\r\n");
      out.write("                        <a href=\"#\">Show all messages</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </ul><!-- End Messages Dropdown Items -->\r\n");
      out.write("\r\n");
      out.write("            </li><!-- End Messages Nav -->\r\n");
      out.write("\r\n");
      out.write("            <li class=\"nav-item dropdown pe-3\">\r\n");
      out.write("\r\n");
      out.write("                <a class=\"nav-link nav-profile d-flex align-items-center pe-0\" href=\"#\" data-bs-toggle=\"dropdown\">\r\n");
      out.write("                    <images src=\"public/assets/images/profile-images.jpg\" alt=\"Profile\" class=\"rounded-circle\">\r\n");
      out.write("                        <span class=\"d-none d-md-block dropdown-toggle ps-2\">K. Anderson</span>\r\n");
      out.write("                </a><!-- End Profile Iamge Icon -->\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow profile\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"dropdown-item d-flex align-items-center\" href=\"/Logout\">\r\n");
      out.write("                            <i class=\"bi bi-box-arrow-right\"></i>\r\n");
      out.write("                            <span>Se deconnecter</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </ul><!-- End Profile Dropdown Items -->\r\n");
      out.write("            </li><!-- End Profile Nav -->\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav><!-- End Icons Navigation -->\r\n");
      out.write("\r\n");
      out.write("</header><!-- End Header -->\r\n");
      out.write("\r\n");
      out.write("<!-- ======= Sidebar ======= -->\r\n");
      out.write("<aside id=\"sidebar\" class=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"sidebar-nav\" id=\"sidebar-nav\">\r\n");
      out.write("\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link collapsed\" href=\"index.html\">\r\n");
      out.write("                <i class=\"bi bi-grid\"></i>\r\n");
      out.write("                <span>Dashboard</span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li><!-- End Dashboard Nav -->\r\n");
      out.write("\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link collapsed\" data-bs-target=\"#components-nav\" data-bs-toggle=\"collapse\" href=\"#\">\r\n");
      out.write("                <i class=\"bi bi-menu-button-wide\"></i><span>Role</span><i class=\"bi bi-chevron-down ms-auto\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul id=\"components-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"/Role\">\r\n");
      out.write("                        <i class=\"bi bi-circle\"></i><span>Ajout Role</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"/List/Role\">\r\n");
      out.write("                        <i class=\"bi bi-circle\"></i><span>Liste Role</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li><!-- End Components Nav -->\r\n");
      out.write("\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link collapsed\" data-bs-target=\"#forms-nav\" data-bs-toggle=\"collapse\" href=\"#\">\r\n");
      out.write("                <i class=\"bi bi-journal-text\"></i><span>User</span><i class=\"bi bi-chevron-down ms-auto\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul id=\"forms-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"/User\">\r\n");
      out.write("                        <i class=\"bi bi-circle\"></i><span>Ajout User</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"/List/User\">\r\n");
      out.write("                        <i class=\"bi bi-circle\"></i><span>Liste User</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li><!-- End Forms Nav -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("</aside><!-- End Sidebar-->\r\n");
      out.write("\r\n");
      out.write("<main id=\"main\" class=\"main\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"pagetitle\">\r\n");
      out.write("        <h1>Home Page</h1>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ol class=\"breadcrumb\">\r\n");
      out.write("                <li class=\"breadcrumb-item\"><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                <li class=\"breadcrumb-item\">Home</li>\r\n");
      out.write("                <li class=\"breadcrumb-item active\">Home</li>\r\n");
      out.write("            </ol>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div><!-- End Page Title -->\r\n");
      out.write("\r\n");
      out.write("    <section class=\"section\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            ");
 if(request.getAttribute("success") != null) {
      out.write("\r\n");
      out.write("            <div style=\"background-color: greenyellow; margin-bottom: 30px; text-align: center; border-radius: 30px; padding: 10px; color: black\">");
      out.print(request.getAttribute("success"));
      out.write("</div>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("            <div class=\"col-lg-6\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <h5 class=\"card-title\">BIENVENUE DANS GESTION SCOLARITE</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("</main><!-- End #main -->\r\n");
      out.write("\r\n");
      out.write("<!-- ======= Footer ======= -->\r\n");
      out.write("<footer id=\"footer\" class=\"footer fixed-bottom\">\r\n");
      out.write("    <div class=\"copyright\">\r\n");
      out.write("        &copy; Copyright <strong><span>NiceAdmin</span></strong>. All Rights Reserved\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"credits\">\r\n");
      out.write("        <!-- All the links in the footer should remain intact. -->\r\n");
      out.write("        <!-- You can delete the links only if you purchased the pro version. -->\r\n");
      out.write("        <!-- Licensing information: https://bootstrapmade.com/license/ -->\r\n");
      out.write("        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/ -->\r\n");
      out.write("        Designed by <a href=\"https://bootstrapmade.com/\">BootstrapMade</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer><!-- End Footer -->\r\n");
      out.write("\r\n");
      out.write("<a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>\r\n");
      out.write("\r\n");
      out.write("<!-- Vendor JS Files -->\r\n");
      out.write("<script src=\"public/assets/vendor/apexcharts/apexcharts.min.js\"></script>\r\n");
      out.write("<script src=\"public/assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<script src=\"public/assets/vendor/chart.js/chart.min.js\"></script>\r\n");
      out.write("<script src=\"public/assets/vendor/echarts/echarts.min.js\"></script>\r\n");
      out.write("<script src=\"public/assets/vendor/quill/quill.min.js\"></script>\r\n");
      out.write("<script src=\"public/assets/vendor/simple-datatables/simple-datatables.js\"></script>\r\n");
      out.write("<script src=\"public/assets/vendor/tinymce/tinymce.min.js\"></script>\r\n");
      out.write("<script src=\"public/assets/vendor/php-email-form/validate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Template Main JS File -->\r\n");
      out.write("<script src=\"public/assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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

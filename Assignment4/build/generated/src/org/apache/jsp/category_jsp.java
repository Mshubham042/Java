package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Category</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("<!-- JavaScript Bundle with Popper -->\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"container\">\n");
      out.write("        \n");
      out.write("          <div class=\"row col-8 g-3 mt-5 \">\n");
      out.write("            <h4 class=\"text-center border\">Add Category</h4>\n");
      out.write("        </div>    \n");
      out.write("   <form action=\"product_backend\" method=\"post\" enctype=\"multipart/form-data\" class=\"row col-md-8 g-3 border border-dark\">\n");
      out.write("  <div class=\"col-md-5 p-2\">\n");
      out.write("    <label for=\"inputEmail4\" class=\"form-label\">Category Name</label>\n");
      out.write("    <input type=\"text\" name=\"Cate_name\" class=\"form-control\" id=\"inputEmail4\">\n");
      out.write("  </div>\n");
      out.write("            <div class=\"col-md-1\"></div>\n");
      out.write("  <div class=\"col-md-5 p-2\">\n");
      out.write("    <label for=\"inputPassword4\" class=\"form-label\">Image</label>\n");
      out.write("    <input type=\"file\" name=\"img\" class=\"form-control\" id=\"inputPassword4\">\n");
      out.write("  </div>\n");
      out.write("   <div class=\"col-md-10 p-2\">\n");
      out.write("    <label for=\"inputEmail4\" class=\"form-label p-2\">Description</label>\n");
      out.write("    <input type=\"text\" name=\"desc\" class=\"form-control\" id=\"inputEmail4\">\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("  <div class=\"col-12 mt-3 p-2\">\n");
      out.write("    <input type=\"submit\" name=\"addcate\" value=\"upload\" class=\"btn btn-primary\">\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

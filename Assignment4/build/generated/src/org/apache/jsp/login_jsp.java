package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("   <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("<!-- JavaScript Bundle with Popper -->\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"container\">\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <div class=\"mt-3\">\n");
      out.write("            \n");
      out.write("        \n");
      out.write("     <ul class=\"nav bg-info mt-3 \" style=\"background-color: orange\">\n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("             <h5><a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Website Name </a></h5>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\" style=\"margin-left: 400px\">\n");
      out.write("            <h5><a class=\"nav-link\" href=\"#\">Home</a></h5>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <h5><a class=\"nav-link\" href=\"#\">Add Category</a></h5>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <h5><a class=\"nav-link disabled\">Add Product</a></h5>\n");
      out.write("        </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <h5><a class=\"nav-link disabled\">View Data</a></h5>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("     </div>     \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login page</title>\n");
      out.write("    </head>\n");
      out.write("            <body class=\" container\">\n");
      out.write("                \n");
      out.write("                <div class=\"error mt-5 row col-md-10\"> \n");
      out.write("                 <div class=\"col-md-3 \" > </div>\n");
      out.write("                <div class=\"col-md-5 mt-3\">");
 String error = request.getParameter("error"); 
                                                       if(error!=null) {  
      out.write(" \n");
      out.write("                                                       <h4 class=\"text-danger\" style=\"background-color: red\">Username or password is wrong</h4>\n");
      out.write("                                                       ");
 }
                                                        
      out.write("</div>\n");
      out.write("                 </div>                                       \n");
      out.write("           \n");
      out.write("        <div class=\"formdata\">     \n");
      out.write("                <div class=\"row col-md-10\">\n");
      out.write("                    <div class=\"col-md-3 \" > </div>\n");
      out.write("                <div class=\"col-md-6 head mt-2  \">\n");
      out.write("                    <h2 class=\"text-center \" style=\"background-color: black ; color: white\">User Login</h2>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("           <form action=\"product_backend\" method=\"post\">      \n");
      out.write("             <div class=\"row col-md-10\">    \n");
      out.write("              <div class=\"col-md-3\"></div>\n");
      out.write("             <div class=\"mb-3 col-md-5 \">\n");
      out.write("            <label class=\"form-label mt-2 p-2\">Username</label>\n");
      out.write("          <input type=\"text\" name=\"username\" class=\"form-control\"  placeholder=\"\">\n");
      out.write("           </div>\n");
      out.write("              \n");
      out.write("             </div> \n");
      out.write("           <div class=\"row col-md-10\"> \n");
      out.write("               <div class=\"col-md-3\"></div>\n");
      out.write("        <div class=\"mb-3 col-md-5\">\n");
      out.write("          <label for=\"formGroupExampleInput2\" class=\"form-label p-2\">Password</label>\n");
      out.write("          <input type=\"password\" name=\"password\" class=\"form-control \"  placeholder=\"\">\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("             </div>\n");
      out.write("        <div class=\"row col-md-10 mt-3\"> \n");
      out.write("         <div class=\"col-md-3\"></div> \n");
      out.write("         <div class=\"col-md-2\">\n");
      out.write("           <input type=\"submit\" class=\"form-control btn btn-success  \" name=\"login\" value=\"login\">\n");
      out.write("         </div>\n");
      out.write("         <div class=\"col-md-1\"></div>\n");
      out.write("         <div class=\"col-md-2\">\n");
      out.write("             <a href=\"user_registration.jsp\" ><p class=\"form-control btn btn-info\">Sign Up</p></a>\n");
      out.write("         </div> \n");
      out.write("        </div> \n");
      out.write("   </form>\n");
      out.write("        </div>       \n");
      out.write("                      \n");
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

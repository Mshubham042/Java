package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbconnection.database;

public final class Product_005fcateogry_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>All Products</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("<!-- JavaScript Bundle with Popper -->\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"container\">\n");
      out.write("       \n");
      out.write("        <h1 class=\"text-center mt-5 border\">Product Category</h1>\n");
      out.write("           <table>\n");
      out.write("               <tr>   \n");
      out.write("\n");
      out.write("    ");
 
            int cn=0;
            database db = new database();
            db.connect();
            ResultSet rs = db.st.executeQuery("select * from product_category");
            
            
        while(rs.next()) 
        {
          cn++; 
         
      out.write("   \n");
      out.write("    \n");
      out.write(" \n");
      out.write("         <!----> <td class=\"p-2\" style=\"border: 1px solid black \">\n");
      out.write("             <a href=\"product_detail.jsp?id=");
      out.print(rs.getString("pc_id") );
      out.write("\" > <div class=\"card\">\n");
      out.write("           <img  src=\"image/");
      out.print(rs.getString("cate_img") );
      out.write("\" height=\"200px\" width=\"300px\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("       <div class=\"card-body\">\n");
      out.write("           <h3 class=\"card-title text-danger\">");
      out.print(rs.getString("category_name") );
      out.write("</h3>\n");
      out.write("        <p class=\"card-text\">");
      out.print(rs.getString("cate_detail") );
      out.write("</p>\n");
      out.write("       </div></a>\n");
      out.write("                   </td>\n");
      out.write("        \n");
      out.write("       ");
  
        if(cn==3)
        {
            cn=0;
            
      out.write("\n");
      out.write("         </tr>  \n");
      out.write("     ");
    
        }   
          
      }
        
      out.write("\n");
      out.write("            \n");
      out.write("             \n");
      out.write("       \n");
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
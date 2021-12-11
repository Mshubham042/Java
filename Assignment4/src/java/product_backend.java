/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dbconnection.database;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author admin
 */
@WebServlet(name = "product_backend", urlPatterns = { "/product_backend" })
@MultipartConfig( location="C:\\Users\\admin\\Documents\\NetBeansProjects\\fileupload\\web\\image"
   // 100 MB
)

public class product_backend extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
             database db = new database();
              db.connect();
            
              
          String login = request.getParameter("login");
          
          if(login!=null)
          {
          String uname = request.getParameter("username");
          String pwd = request.getParameter("password");
          
          String qry = "select * from users where Name = '"+uname+"' and password = '"+pwd+"' ";
          
                 try {
                     ResultSet rs = db.st.executeQuery(qry);
                     if(rs.next())
                     {
//                         out.println("login");
                         HttpSession session = request.getSession();
                         session.setAttribute("username", uname);
                         response.sendRedirect("Product_cateogry.jsp");
                     }
                     else
                     {
                        response.sendRedirect("login.jsp?error=1");
                     }
                 } catch (SQLException ex) {
                     Logger.getLogger(product_backend.class.getName()).log(Level.SEVERE, null, ex);
                 }
          
         
          }

           String add_cate = request.getParameter("addcate");
           
           if(add_cate!=null)
               
       {
           String cate_Title = request.getParameter("Cate_name");
           String cate_img = request.getParameter("img");
           String cate_desc = request.getParameter("desc");
               
              String fname = "";
               Collection<Part> allVariable = request.getParts();
              for (Part p : allVariable) {
                  if(p.getSubmittedFileName() != null) 
                  {
                    
                    fname = Paths.get(p.getSubmittedFileName()).getFileName().toString() ;
//                    out.println("Submitted File Name:" + p.getSubmittedFileName() + "<br/>");
//                    out.println("Content Type:" + p.getContentType() + "<br/>");
//                    out.println("File Size:" + p.getSize() + "<br/>");
//                    out.println("Form Variable Name:" + p.getName() + "<br/>");
                    p.write(fname);
                  }
              }
              
             
              String qry = "insert into product_category values(0,'"+cate_Title +"','"+fname+"','"+cate_desc+"')";
            try {
                int a = db.st.executeUpdate(qry);
                if(a!= 0)
                {
                    out.println("submitted");
                }
            } catch (SQLException ex) {
                Logger.getLogger(product_backend.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
           }
           
           
            String uname = request.getParameter("Name");
            String uemail = request.getParameter("email");
            String uphone = request.getParameter("phone");
            String upassword = request.getParameter("pwd");
            
            if((uname!=null) &&(upassword!=null))
            {     
            out.println(uname);
            
//            database db = new database();
//            db.connect();
             String qry = "insert into users values(0,'"+uname+"','"+uemail+"','"+uphone+"','"+upassword+"')";
             
                  try {
                 int a = db.st.executeUpdate(qry);
                 if(a!=0)
                 {
                      out.println("success");
//                       Register = null;
                 }
                 else
                 {
                       out.println("error");
                 }
//                 
                  } catch (SQLException ex) {
                      Logger.getLogger(product_backend.class.getName()).log(Level.SEVERE, null, ex);
                  }
////            
//
//             
           } 
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dbconnection.database;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
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
import javax.servlet.http.Part;

/**
 *
 * @author admin
 */

@WebServlet(name = "fileupload", urlPatterns = { "/fileupload" })
@MultipartConfig( location="C:\\Users\\admin\\Documents\\NetBeansProjects\\fileupload\\web\\image"
   // 100 MB
)
public class fileupload extends HttpServlet {

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
         
            
            String filename = request.getParameter("filename");
             String fname = "";
       Collection<Part> allVariable = request.getParts();
              for (Part p : allVariable) {
                  if(p.getSubmittedFileName() != null) 
                  {
                    
                    fname = Paths.get(p.getSubmittedFileName()).getFileName().toString() ;
                    out.println("Submitted File Name:" + p.getSubmittedFileName() + "<br/>");
                    out.println("Content Type:" + p.getContentType() + "<br/>");
                    out.println("File Size:" + p.getSize() + "<br/>");
                    out.println("Form Variable Name:" + p.getName() + "<br/>");
                    p.write(fname);
                  }
              }
              
              database db = new database();
              db.connect();
              String qry = "insert into users values('"+filename +"','"+fname+"')";
            try {
                int a = db.st.executeUpdate(qry);
                if(a!= 0)
                {
                    out.println("submitted");
                }
            } catch (SQLException ex) {
                Logger.getLogger(fileupload.class.getName()).log(Level.SEVERE, null, ex);
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

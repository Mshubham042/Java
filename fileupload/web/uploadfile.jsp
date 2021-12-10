<%-- 
    Document   : uploadfile
    Created on : Dec 6, 2021, 3:18:53 PM
    Author     : admin
--%>

<%@page import="javax.servlet.annotation.MultipartConfig"%>
<%@page import="javax.servlet.annotation.WebServlet"%>
<%@page import="dbconnection.database"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>

        <form action="fileupload" enctype="multipart/form-data" method="post">
        <table border="1px solid black">
            <tr>
                <td>Name</td>
                <td><input type="text" name="filename"/></td>
            </tr>
               <tr>
                <td>File</td>
                <td><input type="file" name="choose_fle"/></td>
              </tr>
               <tr>
                <td></td>
                <td><input type="submit" name="upld" value="Upload"/></td>
              </tr>
              <tr>
                  <td>
            
                  </td>
              </tr>  
        </table>
        </form>
        
       
    </body>
</html>

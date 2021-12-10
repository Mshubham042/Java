<%-- 
    Document   : Product
    Created on : Dec 10, 2021, 2:11:16 PM
    Author     : admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="dbconnection.database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Product Details</h1>
         <table>
            
                
         <tr> 

    <% 
        int cn = 0;
            database db = new database();
            db.connect();
            ResultSet rs = db.st.executeQuery("select * from users");
            
            
        while(rs.next()) 
        {
            cn++;
         %>   
    
            
            
         <td style="border: 1px solid black"><img src="image/<%=rs.getString("image") %>" height="300px" alt="demo">
             <a href="#" ><h3>Add TO Cart<h3></a>
             </td>
         

         <%    
          if(cn==3)
          {
              cn = 0;
             %>
         </tr>
       <%  
          }
      }
        %>
            
               
          <tr> 
        </table>  
        
    </body>
</html>

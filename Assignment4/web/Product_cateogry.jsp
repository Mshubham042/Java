<%-- 
    Document   : Product_cateogry
    Created on : Dec 10, 2021, 7:58:34 PM
    Author     : admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="dbconnection.database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Products</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </head>
    <body class="container">
       
        <h1 class="text-center mt-5 border">Product Details</h1>
        <p><% String name = session.getAttribute("username").toString();
             out.println(name);  %></p>
           <table>
               <tr>   

    <% 
            int cn=0;
            database db = new database();
            db.connect();
            ResultSet rs = db.st.executeQuery("select * from product_category");
            
            
        while(rs.next()) 
        {
          cn++; 
         %>   
    
 
         <!----> <td class="p-2" style="border: 1px solid black ">
             <a href="product_detail.jsp?id=<%=rs.getString("category_name") %>" > <div class="card">
           <img  src="image/<%=rs.getString("cate_img") %>" height="200px" width="300px" class="card-img-top" alt="...">
       <div class="card-body">
           <h3 class="card-title text-danger"><%=rs.getString("category_name") %></h3>
        <p class="card-text"><%=rs.getString("cate_detail") %></p>
       </div></a>
                   </td>
        
       <%  
        if(cn==3)
        {
            cn=0;
            %>
         </tr>  
     <%    
        }   
          
      }
        %>
            
             
       
        
    </body>
</html>

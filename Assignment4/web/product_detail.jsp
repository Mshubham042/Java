<%-- 
    Document   : product_detail
    Created on : Dec 10, 2021, 9:52:45 PM
    Author     : admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="dbconnection.database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product detail</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </head>
    <body class="container">
        
       <div class="content mt-5">
         
        <%
            String category = request.getParameter("id");
            database db = new database();
            db.connect();
            ResultSet rs = db.st.executeQuery("select * from product where pro_cate ='"+category+"' ");
            
           while(rs.next())
           
           {  
            %>
       <div class="row col-10 mt-2">
            <div class="col-md-3">
            <div class="card">
                <img src="image/prodimg/<%=rs.getString("pro_img") %>" height="100px" class="card-img-top" alt="...">
<!--              <div class="card-body">
                  <h5 class="card-title"></h5>
                <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
              </div>-->
            </div>
          </div>
         <!--<div class="col-md-1"></div>-->
            <div class="col-md-5 border">
                <h4><%=rs.getString("pro_title") %></h4>
                <p><%=rs.getString("pro_desc") %></p>
                <b><%=rs.getString("pro_price") %></b>   
            </div>
       </div> 
       <% } %>
       </div>
    </body>
</html>

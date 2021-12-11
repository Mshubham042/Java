<%-- 
    Document   : add_product
    Created on : Dec 10, 2021, 8:53:52 PM
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
        <title>Add Product</title>
  
    </head>
    <body class="container">
        
                 <div class="row col-10 g-3 mt-5 ">
            <h4 class="text-center border">Add Product</h4>
        </div>    
   <form action="fileupload" method="post" enctype="multipart/form-data" class="row col-md-10 g-3 border border-dark">
  <div class="col-md-5 p-2">
    <label class="form-label">Select Category</label>
    <select class="form-control" name="pro_cate">
        <% 
          
            database db = new database();
            db.connect();
            ResultSet rs = db.st.executeQuery("select * from product_category");
            
           while(rs.next())
           
           {                 
          %>
        <option value="<%=rs.getString("category_name") %>" ><%=rs.getString("category_name") %></option>
      <% } %>       
    </select>
  </div>
   <div class="col-md-1"></div>
  <div class="col-md-5 p-2">
    <label class="form-label">Product Title</label>
    <input type="text" name="pro_title" class="form-control" >
  </div>
   <div class="col-md-5 p-2">
    <label class="form-label p-2">Product Price</label>
    <input type="text" name="pro_price" class="form-control" >
  </div>
    <div class="col-md-1"></div>
    <div class="col-md-5 p-2">
    <label class="form-label p-2">Product Decs</label>
    <input type="text" name="pro_desc" class="form-control" >
  </div>
    <div class="col-md-5 p-2">
    <label class="form-label p-2">Product Color</label>
    <input type="text" name="pro_color" class="form-control" >
  </div>
    <div class="col-md-1"></div>
     <div class="col-md-5 p-2">
    <label class="form-label p-2">Product Image</label>
    <input type="file" name="pro_img" class="form-control" >
  </div>
 
 
  <div class="col-12 mt-3 p-2">
    <input type="submit" name="addproduct" value="Submit" class="btn btn-primary">
  </div>
</form>
        
    </body>
</html>

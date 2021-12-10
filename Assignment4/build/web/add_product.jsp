<%-- 
    Document   : add_product
    Created on : Dec 10, 2021, 8:53:52 PM
    Author     : admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="dbconnection.database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </head>
    <body class="container">
        
                 <div class="row col-8 g-3 mt-5 ">
            <h4 class="text-center border">Add Product</h4>
        </div>    
   <form action="fileupload" method="post" enctype="multipart/form-data" class="row col-md-8 g-3 border border-dark">
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

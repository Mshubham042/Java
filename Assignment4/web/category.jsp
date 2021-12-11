<%-- 
    Document   : category
    Created on : Dec 10, 2021, 7:19:09 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Category</title>

    </head>
    <body class="container">
        
          <div class="row col-10 g-3 mt-5 ">
            <h4 class="text-center border">Add Category</h4>
        </div>    
   <form action="product_backend" method="post" enctype="multipart/form-data" class="row col-md-10 g-3 border border-dark">
  <div class="col-md-5 p-2">
    <label for="inputEmail4" class="form-label">Category Name</label>
    <input type="text" name="Cate_name" class="form-control" id="inputEmail4">
  </div>
            <div class="col-md-1"></div>
  <div class="col-md-5 p-2">
    <label for="inputPassword4" class="form-label">Image</label>
    <input type="file" name="img" class="form-control" id="inputPassword4">
  </div>
   <div class="col-md-10 p-2">
    <label for="inputEmail4" class="form-label p-2">Description</label>
    <input type="text" name="desc" class="form-control" id="inputEmail4">
  </div>
 
 
  <div class="col-12 mt-3 p-2">
    <input type="submit" name="addcate" value="upload" class="btn btn-primary">
  </div>
</form>
        
    </body>
</html>

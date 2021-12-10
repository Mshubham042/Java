<%-- 
    Document   : user_registration
    Created on : Dec 10, 2021, 5:49:39 PM
    Author     : admin
--%>

<%@page import="dbconnection.database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </head>
    <body class="container">
    
        
        
        <div class="row col-8 g-3 mt-5 ">
            <h4 class="text-center border">User  Registration</h4>
        </div>    
        <form action="product_backend" method="post" class="row col-md-8 g-3 border border-dark">
  <div class="col-md-5 p-2">
    <label for="inputEmail4" class="form-label">Name</label>
    <input type="text" name="Name" class="form-control" id="inputEmail4">
  </div>
            <div class="col-md-1"></div>
  <div class="col-md-5 p-2">
    <label for="inputPassword4" class="form-label">Username</label>
    <input type="email" name="email" class="form-control" id="inputPassword4">
  </div>
   <div class="col-md-5 p-2">
    <label for="inputEmail4" class="form-label p-2">Mobile</label>
    <input type="text" name="phone" class="form-control" id="inputEmail4">
  </div>
            <div class="col-md-1"></div>
  <div class="col-md-5 p-2">
    <label for="inputPassword4" class="form-label p-2">Password</label>
    <input type="password" name="pwd" class="form-control" id="inputPassword4">
  </div>
 
  <div class="col-12 mt-3 p-2">
    <input type="submit" name="register" value="Submit" class="btn btn-primary">
  </div>
</form>
    </body>
</html>

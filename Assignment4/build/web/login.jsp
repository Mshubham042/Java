<%-- 
    Document   : login.jsp
    Created on : Dec 11, 2021, 2:07:24 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
    </head>
            <body class=" container">
                
                <div class="error mt-5 row col-md-10"> 
                 <div class="col-md-3 " > </div>
                <div class="col-md-5 mt-3"><% String error = request.getParameter("error"); 
                                                       if(error!=null) {  %> 
                                                       <h4 class="text-danger" style="background-color: lightpink">! Username or password is wrong</h4>
                                                       <% }
                                                        %></div>
                 </div>                                       
           
        <div class="formdata">     
                <div class="row col-md-10">
                    <div class="col-md-3 " > </div>
                <div class="col-md-6 head mt-2  ">
                    <h2 class="text-center " style="background-color: black ; color: white">User Login</h2>
                </div>
                </div>
                
           <form action="product_backend" method="post">      
             <div class="row col-md-10">    
              <div class="col-md-3"></div>
             <div class="mb-3 col-md-5 ">
            <label class="form-label mt-2 p-2">Username</label>
          <input type="text" name="username" class="form-control"  placeholder="">
           </div>
              
             </div> 
           <div class="row col-md-10"> 
               <div class="col-md-3"></div>
        <div class="mb-3 col-md-5">
          <label for="formGroupExampleInput2" class="form-label p-2">Password</label>
          <input type="password" name="password" class="form-control "  placeholder="">
          
        </div>
             </div>
        <div class="row col-md-10 mt-3"> 
         <div class="col-md-3"></div> 
         <div class="col-md-2">
           <input type="submit" class="form-control btn btn-success  " name="login" value="login">
         </div>
         <div class="col-md-1"></div>
         <div class="col-md-2">
             <a href="user_registration.jsp" ><p class="form-control btn btn-info">Sign Up</p></a>
         </div> 
        </div> 
   </form>
        </div>       
                      
        
    </body>
</html>

<%-- 
    Document   : product_detail
    Created on : Dec 10, 2021, 9:52:45 PM
    Author     : admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="dbconnection.database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<%--<jsp:useBean beanName="cart" scope="session" id="addto" >--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product detail</title>
        
    </head>
    <body class="container">
        
       <div class="content mt-5">
        <div class="row col-12 mt-2">
        
       <%
//           String addcart = request.getParameter("add");
//           
//           if(addcart!=null)
//           {
//               
//           }
           
           %>
            
            
        <%
            String category = request.getParameter("id");
            database db = new database();
            db.connect();
            ResultSet rs = db.st.executeQuery("select * from product where pro_cate ='"+category+"' ");
            
           while(rs.next())
           
           {  
            %>
     
           <div class="col-md-2 " style="background-color: rosybrown">
            <div class="card">
                <img src="image/prodimg/<%=rs.getString("pro_img") %>" height="170px" class="card-img-top" alt="...">
<!--              <div class="card-body">
                  <h5 class="card-title"></h5>
                <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
              </div>-->
            </div>
          </div>
         <!--<div class="col-md-1"></div>-->
         <div class="row col-md-4 border" style="background-color: rosybrown">
                <h4 class="p-1"><%=rs.getString("pro_title") %></h4>
                <b class="p-1"><%=rs.getString("pro_price") %>₹</b> 
                <!--<div class="col-md-10">-->
                <p class="p-1"><%=rs.getString("pro_desc") %></p>  
               
                <a href="backend?add=1"><b class="col-md-4 btn btn-success">Add to Cart</b></a>
                <a href="#"><b class="col-md-3  btn btn-info">Buy</b></a>
               
              
            </div>
<!--       </div> -->
       <% } %>
         <div >
       </div>
    </body>
</html>

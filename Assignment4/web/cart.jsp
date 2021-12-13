<%-- 
    Document   : cart.jsp
    Created on : Dec 12, 2021, 8:56:49 PM
    Author     : admin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="dbconnection.database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart</title>
    </head>
    <body class="container">
        
        <div class="mycart">
            
            <div class="row col-md-10 mt-5">
                
                <h1 class="text-center"><%=session.getAttribute("username") %> your product is added to cart</h1>
                <p></p>
                
                
            </div>
                
                 
                 
      <div class="row col-md-10">   
          
          <% 
            
             Integer userid = Integer.parseInt(session.getAttribute("userid").toString() ) ;  
             database db = new database();
             db.connect();
             
//             
            ArrayList<Integer> arr = new ArrayList<Integer>(); 
            String qdata =" ";
            String isuser = "";
            
             ResultSet rs = db.st.executeQuery("select * from cart where u_id = "+userid+" ");
             while(rs.next())
             {
                 isuser = "true";
                 int data = rs.getInt("product_id");
//                 out.println(data);
                  arr.add(data);    
             }
    
              for(int i=0; i<arr.size() ; i++)
              {
                if(i!=0)
                  {
                  qdata += "," + arr.get(i);
                  }
                else
                {
                  qdata += arr.get(i);   
                }
              }
              
              if(isuser.equals("true"))
            { 
               String qry = "select * from product where p_id in("+qdata+") ";
                 ResultSet result = db.st.executeQuery(qry);
                  
                 while(result.next())
                 
                {   
                 
                  %>
                 <div class="card" style="width: 18rem; margin: 20px">
                   <img src="image/prodimg/<%=result.getString("pro_img") %>" height="150px" class="card-img-top" alt="...">
                      <div class="card-body">
                        <h5 class="card-title"><%=result.getString("pro_title") %></h5>
                        <p class="card-text">.</p>
                        <div class="row">
                        <a href="#" class="btn btn-primary col">+1</a>
                        <p class="col"></p>
                        <a href="product_backend?dlt=1" class="btn btn-danger col">Remove</a>
                        </div>
                      </div>
               </div> 
                        
              <%      
               } 
            }
                %>
   
               </div>
              
          
<!--<!--          
            
-->              
            
        </div>
        
      
    </body>
</html>

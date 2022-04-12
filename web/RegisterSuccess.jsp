<%-- 
    Document   : RegisterSuccess.jsp
    Created on : 26 Feb, 2022, 5:35:44 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
         
        <%
            String name = (String)session.getAttribute("name");
            %>
            <h1 style="color:red">Welcome <%=name%></h1>
            
             <h2 style="color:black">Registration Successfull</h2>
             
             <h3 style="color:black">Please Login To Continue</h3>
            
             
             
         <a href="DonorLogin.html"><input type="button" Value="Sign in" /></a></br>
         
            
    </body>
</html>

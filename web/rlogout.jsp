<%-- 
    Document   : rlogout
    Created on : 19 Oct, 2021, 10:26:04 PM
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
            session.invalidate();
            response.sendRedirect("home.html");

            %>
    </body>
</html>

<%-- 
    Document   : showDonors
    Created on : 11 Oct, 2021, 6:35:45 PM
    Author     : hp
--%>

<%@page import="db.DBconnector"%>
<%@page import="java.sql.Statement"%>
<%@page import="dto.UserDto"%>
<%@page import="model.SearchAuthenticator"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body >
        <h1>Donors are-</h1>
       
        
        
            
         <%
       
       ResultSet rs=null;
       
       rs=SearchAuthenticator.getResult();
        
        System.out.println("Hey this is me "+rs.getString(1)+"\t");
        
        System.out.println("Hey this is you "+rs.getString(2)+"\t");
       
     

            %>
             <table width="500">
                 <tr>
                     <td style="color:red;" > <b> Name  </b></td>
                     <td style="color:red;"> <b> Email </b></td>
                 </tr>
                 <%
                     do
                     {
                         %>
                         <tr>
                             <td> <%=rs.getString("name")%></td>
                             <td> <%=rs.getString("emailid")%></td>
                         </tr>
                         <%
                     }while(rs.next());
             
            %>
             </table>
    </body>
</html>

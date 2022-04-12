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
        <h1>Hello World!</h1>
        <%
        UserDto user = new UserDto();
        ResultSet rs=null;
        String bloodgroup = user.getbloodgroup();
        String state = user.getstate();
        String city = user.getcity();
        
        
        try
        {
            String query = "SELECT name,email from bloodbank where bloodgroup ='"+bloodgroup.trim()+"'and state='"+state.trim()+"'and city='"+city.trim()+"'";
            System.out.println("Query ="+query);
            
            Statement st = DBconnector.getStatement();
            
            rs=st.executeQuery(query);
            
            
        }
            
            catch(SQLException e)
            {
                 System.out.println(e);
            }
    
            

            %>
             <table>
                 <tr>
                     <td> <b> Name </b></td>
                     <td> <b> Email </b></td>
                 </tr>
                 <%
                     while(rs.next())
                     {
                         %>
                         <tr>
                              <td> <b> <%=rs.getString("name")%> </b></td>
                               <td> <b><%=rs.getString("email")%></b></td>
                         </tr>
                         <%
                     }
             
            %>
             </table>
    </body>
</html>

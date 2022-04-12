 <%@page import="java.sql.SQLException"%>
<%@page import="db.DBconnector"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="dto.UserDto"%>

<%-- 
    Document   : rshow
    Created on : 19 Oct, 2021, 10:21:59 PM
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
       
         <a href="rlogout.jsp"><input type="button" Value="Sign out" /></a></br>
         
        <%
            String email = (String)session.getAttribute("email");
            String password = (String)session.getAttribute("password");
            
           ResultSet rs = null;
        
           try
           {
            String query = "SELECT * from userdata where emailid ='"+email.trim()+"'and password='"+password.trim()+"'";
            System.out.println("Query ="+query);
            
            Statement st = DBconnector.getStatement();
            
            rs=st.executeQuery(query);
            
            if(rs.next())
            {
                %>
                
                 <h1 style="color:red">Welcome <%=rs.getString("name")%></h1>
                <table>
                 <tr>
                    <td><B>Name:</B></td>
                    <td><b><%=rs.getString(1)%></b></td>
        
                </tr>
                
                 <tr>
                    <td><B>Gender :</B></td>
                    <td><b><%=rs.getString(2)%></b></td>
                 </tr>
                 
                <!--  <tr>
                    <td> <B>DOB: </B> </td>
                    <td> <INPUT type="date" name="bdate"/></td>
                </tr>-->
                <tr>
                    <td><B>Weight :</B></td>
                    <td><b><%=rs.getString(4)%></b></td>
          
                </tr>
                <tr>
                    <td><B>Blood Group:</B></td>
                    <td><b><%=rs.getString(3)%></b></td>
                   
                </tr>
                
                 <tr>
                    <td><B>City:</B></td>
                    <td><b><%=rs.getString(5)%></b></td>
                    
                </tr>
                
                  <tr>
                    <td><B>Pincode:</B></td>
                    <td><b><%=rs.getString(6)%></b></td>
                   
                </tr>

                 <tr>
                    <td><B>Email:</B></td>
                    <td><b><%=rs.getString(7)%></b></td>
                    
                </tr>
                 <tr>
                    <td><B>Mobile no:</B></td>
                    <td><b><%=rs.getString(9)%></b></td>
                 
                </tr>
                
                </table>
                    
                    
                 <%
            }
            }
            catch(SQLException e)
            {
                 System.out.println(e);
            } %>
        
            
            <a href="update.jsp"><input type="button" Value="update" /></a></br>
            
          <%  
                
          
          %>
            
    </body>
</html>

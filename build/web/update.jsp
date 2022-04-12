<%-- 
    Document   : update.jsp
    Created on : 21 Mar, 2022, 3:56:26 PM
    Author     : hp
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="db.DBconnector"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="dto.UserDto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
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
             
            String name=rs.getString(1);
            String gender=rs.getString(2);
            String bloodgroup=rs.getString(3);
            String weight=rs.getString(4);
            String city=rs.getString(5);
            String pincode=rs.getString(6);
            String contact=rs.getString(9);
            

               %>
                
                 <h1 style="color:red">Welcome <%=rs.getString("name")%></h1>
                  <h2 style="color:black"> Update your Details Here......</h2>
                  
                  
                 <form action="Updateservlet" method="POST">
                <table>
                 <tr>
                    <td><B>Name:</B></td>
                    <td><b><%=name%></b></td>
        
                </tr>
                
                 <tr>
                    <td><B>Gender :</B></td>
                    <td><b><%=gender%></b></td>
                 </tr>
                 
                <!--  <tr>
                    <td> <B>DOB: </B> </td>
                    <td> <INPUT type="date" name="bdate"/></td>
                </tr>-->
                <tr>
                    <td><B>Weight :</B></td>
                    <td><b><input type="text" name="weight" value="<%=weight%>" placeholder="<%=rs.getString(4)%>" /></b></td>
          
                </tr>
                <tr>
                    <td><B>Blood Group:</B></td>
                    <td><b><%=rs.getString(3)%>"</b></td>
                   
                </tr>
                
                 <tr>
                    <td><B>City:</B></td>
                    <td><b><input type="text" name="city" value="<%=city%>" placeholder="<%=rs.getString(5)%>" /></b></td>
                    
                </tr>
                
                  <tr>
                    <td><B>Pincode:</B></td>
                    <td><b><input type="text" name="pincode" value="<%=pincode%>"  placeholder="<%=rs.getString(6)%>" /></b></td>
                   
                </tr>

                 <tr>
                    <td><B>Email:</B></td>
                    <td><b><input type="text" name="email" value="<%=email%>"  placeholder="<%=rs.getString(6)%>  "/></b></td>
                    
                </tr>
s                    <td><B>Mobile no:</B></td>
                    <td><b><input type="text" name="mobileno" value="<%=contact%>" placeholder="<%=rs.getString(9)%>" /></b></td>
                 
                </tr>
                
                 <tr>
                    <td><B>Password :</B></td>
                    <td><b><input type="password" name="password" value="<%=password%>" placeholder="<%=rs.getString(8)%>" /></b></td>
                 
                </tr>
                 <tr>
                    <td></td>
                    <td><input type="submit" Value="Update Details" /></td>
                </tr>
                
                </table>
                 </form>
                    
                    
                 <%
            }
            }
            catch(SQLException e)
            {
                 System.out.println(e);
            } %>
        
    </body>
</html>

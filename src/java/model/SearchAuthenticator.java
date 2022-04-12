/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBconnector;
import dto.UserDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SearchAuthenticator 
{
   static ResultSet rs = null;
    public boolean isSearch(UserDto user)
    {
        String bloodgroup = user.getbloodgroup();
       // String state = user.getstate();
        String city = user.getcity();
        String pincode = user.getpincode();
        
        
        try
        {
            String query = "SELECT name,emailid from userdata where bloodgroup ='"+bloodgroup.trim()+"'and city='"+city.trim()+"'and pincode='"+pincode.trim()+"'";
            System.out.println("Query ="+query);
            
            Statement st = DBconnector.getStatement();
            
            rs=st.executeQuery(query);
            
            if(rs.next())
            {
              return true;
            }
        }
            
            catch(SQLException e)
            {
                 System.out.println(e);
            }
      return false;
            
    }   
    
    public static ResultSet getResult()
          {
                    return rs;
            }
            
}

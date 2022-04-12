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

/**
 *
 * @author hp
 */
public class DonorLoginAuthenticator {
    static ResultSet rs = null;
    public boolean isLogin(UserDto user)
    {
        String email = user.getemail();
       // String state = user.getstate();
        String password= user.getpassword();
        
        try
        {
            String query = "SELECT emailid,password from userdata where emailid ='"+email.trim()+"'and password='"+password.trim()+"'";
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

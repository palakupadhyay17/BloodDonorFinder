/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBconnector;
import dto.UserDto;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hp
 */
public class UpdateAuthenticator
{public boolean isUpdate(UserDto user)
    {
       
        String name = user.getname();
        String password =user.getpassword();
        String bloodgroup = user.getbloodgroup();
        String city = user.getcity();
        String email = user.getemail();
        String mobileno = user.getmobileno();
        String gender = user.getgender();
        //String Dob = user.getDob();
        String pincode = user.getpincode();
        float weight=user.getweight();
        System.out.println(weight);
        
        
         try
         {
             Statement st = DBconnector.getStatement();
            
            String query = "UPDATE userdata set weight='"+weight+"',city='"+city+"',pincode='"+pincode+"',password='"+password+"',contact='"+mobileno+"'  where emailid='"+email+"' ";
            System.out.println(query);
            int i;
            
            i = st.executeUpdate(query);
            
           if(i>0)
            {
               System.out.println("Updation Done");
                return true;
            }
  
        }
         
        catch(SQLException e) 
         {
             System.out.println(e);
         }
           
                 return false;
    }

    
}

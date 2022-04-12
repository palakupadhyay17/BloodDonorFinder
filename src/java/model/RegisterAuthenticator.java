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


public class RegisterAuthenticator 
{
    
 public boolean isRegister(UserDto user)
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
            
            String query = "INSERT INTO userdata values('"+name+"','"+gender+"','"+bloodgroup+"','"+weight+"','"+city+"','"+pincode+"' ,'"+email+"','"+password+"','"+mobileno+"')";
            System.out.println(query);
            int i;
            
            i = st.executeUpdate(query);
            
           if(i>0)
            {
               System.out.println("Insertion Done");
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
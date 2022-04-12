/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;
/**
 *
 * @author hp
 */
public class UserDto
{
     String name,email,mobileno,password,bloodgroup,gender,city,Dob,pincode;
     
     float weight;
    
    public String getname()
    {
        return name;
    }
      public String getpincode()
    {
        return pincode;
    }
     public String getemail()
    {
        return email;
    }
     public String getcity()
    {
        return city;
    }
     public String getmobileno()
    {
        return mobileno;
    }
    
    public String getpassword()
    {
        return password;
    }
     public String getbloodgroup()
    {
        return bloodgroup;
    }
      public String getgender()
    {
        return gender;
    }
     public String getDob()
    {
        return Dob;
    }
      public float getweight()
    {
        return weight;
    }
     
    public void setname(String name)
    {
        this.name=name;
    }
     public void setemail(String email)
    {
        this.email=email;
    }
      public void setpincode(String pincode)
    {
        this.pincode=pincode;
    }
     public void setcity(String city)
    {
        this.city= city;
    }
     public void setmobileno(String mobileno)
    {
        this.mobileno= mobileno;
    }
    
    public void setpassword(String password)
    {
        this.password=password;
    }
     public void setbloodgroup(String bloodgroup)
    {
        this.bloodgroup= bloodgroup;
    }
      public void setgender(String gender)
    {
        this.gender=gender;
    }
     public void setDob(String Dob)
    {
        this.Dob=Dob;
    }
      public void setweight(float weight)
    {
        this.weight=weight;
    }  
   
}

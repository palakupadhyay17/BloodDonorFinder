/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserDto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.RegisterAuthenticator;
import model.SearchAuthenticator;
import model.UpdateAuthenticator;

/**
 *
 * @author hp
 */
public class Updateservlet extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.sendRedirect("update.jsp");
    }
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
         String name = request.getParameter("name");
        String password = request.getParameter("password");
        String bloodgroup = request.getParameter("bloodgroup");
        String city = request.getParameter("city");
        String email = request.getParameter("email");
        String mobileno = request.getParameter("mobileno");
        String gender = request.getParameter("gender");
      //  String Dob = request.getParameter("Dob");
        String pincode = request.getParameter("pincode");
        String w = request.getParameter("weight");
        Float weight=Float.parseFloat(w);
        
        UserDto user = new UserDto();
         
        user.setname(name);
        user.setpassword(password);
        user.setcity(city);
        user.setbloodgroup(bloodgroup);
        user.setmobileno(mobileno);
        user.setgender(gender);
       // user.setDob(Dob);
        user.setpincode(pincode);
        user.setweight(weight);
        user.setemail(email);
        
        
        UpdateAuthenticator u = new UpdateAuthenticator();
        boolean Update = u.isUpdate(user);
        
        
        if(Update)
        {
          // HttpSession session = request.getSession(true);
          //  session.setAttribute("name",name);
            response.sendRedirect("donordetail.jsp");
            
        }
        else
        {
            response.sendRedirect("update.jsp");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserDto;
import java.io.IOException;
import javax.servlet.GenericServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.SearchAuthenticator;

public class Searchcheckservlet extends HttpServlet 
{
   
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.sendRedirect("home.html");
    }
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        String bloodgroup = request.getParameter("bloodgroup");
        //String state = request.getParameter("state");
        String city = request.getParameter("city");
        String pincode = request.getParameter("pincode");
        
        UserDto user = new UserDto();
         
        user.setbloodgroup(bloodgroup);
       // user.setstate(state);
        user.setcity(city);
        user.setpincode(pincode);
         
         
         
        
      SearchAuthenticator s=new SearchAuthenticator();
        boolean search = s.isSearch(user);
        System.out.println(search);
        
        
        if(search)
        {
            response.sendRedirect("showDonor.jsp");
        }
        else
        {
            response.sendRedirect("home.html");
        }
    }
}

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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DonorLoginAuthenticator;

/**
 *
 * @author hp
 */

public class DonorLoginServlet extends HttpServlet
{
    
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.sendRedirect("DonorLogin.html");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        UserDto user = new UserDto();
         
        user.setemail(email);
        user.setpassword(password);
        
        DonorLoginAuthenticator dl=new DonorLoginAuthenticator();
        boolean login = dl.isLogin(user);
        
        
        if(login)
        {
            HttpSession session = request.getSession(true);
             session.setAttribute("email",email);
             session.setAttribute("password",password);
            response.sendRedirect("donordetail.jsp");
        }
        else
        {
            response.sendRedirect("DonorLogin.html");
        }
    }
}

    
package com.webapp.servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.webapp.beans.User;
import com.webapp.dao.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NP-soft
 */
@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        User user = UserDAO.getUserByEmail(email);
        
        
        try{
            if(user.getPassword().equals(password)){
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
            
                request.getRequestDispatcher("homepage.jsp").forward(request, response);
            }else if(!user.getPassword().equals(password)){
                String message = "wrong password";
                request.setAttribute("message", message);
            
                request.getRequestDispatcher("errpage.jsp").forward(request, response);
            }
        }catch(NullPointerException exception){
            String message = "email not found";
            request.setAttribute("message", message);
            
            request.getRequestDispatcher("errpage.jsp").forward(request, response);
        }
         
    }

}

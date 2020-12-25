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
@WebServlet(urlPatterns = {"/addUser"})
public class AddUser extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        int age = Integer.parseInt(request.getParameter("age"));
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        if(!UserDAO.isDuplicateEmail(email)){
            User user = new User(name, lastName, age, email, password);
            UserDAO.addUser(user);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            
            request.getRequestDispatcher("homepage.jsp").forward(request, response);
        }else{
            String message = "this email already exits";
            request.setAttribute("message", message);
            
            request.getRequestDispatcher("errpage.jsp").forward(request, response);
        }  
    }

}

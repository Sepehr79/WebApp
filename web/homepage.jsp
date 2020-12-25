<%-- 
    Document   : homepage
    Created on : Dec 23, 2020, 12:53:05 PM
    Author     : Sepehr79
--%>

<%@page import="com.webapp.beans.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        
        <%
            HttpSession seesion = request.getSession();
            User user =(User) session.getAttribute("user");
            if(user == null){
                String message = "دسترسی غیر مجاز";
                request.setAttribute("message", message);
                request.getRequestDispatcher("errpage.jsp").forward(request, response);
            }
        %>
        <p>Welcome <%= user.getName()%> <%= user.getLastName()%></p>
    </body>
</html>

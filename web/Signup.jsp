<%-- 
    Document   : Signup
    Created on : Dec 22, 2020, 11:20:27 PM
    Author     : NP-soft
--%>

<%@page import="com.webapp.dao.UserDAO"%>
<%@page import="com.webapp.beans.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Signup</h1>
        
        
        <form action="addUser" method="post">
            <table>
                <tr>
                    <td>Enter name: </td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Enter lastname: </td>
                    <td><input type="text" name="lastName"></td>
                </tr>
                <tr>
                    <td>Enter age: </td>
                    <td><input type="number" name="age"></td>
                </tr>
                <tr>
                    <td>Enter email: </td>
                    <td><input type="email" name="email"></td>
                </tr>
                <tr>
                    <td>Enter password: </td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="send"></td>
                    <td><input type="reset" value="reset"></td>
                </tr>
            </table>
        </form>
         
    </body>
</html>

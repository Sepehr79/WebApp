<%-- 
    Document   : Login
    Created on : Dec 22, 2020, 11:20:56 PM
    Author     : Sepehr79
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <table>
            <form action="login" method="post">
                <tr>
                    <td>Enter email: </td>
                    <td><input type="email" name="email"></td>
                </tr>
                <tr>
                    <td>Enter password: </td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="login"></td>
                </tr>
            </form>
        </table>
    </body>
</html>

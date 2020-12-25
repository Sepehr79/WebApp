<%-- 
    Document   : errpage
    Created on : Dec 23, 2020, 12:53:54 PM
    Author     : NP-soft
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%  
        String message;
        try{
            message = request.getAttribute("message").toString();
        }catch(Exception e){
            message = "no message";
        }
    %>
    <body>
        <h1 style="color: red">Error page</h1>
        <p>message: <%= message%></p>
    </body>
</html>

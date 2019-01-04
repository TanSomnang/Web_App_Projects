<%-- 
    Document   : index
    Created on : Jan 3, 2019, 11:01:32 AM
    Author     : MSI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="FirstServlet" method="post">
            UserName: <input type="text" name="name">
            Email   : <input type="email" name="email">
            <input type="submit" value="LogIn">
        </form>
    </body>
</html>

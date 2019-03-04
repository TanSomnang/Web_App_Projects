<%-- 
    Document   : index
    Created on : Jan 14, 2019, 1:43:10 PM
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
       <form action="servletRequestlistner" method="post">
            <table>
                <tr>
                    <td align="right"><b>UserName: </b></td>
                    <td>
                        <input type="text" name="name" size="75">
                    </td>
                </tr>
                <tr>
                    <td align="right"><b>Password: </b></td>
                    <td>
                        <input type="password" name="password" size="75">
                    </td>
                </tr>
                <tr>
                    <td align="left"><b> </b></td>
                    <td>
                        <input type="submit" value="Log In" name="login">
                    </td>
                </tr>
                <tr>
                    <td align="left"><b> </b></td>
                    <td>
                        <a href="FirstServlet">Servlet Attribute</a><br>
                        <a href="SessionServlet">Session Servlet</a><br>
                        <a href="ServletContext">Servlet Context</a><br>
                        <a href="Logout">LogOut Session</a><br>
                        <a href="servletRequestlistner">Request Listener</a><br>
                        
                    </td>
                </tr>
                
            </table>
           
        </form>

    </body>
</html>

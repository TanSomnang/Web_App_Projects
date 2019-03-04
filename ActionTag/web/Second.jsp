<%-- 
    Document   : Second
    Created on : Jan 28, 2019, 2:10:56 PM
    Author     : MSI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body  style="background-color: bisque">
        <h1>Hello World from Second.jsp</h1>
        ${param.user}
        <jsp:useBean id="bean" class="Bean.userBean" scope="session"></jsp:useBean>
        <br>
        ID:
        <jsp:getProperty name="bean" property="id"/><br>
        
        
        School:<jsp:getProperty name="bean" property="school"/><br>
        Name:
        <jsp:getProperty name="bean" property="name"/>
        <div style="background-color: aqua; ">
            <form>
            <table align="center">
                <tr align="right">
                    <td>Username: </td>
                    <td><input type="text" name="name" size="50"></td>
                </tr>
                <tr align="right">
                    <td>Password: </td>
                    <td><input type="password" name="pass" size="50"></td>
                </tr>
                <tr align="center">
                    <td></td>
                    <td><input type="submit" value="Login"></td>
                </tr>
                <tr align="center">
                    <td></td>
                    <td><input type="submit" value="Register"></td>
                </tr>
            </table>
        </form>
        </div>
        
        
    </body>
</html>

<%-- 
    Document   : Landing
    Created on : Jan 30, 2019, 1:57:43 PM
    Author     : MSI
--%>

<%--<%@page isELIgnored="true"%>    //Disable Expression language--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Welcome Home!!!!<br>
        <%-- <%= request.getParameter("name")%> --%>
        Name: ${param.name}<br>
        Password:${param.pass}<br>
        ${param}<br>
        ${paramValues}<br>
        ${10/0}<br>
        ${sessionScope.school}<br>
        ${requestScope.color}<br>
        ${initParam.color}<br>
        ${header}<br>
        ${headerValues}<br>
        ${applicationScope.Authur}<br>
        ${pageScope.color}<br>
        ${cookie}
        
    </body>
</html>

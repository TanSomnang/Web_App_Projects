<%-- 
    Document   : index
    Created on : Jan 28, 2019, 2:03:12 PM
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
        <%--
        
        --%>
        
        <jsp:useBean id="bean" class="Bean.userBean" scope="session"></jsp:useBean>
        <jsp:setProperty property="id" name="bean" value="980"/>
        <jsp:setProperty property="name" name="bean" value="Nang"/>
        <jsp:setProperty property="school" name="bean" value="Love Money"/>
        <jsp:forward page="Next.jsp">
            <jsp:param value="Somnang" name="user"/>
        </jsp:forward>
    </body>
</html>

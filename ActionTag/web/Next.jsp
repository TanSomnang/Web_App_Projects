<%-- 
    Document   : Next
    Created on : Jan 28, 2019, 2:04:37 PM
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
        hello from Next.jsp
        <jsp:forward page="Second.jsp"/>
        <%--<jsp:include page="Second.jsp"/>--%>
    </body>
</html>

<%-- 
    Document   : success
    Created on : Jan 21, 2019, 2:35:18 PM
    Author     : MSI
--%>
<%@include file="Header.jsp" %>

<%@page extends="java.lang.Thread" %>
<%@page language="java" %>
<%@page autoFlush="true" %>
<%@page import="" %>
<%@page errorPage="Error.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
//            int n=1/1
            
            out.println("Color: "+config.getInitParameter("color"));
            String name2=request.getParameter("name");
            out.println("Welcome "+name2);
            out.println((String)session.getAttribute("user"));
            pageContext.getAttribute("user", PageContext.SESSION_SCOPE);
        %>
       
    </body>
</html>

<%-- 
    Document   : index
    Created on : Jan 30, 2019, 1:56:03 PM
    Author     : MSI
--%>

<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Landing.jsp">
            <input type="text" name="name"><br>
            <input type="text" name="pass"><br>
            <input type="submit" value="click">
        </form>
        <%
            
            Map <String,String>map=new HashMap();
            map.put("school1", "KIT");
            map.put("school2", "RUPP");
            map.put("school3", "AUPP");
            session.setAttribute("school", map);
            request.setAttribute("color", "red");
            pageContext.setAttribute("color", "green");
            application.setAttribute("Authur", "james");
//            Cookie ck=new Cookie("Name", "James");
           
            
        %>
    </body>
</html>

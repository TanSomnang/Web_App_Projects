<%-- 
    Document   : next
    Created on : Jan 21, 2019, 1:45:52 PM
    Author     : MSI
--%>
<%@page errorPage="Error.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--Declaration Tag--%>
       <br>
       <%! String name="Name", school="KIT";
            public int test(int a, int b)
            {
                return a+b;
            }
            
        %>
        
        <%--Scriptlet Tag--%>
        
        <% 
//            String name="Somnang";
            String name2=request.getParameter("name");
//            response.getWriter().println(name+" Go Home...!");
            if(name2.equalsIgnoreCase("Somnang Tan"))
            {
//                session.setAttribute("name", name2);
               pageContext.setAttribute("user", "Test", PageContext.SESSION_SCOPE);
                
                request.getRequestDispatcher("/Success").forward(request, response);
            }
            else
            {
                request.getRequestDispatcher("failure.jsp").forward(request,response);
            }
        %>
        
        <%--Expression Tag--%>
        <br><%= test(10,29)%><br>
        <%= name+school %><br>
        <%= "Welcome "+name2%>
 
        
    </body>
</html>

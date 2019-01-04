<%-- 
    Document   : index
    Created on : Dec 25, 2018, 11:03:04 AM
    Author     : MSI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HTML Page</title>
    </head>
    <body>
         <form action="FirstServlet" method="get">
	
		<div>
		<h1>Login Form</h1>
		<span>Fill out the form below to login to my super awesome imaginary control panel.</span>
		</div>
	
		<div>
                    UserName: <input name="name" type="text"/><br>
		
                    Password: <input name="pass" type="password" /><br>
		<div></div>		
		</div>

		<div>
		<input type="submit" name="submit" value="Login" />
		<input type="submit" name="submit" value="Register" />
		</div>
	
	</form>
    </body>
</html>

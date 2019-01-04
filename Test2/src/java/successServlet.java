/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MSI
 */
public class successServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       HttpSession hs=req.getSession();
       String userName = (String)hs.getAttribute("name");
       resp.setContentType("text/html");
       PrintWriter pw=resp.getWriter();
       pw.println("Welcome "+userName);
       pw.println("Successfully Connected");
       pw.println("<br><a href='LogOut'>Logout</a>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       String userName=req.getParameter("name"); //can't be used in second servlet
       HttpSession hs=req.getSession();
       String userName = (String)hs.getAttribute("name");
       resp.setContentType("text/html");
       PrintWriter pw=resp.getWriter();
       pw.println("Welcome "+userName);
       pw.println("Successfully Connected");
       pw.println("<br><a href='LogOut'>Logout</a>");
    }

}
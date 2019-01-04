/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MSI
 */
public class LogOut extends HttpServlet {

       public void logOut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        HttpSession hs = req.getSession();
        hs.invalidate();
        req.getRequestDispatcher("index.html").forward(req, resp);
    }
  
       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logOut(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logOut(request, response);
    }

   
}

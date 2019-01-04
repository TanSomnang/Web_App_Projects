/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MSI
 */
public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String userName=req.getParameter("name");
        PrintWriter out=resp.getWriter();int check=0;
//        for(int i=0; i< userName.length();i++)
//        {
//            if(userName.charAt(i) == 's' || userName.charAt(i) == 'S')
//            {
//                out.println("Welcome "+userName);
//                check=1;
//                break;
//            } 
//        }
//        if(check==0)
//        {
//            out.println("Not match with conditions");
//        }
        
        //check string by using for loop, instead of using .contains
//        
        
        
        
            
        
        
        
       
//            out.print("Welcome "+userName);
            if(userName.equalsIgnoreCase("Sopheak"))
        {
            RequestDispatcher rd=req.getRequestDispatcher("/successServlet");
            rd.forward(req,resp);
            
        }
            
        
//        else if(userName.contains("s"))
//        {
//            out.print("Welcome "+userName);
//        }
        else
        {
            out.println("Not match with conditions");
            RequestDispatcher rd=req.getRequestDispatcher("/FailureServlet");
            rd.include(req,resp);
        }
//        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("name");
        String passWord=req.getParameter("pass");
        
        PrintWriter pw=resp.getWriter();
        if(userName.equalsIgnoreCase("Sopheak"))
        {
            RequestDispatcher rd=req.getRequestDispatcher("/successServlet");
            HttpSession hs=req.getSession();
            
            hs.setAttribute("name", userName);     //used to pass the value to second servlet
            rd.forward(req,resp);
            
        }
         else
        {
            pw.println("Not match with conditions");
            RequestDispatcher rd=req.getRequestDispatcher("/FailureServlet");
            rd.include(req,resp);
        }
        
//            pw.print("Welcome "+userName);
//        }
//        else if(userName.contains("s"))
//        {
//            pw.print("Welcome "+userName);
//        }
//        else
//        {
//            pw.print("Not match with conditions");
//        }
        
    }

   
    }

   
  




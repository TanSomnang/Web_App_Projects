import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MSI
 */
public class SecondServelet extends HttpServlet {

    
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        HttpSession hs=request.getSession();
//        String user=(String)hs.getAttribute("name");
        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        Cookie[] ck=request.getCookies(); //cookies
        
//        pw.println("Welcome "+user);
        for(Cookie cook:ck)
        {
            pw.println("<br>Name:"+cook.getName()+"<br>Value:"+cook.getValue());
        }
        pw.println("<br><a href='LogOut'>Logout</a>");
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
//        String user=(String)request.getAttribute("name");
//        PrintWriter pw=response.getWriter();
//        pw.println("Welcome "+user);
        
        PrintWriter pw=response.getWriter();
        Cookie[] ck=request.getCookies();
        response.setContentType("text/html");
         
//        pw.println("Welcome "+user);
        for(Cookie cook:ck)
        {
            pw.println("Name: "+cook.getName()+"\nValue: "+cook.getValue());
        }
        pw.println("<br><a href='LogOut'>Logout</a>");
       
       
    }


}

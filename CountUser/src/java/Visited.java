
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MSI
 */
public class Visited extends HttpServlet {

  
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String userName = request.getParameter("name");
        PrintWriter pw=response.getWriter();
//        pw.println("<a href='SecondServelet?user="+userName+"'>SecondServelet</a>"); //URL rewriting
        pw.println("Welcome "+userName);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String userName = request.getParameter("name");
        PrintWriter pw=response.getWriter();
//        pw.println("<a href='SecondServelet?user="+userName+"'>SecondServelet</a>"); //URL rewriting
        pw.println("Welcome "+userName);
    }
}

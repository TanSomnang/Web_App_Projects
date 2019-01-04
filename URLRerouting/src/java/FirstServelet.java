
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServelet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String userName = request.getParameter("name");
        PrintWriter pw=response.getWriter();
        pw.println("<a href='SecondServelet?user="+userName+"'>SecondServelet</a>"); //URL rewriting
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
        String userName = request.getParameter("name");
        PrintWriter pw=response.getWriter();
//        pw.println("<a href='SecondServelet?name="+userName+"'>SecondServelet</a>");
        ServletConfig sc = getServletConfig();
        String color = sc.getInitParameter("color");
        pw.println(color);
        pw.println("<form action='SecondServelet'>"
                    +"<input type='hidden' name='user' value='"+userName+"'>"
                    +"<input type='submit' value='second'>"
                            +"</form>");
    }


}

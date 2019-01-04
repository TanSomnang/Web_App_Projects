
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user=req.getParameter("name");
//        HttpSession hs=req.getSession();
//        req.setAttribute("name", user);
         resp.setContentType("text/html");
        Cookie ck=new Cookie("name", user);
        resp.addCookie(ck);
        
        RequestDispatcher rd=req.getRequestDispatcher("SecondServelet");
        rd.forward(req, resp);
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     String user=req.getParameter("name");
//     HttpSession hs=req.getSession();
//        req.setAttribute("name", user);
        resp.setContentType("text/html");
        Cookie ck=new Cookie("Hell", user);
        resp.addCookie(ck);
        
        PrintWriter pw=resp.getWriter();
         pw.println("<a href='SecondServelet'>SecondServelet</a>");
//        RequestDispatcher rd=req.getRequestDispatcher("SecondServelet");
//        rd.forward(req, resp);
    }
    
}

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
public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name =request.getParameter("user");
        StudentModel sm=new StudentModel();
        sm.setUser(name);
        boolean result = sm.checkValues(sm);
        if(result==true)
        {
            request.getRequestDispatcher("success.jsp").forward(request, response);
        }
        else
            request.getRequestDispatcher("failure.jsp").forward(request, response);
    }
}

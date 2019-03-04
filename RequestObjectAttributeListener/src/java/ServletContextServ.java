import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MSI
 */
public class ServletContextServ extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext sc=getServletContext();
        sleep();
        sc.setAttribute("name", "Tan");
        sleep();
        sc.setAttribute("name", "Somnang");
        sleep();
        sc.removeAttribute("name");
        }
    public void sleep()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
         ex.printStackTrace();
        }
    }
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}

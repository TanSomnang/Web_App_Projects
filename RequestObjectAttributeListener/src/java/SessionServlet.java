import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MSI          
 */
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession hs=request.getSession();
        sleep();
        hs.setAttribute("name", "Somnang");
        sleep();
        hs.setAttribute("name", "Tan");
        sleep();
        hs.removeAttribute("name");
        
    }
    public void sleep()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
           ex.printStackTrace();
        }
    }

    
}

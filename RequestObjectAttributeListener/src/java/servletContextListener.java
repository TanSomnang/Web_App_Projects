
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 *
 * @author MSI
 */
public class servletContextListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context "+sce+" is created...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context "+sce+" is destroyed...");
    }
    
}

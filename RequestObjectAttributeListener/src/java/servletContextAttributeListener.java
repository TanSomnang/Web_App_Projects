
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 *
 * @author MSI
 */
public class servletContextAttributeListener implements ServletContextAttributeListener{

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("New Attribute "+event.getName()+" with value "+event.getValue()+" is added to the request object..."); 
    
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
    System.out.println("New Attribute "+event.getName()+" with value "+event.getValue()+" is remove to the request object..."); 
    
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
    System.out.println("New Attribute "+event.getName()+" with value "+event.getValue()+" is replace to the request object..."); 
    
    }
    
}

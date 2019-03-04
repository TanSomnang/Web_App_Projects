
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionListener implements HttpSessionAttributeListener{

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
       System.out.println("New Attribute "+event.getName()+" with value "+event.getValue()+" is added to the request object..."); 
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
    System.out.println("New Attribute "+event.getName()+" with value "+event.getValue()+" is removed to the request object...");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
    System.out.println("New Attribute "+event.getName()+" with value "+event.getValue()+" is replaced to the request object...");
    }
    
}

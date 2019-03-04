
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class AttributeChangeListener implements ServletRequestAttributeListener{

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("New Attribute "+srae.getName()+" with value "+srae.getValue()+" is added to the request object...");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("New Attribute "+srae.getName()+" with value "+srae.getValue()+" is removed to the request object...");    
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("New Attribute "+srae.getName()+" with value "+srae.getValue()+" is replaced to the request object..."); 
    }
    
}

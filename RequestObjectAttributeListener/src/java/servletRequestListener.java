
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI
 */
public class servletRequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("A request is destroyed...");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("A request is created...");
    }
    
}

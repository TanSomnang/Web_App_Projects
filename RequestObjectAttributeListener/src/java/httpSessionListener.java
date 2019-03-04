
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI
 */
public class httpSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session with "+se.getSession().getId()+" is created...");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session with "+se.getSession().getId()+" is destroyed...");
    }
    
}

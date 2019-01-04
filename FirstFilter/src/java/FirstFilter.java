
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI
 */
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Inside init()");
        }

   
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        
        System.out.println("Inside doFilter()");
        String Email=request.getParameter("email").trim();
        if((Email.contains("@"))&&(Email.contains(".")))
        {
            chain.doFilter(request, response);
        }
        else
        {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        
        
    }

    @Override
    public void destroy() {
        System.out.println("Inside destroy()");
        }
    
    
}


import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondFilter implements Filter{
     @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Inside init() 2");
        }

   
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Inside doFilter() 2");
       
        String user = request.getParameter("name").trim();
        if((user==null)||user.equals(""))
        {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        else 
        {
            chain.doFilter(request, response);
        }
                
    }

    @Override
    public void destroy() {
        System.out.println("Inside destroy() 2");
        }
}

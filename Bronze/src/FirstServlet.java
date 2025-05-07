import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns ="/fs",loadOnStartup = 1)
public class FirstServlet extends GenericServlet {


    public FirstServlet(){
        System.out.println("FirstServlet running in Tomcat ");
    }

    @Override
   public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException
    {
        System.out.println("service method running in FirstServlet");
    }
}

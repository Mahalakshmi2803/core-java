import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns ="/bs",loadOnStartup = 1)
public class BadmintonServlet extends GenericServlet {


    public BadmintonServlet(){
        System.out.println("BadmintonServlet created by Tomcat ");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException
    {
        System.out.println("service method running in BadmintonServlet");
    }
}


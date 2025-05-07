import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns ="/cs",loadOnStartup = 1)
public class CricketServlet extends GenericServlet {


    public CricketServlet(){
        System.out.println("CricketServlet created by Tomcat ");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException
    {
        System.out.println("service method running in CricketServlet");
    }
}


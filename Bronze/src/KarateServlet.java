import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns ="/ks",loadOnStartup = 1)
public class KarateServlet extends GenericServlet {


    public KarateServlet(){
        System.out.println("KarateServlet created by Tomcat ");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException
    {
        System.out.println("service method running in KarateServlet");
    }
}


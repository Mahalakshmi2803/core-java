import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns ="/vs",loadOnStartup = 1)
public class VolleyballServlet extends GenericServlet {


    public VolleyballServlet(){
        System.out.println("VolleyballServlet created by Tomcat ");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException
    {
        System.out.println("service method running in VolleyballServlet");
    }
}


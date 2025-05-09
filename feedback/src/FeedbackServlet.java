import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class FeedbackServlet extends GenericServlet {

    public FeedbackServlet(){
        System.out.println("FeedbackServlet created by tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String contact=servletRequest.getParameter("contact");
        String feedback=servletRequest.getParameter("feedback");

//        servletResponse.setContentType("text/html");
//        PrintWriter writer=servletResponse.getWriter();
//        writer.println(name+" Thank you for Feedback");

    }
}

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns ="/check" , loadOnStartup = 1)
public class AadharServlet extends GenericServlet {

    public AadharServlet() {
        System.out.println("AadharServlet created by tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method running in AadharServlet");
        String aadhar = servletRequest.getParameter("AadharNumber");

        if (aadhar != null && aadhar.matches("\\d{12}")) {
            System.out.println("Valid Aadhar Number: " + aadhar);
        } else {
            System.out.println("Invalid Aadhar Number. It must be exactly 12 digits.");
        }
    }
}


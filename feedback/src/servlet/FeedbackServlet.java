package servlet;

import repository.FeedbackRepoImpl;
import dto.FeedbackDto;
import repository.FeedbackRepo;
import service.FeedbackService;
import service.FeedbackServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.Integer.parseInt;

@WebServlet(urlPatterns = "/submit")
public class FeedbackServlet extends HttpServlet {

    public FeedbackServlet(){
        System.out.println("FeedbackServlet created by tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String contact=req.getParameter("rating");
        String feedback=req.getParameter("feedback");

        FeedbackDto feedbackDto=new FeedbackDto();
        feedbackDto.setName(name);
        feedbackDto.setEmail(email);
        feedbackDto.setRating(contact);
        feedbackDto.setFeedback(feedback);

        FeedbackRepo feedbackRepo=new FeedbackRepoImpl();
        String result= feedbackRepo.persist(feedbackDto);


    }
}


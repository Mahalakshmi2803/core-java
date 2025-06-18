package com.xworkz.poster.servlet;

import com.xworkz.poster.dto.PosterDto;
import com.xworkz.poster.repository.PosterRepository;
import com.xworkz.poster.repository.PosterRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = {"/submitPoster", "/search"}, loadOnStartup = 1)
public class PosterServlet extends HttpServlet {

    private PosterRepository posterRepository = new PosterRepositoryImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("PosterServlet POST is running...");

        String posterName = req.getParameter("posterName");
        String posterColor = req.getParameter("posterColor");
        String posterMaterial = req.getParameter("posterMaterial");
        String posterLengthInCm = req.getParameter("posterLengthInCm");
        String posterReleaseDate = req.getParameter("posterReleaseDate");
        String isAGoodPoster = req.getParameter("IsAGoodPoster");

        PosterDto posterDto = new PosterDto();
        posterDto.setPosterName(posterName);
        posterDto.setPosterColor(posterColor);
        posterDto.setPosterMaterial(posterMaterial);
        posterDto.setPosterLengthInCm(posterLengthInCm);
        posterDto.setPosterReleaseDate(posterReleaseDate);
        posterDto.setIsAGoodPoster(isAGoodPoster);

        String result = posterRepository.persist(posterDto);

        if ("Success".equalsIgnoreCase(result)) {
            System.out.println("Poster saved successfully.");
            req.setAttribute("success", "Poster details saved successfully");
        } else {
            System.out.println("Poster not saved.");
            req.setAttribute("dto", posterDto);
            req.setAttribute("failure", "Failed to save Poster details");
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/poster.jsp");  // Forward to form page
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("PosterServlet GET is running...");

        String idParam = req.getParameter("posterID");

        if (idParam != null && !idParam.isEmpty()) {
            try {
                int id = Integer.parseInt(idParam);
                Optional<PosterDto> found = posterRepository.findById(id);

                if (found.isPresent()) {
                    PosterDto posterDto = found.get();
                    req.setAttribute("foundPoster", posterDto);
                    req.setAttribute("message", "Poster found with ID: " + id);
                } else {
                    req.setAttribute("message", "No Poster found with ID: " + id);
                }

            } catch (NumberFormatException e) {
                req.setAttribute("message", "Invalid Poster ID format");
            }
        } else {
            req.setAttribute("message", "Poster ID cannot be empty");
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/posters.jsp");  // Forward to result page
        dispatcher.forward(req, resp);
    }
}

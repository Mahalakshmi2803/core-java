package com.xworkz.poster.servlet;

import com.xworkz.poster.dto.PosterDto;
import com.xworkz.poster.repository.PosterRepository;
import com.xworkz.poster.repository.PosterRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/submitPoster", loadOnStartup = 1)
public class PosterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("PosterServlet is Running");

        String posterName = req.getParameter("posterName");
        String posterColor = req.getParameter("posterColor");
        String posterMaterial = req.getParameter("posterMaterial");
        String posterLengthInCm = req.getParameter("posterLengthInCm");
        String posterReleaseDate = req.getParameter("posterReleaseDate");
        String IsAGoodPoster = req.getParameter("IsAGoodPoster");



        PosterDto posterDto = new PosterDto();
        posterDto.setPosterName(posterName);
        posterDto.setPosterColor(posterColor);
        posterDto.setPosterMaterial(posterMaterial);
        posterDto.setPosterLengthInCm(posterLengthInCm);
        posterDto.setPosterReleaseDate(posterReleaseDate);
        posterDto.setIsAGoodPoster(IsAGoodPoster);



        PosterRepository posterRepository=new PosterRepositoryImpl();
        String result= posterRepository.persist(posterDto);









    }
}

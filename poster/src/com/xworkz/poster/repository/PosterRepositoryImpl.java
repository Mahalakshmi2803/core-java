package com.xworkz.poster.repository;

import com.xworkz.poster.dto.PosterDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PosterRepositoryImpl implements PosterRepository{

    @Override
    public String persist(PosterDto posterDto) {
        System.out.println("Persist running in PosterRepositoryImpl");
        System.out.println("Should save into DB");

        if (posterDto != null) {
            String url = "jdbc:mysql://localhost:3306/maha_2803";
            String username = "root";
            String password = "Mahalakshmi@2803";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, username, password);

                String sql = "INSERT INTO poster_details values (1," +
                        "'" + posterDto.getPosterName() + "', '" +
                        posterDto.getPosterColor() + "', '" +
                        posterDto.getPosterMaterial() + "',  " +
                        posterDto.getPosterLengthInCm() + ", '" +
                        posterDto.getPosterReleaseDate() + "', '" +
                        posterDto.getIsAGoodPoster() + "')";

                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return "Success";
    }
}


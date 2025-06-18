package com.xworkz.poster.repository;

import com.xworkz.poster.constant.DBProperties;
import com.xworkz.poster.dto.PosterDto;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;

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
                String sql = "INSERT INTO poster_details values (8," +
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
    public Optional<PosterDto>
    findById(int id) {
        System.out.println("running findById in posterRepositoryImpl...");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DBProperties.URL.getProp(), DBProperties.USER_NAME.getProp(), DBProperties.SECRET.getProp());
            String findByIdSQL="select * from poster_details p where p.id="+id+"";
            System.out.println("findById :"+findByIdSQL);
            Statement statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery(findByIdSQL);
            System.out.println("resultSet :"+resultSet);
            while(resultSet.next())
            {
                int pk= resultSet.getInt("id");
                String name=resultSet.getString("posterName");
                String color=resultSet.getString("posterColor");
                String material=resultSet.getString("posterMaterial");
                int length=resultSet.getInt("posterLengthInCm");
                LocalDate releaseDate=resultSet.getDate("posterReleaseDate").toLocalDate();
                boolean goodOrBad=resultSet.getBoolean("isAGoodPoster");

                PosterDto  posterDto=new PosterDto(name,color,material,length,releaseDate,goodOrBad);
                return  Optional.of(posterDto);
            }

        }
        catch (SQLException | ClassNotFoundException exception)
        {
            System.err.println("SQLException in findById "+exception.getMessage());
        }
        return Optional.empty();
    }
}


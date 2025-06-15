package com.xworkz.weather.repository;

import com.xworkz.weather.dto.WeatherDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WeatherRepositoryImpl implements WeatherRepository {
    @Override
    public String persist(WeatherDto weatherDto) {
        System.out.println("Persist running in weatherDto");
        System.out.println("Should save into DB");

        if (weatherDto != null) {
            String url = "jdbc:mysql://localhost:3306/maha_2803";
            String username = "root";
            String password = "Mahalakshmi@280303";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, username, password);

                String sql = "INSERT INTO weather_forecast (" +
                        "placeName, weather, minTemp, maxTemp, cloudy, raining, " +
                        "rainInMM, humidity, windSpeed, sunriseTime, sunsetTime, " +
                        "moonriseTime, moonsetTime, rainStartTime, rainEndTime, " +
                        "precipitation, CurrentDateTime) VALUES (" +
                        "'" + weatherDto.getPlaceName() + "', '" +
                        weatherDto.getWeather() + "', '" +
                        weatherDto.getMinTemp() + "', '" +
                        weatherDto.getMaxTemp() + "', '" +
                        weatherDto.getCloudy() + "', '" +
                        weatherDto.getRaining() + "', " +
                        weatherDto.getRainInMM() + ", '" +
                        weatherDto.getHumidity() + "', " +
                        weatherDto.getWindSpeed() + ", '" +
                        weatherDto.getSunRiseTime() + "', '" +
                        weatherDto.getSunSetTime() + "', '" +
                        weatherDto.getMoonRiseTime() + "', '" +
                        weatherDto.getMoonSetTime() + "', '" +
                        weatherDto.getRainStartTime() + "', '" +
                        weatherDto.getRainEndTime() + "', " +
                        weatherDto.getPrecipitation() + ", '" +
                        weatherDto.getCurrentDateTime() + "')";

                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return "Success";
    }
}

package repository;

import dto.FeedbackDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FeedbackRepoImpl implements FeedbackRepo {

    @Override
    public String persist(FeedbackDto feedbackDto) {
        System.out.println("Persist running in FeedbackRepoImpl");

        if (feedbackDto == null) {
            return "Failed: Feedback data is null";
        }

        String url = "jdbc:mysql://localhost:3306/maha_2803";
        String username = "root";
        String password = "Mahalakshmi@2803";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = DriverManager.getConnection(url, username, password);
                 Statement statement = connection.createStatement()) {

                // Keep the SQL exactly as you provided
                String sql = "insert into table_feedback values(0,'"
                        + feedbackDto.getName() + "','"
                        + feedbackDto.getEmail() + "',"
                        + feedbackDto.getRating() + ",'"
                        + feedbackDto.getFeedback() + "')";

                System.out.println("Executing SQL: " + sql);

                statement.executeUpdate(sql);
                return "Success";

            } catch (SQLException e) {
                e.printStackTrace();
                return "Database Error: " + e.getMessage();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "JDBC Driver not found";
        }
    }
}

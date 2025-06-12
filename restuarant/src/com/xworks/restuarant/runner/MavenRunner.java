package com.xworks.restuarant.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MavenRunner {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String username="root";
        String password="Mahalakshmi@2803";
        String url="jdbc:mysql://localhost:3306/maha_2803";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection(url,username,password);
        System.out.println("Connection success: "+connection);

}

}

package com.yash.nutritionapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Driver not found.");
            ex.printStackTrace();
            return null;
        }

        String url = "jdbc:mysql://localhost:3306/kiran";
        String username = "root";
        String password = "root";

        return DriverManager.getConnection(url, username, password);
    }
}
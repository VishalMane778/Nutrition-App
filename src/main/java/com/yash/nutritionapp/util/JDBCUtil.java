package com.yash.nutritionapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {

    public static Connection getConnection() {


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/nutrition_app";
            String user = "root";
            String pass = "root";

            return DriverManager.getConnection(url, user, pass);

        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}

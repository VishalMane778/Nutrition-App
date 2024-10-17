package com.yash.nutritionapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static Connection connection;

	public static Connection openConnection() throws ClassNotFoundException, SQLException {
		// load jdbc driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/nutritionapp_db";
		String user = "root";
		String password = "root";

		connection = DriverManager.getConnection(url, user, password);
		return connection;
	}

//get Connection
	public static Connection getConnection() {
		return connection;
	}

//close connection
	public static void close() throws SQLException {
		if (connection != null) {
			connection.close();
		}
	}
}

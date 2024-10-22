package com.yash.nutritionapp.daoimpl;

import com.yash.nutritionapp.dao.HealthProfileDAO;
import com.yash.nutritionapp.domain.HealthProfile;
import com.yash.nutritionapp.util.DBConnection;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HealthProfileDAOImpl implements HealthProfileDAO {

    @Override
    public void saveHealthProfile(HealthProfile healthProfile) throws SQLException {
        String query = "INSERT INTO user_profile(age, weight, height, activity_level,bmi,bmiCategory) VALUES (?, ?, ?, ?,?,?)";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, healthProfile.getAge());
            statement.setDouble(2, healthProfile.getWeight());
            statement.setDouble(3, healthProfile.getHeight());
            statement.setString(4, healthProfile.getActivityLevel());
            statement.setDouble(5,healthProfile.getBmi());
            statement.setString(6,healthProfile.getBmiCategory());
            statement.executeUpdate();
        }
    }
}
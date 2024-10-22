package com.yash.nutritionapp.daoimpl;

import com.yash.nutritionapp.dao.SetGoalsDAO;
import com.yash.nutritionapp.domain.HealthProfile;
import com.yash.nutritionapp.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.yash.nutritionapp.dao.SetGoalsDAO;
public class SetGoalsDAOImpl implements SetGoalsDAO{

    @Override
    public void setUserGoals(HealthProfile user, String goalType, String goalValue, String timeframe) {
        try (Connection connection = DBConnection.getConnection()) {
            String query = "INSERT INTO user_goals (user_id, goal_type, goal_value, timeframe) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, HealthProfile.getId());
            statement.setString(2, goalType);
            statement.setString(3, goalValue);
            statement.setString(4, timeframe);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
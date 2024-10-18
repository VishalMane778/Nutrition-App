package com.yash.nutritionapp.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.nutritionapp.dao.UserDAO;
import com.yash.nutritionapp.domain.User;
import com.yash.nutritionapp.util.DBConnection;

public class UserDAOImpl implements UserDAO {

    DBConnection dbConnection;

    public UserDAOImpl() {
        dbConnection = new DBConnection();
    }


    public void saveUser(User user) {

        String sqlInsert = "INSERT INTO userdata VALUES (?, ?, ?, ?, ?)";
        try(Connection con = dbConnection.getConnection();
            PreparedStatement statement = con.prepareStatement(sqlInsert)){

            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setFloat(4, user.getHeight());
            statement.setFloat(5, user.getWeight());

            statement.executeUpdate();
            System.out.println("done inserting!!");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public User getUser(String email, String password) {
        System.out.println("Inside dao getUser");
        String getUserQuery = "select * from userdata where email = ? and password = ?";
        User user = new User();

        try(Connection con = dbConnection.getConnection();
            PreparedStatement statement = con.prepareStatement(getUserQuery)){

            System.out.println(email);
            System.out.println(password);

            statement.setString(1, email);
            statement.setString(2, password);

            System.out.println("label 111");

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                System.out.println("Printing rs...");
                System.out.println("name: " + rs.getString("name"));
                String _name = rs.getString("name");
                String _email = rs.getString("email");
                String _password = rs.getString("password");
                float _height = rs.getFloat("height");
                float _weight = rs.getFloat("weight");

                user = new User(_name, _email, _password, _height, _weight);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("done finding user");

        return user;
    }

}
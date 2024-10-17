package com.yash.nutritionapp.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.yash.nutritionapp.domain.Role;
import com.yash.nutritionapp.domain.User;

public interface IUserDao {

	// add a method to register new User
	String registerUser(User newUser) throws SQLException;

	// add a method to authenticate user
	User authenticateUser(String email, String password) throws SQLException;
}

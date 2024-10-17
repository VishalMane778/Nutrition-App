package com.yash.nutritionapp.daoimpl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.nutritionapp.dao.IUserDao;

import com.yash.nutritionapp.domain.User;
import static com.yash.nutritionapp.util.DBUtils.*;

public class UserDaoImpl implements IUserDao {

	private Connection cn;
	private PreparedStatement pst1, pst2;

	// def ctor
	public UserDaoImpl() throws SQLException, ClassNotFoundException {
		// get FIXED DB conn from DBUtils
		cn = getConnection();

		String insertSql = "insert into users values(default,?,?,?,?)";
		pst1 = cn.prepareStatement(insertSql);

		pst2 = cn.prepareStatement("SELECT * FROM users WHERE email=? AND password=?");
		System.out.println("user dao created !");
	}

	@Override
	public String registerUser(User newUser) throws SQLException {
		// set IN params : name | email | password | reg_amt | reg_date | role
		pst1.setString(1, newUser.getName());
		pst1.setString(2, newUser.getEmail());
		pst1.setString(3, newUser.getPassword());
		pst1.setString(6, newUser.getUserRole().getRoleName());
		int rowCount = pst2.executeUpdate();
		if (rowCount == 1)
			return "User registered successfully .....";
		return " User registration failled  !!!!!!!!!!!!!!!!!!!!!!!";
	}

	@Override
	public User authenticateUser(String email, String password) throws SQLException {
		pst2.setString(1, email);
		pst2.setString(2, password);
		try (ResultSet rst = pst2.executeQuery()) {
			if (rst.next()) {
				return new User(rst.getString(1));
			}
			return null;
		}
	}

	// add clean up method , to close DB resources
	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();

	}

}

package com.yash.nutritionapp.domain;

import javax.management.relation.Role;

public class User {
	private int userId;
	private String name;
	private String email;
	private String password;
	private Role userRole;

	public User(int userId, String name, String email, String password, Role userRole) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.userRole = userRole;
	}

	public User(String name, String email, String password, Role userRole) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.userRole = userRole;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getUserRole() {
		return userRole;
	}

	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}

}

package com.yash.nutritionapp.dao;

import com.yash.nutritionapp.domain.User;

public interface UserDAO {

    public void saveUser(User user);
    User getUser(String name, String password);

}

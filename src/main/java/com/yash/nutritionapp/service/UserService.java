package com.yash.nutritionapp.service;

import com.yash.nutritionapp.domain.User;

public interface UserService {

    public void saveUser(User user);
    public User getUser(String email, String password);
}

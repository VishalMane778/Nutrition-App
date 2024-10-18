package com.yash.nutritionapp.serviceimpl;


import com.yash.nutritionapp.daoimpl.UserDAOImpl;
import com.yash.nutritionapp.domain.User;
import com.yash.nutritionapp.service.UserService;


public class UserServiceImpl implements UserService{

    UserDAOImpl userDAO = new UserDAOImpl();

    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public User getUser(String email, String password) {
        return userDAO.getUser(email, password);
    }


}

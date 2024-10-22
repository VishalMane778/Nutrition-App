package com.yash.nutritionapp.serviceimpl;

import com.yash.nutritionapp.dao.HealthProfileDAO;
import com.yash.nutritionapp.daoimpl.HealthProfileDAOImpl;
import com.yash.nutritionapp.domain.HealthProfile;
import com.yash.nutritionapp.service.HealthProfileService;

import java.sql.SQLException;

public class HealthProfileServiceImpl implements HealthProfileService {

    private HealthProfileDAO healthProfileDAO = new HealthProfileDAOImpl();

    @Override
    public void saveHealthProfile(HealthProfile healthProfile) {
        try {
            healthProfileDAO.saveHealthProfile(healthProfile);
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }
}
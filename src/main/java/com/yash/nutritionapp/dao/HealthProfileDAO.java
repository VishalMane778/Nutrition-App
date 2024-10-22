package com.yash.nutritionapp.dao;

import com.yash.nutritionapp.domain.HealthProfile;

import java.sql.SQLException;

public interface HealthProfileDAO {
    void saveHealthProfile(HealthProfile healthProfile) throws SQLException;
}
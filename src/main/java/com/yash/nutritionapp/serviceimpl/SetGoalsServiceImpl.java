package com.yash.nutritionapp.serviceimpl;

import com.yash.nutritionapp.dao.SetGoalsDAO;
import com.yash.nutritionapp.daoimpl.SetGoalsDAOImpl;
import com.yash.nutritionapp.domain.HealthProfile;
import com.yash.nutritionapp.service.SetGoalsService;

public class SetGoalsServiceImpl implements SetGoalsService {
    private SetGoalsDAO setGoalsDAO = new SetGoalsDAOImpl();

    @Override
    public void setGoals(HealthProfile user, String goalType, String goalValue, String timeframe) {
        setGoalsDAO.setUserGoals(user,goalType, goalValue, timeframe);
    }
}
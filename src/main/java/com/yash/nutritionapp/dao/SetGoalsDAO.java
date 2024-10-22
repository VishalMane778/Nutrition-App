package com.yash.nutritionapp.dao;

import com.yash.nutritionapp.domain.HealthProfile;

public interface SetGoalsDAO{
    void setUserGoals(HealthProfile user, String goalType, String goalValue, String timeframe);
}

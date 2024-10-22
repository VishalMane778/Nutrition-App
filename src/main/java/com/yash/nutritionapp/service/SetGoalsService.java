package com.yash.nutritionapp.service;

import com.yash.nutritionapp.domain.HealthProfile;

public interface SetGoalsService {
    void setGoals(HealthProfile user, String goalType, String goalValue, String timeframe);
}
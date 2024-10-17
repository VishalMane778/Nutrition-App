package com.yash.nutritionapp.dao;

import java.util.List;

import com.yash.nutritionapp.domain.Nutrient;

public interface NutrientDao {
    void addNutrient(Nutrient nutrient);
    List<Nutrient> getAllNutrients();
}

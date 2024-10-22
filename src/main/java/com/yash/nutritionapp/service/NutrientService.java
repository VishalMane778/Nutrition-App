package com.yash.nutritionapp.service;

import java.util.List;

import com.yash.nutritionapp.domain.Nutrient;

public interface NutrientService {
    void addNutrient(Nutrient nutrient);
    List<Nutrient> getAllNutrients();
}

package com.yash.nutritionapp.serviceimpl;

import java.util.List;

import com.yash.nutritionapp.daoimpl.NutrientDaoImpl;
import com.yash.nutritionapp.domain.Nutrient;
import com.yash.nutritionapp.service.NutrientService;

public class NutrientServiceImpl implements NutrientService{
    NutrientDaoImpl addNutrientDaoImpl = new NutrientDaoImpl();

    @Override
    public void addNutrient(Nutrient nutrient) {
        addNutrientDaoImpl.addNutrient(nutrient);
    }

    @Override
    public List<Nutrient> getAllNutrients() {
        return addNutrientDaoImpl.getAllNutrients() ;
    }

}

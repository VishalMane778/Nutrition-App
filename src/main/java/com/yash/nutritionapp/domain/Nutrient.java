package com.yash.nutritionapp.domain;

public class Nutrient {

    private String nutrientName;
    private double nutrientCalorie;
    private double nutrientCarbs;
    private double nutrientSugar;
    private double nutrientFat;
    private double nutrientProtein;
    private String nutrientDescription;

    public double getNutrientCalorie() {
        return nutrientCalorie;
    }

    public void setNutrientCalorie(double nutrientCalorie) {
        this.nutrientCalorie = nutrientCalorie;
    }

    public double getNutrientCarbs() {
        return nutrientCarbs;
    }

    public void setNutrientCarbs(double nutrientCarbs) {
        this.nutrientCarbs = nutrientCarbs;
    }

    public double getNutrientSugar() {
        return nutrientSugar;
    }

    public void setNutrientSugar(double nutrientSugar) {
        this.nutrientSugar = nutrientSugar;
    }

    public double getNutrientFat() {
        return nutrientFat;
    }

    public void setNutrientFat(double nutrientFat) {
        this.nutrientFat = nutrientFat;
    }

    public double getNutrientProtein() {
        return nutrientProtein;
    }

    public void setNutrientProtein(double nutrientProtein) {
        this.nutrientProtein = nutrientProtein;
    }

    public String getNutrientDescription() {
        return nutrientDescription;
    }

    public void setNutrientDescription(String nutrientDescription) {
        this.nutrientDescription = nutrientDescription;
    }

    public String getNutrientName() {
        return nutrientName;
    }

    public void setNutrientName(String nutrientName) {
        this.nutrientName = nutrientName;
    }

    @Override
    public String toString() {
        return "Nutrient{" +
                "nutrientName='" + nutrientName + '\'' +
                ", nutrientCalorie=" + nutrientCalorie +
                ", nutrientCarbs=" + nutrientCarbs +
                ", nutrientSugar=" + nutrientSugar +
                ", nutrientFat=" + nutrientFat +
                ", nutrientProtein=" + nutrientProtein +
                ", nutrientDescription='" + nutrientDescription + '\'' +
                '}';
    }
}

package com.yash.nutritionapp.domain;

public class HealthProfile {
    private static int id;
    private int age;
    private double weight;
    private double height;
    private String activityLevel;
    private double bmi;
    private String bmiCategory;
    public HealthProfile(int age, double weight, double height, String activityLevel) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.activityLevel = activityLevel;
    }

    // Getters and Setters
    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    public void setBmi(double bmi) {
        this.bmi=bmi;
    }

    public void setBmiCategory(String bmiCategory) {
        this.bmiCategory=bmiCategory;
    }
    public double getBmi()
    {
        return bmi;
    }
    public  String getBmiCategory()
    {
        return bmiCategory;
    }

}

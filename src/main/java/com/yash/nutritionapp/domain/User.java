package com.yash.nutritionapp.domain;

public class User {
    private String name;
    private String email;
    private String password;
    private float height;
    private float weight;

    public User(String name, String email, String password, float height, float weigth) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.height = height;
        this.weight = weigth;
    }

    public User() {
        super();
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


}

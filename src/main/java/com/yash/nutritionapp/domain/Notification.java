package com.yash.nutritionapp.domain;

import java.sql.Time;

public class Notification {
    private int id;
    private int userId;
    private String type;
    private Time time;
    private String message;
    private String status;

    public Notification(int userId, String type, Time time, String message, String status) {
        this.userId = userId;
        this.type = type;
        this.time = time;
        this.message = message;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

package com.yash.nutritionapp.controller;

import com.yash.nutritionapp.domain.HealthProfile;
import com.yash.nutritionapp.service.HealthProfileService;
import com.yash.nutritionapp.serviceimpl.HealthProfileServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/saveProfile")
public class HealthProfileServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private HealthProfileService healthProfileService = new HealthProfileServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("healthProfile.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String age = request.getParameter("age");
        String weight = request.getParameter("weight");
        String height = request.getParameter("height");
        String activityLevel = request.getParameter("activityLevel");

        HealthProfile healthProfile = new HealthProfile(Integer.parseInt(age), Double.parseDouble(weight), Double.parseDouble(height), activityLevel);
        healthProfileService.saveHealthProfile(healthProfile);

        request.getSession().setAttribute("healthProfile", healthProfile);
        response.sendRedirect("profileSaved.jsp");
    }
}
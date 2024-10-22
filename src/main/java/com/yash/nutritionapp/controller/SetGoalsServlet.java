package com.yash.nutritionapp.controller;

import com.yash.nutritionapp.domain.HealthProfile;
import com.yash.nutritionapp.service.SetGoalsService;
import com.yash.nutritionapp.serviceimpl.SetGoalsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/setGoals")
public class SetGoalsServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private SetGoalsService setGoalsService = new SetGoalsServiceImpl();


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String goalType = request.getParameter("goalType");
        String goalValue = request.getParameter("goalValue");
        String timeframe = request.getParameter("timeframe");

        HealthProfile user = (HealthProfile ) request.getSession().getAttribute("user");
        if (user == null) {
            request.getRequestDispatcher("jsp/goalsSet.jsp").forward(request, response);
            return;
        }

        setGoalsService.setGoals(user, goalType, goalValue, timeframe);
//       response.sendRedirect("jsp/goalsSet.jsp");
        request.getRequestDispatcher("jsp/goalsSet.jsp").forward(request, response);
    }
}
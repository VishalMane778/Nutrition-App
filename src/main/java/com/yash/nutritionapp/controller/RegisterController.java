package com.yash.nutritionapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.nutritionapp.domain.User;
import com.yash.nutritionapp.serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class registerController
 */
@WebServlet("/registerController")
public class RegisterController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RegisterController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("inside RegisterController");
        UserServiceImpl userServiceImpl = new UserServiceImpl();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        float height = Float.parseFloat(request.getParameter("height"));
        float weight = Float.parseFloat(request.getParameter("weight"));

//		System.out.println("reg name : " + name);

        User user = new User(name, email, password, height, weight);

        userServiceImpl.saveUser(user);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/loginPage.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
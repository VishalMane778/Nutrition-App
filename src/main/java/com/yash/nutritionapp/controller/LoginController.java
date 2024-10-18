package com.yash.nutritionapp.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.yash.nutritionapp.domain.User;
import com.yash.nutritionapp.service.UserService;
import com.yash.nutritionapp.serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class loginController
 */
@WebServlet("/loginController")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("inside login controller");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserService userService = new UserServiceImpl();
        HttpSession session = request.getSession();

        if(email.equals("admin@yash.com") && password.equals("Admin@123")) {
            System.out.println("admin section");
            session.setAttribute("name", "Kiraniyaa");
            RequestDispatcher dispatcher = request.getRequestDispatcher("adminPage.jsp");
            dispatcher.forward(request, response);
        }
        else {

            User user = userService.getUser(email, password);

            System.out.println(user.getEmail());
            System.out.println(user.getName());

            session.setAttribute("name", user.getName());

            RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/welcomePage.jsp");
            dispatcher.forward(request, response);
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}

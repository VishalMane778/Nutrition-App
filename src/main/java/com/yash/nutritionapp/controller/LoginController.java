package com.yash.nutritionapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.nutritionapp.daoimpl.UserDaoImpl;
import com.yash.nutritionapp.domain.User;
import com.yash.nutritionapp.domain.Role;
import static com.yash.nutritionapp.util.DBUtils.*;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userDao;
	

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("in init method");
		try {
			openConnection();
			userDao = new UserDaoImpl();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			throw new ServletException("error in init of " + getClass(), e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		if (userDao != null) {
			try {
				userDao.cleanUp();
				
				close();

			} catch (SQLException e) {
				throw new RuntimeException("error in destroy " + getClass(), e);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			String name = request.getParameter("email");
			String password = request.getParameter("password");
			User user = userDao.authenticateUser(name, password);
			if (user == null) {
				pw.println("<h5>Invalid credentials, Please <a href='login.html'>Retry</a><h5>");
			} else {
				
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("user", user);
				httpSession.setAttribute("user_dao", userDao);
				
				if(user.getUserRole()== Role.ADMIN)
					response.sendRedirect("admin");
				else
					response.sendRedirect("userHome");
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new ServletException("error in do-post " + getClass(), e);
		}
	}

}

package com.yash.nutritionapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.nutritionapp.dao.ProductDAO;
import com.yash.nutritionapp.daoimpl.ProductDaoImpl;
import com.yash.nutritionapp.domain.Product;

@WebServlet("/product")
public class ProductController extends HttpServlet {
	private ProductDAO productDAO = new ProductDaoImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		try {
			if (action == null || action.equals("list")) {
				List<Product> products = productDAO.getAllProducts();
				request.setAttribute("products", products);
				request.getRequestDispatcher("productList.jsp").forward(request, response);
			} else if (action.equals("edit")) {
				int productId = Integer.parseInt(request.getParameter("productId"));
				Product product = productDAO.getProductById(productId);
				request.setAttribute("product", product);
				request.getRequestDispatcher("productForm.jsp").forward(request, response);
			} else if (action.equals("delete")) {
				int productId = Integer.parseInt(request.getParameter("productId"));
				productDAO.deleteProduct(productId);
				response.sendRedirect("product?action=list");
			}
		} catch (Exception e) {
			request.setAttribute("errorMessage", e.getMessage());
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		try {
			if (action.equals("add")) {
				Product product = new Product();
				product.setProductName(request.getParameter("productName"));
				product.setDescription(request.getParameter("description"));
				product.setPrice(Double.parseDouble(request.getParameter("price")));
				product.setQuantity(Integer.parseInt(request.getParameter("quantity")));
				productDAO.addProduct(product);
				response.sendRedirect("product?action=list");
			} else if (action.equals("update")) {
				Product product = new Product();
				product.setProductId(Integer.parseInt(request.getParameter("productId")));
				product.setProductName(request.getParameter("productName"));
				product.setDescription(request.getParameter("description"));
				product.setPrice(Double.parseDouble(request.getParameter("price")));
				product.setQuantity(Integer.parseInt(request.getParameter("quantity")));
				productDAO.updateProduct(product);
				response.sendRedirect("product?action=list");
			}
		} catch (Exception e) {
			request.setAttribute("errorMessage", e.getMessage());
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}
}
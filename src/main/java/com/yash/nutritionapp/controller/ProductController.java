package com.yash.nutritionapp.controller;
 
import com.yash.nutritionapp.domain.Product;
import com.yash.nutritionapp.domain.Review;
import com.yash.nutritionapp.service.IProductService;
import com.yash.nutritionapp.serviceimpl.ProductServiceImpl;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
 
@WebServlet("/product")
public class ProductController extends HttpServlet {
    private IProductService productService;
 
    public void init() {
        try {
            productService = new ProductServiceImpl();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<Product> productList = productService.getAllProducts();
            req.setAttribute("productList", productList);
            req.getRequestDispatcher("/product.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Unable to fetch products.");
        }
    }
 
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        try {
            if ("add".equals(action)) {
                // Add product logic
                String name = req.getParameter("name");
                String description = req.getParameter("description");
                double price = Double.parseDouble(req.getParameter("price"));
                int quantity = Integer.parseInt(req.getParameter("quantity"));
                Product product = new Product(name, description, price, quantity);
                String result = productService.addProduct(product);
                resp.getWriter().write(result);
            } else if ("update".equals(action)) {
                // Update product logic
                int productId = Integer.parseInt(req.getParameter("id"));
                String name = req.getParameter("name");
                double price = Double.parseDouble(req.getParameter("price"));
                int quantity = Integer.parseInt(req.getParameter("quantity"));
                String result = productService.updateProduct(productId, name, price, quantity);
                resp.getWriter().write(result);
            } else if ("delete".equals(action)) {
                // Delete product logic
                int productId = Integer.parseInt(req.getParameter("id"));
                String result = productService.deleteProduct(productId);
                resp.getWriter().write(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Operation failed.");
        }
    }
}

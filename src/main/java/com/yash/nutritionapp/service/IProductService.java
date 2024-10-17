package com.yash.nutritionapp.service;

import java.sql.SQLException;
import java.util.List;

import com.yash.nutritionapp.domain.Product;

public interface IProductService {
	List<Product> getAllProducts() throws SQLException;

	Product getProductByName(String name) throws SQLException;

	String addProduct(Product product) throws SQLException;

	String updateProduct(int productId, String productName, double price, int quantity) throws SQLException;

	String deleteProduct(int productId) throws SQLException;

}

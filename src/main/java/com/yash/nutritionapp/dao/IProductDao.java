package com.yash.nutritionapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.yash.nutritionapp.domain.*;

public interface IProductDao {
	// get a all products
	List<Product> getAllProducts() throws SQLException;

	// get the product by name
	Product getByProductName(String name) throws SQLException;

	// insert new product
	String addProduct(Product product) throws SQLException;

	// update the existing product
	String updateProduct(int productId, String productName, double price, int quantity) throws SQLException;

	// delete product
	String deleteProduct(int id) throws SQLException;

}

package com.yash.nutritionapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.yash.nutritionapp.domain.Product;
import com.yash.nutritionapp.exception.ProductException;

public interface ProductDAO {
//	void addProduct(Product product) throws SQLException;

	void addProduct(Product product) throws ProductException;

	void updateProduct(Product product) throws ProductException;

	void deleteProduct(int productId) throws ProductException;

	List<Product> getAllProducts() throws ProductException;

	Product getProductById(int productId) throws ProductException;

	Product getProductByName(String productName) throws ProductException;
}

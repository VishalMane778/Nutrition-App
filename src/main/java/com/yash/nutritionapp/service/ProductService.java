package com.yash.nutritionapp.service;

import com.yash.nutritionapp.domain.Product;
import com.yash.nutritionapp.exception.ProductException;

import java.util.List;

public interface ProductService {
	List<Product> getAllProducts() throws ProductException;

	Product getProductById(int productId) throws ProductException;

	void addProduct(Product product) throws ProductException;

	void updateProduct(Product product) throws ProductException;

	void deleteProduct(int productId) throws ProductException;

}
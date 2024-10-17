package com.yash.nutritionapp.serviceimpl;

import java.sql.SQLException;
import java.util.List;

import com.yash.nutritionapp.dao.IProductDao;
import com.yash.nutritionapp.daoimpl.ProductDaoImpl;
import com.yash.nutritionapp.domain.Product;
import com.yash.nutritionapp.exception.ProductNotFoundException;
import com.yash.nutritionapp.service.IProductService;

public class ProductServiceImpl implements IProductService {

	private IProductDao productDao;

	public ProductServiceImpl() throws SQLException {
		// TODO Auto-generated constructor stub
		productDao = new ProductDaoImpl();
	}

	@Override
	public List<Product> getAllProducts() throws SQLException {
		return productDao.getAllProducts();
	}

	@Override
	public Product getProductByName(String name) throws SQLException {
		Product product = productDao.getByProductName(name);
		if (product == null) {
			throw new ProductNotFoundException("Product with name " + name + " not found");
		}
		return product;
	}

	@Override
	public String addProduct(Product product) throws SQLException {
		return productDao.addProduct(product);
	}

	@Override
	public String updateProduct(int productId, String productName, double price, int quantity) throws SQLException {
		return productDao.updateProduct(productId, productName, price, quantity);
	}

	@Override
	public String deleteProduct(int productId) throws SQLException {
		return productDao.deleteProduct(productId);
	}

}

package com.yash.nutritionapp.serviceimpl;

import java.util.List;

import com.yash.nutritionapp.dao.ProductDAO;
import com.yash.nutritionapp.daoimpl.ProductDaoImpl;
import com.yash.nutritionapp.domain.Product;
import com.yash.nutritionapp.exception.ProductException;
import com.yash.nutritionapp.service.ProductService;

public class ProductServiceImpl implements ProductService {

	private ProductDAO productDAO;

    public ProductServiceImpl() {
        this.productDAO = new ProductDaoImpl(); // You might want to use Dependency Injection here
    }

    @Override
    public List<Product> getAllProducts() throws ProductException {
        return productDAO.getAllProducts();
    }

    @Override
    public Product getProductById(int productId) throws ProductException {
        return productDAO.getProductById(productId);
    }

    @Override
    public void addProduct(Product product) throws ProductException {
        productDAO.addProduct(product);
    }

    @Override
    public void updateProduct(Product product) throws ProductException {
        productDAO.updateProduct(product);
    }

    @Override
    public void deleteProduct(int productId) throws ProductException {
        productDAO.deleteProduct(productId);
    }

}

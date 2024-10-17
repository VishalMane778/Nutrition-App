package com.yash.nutritionapp.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.nutritionapp.dao.*;
import com.yash.nutritionapp.domain.Product;

import static com.yash.nutritionapp.util.DBUtils.*;

public class ProductDaoImpl implements IProductDao {
	private Connection connection;
	private PreparedStatement pst1, pst2, pst3, pst4, pst5;

	public ProductDaoImpl() throws SQLException {
		connection = getConnection();
		pst1 = connection.prepareStatement("SELECT * FROM products");
		pst2 = connection.prepareStatement("SELECT * FROM products WHERE name=?");
		pst3 = connection.prepareStatement("INSERT INTO products VALUES(default,?,?,?,?,?");
		pst4 = connection.prepareStatement("UPDATE products SET name =?,description=?,price=?,quantity=? WHERE id=?");
		pst5 = connection.prepareCall("DELETE FROM products WHERE produt_id=?");
		System.out.println("Product Dao created");
	}

	// get all product
	@Override
	public List<Product> getAllProducts() throws SQLException {
		List<Product> productTopics = new ArrayList<>();
		try (ResultSet rst = pst1.executeQuery()) {
			while (rst.next())
				// productName, description, price, quantity,reviews
				productTopics.add(new Product(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getDouble(4),
						rst.getInt(5), rst.getObject(6)));
		}
		return productTopics;
	}

	// get the product by name
	@Override
	public Product getByProductName(String name) throws SQLException {
		pst2.setString(1, name);
		try (ResultSet rst = pst2.executeQuery()) {
			if (rst.next())
				return new Product(rst.getInt(1), name, rst.getString(3), rst.getDouble(4), rst.getInt(5),
						rst.getObject(6));
		}
		return null;
	}

	// add product
	@Override
	public String addProduct(Product product) throws SQLException {
		pst3.setString(1, product.getProductName());
		pst3.setString(2, product.getDesrciption());
		pst3.setDouble(3, product.getPrice());
		pst3.setInt(4, product.getQuantity());

		int rowCount = pst3.executeUpdate();
		if (rowCount == 1)
			return "Product Details inserted successfully.";
		return "Insertion of product details failed.";
	}

	// update existing product
	@Override
	public String updateProduct(int productId, String productName, double price, int quantity) throws SQLException {
		pst4.setString(1, productName);
		pst4.setDouble(2, price);
		pst4.setInt(3, quantity);

		int rowCount = pst4.executeUpdate();
		if (rowCount == 1)
			return "Product details updated.";
		return "Updation of product is failled.";
	}

	// delete the product by id
	@Override
	public String deleteProduct(int id) throws SQLException {
		pst5.setInt(1, id);
		int rowCount = pst4.executeUpdate();
		if (rowCount == 1)
			return "Product deleted successfully.";
		return "product deletion failled.";
	}

	public void cleanup() throws SQLException {
		if (pst1 != null) {
			pst1.close();
		}
		if (pst2 != null)
			pst2.close();
		if (pst3 != null)
			pst3.close();
		if (pst4 != null)
			pst4.close();
		System.out.println("");
	}

}

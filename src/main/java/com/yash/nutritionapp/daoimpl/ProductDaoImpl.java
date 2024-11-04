package com.yash.nutritionapp.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yash.nutritionapp.dao.ProductDAO;
import com.yash.nutritionapp.domain.Product;
import com.yash.nutritionapp.exception.ProductException;
import static com.yash.nutritionapp.util.DBConnection.getConnection;

public class ProductDaoImpl implements ProductDAO {

//	@Override
//	public void addProduct(Product product) throws Produ {
//		String sql = "INSERT INTO products (productName, description, price, quantity) VALUES (?, ?, ?, ?)";
//
//		try (Connection connection = DBConnection.getConnection();
//				PreparedStatement statement = connection.prepareStatement(sql)) {
//
//			statement.setString(1, product.getProductName());
//			statement.setString(2, product.getDescription());
//			statement.setDouble(3, product.getPrice());
//			statement.setInt(4, product.getQuantity());
//			statement.executeUpdate();
//		} catch (SQLException e) {
//			// Log the exception and rethrow it
//			System.err.println("Error while adding product: " + e.getMessage());
//			throw e;
//		}
//	}

	@Override
	public void addProduct(Product product) throws ProductException {
		String query = "INSERT INTO products (productName, description, price, quantity) VALUES (?, ?, ?, ?)";
		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, product.getProductName());
			stmt.setString(2, product.getDescription());
			stmt.setDouble(3, product.getPrice());
			stmt.setInt(4, product.getQuantity());
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new ProductException("Error adding product", e);
		}
	}

	@Override
	public void updateProduct(Product product) throws ProductException {
		String query = "UPDATE products SET productName = ?, description = ?, price = ?, quantity = ? WHERE productId = ?";
		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, product.getProductName());
			stmt.setString(2, product.getDescription());
			stmt.setDouble(3, product.getPrice());
			stmt.setInt(4, product.getQuantity());
			stmt.setInt(5, product.getProductId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new ProductException("Error updating product", e);
		}
	}

	@Override
	public void deleteProduct(int productId) throws ProductException {
		String query = "DELETE FROM products WHERE productId = ?";
		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setInt(1, productId);
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new ProductException("Error deleting product", e);
		}
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		List<Product> products = new ArrayList<>();
		String query = "SELECT * FROM products";
		try (Connection conn = getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("productId"));
				product.setProductName(rs.getString("productName"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getDouble("price"));
				product.setQuantity(rs.getInt("quantity"));
				products.add(product);
			}
		} catch (SQLException e) {
			throw new ProductException("Error fetching products", e);
		}
		return products;
	}

	@Override
	public Product getProductById(int productId) throws ProductException {
		String query = "SELECT * FROM products WHERE productId = ?";
		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setInt(1, productId);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("productId"));
				product.setProductName(rs.getString("productName"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getDouble("price"));
				product.setQuantity(rs.getInt("quantity"));
				return product;
			}
		} catch (SQLException e) {
			throw new ProductException("Error fetching product by ID", e);
		}
		return null; // or throw an exception if preferred
	}

	@Override
	public Product getProductByName(String productName) throws ProductException {
		String query = "SELECT * FROM products WHERE productName = ?";
		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, productName);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("productId"));
				product.setProductName(rs.getString("productName"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getDouble("price"));
				product.setQuantity(rs.getInt("quantity"));
				return product;
			}
		} catch (SQLException e) {
			throw new ProductException("Error fetching product by name", e);
		}
		return null; // or throw an exception if preferred
	}

}

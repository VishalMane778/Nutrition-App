package com.yash.nutritionapp.domain;

import java.util.List;

public class Product {
	private int productId;
	private String productName;
	private String desrciption;
	private double price;
	private int quantity;
	private List<Review> reviews;
	private  Review review;


	

	public Product(int productId, String productName, String desrciption, double price, int quantity,
			Object object) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.desrciption = desrciption;
		this.price = price;
		this.quantity = quantity;
		this.reviews = (List<Review>) object;
	}

	

	public Product(String productName, String desrciption, double price, int quantity) {
		super();
		this.productName = productName;
		this.desrciption = desrciption;
		this.price = price;
		this.quantity = quantity;
	}



	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDesrciption() {
		return desrciption;
	}

	public void setDesrciption(String desrciption) {
		this.desrciption = desrciption;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

}

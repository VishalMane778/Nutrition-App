package com.yash.nutritionapp.domain;

import java.sql.Date;

public class Review {
	private int reviewId;
	private String productId;
	private String reviewName;
	private String comment;
	private int rating;
	private Date reviewDate;

	public Review() {
		// TODO Auto-generated constructor stub
	}

	public Review(int reviewId, String productId, String reviewName, String comment, int rating, Date reviewDate) {
		super();
		this.reviewId = reviewId;
		this.productId = productId;
		this.reviewName = reviewName;
		this.comment = comment;
		this.rating = rating;
		this.reviewDate = reviewDate;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getReviewName() {
		return reviewName;
	}

	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

}

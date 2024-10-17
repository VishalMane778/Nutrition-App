package com.yash.nutritionapp.domain;

import java.sql.Date;

public class Promotion {
	private int promotionId;
	private String name;
	private String details;
	private Date startDate;
	private Date endDate;

	public Promotion() {
		// TODO Auto-generated constructor stub
	}

	public Promotion(int promotionId, String name, String details, Date startDate, Date endDate) {
		super();
		this.promotionId = promotionId;
		this.name = name;
		this.details = details;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(int promotionId) {
		this.promotionId = promotionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}

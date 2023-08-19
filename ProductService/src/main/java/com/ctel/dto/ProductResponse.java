package com.ctel.dto;

public class ProductResponse {
	
	private String id;
	private String pname;
	private String description;
	private double price;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String name) {
		this.pname = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ProductResponse(String id, String name, String description, double price) {
		super();
		this.id = id;
		this.pname = name;
		this.description = description;
		this.price = price;
	}
	public ProductResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductResponse [id=" + id + ", name=" + pname + ", description=" + description + ", price=" + price
				+ "]";
	}
	
	
}

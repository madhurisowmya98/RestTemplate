package com.ctel.dto;

public class ProductRequest {

	private String pname;
	private String description;
	private double price;
	
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
	public ProductRequest(String name, String description, double price) {
		super();
		this.pname = name;
		this.description = description;
		this.price = price;
	}
	public ProductRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "ProductRequest [name=" + pname + ", description=" + description + ", price=" + price + "]";
	}
}

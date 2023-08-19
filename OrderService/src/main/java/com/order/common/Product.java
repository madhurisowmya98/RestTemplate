package com.order.common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@Column(name = "id")
	private String pid;

	//@Column(name = "name")
	private String pname;

	private String description;
	private double price;
	private int oid;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
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
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Product(String pid, String pname, String description, double price, int oid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.description = description;
		this.price = price;
		this.oid = oid;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

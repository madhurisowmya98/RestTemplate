package com.order.common;

public class OrderResponse {

	private String customer_name;
	private String pname;
	private int qty;
	private double amount;

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double price) {
		this.amount = price;
	}

	public OrderResponse(String customer_name, String pname, int qty, double price) {
		super();
		this.customer_name = customer_name;
		this.pname = pname;
		this.qty = qty;
		this.amount = price;
	}

	public OrderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OrderResponse [customer_name=" + customer_name + ", pname=" + pname + ", qty=" + qty + ", price="
				+ amount + "]";
	}

}

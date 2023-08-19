package com.order.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OrderTable")
public class Order {
	
	public Order() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_id;
	
	private String customer_name;
	private int qty;
	private double amount;

	

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getcustomer_name() {
		return customer_name;
	}
 
	public void setcustomer_name(String customer_name) {
		this.customer_name = customer_name;
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
	

	


	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", customer_name=" + customer_name + ", qty=" + qty + ", amount="
				+ amount  + "]";
	}

	

}

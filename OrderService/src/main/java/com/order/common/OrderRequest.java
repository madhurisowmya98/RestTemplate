package com.order.common;

import com.order.entity.Order;

public class OrderRequest {
	private Order order;
	private Product product;

	public OrderRequest(Order order, Product product) {
		super();
		this.order = order;
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

}

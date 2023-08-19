package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.common.OrderRequest;
import com.order.common.OrderResponse;
import com.order.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;

	/*
	 * @RequestMapping("/bookorder") public Order bookOrder(@RequestBody Order
	 * order) { return orderService.saveOrder(order); }
	 */

	@RequestMapping(value = "/order/bookorder"/* , consumes="/OrderRequest" */)
	public OrderResponse bookOrder(@RequestBody OrderRequest order) {
		return orderService.saveOrder(order);
	}
}

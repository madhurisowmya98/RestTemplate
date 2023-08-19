package com.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.order.common.OrderRequest;
import com.order.common.OrderResponse;
import com.order.common.Product;
import com.order.entity.Order;
import com.order.repository.OrderRepository;

@Service
@Qualifier("orderService")
public class OrderService {

	@Autowired
	OrderRepository orderRepo;

	/*
	 * public Order saveOrder(Order order) { // TODO Auto-generated method stub
	 * return orderRepo.save(order); }
	 */

	public OrderResponse saveOrder(OrderRequest orderreq) {
		// TODO Auto-generated method stub
		Order order = orderreq.getOrder();
		Product product = orderreq.getProduct();

		System.out.println(" " + product.getPname() + "  " + product.getDescription());
		order.setAmount(order.getQty() * product.getPrice());
		Order resOrder = orderRepo.save(order);
		product.setOid(resOrder.getOrder_id());
		System.out.println("Order ID" + product.getOid());

		new RestTemplate().postForObject("http://localhost:8089/api/product/insert", product,Product.class);
		
		return new OrderResponse(resOrder.getcustomer_name(), product.getPname(), resOrder.getQty(),
				resOrder.getAmount());
	}

}

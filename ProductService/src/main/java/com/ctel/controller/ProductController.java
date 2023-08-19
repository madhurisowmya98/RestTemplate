package com.ctel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ctel.dto.ProductResponse;
import com.ctel.model.Product;
import com.ctel.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	ProductService productservice;

	/*
	 * @PostMapping("/insert")
	 * 
	 * @ResponseStatus(HttpStatus.CREATED) public void createProduct(@RequestBody
	 * ProductRequest productrequest) {
	 * productservice.createProduct(productrequest); }
	 */

	@PostMapping("/insert")
	@ResponseStatus(HttpStatus.CREATED)
	public void createProduct(@RequestBody Product productrequest) {
		 productservice.createProduct(productrequest);
	}
	
	
	@GetMapping("/GetAll")
	@ResponseStatus(HttpStatus.OK)
	public List<ProductResponse> getAllProducts() {
		List<ProductResponse> pr = productservice.getAllProducts();
		return pr;
	}
	@GetMapping("/GetById/{pname}")
	@ResponseStatus(HttpStatus.OK)
	public Product getProductById(String pname) {
		Product pr = productservice.getProductByPname(pname);
		return pr;
	}

}

package com.ctel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctel.dto.ProductResponse;
import com.ctel.model.Product;
import com.ctel.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public Product createProduct(Product productRequest) {
		String lastId = productRepository.fetchId(); 
		 // System.out.println(lastId +"\n" + lastId.substring(4));
		productRequest.setPid(lastId.substring(0, 4) + (Long.parseLong(lastId.substring(4)) + 1)); 
		productRepository.save(productRequest);
		return productRequest;
	}

	public List<ProductResponse> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> products = productRepository.findAll();
		return products.stream().map(product -> mapToProductResponse(product)).toList();
	}

	private ProductResponse mapToProductResponse(Product product) {
		ProductResponse pr = new ProductResponse();
		pr.setId(product.getPid());
		pr.setPname(product.getPname());
		pr.setDescription(product.getDescription());
		pr.setPrice(product.getPrice());
		return pr;
	}

	public Product getProductByPname(String pname) {
		//Optional<Product> pdtDet=productRepository.findById(pname);
		Optional<Product> pdtDet=productRepository.findByPname(pname);
		if(pdtDet.isPresent()==true)
			return pdtDet.get();
		else
			return null;
	}

}

package com.ratnadip.demoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratnadip.demoapp.model.Product;
import com.ratnadip.demoapp.repository.ProductRepository;

@Service
public class ProductService {
	private ProductRepository repo;
	
	@Autowired
	public ProductService(ProductRepository repo) {
		this.repo = repo;
	}
	
	public Product addProduct(Product product) {
		return repo.save(product);
	}
	
	public List<Product> getAllProduct(){
		return repo.findAll();
	}
}

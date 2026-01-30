package com.ratnadip.demoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratnadip.demoapp.model.Product;
import com.ratnadip.demoapp.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	private ProductService service;
	@Autowired
	 public ProductController(ProductService service) {
		 this.service = service;
	 }
	
	@PostMapping("/add")
	public Product insertProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
	
	@GetMapping("/get")
	public List<Product> fetchAll(){
		return service.getAllProduct();
	}
}

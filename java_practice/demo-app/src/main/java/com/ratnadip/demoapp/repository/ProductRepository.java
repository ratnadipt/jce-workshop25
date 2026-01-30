package com.ratnadip.demoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratnadip.demoapp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

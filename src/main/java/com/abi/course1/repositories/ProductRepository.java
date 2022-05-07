package com.abi.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abi.course1.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}

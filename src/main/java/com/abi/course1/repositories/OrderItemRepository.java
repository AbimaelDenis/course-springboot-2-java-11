package com.abi.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abi.course1.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}

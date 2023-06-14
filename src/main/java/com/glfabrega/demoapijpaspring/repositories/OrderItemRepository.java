package com.glfabrega.demoapijpaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glfabrega.demoapijpaspring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

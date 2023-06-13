package com.glfabrega.demoapijpaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glfabrega.demoapijpaspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

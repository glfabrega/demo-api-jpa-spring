package com.glfabrega.demoapijpaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glfabrega.demoapijpaspring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

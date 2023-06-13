package com.glfabrega.demoapijpaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glfabrega.demoapijpaspring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

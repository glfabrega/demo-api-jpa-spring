package com.glfabrega.demoapijpaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glfabrega.demoapijpaspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

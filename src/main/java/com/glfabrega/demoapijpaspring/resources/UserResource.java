package com.glfabrega.demoapijpaspring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glfabrega.demoapijpaspring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Gabriel","glfabrega@gmail.com","11973060806","1234");
		return ResponseEntity.ok().body(u);
	}

}

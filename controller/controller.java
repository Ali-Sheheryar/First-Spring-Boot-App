package com.example.JPAProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.JPAProject.UserService.UserServices;
import com.example.JPAProject.entities.user;

@RestController
public class controller {

//	@GetMapping("/users")		//to add in database
//	public List<user> getUsers() {
//		user user = new user();
//		user.setId(1);
//		user.setName("Ali");
//		user.setCity("JD");
//		user.setStatus("Active");
//		return user;
//	}
	
	@Autowired
	private UserServices US;
	
	//to get all users
	@GetMapping("/users")
	public ResponseEntity<List<user>> getUsers() {
		List<user> list = US.getUsers();
		if(list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}

	//to get user by id
		@GetMapping("/users/{id}")
		public ResponseEntity<user> getUsers(@PathVariable("id") int id) {
			user user = US.getUserById(id);
			if(user == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(user));
		}
	
	//to add user
	@PostMapping("/users")
	public user addUser(@RequestBody user u) {
		user us = this.US.addUser(u);
		return us;
	}
	
	//to delete user by id
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		this.US.deleteUser(id);
	}
	
	//to update a user
	@PutMapping("/users/{id}")
	public void updateUser(user u, @PathVariable("id") int id) {
		this.US.updateUser(u, id);
	}
}

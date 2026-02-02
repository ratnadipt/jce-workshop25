package com.booking.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.app.dto.UserDTO;
import com.booking.app.service.serviceImp.UserServiceImp;


@RestController
@RequestMapping("/api/users") // base URL
public class UserController {
	private UserServiceImp service;
	
	@Autowired
	public UserController(UserServiceImp service) {
		this.service = service;
	}
	
	// Register user
	@PostMapping
	public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO dto) {
		ResponseEntity<UserDTO> resp;
		resp = new ResponseEntity<>(service.createUser(dto), HttpStatus.CREATED);
		return resp;
	}
	
	// Get user By ID
	@GetMapping("/{id}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable Integer id){
		return new ResponseEntity<>(service.getUserById(id), HttpStatus.OK);
	}
	
	// Get All Users
	@GetMapping
	public ResponseEntity<List<UserDTO>> getAllUsers(){
		return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
	}
	
	// Update user
	@PutMapping("/{id}")
	public ResponseEntity<UserDTO> updateUser(@PathVariable Integer id, @RequestBody UserDTO dto){
		return new ResponseEntity<>(service.updateUser(id, dto), HttpStatus.OK);
	}
	
	
	// Delete User
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer id){
		service.deleteUser(id);
		return new ResponseEntity<>("User Deleted Successfully!", HttpStatus.OK);
	}
	
}

package com.retocrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retocrud.entity.user;
import com.retocrud.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public user create(@RequestBody user user) {
		return userService.create(user);
	}
	
	@GetMapping
	public List<user> read(){
		return userService.read();
	}
	
	@PutMapping
	public user update(@RequestBody user user) {
		return userService.update(user);		
	}
	
	@DeleteMapping
	public void delete(@RequestBody user user) {
		userService.delete(user);		
	}
	
}

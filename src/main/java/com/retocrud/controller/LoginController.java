package com.retocrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retocrud.entity.user;
import com.retocrud.repository.UserRepository;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping
	public user login(@RequestBody user user) {
		user foundUser = userRepository.findByUserName(user.getUserName());
						
		if(foundUser!=null) {		
			System.err.append("x"+foundUser.getPassword());
			if(foundUser.getPassword().equalsIgnoreCase(user.getPassword())) {		
				
				return foundUser;
			}
		}
		
		return null;
	}

}

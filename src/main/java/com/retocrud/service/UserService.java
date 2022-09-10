package com.retocrud.service;

import java.util.List;
import com.retocrud.entity.user;
import com.retocrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public user create(user user) {
		return userRepository.save(user);
	}
		
	public List<user> read() {
		return userRepository.findAll();
	}	
	
	public user update(user user) {
		return userRepository.save(user);
	}
	
	public void delete(user user) {
		userRepository.delete(user);
	}
}

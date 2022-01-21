package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserRepository;
import com.example.demo.entity.User;
import java.util.Optional;
@Service
public class IUserService {
	@Autowired  //DI
	UserRepository userRepository;
	public void saveUser(User user) {
		userRepository.save(user);
	}
	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}
	public Optional<User> getUser(Integer id) {
		return userRepository.findById(id);
	}
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

}

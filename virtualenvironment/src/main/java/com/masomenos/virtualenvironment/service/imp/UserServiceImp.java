package com.masomenos.virtualenvironment.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masomenos.virtualenvironment.entity.User;
import com.masomenos.virtualenvironment.repository.UserRepository;
import com.masomenos.virtualenvironment.service.UserService;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Iterable<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}

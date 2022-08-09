package com.masomenos.virtualenvironment.service;

import com.masomenos.virtualenvironment.entity.User;

public interface UserService {
	public Iterable<User> getAllUsers();

	public User createUser(User formUser) throws Exception;
	
	public User getUserById(Long id) throws Exception;
	
	public User updateUser(User user) throws Exception;
}

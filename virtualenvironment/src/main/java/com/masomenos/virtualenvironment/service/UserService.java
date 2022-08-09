package com.masomenos.virtualenvironment.service;

import com.masomenos.virtualenvironment.entity.User;

public interface UserService {
	public Iterable<User> getAllUsers();

	public User createUser(User formUser) throws Exception;
}

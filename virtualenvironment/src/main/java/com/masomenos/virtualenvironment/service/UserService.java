package com.masomenos.virtualenvironment.service;

import com.masomenos.virtualenvironment.dto.ChangePasswordForm;
import com.masomenos.virtualenvironment.entity.User;

public interface UserService {
	public Iterable<User> getAllUsers();

	public User createUser(User formUser) throws Exception;
	
	public User getUserById(Long id) throws Exception;
	
	public User updateUser(User user) throws Exception;
	
	public void deleteUser(Long id) throws Exception;
	
	public User changePassword(ChangePasswordForm form) throws Exception;
}

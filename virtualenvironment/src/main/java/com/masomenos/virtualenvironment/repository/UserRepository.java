package com.masomenos.virtualenvironment.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masomenos.virtualenvironment.entity.User;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{
	public Set<User> findByDepto(int depto);

	public Optional<User> findByUsername(String username);
}

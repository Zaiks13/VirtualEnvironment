package com.masomenos.virtualenvironment.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masomenos.virtualenvironment.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{
	public Set<User> findByDepto(int depto);
}

package com.masomenos.virtualenvironment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masomenos.virtualenvironment.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long>{

}

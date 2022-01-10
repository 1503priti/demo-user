package com.priti.springproject.DemoUser.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.priti.springproject.DemoUser.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
}
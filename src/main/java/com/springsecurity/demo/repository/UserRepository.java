package com.springsecurity.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.demo.model.User;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmailIdIgnoreCase(String emailId);
}

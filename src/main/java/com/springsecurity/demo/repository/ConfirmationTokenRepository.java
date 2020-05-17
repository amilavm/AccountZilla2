package com.springsecurity.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.springsecurity.demo.model.ConfirmationToken;

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String> {
	ConfirmationToken findByConfirmationToken(String confirmationToken);
}

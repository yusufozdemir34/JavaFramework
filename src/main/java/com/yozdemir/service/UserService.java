package com.yozdemir.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yozdemir.config.ApplicationConstants;
import com.yozdemir.domain.Employee;
import com.yozdemir.exception.NoSuchUserFoundException;
import com.yozdemir.repository.UserRepository;

@Service
@Transactional(ApplicationConstants.TRANSACTION_MANAGER)
public class UserService {
	@Autowired
	private UserRepository repository;
	@Transactional(readOnly = true)
	public Employee findById(Integer id) throws  NoSuchUserFoundException {
		Optional<Employee> opt = repository.findById(id);
		return opt.orElseThrow(() -> new NoSuchUserFoundException(id));
	}

	
}

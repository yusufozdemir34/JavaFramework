package com.yozdemir.facade;

import org.springframework.beans.factory.annotation.Autowired;

import com.yozdemir.domain.dto.EmployeeDto;
import com.yozdemir.domain.dto.ResponseMapper;
import com.yozdemir.exception.NoSuchUserFoundException;
import com.yozdemir.service.UserService;

@org.springframework.stereotype.Service
public class FacadeImpl implements Facade {

	@Autowired
	UserService service;

	public EmployeeDto getUserById(Integer id) throws  NoSuchUserFoundException {

		//return ResponseMapper.INSTANCE.employeeToEmployeDto(service.findById(id));
		return ResponseMapper.INSTANCE.employeeToEmployeDto(service.findById(id));
	}

}

package com.yozdemir.facade;

import com.yozdemir.domain.dto.EmployeeDto;
import com.yozdemir.exception.NoSuchUserFoundException;

public interface Facade {

	public EmployeeDto getUserById(Integer id) throws NoSuchUserFoundException;

}

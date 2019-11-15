package com.yozdemir.domain.dto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.yozdemir.domain.Employee;

@Mapper
public interface ResponseMapper {
    ResponseMapper INSTANCE = Mappers.getMapper(ResponseMapper.class);

    @Mapping(source = "id", target = "id")
    EmployeeDto employeeToEmployeDto(Employee employee);



}
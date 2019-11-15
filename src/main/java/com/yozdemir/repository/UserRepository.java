package com.yozdemir.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yozdemir.domain.Employee;
/**
 * 
 * @author yusuf ozdemir
 *
 *
 */
public interface UserRepository extends JpaRepository<Employee, Integer> {

}

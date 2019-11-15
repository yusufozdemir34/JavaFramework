package com.yozdemir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yozdemir.facade.Facade;

/**
 * 
 * @author yusuf ozdemir
 *
 *
 */
@RestController
@RequestMapping("/rest")
public class RestTestController {
	@Autowired
	Facade facade;

	/** user's access privelege by functionid and orgCode */
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public ResponseEntity userById(@PathVariable("userId") Integer id) throws Exception {

		return new ResponseEntity(facade.getUserById(id), HttpStatus.OK);

	}
}
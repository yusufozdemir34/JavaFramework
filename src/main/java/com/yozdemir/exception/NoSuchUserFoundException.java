package com.yozdemir.exception;

public class NoSuchUserFoundException extends BaseException {
	private static final long serialVersionUID = 1L;
	private static final String EXCEPTION_MESSAGE = "No such user found with ";
	
	public NoSuchUserFoundException(int id) {
		super(EXCEPTION_MESSAGE + "id " + id);
	}
}

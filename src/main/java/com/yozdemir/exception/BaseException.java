package com.yozdemir.exception;

public abstract class BaseException extends Exception {

	public BaseException(String message) {
		super(message);
	}

	public BaseException() {
		super();
	}
}

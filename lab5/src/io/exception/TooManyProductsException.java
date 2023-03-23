package io.exception;

public class TooManyProductsException extends RuntimeException {

	public TooManyProductsException() {
		super();
	}

//	public TooManyProductsException(String message) {
//		super(); //--this is bad code
//	}

	public TooManyProductsException(String message) {
		super(message);
	}
}

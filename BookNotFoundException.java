package com.exception.bll;

public class BookNotFoundException extends Exception{
	//default constructor.
	public BookNotFoundException() {
		
	}

	//parameterized constructor.
	public BookNotFoundException(String message) {
		super(message);
	}
	

}

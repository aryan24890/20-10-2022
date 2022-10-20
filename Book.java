package com.exception.bll;

public class Book {
	String book;	//create variable;
	int id;			//create variable;
	
	//parameterized Book constructor.
	public  Book(int id,String book) {
		this.book = book;
		this.id = id;
		
	}
	
	// method to get Id..
	public int getId() {
		return id;
	}

}

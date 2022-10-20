/*
 * 3.	Do the following:

Create a class Book with id, name as the member variables.

Create  BookNotFoundException as a exception and create one argument constructor which is accepting String message.

Create a test class with an array of 5 books with ids starting from 1.

Create a method findById(Book[] books , int id) which will take the previously created book array and one id to find the book.

Print "Found" if the book is present with the given id else throw BookNotFoundException with a message "Book with the given id is not present".

Handle the exception in main method and print the stacktrace in catch block.


 */
package com.exception.pll;

import com.exception.bll.Book;
import com.exception.bll.BookNotFoundException;

public class BookMain {

	public static void main(String[] args) throws Exception{
		
		//Create obj of book class.
		Book b1 = new Book(1,"Java EE");
		Book b2 = new Book(2,"Css4.9");
		Book b3 = new Book(3,"Advance Java.17");
		Book b4 = new Book(4,"Information Technology");
		Book b5 = new Book(5,"Python 8.2");
		
		Book books[] = {b1,b2,b3,b4,b5};	// store all book in books Array
		
		try {
			if(findById(books,5)) {
				System.out.println("Book is present in books");
			}
			else{
				throw new BookNotFoundException("Book with the given id is not present");
			}
		
		}catch(BookNotFoundException ex) {	//catch book not find Exception
			ex.printStackTrace();
		
		}catch(Exception ex) {		// catch other exceptions
			ex.printStackTrace();
		}
		
	}
		//method for search book by id 
		public static boolean findById(Book[] books , int id) {
			for(Book b:books) {
				if(b.getId()==id)
				return true;
			}
			return false;
		}
}

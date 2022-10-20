/*
 * 1.	The professor you TA (Training Associate) for, Professor Jackson, shared with you the code she uses to auto-grade students’ work. She and the other TAs have encountered some problems with the code in the past when they enter the total possible point value for an assignment. Occasionally, they accidentally enter 0 for the total number of possible points and the program encounters a fatal error when trying to divide by 0.

To help out with this issue, complete a function called divide() in Main. 

The divide() method takes in two parameters: x and y.

Your function should return the result of x/y.

However, if y is zero, you should throw an exception. 

Try to use an ArithmeticException and put your try/catch block in divide() to test out your error-handling skills. 

If an exception is caught, make sure to print out a helpful message.

 */
package com.exception.pll;

import java.util.Scanner;

import com.exception.bll.ProfessorTA;

public class ProfessorTAMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// Create obj of Scanner class
		
		System.out.println("Enter the Number: ");	// Enter number
		int num = sc.nextInt();
		
		System.out.println("Enter divisor: ");	//Enter divisor
		int div = sc.nextInt();
		
		ProfessorTA p1 = new ProfessorTA();		//Create Obj of ProfessorTA class
		
		System.out.println("division = "+ p1.divide(num, div)); //Call divide Method.
		

		
		sc.close();	//closing Scanner class.
	}

}

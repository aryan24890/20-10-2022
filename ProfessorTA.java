package com.exception.bll;

public class ProfessorTA {
	
	// divide method
	public int divide(int x, int y) {
		try{								// in try block
				return x/y;
			}
			catch(ArithmeticException ex){	// if divisor is o then execute this part
				System.out.println(ex +" --> Divisor must not be 0");
			}
		return y; 
	}

}

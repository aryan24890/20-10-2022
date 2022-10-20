package com.exception.bll;

public class ProfessorJackson {
	
	
	public int checkFileExtension(String fileName) throws NullException, EmptyException {
		
		if(fileName==null) {
			throw new NullException("This is null file");//throw null Exception
		}
		
		if(fileName.isEmpty()) {
			throw new EmptyException("this is empty file");//throw empty exception
		}
		
		
		if(fileName.endsWith(".java")) {	//return 1
			return 1;
		}
		else	// return 0
		return 0;
	}

}

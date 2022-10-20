/*
 * 2.	After mentioning to Professor Jackson that you would like to get some more practice with exceptions, she offered to let you write some grading software! Before she gives you full control over auto-grading students’ work, she asked if you could write a function called checkFileExtension(). 

The checkFileExtension() method takes in one parameter: fileName.

checkFileExtension() should return an integer representing the number of points a student receives for properly submitting a file in Java. 

If a student’s submitted file ends in .java, they get 1 point. 

If a student’s submitted file doesn’t end in .java, they get 0 points. 

If the file submitted is null or an empty string, an exception should be thrown and you should give the student -1 points. 

What kind of exception is up to you, including to a custom exception!

In main(), Professor Jackson has provided a array of students and the names of their submitted files for you to test out your work. 

If an exception is caught, make sure to print out the error message

 */
package com.exception.pll;

import com.exception.bll.EmptyException;
import com.exception.bll.NullException;
import com.exception.bll.ProfessorJackson;

public class ProfessorJacksonMain {

	public static void main(String[] args) throws Exception {
		//create obj of ProfessorJackson class
		ProfessorJackson prof = new ProfessorJackson();
		
		String students[] = {"aryan","viraj","mukesh"};	//students array	
		
		String files[] = {"file.html","file.java", null,};	//files array
		
		String name="";
		try {
			int i=0;
			for(String file:files)
			{
				int number = prof.checkFileExtension(file);
				
				if(number == 1)	//check return value
					System.out.println(students[i]+	" Your file is a java file. got 1 point ");
				else
					System.out.println(students[i]+" Your file is not a java file. got 0 point");
				i++;
				name=students[i];
			}
			
		}
		catch(NullException ex) {	//catch null Exception
			System.out.println(name +" Your have send a null file. got -1 point");
			System.err.println("NullException :"+ex.getMessage());
		}
		catch(EmptyException ex) {	//catch Empty Exception
			System.out.println(name +" Your have send a empty file. got -1 point");
			System.err.println("EmptyException : " +ex.getMessage());
		}
		catch(Exception ex) {	//catch other Exception
		
			System.out.println(ex.getMessage());
		}
		
	}

}

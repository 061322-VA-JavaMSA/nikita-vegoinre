package com.revature.exceptions;

public class ExceptionDriver {

	public static void main(String[] args) {
		
		System.out.println("Beginning of main method")
		int a = 1; //set first variable a
		int b = 2; //default access modifier, second variable
		if (b !=0) {
			System.out.println(a / b); // Example of an arithmetic exception, unchecked, can be avoided using a 0 check
		
		}
		
		
			
		}
		
		ExceptionDriver.maybeException();
		
	} catch (Exception e) {
		System.out.println("Exception was caught and handled!");
		e.printStackTrace();
		
	}
	
	//Test a try with resources
	
	
	
	system.out.println("End of the main method.");
		
		//use the try for "risky" code - might throw an exception
		
		try {

  		ExceptionDriver.maybeException();
  
  		
  		/*
  } catch (Exception e) {
  	System.out.println("Exception was caught and handled!");
  	e.printStackTrace();
  	
  	
 
 */
			
		}
		
		
			
			
	/*	}
		
		public static void maybeException() throws fileNotFoundException {
			//math.random, if result in >.5 throws an exception
			
			double fileExists = Math.random();
			
			
			if(fileExists > .5) {
				throw new fileNotFoundException(); 
			}
		//sometimes it pays to handle exceptions at a specific point
		//in the execution, allows to demonstrate errors more effectively
		//compile time exception or checked exception
		
		

	}


*/
}

package com.revature.calculatortest;

public class Calculator {
	
	//driver class for calculator function

	/*Main class method for unit testing each of,
	* 1 - subtract two integers - throw exception i.e. 5-3 = 2 | use for test
	* 2 - multiply two integers - throw exception i.e. 2 * 4 = 8 | use for test
	* 3 - add two integers - throw exception i.e. 2 + 3 = 5 | use for test
	* 4 - divide two integers - throw exception i.e. 4/2 = 2 | use for test
	*/
	
	// subtraction object
	 public int subtract (int value1, int value2) {
		 return value1 - value2;
	 }
	
	 // adds object
	 public int add (int value1, int value2) {
		 return value1 + value2;
	 }
	 
	 // multiplication object
	 public int multiply (int value1, int value2) {
		 return value1 * value2;
	 }
	 
	 // division object with condition zero
	 public int divide (int value1, int value2) throws Exception {
		 if(value2==0) {
			 throw new Exception("Cannot divide by zero");	 
		 } 
		 return value1/value2;
	 }
	 


		
		
		public static void main(String[] args) {
			
			//unit test for exceptions in calculator
			
			/*Main class method for unit testing each of,
			* 1 - subtract two integers - throw exception i.e. 5-3 = 2 | use for test
			* 2 - multiply two integers - throw exception i.e. 2 * 4 = 8 | use for test
			* 3 - add two integers - throw exception i.e. 2 + 3 = 5 | use for test
			* 4 - divide two integers - throw exception i.e. 4/2 = 2 | use for test
			*/
			

		}
	 
}



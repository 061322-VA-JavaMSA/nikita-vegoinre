package com.revature;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Driver");
	int x = 5;
	
	//By default set to 0
	
	Driver d = new Driver();
	
//	d.method1(x);
	
//	x = d.method2(x);
	
	//what is value of x?
	
	/* Create new driver in "heap" memory, and assign
	to driver d, set a new scope for method3, and adds value
	for the object created in the heap, from the call
	Thus the value of driver d = '10' */
	
	d.myNumber = 5;
	
		System.out.println(d.myNumber);
	}
	
	public void method1(intx) {
		 x = x + 5;
	} 
	
	//Return back initial value to add x to 5
	/*Build onto language specifics of Java
	 * Pass the variable into a method using the value
	 * of that variable, rather than the variable
	 itself */
	
	public int method2(intx) {
		return x = x + 5;
		
	}
	
	public void method3(Driver d) {
		d.myNumber = d.myNumber + 5;
		
	}
	

}

package com.revature;

public class StringDriver {

	public static void main(String[] args) {
		// Initialize a string s, set s1 equal to "Hello"
		String s = "Hello"; //literal
		String s1 = "Hello";
		String s2 = new String ("Hello");
		
		//== not just the value in the memory, but also is it same memory block?
		System.out.println("Is s==s1? " + (s == s1)); //true
		System.out.println("Is s==s2 " + (s == s2)); //false
		System.out.println("Is s.equals(s2)? " + s.equals(s2)); //this reflects the value of the string and not the memory address
		
		// need to return the "memory address" of "Hello" in the String pool
		s2.intern();
		
		//assign to the memory address of "Hello" in SP to s2
		s2 = s2.intern();
		
		System.out.println("Is s==s2 after intern?" + (s == s2));
	
		System.out.println();
		
		/*
		 * When you Compare objects in java
		 * .equals is a method from the Object class = Very Generic, need to over-ride for each class
		 * Must set our parameters and adjust as necesarry to the needs of .equals method
		 * 
		 * */
		 */
		 
		 Object a = new Object();
		 Object b = new Object();
		 
		 System.out.println("is a==b? " + (a==b));
		 System.out.println("is a.equals(b)? " + a.equals(b));
		 // default implementation in object calss
		 
		 /*String methods to look into
		  * 	- substring()
		  *		- replace()
		  *		- charAt()
		  */	
		  
		 
		 StringBuilder sb = new StringBuilder("Hello World!");
		 
		 sb.reverse();
		 
		 System.out.println(sb);
		 
		 String f
	}
	

}

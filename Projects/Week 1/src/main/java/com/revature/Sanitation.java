package com.revature;

public class SanitationDriver {
	
	//static number is specific to the class, not to instances
	
	public static int number = 0;
	public int id;
	
	//increment the number from 0 onwards
	
	public SanitationDriver(int id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		// write a function instance which increments from i < 0 to 100000
		
		for(int i = 0; 1 < 10000; i++) {
			SanitationDriver gd = new SanitationDriver(i);
			
			System.gc();
		}
	}

	@Override
	protected void finalize() {
		System.out.println("id: " + id + " has been sanitized.")
	}

}

package com.revature;

import java.util.Scanner; 

public class ScannerDriver {
	
	//add a static variable so you can call the scanner class in MenuOne
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// Take in input into scanner() method from java.util package
		// import the java utility scanner above
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(system.in);
			
			System.out.println("Hello World!");
			System.out.println("What is your first name?");
			
			String name = scan.nextLine();
			
			System.out.println("Hello" + name + "!");
			//ask to pick a number
			
			System.out.println("Please choose a number from 1-2: ");
			
			int num = scan.nextInt();
			scan.nextLine(); //flush leftover from the previous input capture
			
			System.out.println("Your number is " + num);
			
			//set a variable for the input
			
			// int num2 = scan.nextInt();
			
			//or
			
			String num = scan.nextLine();
			
			int number = Interger.parseInt(num);
			
			//calls method to avoid exception
			
			Switch(number) {
				case "1":
					System.out.println("Hello");
					break;
				Case "2":
					System.out.println("Goodbye");
					break;
				default:
					System.out.println("Not recognized");
					
			scan.close();	
			}
		}
		

	}

}

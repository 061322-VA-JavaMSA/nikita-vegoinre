package com.revature;

import java.util.Scanner;

public class MenuOne {

	public static void main(String[] args) {
		// input a username and password, if match return welcome
		// otherwise return "not authorized"
		
		public static void loginScreen() {
			String usernameInput = "username";
			String passwordInput = "password";
			
			int username;
			int password;
			
			System.out.println("Please enter username");
			String usernameInput = scan.nextLine();
			System.out.println("please enter password");
			String passwordInput = scan.nextLine();
			
			//Use switch statement to demonstrate first verify username
			
			/*
			 * 	System.out.println("Hello World!");
			System.out.println("What is your first name?");
			
			String name = scan.nextLine();
			
			System.out.println("Hello" + name + "!");
			//ask to pick a number
			
			System.out.println("Please choose a number from 1-2: ");
			
			int num = scan.nextInt();
			scan.nextLine(); //flush leftover from the previous input capture
			
		
			 * 
			 */
			
			
			Switch(login) {
			case "1":
				System.out.println("Please enter username:" + username);
				
				//scan username string into variable
				int username = scan.nextInt();
				scan.nextLine(); 
				//flush leftover from the previous input capture	
			
				
				//verify username with hashcode for encryption
				
				
				break;
			Case "2":
				System.out.println("Please verify password:" + password);
				break;
				
				//scan username string into variable
				int username = scan.nextInt();
				scan.nextLine(); 
				//flush leftover from the previous input capture	
			
				
				//verify username with hashcode for encryption
				
				
			default:
				System.out.println("Not authorized");
				
		scan.close();	
		}

	}

}

package com.revature;

//remember to import your package
import java.time.LocalDate;

public class Driver {

	public static void main(String[] args) {
		// Task for...
		
		Task t = new Task();
		System.out.println("The Date due is" + t.dueDate);
		System.out.println(t.completed);
		private localDate dueDate;
		
		public String description;
		public boolean completed;
		public LocalDate;
		
		 /*
		  * Access Modifiers
		  * Public - Least restrictive (all parent/child classes)
		  * Protected - Only classes within same Package
		  * Default - All classes within same package
		  * Private - Only accessible within same class not package
		  */
		
		
		public Task() {
			dueDate = LocalDate.now().plusDays(5);
		Description = "none provided";

}

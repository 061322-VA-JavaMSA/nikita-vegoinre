package com.revature.oop.models;

import java.time.LocalDate;

public class Task {
	
	private String description;
	private boolean completed;
	private LocalDate dueDate;
	private User userAssigned;
//private int userIdAssigned; //outmodded but will work under conditions
	
	
	
	//Object which is user assigned to it. useful to tie the username to a verification step.
	
	public Task() {
		//super() => used as the Object class construtor?
		
		dueDate = LocalDate.now().plusDays(5);
		description = "Task to be defined";
		
	public Task() doTask() {
			//Set method
			
			System.out.println("");
		
	public Task() doTask(String speed) {
		
	}
			//do task
			
			dueDate = LocalDate.now().plusDays(5);
			description = "Task to be defined";
			
			public Task() {
				//super() => used as the Object class construtor?
				
				dueDate = LocalDate.now().plusDays(5);
				description = "Task to be defined";
	
	@Override
	public String toString() {
		return "Task [description=" + description + ", completed=" + completed + ", dueDate=" + dueDate
				+ ", userAssigned=" + userAssigned + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (completed ? 1231 : 1237);
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + ((userAssigned == null) ? 0 : userAssigned.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (completed != other.completed)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (userAssigned == null) {
			if (other.userAssigned != null)
				return false;
		} else if (!userAssigned.equals(other.userAssigned))
			return false;
		return true;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public User getUserAssigned() {
		return userAssigned;
	}

	public void setUserAssigned(User userAssigned) {
		this.userAssigned = userAssigned;
	}

	public Task (String description)
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// Create a Task class, to use as a method

	}

}

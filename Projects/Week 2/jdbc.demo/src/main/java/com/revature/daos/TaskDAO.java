package com.revature.daos;

import java.util.List;

public interface TaskDAO {
	
	Task createTask(Task t);
	List<Task> retrieveTasks();
	Task retrieveTaskById(int id);
	List<Task> retrieveTasksByUserId(int id);
	
	
	//remember interface is abstract by default
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

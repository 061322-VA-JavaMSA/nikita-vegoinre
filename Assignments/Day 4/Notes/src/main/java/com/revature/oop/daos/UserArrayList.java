package com.revature.oop.daos;

import java.util.ArrayList();
import java.util.List;
import com.revature.models.User;


public class UserArrayList implements UserDao {
	
	//adds users to array for database
	
	private List<com.revature.oop.models.User> userDb = new ArrayList<();
	
	
	
	
	public List<User> getById(int id) {
		return userDb.get(id)
	}
	public void setUserDb(List<User> userDb) {
		this.userDb = userDb;
	}
	
	
	
	
	}

}

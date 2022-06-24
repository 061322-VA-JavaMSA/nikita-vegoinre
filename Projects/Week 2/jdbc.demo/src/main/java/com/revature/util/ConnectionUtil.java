package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	
/*
 * Singleton is a good design pattern for
 * ensuring that only one instance of a class exists
 * Essentially makes something only form an object once then final
 * - Useful for heavier use of resources, uses multiple conditions
 * Getter Method - public static retrieve
 * 
 */

	public static Connection c;
		//set static variable, gosh I cannot type
	
	public Connection getHardcodedConnection() throws SQLException {
		//String url = "jdbc:[driver
		
		String url = ""
		String username = "";
		String password = "";
		
		if (c == null || c.isClosed()) {
			c = DriverManager.getConnection(url, username, password);
		}
		
		/* 
		every time this method is called, 
		it keeps connection open and establishes connection */

	}
	
	//going to rework this later today, its a mess I know

}

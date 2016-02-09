package com.andrius.service;

import java.sql.*;


public class LoginService {
  public boolean authenticate(String userId, String password){
	  /* this is dummy implementation just checking if its password null or empty
	  * characters was inserted.
	  */
	  boolean result = true;
	  String driver = "com.mysql.jdbc.Driver";
	  String url = "jdbc:mysql://localhost:3306";
	  String dataBase ="/test";
	  String username = "root";
	  String pass = "letsDoIt123";
	  try{
		  // Get a connection to database:
		  Class.forName(driver);
		 Connection conn = DriverManager.getConnection(url+ dataBase ,username,pass);
		  System.out.println("Connected"); // just for test
		  // Create a statement:
		  Statement mySt = conn.createStatement();
		  // Execute SQL query:
		  ResultSet myRs =  mySt.executeQuery("SELECT * FROM  user");
		  // Process the result set:
		  while(myRs.next()){ // need to change logics
			  if((password == null)||(password.trim() != myRs.getString("password"))){
				  result = false;
			  }
			  System.out.println(myRs.getString("name") + " , " + myRs.getString("password"));
		  }
	  }catch(Exception e){
		  e.printStackTrace();
	  }
	
	  return result;
  }
}

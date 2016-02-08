package com.andrius.service;

public class LoginService {
  public boolean authenticate(String userId, String password){
	  /* this is dummy implementation just checking if its password null or empty
	  * characters was inserted.
	  */
	  boolean result = true;
	  if((password == null) || (password.trim() =="")){
		  System.out.println("password:" + password); // just for testing left
		  result = false;
	  }
	  return result;
  }
}

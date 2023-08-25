package com.ba.boost.day64and65.deneme6;

public record User(String username, String password) {

	public User {
		
		if (username == null || password == null) {
			throw new IllegalArgumentException("Username and password must not be null");
		}
	}

	public String username() {
		return username.toUpperCase();
	}
	
	public static String getValue() {
		return "1000";
		
	}
	


}

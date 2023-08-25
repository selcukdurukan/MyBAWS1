package com.ba.boost.day64and65.deneme6;

public class Test {

	public static void main(String[] args) {
		
		 User us = new User("Ali", "Veli");
		 User us1 = new User("Ali", "Veli");
		 User us2 = new User(null, null);
		
		 
		 System.out.println(us.toString());;
		 System.out.println(us.username() + " - " + us.password());
		 System.out.println(us.equals(us1));
		 
		 User.getValue();
		 
		 

	}

}

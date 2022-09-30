package com.ba.boost.day13;

public class GettersSettersSet {

	public static void main(String[] args) {
		
		GettersSetters obj = new GettersSetters();
		
		obj.lastName = "Durukan";
		obj.setName("Selo");
		
		System.out.println(obj.lastName +" "+ obj.getName());
		
		System.out.println(obj.getId());

	}

}

package com.ba.boost.day12;

public class WrappertoPrimitiveType {

	public static void main(String[] args) {
		
		Integer aObj = new Integer(23);
		
		int b= aObj;		// unboxing
		int a = aObj.intValue();  // converts into a primitive type.
		
		System.out.println(a);

	}

}

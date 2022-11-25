package com.ba.boost.day23;

public class ThrowLessonWitUserDefinedException {

	public static void main(String[] args)  {
		
		try {
			validate(13);
		} catch (UserDefinedException e) {
		System.err.println(e.getMessage() + " - " + e.getClass());	
//		e.printStackTrace();
		} finally {
			System.out.println("This runs everytime..");
		}

	}

	private static void validate(int age) throws UserDefinedException  {
		
		if (age<18) {
			throw new UserDefinedException();
		} else {
			System.out.println("Person is eligiblee to vote");
		}
		
	}

}

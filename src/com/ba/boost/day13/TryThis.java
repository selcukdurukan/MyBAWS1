package com.ba.boost.day13;

public class TryThis {
	
	int variable1; // Class variable
	
	int variable = 15; // Class variable

	int method(int variable) {   // Class Method
		return variable;

	}
	
	int method1(int variable) {   // Class Method
		return this.variable;   // We cannot use this in static context.
	}


	public static void main(String[] args) {

		int variable = 10;  // Local variable
		
		TryThis obj = new TryThis();
		
		System.out.println(obj.variable1);  // This variable is class variable. This gets 0 if it don't have value.
		 
		System.out.println(obj.method(variable)); // This variable is local variable.
		
		System.out.println(obj.variable);  //This variable is class variable
		
		System.out.println(obj.method1(0));
	}

}

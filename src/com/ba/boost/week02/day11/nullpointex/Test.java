package com.ba.boost.week02.day11.nullpointex;

public class Test {

	public static void main(String[] args) {
		
		MyClass myVariable = null;
		System.out.println(myVariable);
//		System.out.println(myVariable.a);    // This is NullPointerException because we didn't create a reference type from MyClass. I mean there's no address in stack.In addition, there's no object, so we can't use a.
											//Program burada var olmayan bir nesnenin ozniteligine erişmeye çalışıyor. O yuzden de çöküyor.
		myVariable = new MyClass();
		System.out.println(myVariable);
		System.out.println(myVariable.a);
		
		if (myVariable == null) {
			System.out.println("null");
		} else {
			System.out.println("not null");
		}
		
	}

}

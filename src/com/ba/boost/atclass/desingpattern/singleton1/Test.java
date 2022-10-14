package com.ba.boost.atclass.desingpattern.singleton1;

public class Test {

	public static void main(String[] args) {
 
		LazyInitializedSingleton s1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton s2 = LazyInitializedSingleton.getInstance();
		EagerInitializedSingleton s3 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton s4 = EagerInitializedSingleton.getInstance();
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}

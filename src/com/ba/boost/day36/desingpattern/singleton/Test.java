package com.ba.boost.day36.desingpattern.singleton;

public class Test {

	public static void main(String[] args) {
 
		LazyInitializedSingleton ls1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton ls2 = LazyInitializedSingleton.getInstance();
		EagerInitializedSingleton es3 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton es4 = EagerInitializedSingleton.getInstance();
		
		
		System.out.println(ls1);
		System.out.println(ls2);
		System.out.println(es3);
		System.out.println(es4);
		

	}

}

package com.ba.boost.atclass.desingpattern.singleton1;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;

	public ThreadSafeSingleton() {
	}

	public static synchronized ThreadSafeSingleton getInstance() {  // if you use singleton with thread, you should write synchronized.
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	static Thread t1 = new Thread() {
		ThreadSafeSingleton s1 = ThreadSafeSingleton.getInstance();
	};
	
	static Thread t2 = new Thread() {
		ThreadSafeSingleton s2 = ThreadSafeSingleton.getInstance();
	};
	
	public static void main(String[] args) {
		
		t1.start();
		System.out.println(instance);
		t2.start();
		System.out.println(instance);
	}

	
}

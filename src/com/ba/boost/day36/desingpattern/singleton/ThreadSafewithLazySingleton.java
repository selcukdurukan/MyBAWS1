package com.ba.boost.day36.desingpattern.singleton;

public class ThreadSafewithLazySingleton {

	private static ThreadSafewithLazySingleton instance;

	public ThreadSafewithLazySingleton() {
	}

	public static synchronized ThreadSafewithLazySingleton getInstance() { // if you use singleton with thread, you should write
														// synchronized.
		if (instance == null) {
			instance = new ThreadSafewithLazySingleton();
		}
		return instance;
	}

	static Thread t1 = new Thread() {

		@Override
		public void run() {
			ThreadSafewithLazySingleton t1 = ThreadSafewithLazySingleton.getInstance();
			System.out.println(instance);
			System.out.println(Thread.currentThread().getName());

		}

	};

	static Thread t2 = new Thread() {

		@Override
		public void run() {
			ThreadSafewithLazySingleton t2 = ThreadSafewithLazySingleton.getInstance();
			System.out.println(instance);
			System.out.println(Thread.currentThread().getName());
		}

	};

	public static void main(String[] args) {

		t1.start();
		t2.start();

	}

}

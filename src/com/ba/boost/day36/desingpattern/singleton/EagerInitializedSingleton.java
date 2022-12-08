package com.ba.boost.day36.desingpattern.singleton;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {
		super();
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}

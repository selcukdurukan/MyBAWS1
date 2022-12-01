package com.ba.boost.day33;

public class JavaProcess {

	public static void main(String[] args) {

		System.out.println("Programin calistigi thread - Name	: " + Thread.currentThread().getName());
		System.out.println("Programin calistigi thread - ID		: " + Thread.currentThread().getId());
		System.out.println("Programin calistigi thread - Oncelik	: " + Thread.currentThread().getPriority());
		System.out.println("Programin calistigi thread - Durum	: " + Thread.currentThread().getState());
		System.out.println("Programin calistigi thread - ClassLo	: " + Thread.currentThread().getContextClassLoader());
		System.out.println("Programin calistigi thread - Grup	: " + Thread.currentThread().getThreadGroup());

	}

}

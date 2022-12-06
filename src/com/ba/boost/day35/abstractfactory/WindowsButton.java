package com.ba.boost.day35.abstractfactory;

public class WindowsButton implements Button{

	@Override
	public void configure() {
		System.out.println("You have created WindowsButton");
	}

}

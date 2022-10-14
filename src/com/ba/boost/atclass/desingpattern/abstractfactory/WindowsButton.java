package com.ba.boost.atclass.desingpattern.abstractfactory;

public class WindowsButton implements Button{

	@Override
	public void configure() {
		System.out.println("You have created WindowsButton");
	}

}

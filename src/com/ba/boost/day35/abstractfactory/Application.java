package com.ba.boost.day35.abstractfactory;

public class Application {
	
	private Button button;
	private Checkbox checkbox;
	
	public Application(GUIfactory factory) {
		
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

	public void configure () {
		button.configure();
		checkbox.configure();
	}
}

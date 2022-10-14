package com.ba.boost.atclass.desingpattern.abstractfactory;

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

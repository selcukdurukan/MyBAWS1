package com.ba.boost.atclass.desingpattern.abstractfactory;

public class MacOSFactory implements GUIfactory{

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}

}

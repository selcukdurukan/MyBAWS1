package com.ba.boost.day35.abstractfactory;

public class WindowsFactory implements GUIfactory{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}

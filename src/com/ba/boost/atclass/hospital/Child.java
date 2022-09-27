package com.ba.boost.atclass.hospital;

public class Child extends Person {

	private boolean toothControl;

	
	public Child(String name, boolean isHealty, int age, boolean toothControl) {
		super(name, isHealty, age);
		this.toothControl = toothControl;
	}

	public boolean isToothControl() {
		return toothControl;
	}

	public void setToothControl(boolean toothControl) {
		this.toothControl = toothControl;
	}

	@Override
	public String toString() {
		return "Child [toothControl=" + toothControl + ", toString()=" + super.toString() + "]";
	}
	
	

}

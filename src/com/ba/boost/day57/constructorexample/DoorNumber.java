package com.ba.boost.day57.constructorexample;

public class DoorNumber {
	
	private int doorNumber;

	public DoorNumber(int doorNumber) {
		super();
		this.doorNumber = doorNumber;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	@Override
	public String toString() {
		return "DoorNumber [doorNumber=" + doorNumber + "]";
	}
	
	

}

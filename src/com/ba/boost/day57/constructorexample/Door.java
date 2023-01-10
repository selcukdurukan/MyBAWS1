package com.ba.boost.day57.constructorexample;

public class Door {
	
	private DoorType door;

	public Door(DoorType door) {
		super();
		this.door = door;
	}

	public DoorType getDoor() {
		return door;
	}

	public void setDoor(DoorType door) {
		this.door = door;
	}

	@Override
	public String toString() {
		return "Door [door=" + door + "]";
	}
	
	
	
	

}

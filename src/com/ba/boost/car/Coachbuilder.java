package com.ba.boost.car;

public class Coachbuilder {
	
	private Door carDoor;
	private Brand carBrand;
	private DoorNumber doorNumber;
	
	
	public Coachbuilder(Door carDoor, Brand carBrand, DoorNumber doorNumber) {
		super();
		this.carDoor = carDoor;
		this.carBrand = carBrand;
		this.doorNumber = doorNumber;
	}

	public Door getCarDoor() {
		return carDoor;
	}


	public void setCarDoor(Door carDoor) {
		this.carDoor = carDoor;
	}


	public Brand getCarBrand() {
		return carBrand;
	}


	public void setCarBrand(Brand carBrand) {
		this.carBrand = carBrand;
	}


	public DoorNumber getDoorNumber() {
		return doorNumber;
	}


	public void setDoorNumber(DoorNumber doorNumber) {
		this.doorNumber = doorNumber;
	}


	@Override
	public String toString() {
		return "Coachbuilder [carDoor=" + carDoor + ", carBrand=" + carBrand + ", doorNumber=" + doorNumber + "]";
	}
	
	

	
	
}

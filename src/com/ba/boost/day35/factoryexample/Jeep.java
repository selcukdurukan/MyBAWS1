package com.ba.boost.day35.factoryexample;

public class Jeep implements Car {

	@Override
	public String insertTyres() {
		return "Lastikler takildi";
	}

	@Override
	public String placeGasTank() {
		return "60 Litres.";
	}

	@Override
	public String toString() {
		return "For Jeep: " + this.insertTyres() + " ve tank " + this.placeGasTank();
	}

}

package com.ba.boost.day35.factoryexample;

public class HatchBack implements Car {

	@Override
	public String insertTyres() {
		return "Lastikler takildi";
	}

	@Override
	public String placeGasTank() {
		return "40 Litres.";
	}

	@Override
	public String toString() {
		return "For HatchBack: " + this.insertTyres() + " ve tank " + this.placeGasTank();
	}

}

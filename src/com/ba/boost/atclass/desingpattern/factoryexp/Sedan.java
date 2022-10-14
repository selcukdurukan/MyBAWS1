package com.ba.boost.atclass.desingpattern.factoryexp;

public class Sedan implements Car{



	@Override
	public String insertTyres() {
		return "Lastikler takildi.";
	}

	@Override
	public String placeGasTank() {
		return "Gas tank = 50 Litres";
	}
	
	@Override
	public String toString() {
		return "Sedan [Gas Tank=" + this.placeGasTank() + ", Tyres=" + this.insertTyres() + "]";
	}

}

package com.ba.boost.atclass.desingpattern.factoryexp;

public class HatchBack implements Car{

	@Override
	public String insertTyres() {
		return "Lastikler takildi.";
	}

	@Override
	public String placeGasTank() {
		return "40 Litres";
	}

	@Override
	public String toString() {
		return "HatchBack [Gas Tank=" + this.placeGasTank() + ", Tyres=" + this.insertTyres() + "]";
	}

	

}

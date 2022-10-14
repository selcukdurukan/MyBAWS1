package com.ba.boost.atclass.desingpattern.factoryexp;

public class Jeep implements Car{



	@Override
	public String insertTyres() {
		return "Lastikler takildi.";
	}

	@Override
	public String placeGasTank() {
		return "Gas tank = 60 Litres";
	}
	
	@Override
	public String toString() {
		return "Jeep [Gas Tank=" + this.placeGasTank() + ", Tyres=" + this.insertTyres() + "]";
	}


}

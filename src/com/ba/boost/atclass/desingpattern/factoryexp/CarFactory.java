package com.ba.boost.atclass.desingpattern.factoryexp;


public class CarFactory {
	
	public static Car create(String type) {
		
		if (type.equalsIgnoreCase("Hatchback")) {
			return new HatchBack();
		}
		if (type.equalsIgnoreCase("Jeep")) {
			return new Jeep();
		}
		if (type.equalsIgnoreCase("Sedan")) {
			return new Sedan();
		}
		return null;
	
	}

}

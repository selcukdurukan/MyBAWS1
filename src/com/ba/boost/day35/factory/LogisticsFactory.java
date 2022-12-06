package com.ba.boost.day35.factory;

public class LogisticsFactory {
	
	public static Logistic create(String type) {
		if (type.equalsIgnoreCase("Kara")) {
			return new LandLogistic();
		}
		if (type.equalsIgnoreCase("Hava")) {
			return new AirLogistic();
		}
		if (type.equalsIgnoreCase("Deniz")) {
			return new SeaLogistic();
		}
		return null;
	}

}

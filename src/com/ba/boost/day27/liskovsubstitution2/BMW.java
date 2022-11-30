package com.ba.boost.day27.liskovsubstitution2;

public class BMW extends BaseCar implements SMSSendeable{

	@Override
	public double getCostPerKm() {
		return 5;
	}

	@Override
	public void sendTripInfoSMSToDriver() {
		System.out.println("SMS: trip info");
		
	}

}

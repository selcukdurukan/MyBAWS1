package com.ba.boost.day27.liskovsubstitution2;

public abstract class BaseCar {
	
	/*
	 * Liskov substutition principle der ki child classlar, parent classlar'ın özelliğini taşımalı. 
	 * Child class için bir değişiklik parent class'ı etkilememeli.
	 * Eğer bir sub-class varsa o sub-class ustundeki sınıfların tum özellegini taşıyabilmeli.
	 * Ornegin farz edelim mercedes artık sms göndermiyor basecar sınıfındaki 
	 * methodu interface taşırız bu özelligi bmw sınıfına implement ederek devam ederiz, böylece liskov principle bozulmamış olur.
	 */
	
	public int tripKm(int distance) {
		return distance;
	}
	
	public abstract double getCostPerKm();
	
	public void sendTripInfoMailToDriver() {
		System.out.println("Email: trip info");
	}
	

}

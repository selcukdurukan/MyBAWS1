package com.ba.boost.day27.interfacesegregation;

public class CustomerTest implements IGenerable{ //Interface segregation
	
	/*
	 * 
	 * Bir arayüz muhakkak tek bir kabiliyet kazandırmalı. Genel bir arayüz nedeni ile bir müşterinin 
	 * çevresini hesaplamak zorunda kalmamalılıyız
	 * 
	 */

	@Override
	public boolean isHealthy() {
		return false;
	}

	@Override
	public void setCustomerId() {
		
	}

	@Override
	public String getAdress() {
		return null;
	}

	@Override
	public int calculatePerimeter() {
		/*
		 * Is not used ya da do nothing comment'ler yazmak zorunda kalmamız gerekli!!
		 *  Bu yuzden bunları ayrı arayuz(interface) olarak kurmaylıyız.
		 */
		return 0;
	}

	

}

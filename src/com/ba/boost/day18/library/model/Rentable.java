package com.ba.boost.day18.library.model;

public interface Rentable {
	
	int getAvailableAmountInfo();
	String getNameInfo();
	void updateAmountInfo(int amount);
	
	
	default void rent(int amount, Period rentalPeriod, int rentalTime) {
		if (amount < this.getAvailableAmountInfo()) {
			System.out.println(amount +" adet "+ this.getNameInfo() + " adli urun kiraya verildi.");
			this.updateAmountInfo(this.getAvailableAmountInfo() - amount);
		} else {
			System.out.println("Almak istediginiz urunden yeteri kadar yok.");
		}
		
	}
	
	default void returnRental(int amount) {
		this.updateAmountInfo(this.getAvailableAmountInfo() + amount);;
		
	}

}
